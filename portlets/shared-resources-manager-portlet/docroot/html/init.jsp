<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>


<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.service.RoleServiceUtil" %>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@page import="javax.portlet.PortletURL" %>


<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>


<%@ page import="com.liferay.portlet.PortalPreferences" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>


<%@ page import="com.rivetlogic.assetmanagement.model.Asset" %>
<%@ page import="com.rivetlogic.assetmanagement.model.AssetRequest" %>
<%@ page import="com.rivetlogic.assetmanagement.model.AssetCategory" %>
<%@ page import="com.rivetlogic.assetmanagement.model.AssetLocation" %>
<%@ page import="com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil" %>
<%@ page import="com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil" %>
<%@ page import="com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil" %>
<%@ page import="com.rivetlogic.assetmanagement.service.AssetLocationLocalServiceUtil" %>
<%@ page import="com.rivetlogic.assetmanagement.service.AssetMessageLocalServiceUtil" %>
<%@page import="com.rivetlogic.assetmanagement.model.impl.AssetStatus"%>

<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>

<%@ page import="java.text.DateFormat" %>

<portlet:defineObjects />
<theme:defineObjects />