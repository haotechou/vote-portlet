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

<aui:model-context bean="${voteBallot}" model="<%= VoteBallot.class %>" />

<portlet:actionURL var="editBallotURL">
	<portlet:param name="controller" value="ballots" />
	<portlet:param name="action" value="update" />
</portlet:actionURL>

<aui:form action="${editBallotURL}" method="post">
	<portlet:renderURL var="viewBallotURL">
		<portlet:param name="controller" value="ballots" />
		<portlet:param name="action" value="index" />
	</portlet:renderURL>

	<aui:input name="redirect" type="hidden" value="${viewBallotURL}" />
	<aui:input name="id" type="hidden" value="${voteBallot.voteBallotId}" />

	<aui:input name="name">
		<aui:validator errorMessage="the-ballot-name-is-invalid" name="required" />
	</aui:input>

	<aui:input name="description">
		<aui:validator errorMessage="the-ballot-description-is-invalid" name="required" />
	</aui:input>

	<aui:select label="idea-type" name="voteIdeaTypeId" showEmptyOption="${false}">
		<c:forEach items="${voteIdeaTypes}" var="voteIdeaType">
			<aui:option label="${voteIdeaType.name}" value="${voteIdeaType.voteIdeaTypeId}" />
		</c:forEach>
	</aui:select>

	<aui:input name="endDate" value="${existingEndDate}">
		<aui:validator errorMessage="the-ballot-end-date-is-invalid" name="required" />
	</aui:input>

	<aui:button-row>
		<aui:button type="submit" value="save" />

		<aui:button href="${viewBallotURL}" value="cancel" />
	</aui:button-row>
</aui:form>