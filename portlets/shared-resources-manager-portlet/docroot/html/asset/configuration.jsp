<%@include file="/html/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>

<%
	int time_cfg = GetterUtil.getInteger(portletPreferences.getValue("time", StringPool.TRUE));
	int minutes_cfg = GetterUtil.getInteger(portletPreferences.getValue("minutes", StringPool.TRUE));
%>

<liferay-portlet:actionURL var="configurationURL"
	portletConfiguration="true">
</liferay-portlet:actionURL>


<p style="font-size: medium;"><liferay-ui:message key="configuration-description" /></p>


<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />

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

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>

</aui:form>