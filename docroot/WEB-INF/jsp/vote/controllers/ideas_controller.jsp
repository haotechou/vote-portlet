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
<%@ include file="/WEB-INF/jsp/util/vote_idea_indexer.jspf" %>

<%!
public static class AlloyControllerImpl extends BaseAlloyControllerImpl {

	public AlloyControllerImpl() {
		setPermissioned(true);
	}

	public void add() throws Exception {
		_validateAdd();

		VoteIdea voteIdea = VoteIdeaLocalServiceUtil.createVoteIdea(0);

		updateModel(voteIdea);

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
		VoteIdea voteIdea = _fetchVoteIdea();

		_validateDelete(voteIdea);

		VoteIdeaLocalServiceUtil.deleteVoteIdea(voteIdea);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void edit() throws Exception {
		VoteIdea voteIdea = _fetchVoteIdea();

		_validateEdit(voteIdea);

		renderRequest.setAttribute("voteIdea", voteIdea);

		List<VoteIdeaType> voteIdeaTypes = _fetchVoteIdeaTypes();

		renderRequest.setAttribute("voteIdeaTypes", voteIdeaTypes);
	}

	public void index() throws Exception {
		AlloySearchResult alloySearchResult = search(null, new Sort(Field.NAME, Sort.STRING_TYPE, false));

		renderRequest.setAttribute("alloySearchResult", alloySearchResult);
	}

	public void update() throws Exception {
		VoteIdea voteIdea = _fetchVoteIdea();

		_validateUpdate(voteIdea);

		updateModel(voteIdea);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void view() throws Exception {
		VoteIdea voteIdea = _fetchVoteIdea();

		_validateView(voteIdea);

		renderRequest.setAttribute("voteIdea", voteIdea);

		VoteIdeaType voteIdeaType = VoteIdeaTypeLocalServiceUtil.fetchVoteIdeaType(voteIdea.getVoteIdeaTypeId());

		renderRequest.setAttribute("voteIdeaType", voteIdeaType);
	}

	@Override
	protected Indexer buildIndexer() {
		return VoteIdeaIndexer.getInstance();
	}

	private VoteIdea _fetchVoteIdea() throws Exception {
		long voteIdeaId = ParamUtil.getLong(request, "id");

		return VoteIdeaLocalServiceUtil.fetchVoteIdea(voteIdeaId);
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
			throw new AlloyException("the-idea-name-is-invalid");
		}

		_validateName(name);
		_validateNameExists(name);
	}

	private void _validateDelete(VoteIdea voteIdea) throws Exception {
		_validateVoteIdea(voteIdea);
	}

	private void _validateEdit(VoteIdea voteIdea) throws Exception {
		_validateVoteIdea(voteIdea);
	}

	private void _validateName(String name) throws Exception {
		Pattern pattern = Pattern.compile(VoteIdeaConstants.NAME_REGEX);

		Matcher matcher = pattern.matcher(name);

		if (!matcher.find()) {
			throw new AlloyException("the-idea-name-is-invalid");
		}
	}

	private void _validateNameExists(String name) throws Exception {
		List<VoteIdea> voteIdea = alloyServiceInvoker.executeDynamicQuery(new Object[] {"name", name});

		if (!voteIdea.isEmpty()) {
			throw new AlloyException("the-idea-already-exists");
		}
	}

	private void _validateUpdate(VoteIdea voteIdea) throws Exception {
		String name = ParamUtil.getString(request, "name");

		if (Validator.isNull(name)) {
			throw new AlloyException("the-idea-name-is-invalid");
		}

		_validateName(name);
	}

	private void _validateView(VoteIdea voteIdea) throws Exception {
		_validateVoteIdea(voteIdea);
	}

	private void _validateVoteIdea(VoteIdea voteIdea) throws Exception {
		if (voteIdea == null) {
			throw new AlloyException("the-idea-does-not-exist");
		}
	}

	private static final long _POLL_INDEX_WAIT_INTERVAL = 500;

}
%>