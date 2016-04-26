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

<portlet:renderURL var="viewBallotsURL">
	<portlet:param name="controller" value="ballots" />
	<portlet:param name="action" value="index" />
</portlet:renderURL>

<portlet:renderURL var="viewIdeaTypesURL">
	<portlet:param name="controller" value="idea_types" />
	<portlet:param name="action" value="index" />
</portlet:renderURL>

<portlet:renderURL var="viewIdeasURL">
	<portlet:param name="controller" value="ideas" />
	<portlet:param name="action" value="index" />
</portlet:renderURL>

<%
List<String> tabsNames = new ArrayList<String>();
List<String> tabsValuesList = new ArrayList<String>();

tabsNames.add("ballots");

tabsValuesList.add(viewBallotsURL);

tabsNames.add("idea-types");

tabsValuesList.add(viewIdeaTypesURL);

tabsNames.add("ideas");

tabsValuesList.add(viewIdeasURL);

String[] tabsValuesArray = new String[3];

tabsValuesList.toArray(tabsValuesArray);
%>

<liferay-ui:tabs names="<%= StringUtil.merge(tabsNames) %>"
	url0="<%= tabsValuesArray[0] %>"
	url1="<%= tabsValuesArray[1] %>"
	url2="<%= tabsValuesArray[2] %>"
/>