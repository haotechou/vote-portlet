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

<aui:model-context bean="${voteIdeaType}" model="<%= VoteIdeaType.class %>" />

<portlet:actionURL var="editIdeaTypeURL">
	<portlet:param name="controller" value="idea_types" />
	<portlet:param name="action" value="update" />
</portlet:actionURL>

<aui:form action="${editIdeaTypeURL}" method="post">
	<portlet:renderURL var="viewIdeaTypeURL">
		<portlet:param name="controller" value="idea_types" />
		<portlet:param name="action" value="index" />
	</portlet:renderURL>

	<aui:input name="redirect" type="hidden" value="${viewIdeaTypeURL}" />
	<aui:input name="id" type="hidden" value="${voteIdeaType.voteIdeaTypeId}" />

	<aui:input name="name" />

	<aui:button-row>
		<aui:button type="submit" value="save" />

		<aui:button href="${viewIdeaTypeURL}" value="cancel" />
	</aui:button-row>
</aui:form>