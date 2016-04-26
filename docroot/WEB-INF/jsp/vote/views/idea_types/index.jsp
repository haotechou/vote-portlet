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
	<liferay-util:param name="tabs1" value="idea-types" />
</liferay-util:include>

<aui:button-row>
	<portlet:renderURL var="createIdeaTypeURL">
		<portlet:param name="controller" value="idea_types" />
		<portlet:param name="action" value="create" />
	</portlet:renderURL>

	<aui:button href="${createIdeaTypeURL}" value="add-idea-type" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="there-are-no-idea-types" iteratorURL="${alloySearchResult.portletURL}">
	<liferay-ui:search-container-results
		results="${alloySearchResult.baseModels}"
		total="${alloySearchResult.size}"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.vote.model.VoteIdeaType"
		escapedModel="<%= true %>"
		keyProperty="voteIdeaTypeId"
		modelVar="voteIdeaType"
	>
		<portlet:renderURL var="viewIdeaTypeURL">
			<portlet:param name="controller" value="idea_types" />
			<portlet:param name="action" value="view" />
			<portlet:param name="id" value="${voteIdeaType.voteIdeaTypeId}" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="${viewIdeaTypeURL}"
			property="name"
		/>

		<liferay-ui:search-container-column-text
			align="right"
		>
			<liferay-ui:icon-menu>
				<portlet:renderURL var="editIdeaTypeURL">
					<portlet:param name="controller" value="idea_types" />
					<portlet:param name="action" value="edit" />
					<portlet:param name="id" value="${voteIdeaType.voteIdeaTypeId}" />
				</portlet:renderURL>

				<liferay-ui:icon
					image="edit"
					method="get"
					url="${editIdeaTypeURL}"
				/>

				<portlet:actionURL var="deleteIdeaTypeURL">
					<portlet:param name="controller" value="idea_types" />
					<portlet:param name="action" value="delete" />
					<portlet:param name="id" value="${voteIdeaType.voteIdeaTypeId}" />
					<portlet:param name="redirect" value="${alloySearchResult.portletURL}" />
				</portlet:actionURL>

				<liferay-ui:icon-delete
					url="${deleteIdeaTypeURL}"
				/>
			</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>