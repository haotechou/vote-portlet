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
	<liferay-util:param name="tabs1" value="ballots" />
</liferay-util:include>

<aui:button-row>
	<portlet:renderURL var="createBallotURL">
		<portlet:param name="controller" value="ballots" />
		<portlet:param name="action" value="create" />
	</portlet:renderURL>

	<aui:button href="${createBallotURL}" value="add-ballot" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="there-are-no-ballots" iteratorURL="${portletURL}">
	<liferay-ui:search-container-results
		results="${currentVoteBallots}"
		total="${currentVoteBallots.size()}"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.vote.model.VoteBallot"
		escapedModel="${true}"
		keyProperty="voteBallotId"
		modelVar="voteBallot"
	>
		<portlet:renderURL var="viewBallotURL">
			<portlet:param name="controller" value="ballots" />
			<portlet:param name="action" value="view" />
			<portlet:param name="id" value="${voteBallot.voteBallotId}" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="${viewBallotURL}"
			property="name"
		/>

		<liferay-ui:search-container-column-text
			property="description"
		/>

		<liferay-ui:search-container-column-text
			name="vote-end-date"
		>
			<fmt:formatDate pattern="MM/dd/yyyy hh:mm a" value="${voteBallot.endDate}" />
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text
			align="right"
		>
			<liferay-ui:icon-menu>
				<portlet:renderURL var="editBallotURL">
					<portlet:param name="controller" value="ballots" />
					<portlet:param name="action" value="edit" />
					<portlet:param name="id" value="${voteBallot.voteBallotId}" />
				</portlet:renderURL>

				<liferay-ui:icon
					image="edit"
					method="get"
					url="${editBallotURL}"
				/>

				<portlet:actionURL var="deleteBallotURL">
					<portlet:param name="controller" value="ballots" />
					<portlet:param name="action" value="delete" />
					<portlet:param name="id" value="${voteBallot.voteBallotId}" />
					<portlet:param name="redirect" value="${portletURL}" />
				</portlet:actionURL>

				<liferay-ui:icon-delete
					url="${deleteBallotURL}"
				/>
			</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>