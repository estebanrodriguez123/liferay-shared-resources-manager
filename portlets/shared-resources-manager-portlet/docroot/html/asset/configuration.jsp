<%@include file="/html/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.Constants"%>

<%
	int time_cfg = GetterUtil.getInteger(portletPreferences.getValue("time", StringPool.TRUE));
	int minutes_cfg = GetterUtil.getInteger(portletPreferences.getValue("minutes", StringPool.TRUE));
	
	String myAssetsTab = "my-assets";
	String allAssetsTab = "all-assets";
	String tab_cfg = GetterUtil.getString(portletPreferences.getValue("default-opened-tab", StringPool.TRUE));
	if(null == tab_cfg || tab_cfg.isEmpty()){
		tab_cfg = myAssetsTab;
	}
%>

<liferay-portlet:actionURL var="configurationURL"
	portletConfiguration="true">
</liferay-portlet:actionURL>


<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />

	<p style="font-size: medium;"><liferay-ui:message key="configuration-description" /></p>
	<aui:input name="preferences--time--" required="true" type="number"
		value="<%=time_cfg%>" />
	<aui:row>
		<aui:column>
			<aui:input name="preferences--minutes--" required="true" type="radio"
				label="Hours" value="60" checked="<%=60 == minutes_cfg%>" />
		</aui:column>
		<aui:column>
			<aui:input name="preferences--minutes--" required="true" type="radio"
				label="Days" value="1440" checked="<%=1440 == minutes_cfg%>" />
		</aui:column>
	</aui:row>
	
	<aui:select name="preferences--default-opened-tab--" showEmptyOption="false">
		<aui:option value="<%= myAssetsTab %>" selected="<%= myAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="my-assets" /></aui:option>
		<aui:option value="<%= allAssetsTab %>" selected="<%= allAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="all-assets" /></aui:option>
	</aui:select>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>

</aui:form>