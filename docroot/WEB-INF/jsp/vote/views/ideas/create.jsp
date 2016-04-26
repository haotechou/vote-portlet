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

<aui:model-context bean="${voteIdea}" model="<%= VoteIdea.class %>" />

<portlet:actionURL var="addIdeaURL">
	<portlet:param name="controller" value="ideas" />
	<portlet:param name="action" value="add" />
</portlet:actionURL>

<aui:form action="${addIdeaURL}" method="post">
	<portlet:renderURL var="viewIdeasURL">
		<portlet:param name="controller" value="ideas" />
		<portlet:param name="action" value="index" />
	</portlet:renderURL>

	<aui:input name="redirect" type="hidden" value="${viewIdeasURL}" />

	<aui:input name="name">
		<aui:validator errorMessage="the-idea-name-is-invalid" name="required" />
	</aui:input>

	<aui:input name="description" />

	<aui:select label="idea-type" name="voteIdeaTypeId" showEmptyOption="${false}">
		<c:forEach items="${voteIdeaTypes}" var="voteIdeaType">
			<aui:option label="${voteIdeaType.name}" value="${voteIdeaType.voteIdeaTypeId}" />
		</c:forEach>
	</aui:select>

	<aui:button-row>
		<aui:button type="submit" value="add" />

		<aui:button href="${viewIdeasURL}" value="cancel" />
	</aui:button-row>
</aui:form>