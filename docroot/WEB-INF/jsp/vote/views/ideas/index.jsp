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

<%@ include file="/WEB-INF/jsp/vote/views/init.jsp" %>

<liferay-util:include page="/WEB-INF/jsp/vote/views/toolbar.jsp" servletContext="<%= application %>">
	<liferay-util:param name="tabs1" value="ideas" />
</liferay-util:include>

<aui:button-row>
	<portlet:renderURL var="createIdeaURL">
		<portlet:param name="controller" value="ideas" />
		<portlet:param name="action" value="create" />
	</portlet:renderURL>

	<aui:button href="${createIdeaURL}" value="add-idea" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="there-are-no-ideas" iteratorURL="${alloySearchResult.portletURL}">
	<liferay-ui:search-container-results
		results="${alloySearchResult.baseModels}"
		total="${alloySearchResult.size}"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.vote.model.VoteIdea"
		escapedModel="<%= true %>"
		keyProperty="voteIdeaId"
		modelVar="voteIdea"
	>
		<portlet:renderURL var="viewIdeaURL">
			<portlet:param name="controller" value="ideas" />
			<portlet:param name="action" value="view" />
			<portlet:param name="id" value="${voteIdea.voteIdeaId}" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="${viewIdeaURL}"
			property="name"
		/>

		<liferay-ui:search-container-column-text
			property="description"
		/>

		<c:set value="<%= VoteIdeaTypeLocalServiceUtil.getVoteIdeaType(voteIdea.getVoteIdeaTypeId()) %>" var="voteIdeaType" />

		<liferay-ui:search-container-column-text
			name="idea-type"
			value="${voteIdeaType.name}"
		/>

		<liferay-ui:search-container-column-text
			align="right"
		>
			<liferay-ui:icon-menu>
				<portlet:renderURL var="editIdeaURL">
					<portlet:param name="controller" value="ideas" />
					<portlet:param name="action" value="edit" />
					<portlet:param name="id" value="${voteIdea.voteIdeaId}" />
				</portlet:renderURL>

				<liferay-ui:icon
					image="edit"
					method="get"
					url="${editIdeaURL}"
				/>

				<portlet:actionURL var="deleteIdeaURL">
					<portlet:param name="controller" value="ideas" />
					<portlet:param name="action" value="delete" />
					<portlet:param name="id" value="${voteIdea.voteIdeaId}" />
					<portlet:param name="redirect" value="${alloySearchResult.portletURL}" />
				</portlet:actionURL>

				<liferay-ui:icon-delete
					url="${deleteIdeaURL}"
				/>
			</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>