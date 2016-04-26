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

<portlet:renderURL var="backURL">
	<portlet:param name="controller" value="idea_types" />
	<portlet:param name="action" value="index"  />
</portlet:renderURL>

<liferay-ui:header backURL="${backURL}" title="view-idea-type" />

<aui:field-wrapper name="name">
	${voteIdeaType.name}
</aui:field-wrapper>