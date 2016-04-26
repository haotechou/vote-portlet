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

<%@ page import="com.liferay.alloy.mvc.AlloyController" %><%@
page import="com.liferay.alloy.mvc.AlloyException" %><%@
page import="com.liferay.alloy.mvc.AlloySearchResult" %><%@
page import="com.liferay.alloy.mvc.AlloyServiceInvoker" %><%@
page import="com.liferay.alloy.mvc.BaseAlloyIndexer" %><%@
page import="com.liferay.compat.portal.kernel.util.StringUtil" %><%@
page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %><%@
page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %><%@
page import="com.liferay.portal.kernel.search.Document" %><%@
page import="com.liferay.portal.kernel.search.Field" %><%@
page import="com.liferay.portal.kernel.search.Indexer" %><%@
page import="com.liferay.portal.kernel.search.Sort" %><%@
page import="com.liferay.portal.kernel.search.Summary" %><%@
page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.DateFormatFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.DateUtil" %><%@
page import="com.liferay.portal.kernel.util.OrderByComparator" %><%@
page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.Validator" %><%@
page import="com.liferay.portal.util.PortalUtil" %><%@
page import="com.liferay.vote.model.VoteBallot" %><%@
page import="com.liferay.vote.model.VoteIdea" %><%@
page import="com.liferay.vote.model.VoteIdeaType" %><%@
page import="com.liferay.vote.model.impl.VoteIdeaTypeModelImpl" %><%@
page import="com.liferay.vote.service.VoteBallotLocalServiceUtil" %><%@
page import="com.liferay.vote.service.VoteIdeaLocalServiceUtil" %><%@
page import="com.liferay.vote.service.VoteIdeaTypeLocalServiceUtil" %>

<%@ page import="java.util.ArrayList" %><%@
page import="java.util.Calendar" %><%@
page import="java.util.Date" %><%@
page import="java.util.List" %><%@
page import="java.util.Locale" %><%@
page import="java.util.regex.Matcher" %><%@
page import="java.util.regex.Pattern" %>

<%@ page import="javax.portlet.PortletMode" %><%@
page import="javax.portlet.PortletURL" %><%@
page import="javax.portlet.WindowState" %>

<%@ include file="/WEB-INF/jsp/util/portlet_keys.jspf" %>
<%@ include file="/WEB-INF/jsp/util/vote_ballot_constants.jspf" %>
<%@ include file="/WEB-INF/jsp/util/vote_idea_constants.jspf" %>
<%@ include file="/WEB-INF/jsp/util/vote_idea_type_constants.jspf" %>