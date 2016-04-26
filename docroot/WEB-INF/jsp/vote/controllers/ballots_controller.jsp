<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/WEB-INF/jsp/vote/controllers/init.jspf" %>
<%@ include file="/WEB-INF/jsp/util/vote_ballot_indexer.jspf" %>

<%!
public static class AlloyControllerImpl extends BaseAlloyControllerImpl {

	public AlloyControllerImpl() {
		setPermissioned(true);
	}

	public void add() throws Exception {
		_validateAdd();

		VoteBallot voteBallot = VoteBallotLocalServiceUtil.createVoteBallot(0);

		Date date = _fetchDateAndTime();

		voteBallot.setEndDate(date);

		updateModel(voteBallot);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void create() throws Exception {
		List<VoteIdeaType> voteIdeaTypes = _fetchVoteIdeaTypes();

		renderRequest.setAttribute("voteIdeaTypes", voteIdeaTypes);
	}

	public void delete() throws Exception {
		VoteBallot voteBallot = _fetchVoteBallot();

		_validateDelete(voteBallot);

		VoteBallotLocalServiceUtil.deleteVoteBallot(voteBallot);

		// To Do: Clean up associated vote entries

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void edit() throws Exception {
		VoteBallot voteBallot = _fetchVoteBallot();

		_validateEdit(voteBallot);

		renderRequest.setAttribute("voteBallot", voteBallot);

		List<VoteIdeaType> voteIdeaTypes = _fetchVoteIdeaTypes();

		renderRequest.setAttribute("voteIdeaTypes", voteIdeaTypes);

		Calendar existingEndDate = CalendarFactoryUtil.getCalendar();

		existingEndDate.setTime(voteBallot.getEndDate());

		renderRequest.setAttribute("existingEndDate", existingEndDate);
	}

	public void index() throws Exception {
		List<VoteBallot> voteBallots = VoteBallotLocalServiceUtil.getVoteBallots(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		List<VoteBallot> currentVoteBallots = new ArrayList<VoteBallot>();

		Date date = DateUtil.newDate();

		for (VoteBallot voteBallot : voteBallots) {
			if (DateUtil.compareTo(voteBallot.getEndDate(), date) >= 0) {
				currentVoteBallots.add(voteBallot);
			}
		}

		// To Do: Sort the displayed result

		renderRequest.setAttribute("currentVoteBallots", currentVoteBallots);

		renderRequest.setAttribute("portletURL", portletURL);
	}

	public void update() throws Exception {
		VoteBallot voteBallot = _fetchVoteBallot();

		_validateUpdate(voteBallot);

		Date date = _fetchDateAndTime();

		voteBallot.setEndDate(date);

		updateModel(voteBallot);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void view() throws Exception {

		// To Do: Fill something here

	}

	@Override
	protected Indexer buildIndexer() {
		return VoteBallotIndexer.getInstance();
	}

	private Date _fetchDateAndTime() throws Exception {
		Date endDate = ParamUtil.getDate(request, "endDate", DateFormatFactoryUtil.getSimpleDateFormat(VoteBallotConstants.AUI_DATE_FORMAT));

		Date endDateTime = ParamUtil.getDate(request, "endDateTime", DateFormatFactoryUtil.getSimpleDateFormat(VoteBallotConstants.AUI_TIME_FORMAT));

		_validateDateAndTime(endDate, endDateTime);

		Calendar calendar1 = CalendarFactoryUtil.getCalendar();

		Calendar calendar2 = CalendarFactoryUtil.getCalendar();

		calendar1.setTime(endDate);

		calendar2.setTime(endDateTime);

		calendar2.set(Calendar.DAY_OF_MONTH, calendar1.get(Calendar.DAY_OF_MONTH));

		calendar2.set(Calendar.MONTH, calendar1.get(Calendar.MONTH));

		calendar2.set(Calendar.YEAR, calendar1.get(Calendar.YEAR));

		return calendar2.getTime();
	}

	private VoteBallot _fetchVoteBallot() throws Exception {
		long voteBallotId = ParamUtil.getLong(request, "id");

		return VoteBallotLocalServiceUtil.fetchVoteBallot(voteBallotId);
	}

	private List<VoteIdeaType> _fetchVoteIdeaTypes() throws Exception {
		AlloyServiceInvoker voteIdeaTypeAlloyServiceInvoker = new AlloyServiceInvoker(VoteIdeaType.class.getName());

		OrderByComparator orderByComparator = OrderByComparatorFactoryUtil.create(VoteIdeaTypeModelImpl.TABLE_NAME, "name", true);

		DynamicQuery voteIdeaTypeDynamicQuery = voteIdeaTypeAlloyServiceInvoker.buildDynamicQuery();

		return voteIdeaTypeAlloyServiceInvoker.executeDynamicQuery(voteIdeaTypeDynamicQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);
	}

	private void _validateAdd() throws Exception {
		String name = ParamUtil.getString(request, "name");

		if (Validator.isNull(name)) {
			throw new AlloyException("the-ballot-name-is-invalid");
		}

		_validateName(name);
		_validateNameExists(name);

		String description = ParamUtil.getString(request, "description");

		if (Validator.isNull(description)) {
			throw new AlloyException("the-ballot-description-is-invalid");
		}

		_validateEndDate();
	}

	private void _validateDateAndTime(Date endDate, Date endDateTime) {

		// To Do: Verify is not empty and is valid date and time

		// "the-ballot-end-date-is-invalid"
	}

	private void _validateDelete(VoteBallot voteBallot) throws Exception {
		_validateVoteBallot(voteBallot);
	}

	private void _validateEdit(VoteBallot voteBallot) throws Exception {
		_validateVoteBallot(voteBallot);
	}

	private void _validateEndDate() throws Exception {
		Date date = _fetchDateAndTime();

		if (DateUtil.compareTo(new Date(), date) >= 0) {
			throw new AlloyException("the-ballot-end-date-is-invalid");
		}
	}

	private void _validateName(String name) throws Exception {
		Pattern pattern = Pattern.compile(VoteBallotConstants.NAME_REGEX);

		Matcher matcher = pattern.matcher(name);

		if (!matcher.find()) {
			throw new AlloyException("the-ballot-name-is-invalid");
		}
	}

	private void _validateNameExists(String name) throws Exception {
		List<VoteBallot> voteBallot = alloyServiceInvoker.executeDynamicQuery(new Object[] {"name", name});

		if (!voteBallot.isEmpty()) {
			throw new AlloyException("the-ballot-already-exists");
		}
	}

	private void _validateUpdate(VoteBallot voteBallot) throws Exception {
		String name = ParamUtil.getString(request, "name");

		if (Validator.isNull(name)) {
			throw new AlloyException("the-ballot-name-is-invalid");
		}

		_validateName(name);

		String description = ParamUtil.getString(request, "description");

		if (Validator.isNull(description)) {
			throw new AlloyException("the-ballot-description-is-invalid");
		}

		_validateEndDate();
	}

	private void _validateVoteBallot(VoteBallot voteBallot) throws Exception {
		if (voteBallot == null) {
			throw new AlloyException("the-ballot-does-not-exist");
		}
	}

	private static final long _POLL_INDEX_WAIT_INTERVAL = 500;

}
%>