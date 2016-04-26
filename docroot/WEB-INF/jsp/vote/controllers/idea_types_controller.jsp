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
<%@ include file="/WEB-INF/jsp/util/vote_idea_type_indexer.jspf" %>

<%!
public static class AlloyControllerImpl extends BaseAlloyControllerImpl {

	public AlloyControllerImpl() {
		setPermissioned(true);
	}

	public void add() throws Exception {
		_validateAdd();

		VoteIdeaType voteIdeaType = VoteIdeaTypeLocalServiceUtil.createVoteIdeaType(0);

		updateModel(voteIdeaType);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void create() throws Exception {
		VoteIdeaType voteIdeaType = VoteIdeaTypeLocalServiceUtil.createVoteIdeaType(0);

		renderRequest.setAttribute("voteIdeaType", voteIdeaType);
	}

	public void delete() throws Exception {
		VoteIdeaType voteIdeaType = _fetchVoteIdeaType();

		_validateDelete(voteIdeaType);

		VoteIdeaTypeLocalServiceUtil.deleteVoteIdeaType(voteIdeaType);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void edit() throws Exception {
		VoteIdeaType voteIdeaType = _fetchVoteIdeaType();

		_validateEdit(voteIdeaType);

		renderRequest.setAttribute("voteIdeaType", voteIdeaType);
	}

	public void index() throws Exception {
		AlloySearchResult alloySearchResult = search(null, new Sort(Field.NAME, Sort.STRING_TYPE, false));

		renderRequest.setAttribute("alloySearchResult", alloySearchResult);
	}

	public void update() throws Exception {
		VoteIdeaType voteIdeaType = _fetchVoteIdeaType();

		_validateUpdate(voteIdeaType);

		updateModel(voteIdeaType);

		addSuccessMessage();

		Thread.sleep(_POLL_INDEX_WAIT_INTERVAL);

		String redirect = ParamUtil.getString(request, "redirect");

		redirectTo(redirect);
	}

	public void view() throws Exception {
		VoteIdeaType voteIdeaType = _fetchVoteIdeaType();

		_validateView(voteIdeaType);

		renderRequest.setAttribute("voteIdeaType", voteIdeaType);
	}

	@Override
	protected Indexer buildIndexer() {
		return VoteIdeaTypeIndexer.getInstance();
	}

	private VoteIdeaType _fetchVoteIdeaType() throws Exception {
		long voteIdeaTypeId = ParamUtil.getLong(request, "id");

		return VoteIdeaTypeLocalServiceUtil.fetchVoteIdeaType(voteIdeaTypeId);
	}

	private void _validateAdd() throws Exception {
		String name = ParamUtil.getString(request, "name");

		if (Validator.isNull(name)) {
			throw new AlloyException("the-idea-type-name-is-invalid");
		}

		_validateName(name);
		_validateNameExists(name);
	}

	private void _validateDelete(VoteIdeaType voteIdeaType) throws Exception {
		_validateVoteIdeaType(voteIdeaType);
		_validateNoAssociatedIdeaExists(voteIdeaType);
	}

	private void _validateEdit(VoteIdeaType voteIdeaType) throws Exception {
		_validateVoteIdeaType(voteIdeaType);
	}

	private void _validateName(String name) throws Exception {
		Pattern pattern = Pattern.compile(VoteIdeaTypeConstants.NAME_REGEX);

		Matcher matcher = pattern.matcher(name);

		if (!matcher.find()) {
			throw new AlloyException("the-idea-type-name-is-invalid");
		}
	}

	private void _validateNameExists(String name) throws Exception {
		List<VoteIdeaType> voteIdeaType = alloyServiceInvoker.executeDynamicQuery(new Object[] {"name", name});

		if (!voteIdeaType.isEmpty()) {
			throw new AlloyException("the-idea-type-already-exists");
		}
	}

	private void _validateNoAssociatedIdeaExists(VoteIdeaType voteIdeaType) throws Exception {
		AlloyServiceInvoker voteIdeaTypeAlloyServiceInvoker = new AlloyServiceInvoker(VoteIdea.class.getName());

		List<VoteIdea> voteIdeas = voteIdeaTypeAlloyServiceInvoker.getModels(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		for (VoteIdea voteIdea : voteIdeas) {
			if (voteIdea.getVoteIdeaTypeId() == voteIdeaType.getVoteIdeaTypeId()) {
				throw new AlloyException("the-idea-type-is-used-by-an-idea");
			}
		}
	}

	private void _validateUpdate(VoteIdeaType voteIdeaType) throws Exception {
		String name = ParamUtil.getString(request, "name");

		if (Validator.isNull(name)) {
			throw new AlloyException("the-idea-type-name-is-invalid");
		}

		_validateName(name);
	}

	private void _validateView(VoteIdeaType voteIdeaType) throws Exception {
		_validateVoteIdeaType(voteIdeaType);
	}

	private void _validateVoteIdeaType(VoteIdeaType voteIdeaType) throws Exception {
		if (voteIdeaType == null) {
			throw new AlloyException("the-idea-type-does-not-exist");
		}
	}

	private static final long _POLL_INDEX_WAIT_INTERVAL = 500;

}
%>