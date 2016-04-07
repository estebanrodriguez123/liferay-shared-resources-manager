<%@include file="/html/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	String currentURL = PortalUtil.getCurrentURL(renderRequest);

	long assetId = ParamUtil.getLong(request, "assetId");
	long toUserId = ParamUtil.getLong(request, "toUserId");
	
	String messageType = ParamUtil.getString(request, "messageType");
%>


<liferay-ui:header backURL="<%=redirect%>" escapeXml="<%=false%>"
	localizeTitle="<%=true%>" showBackURL="<%=true%>" title="message-asset" />

<portlet:actionURL name="addAssetMessage" var="addAssetMessageURL" />
<p>
	<liferay-ui:message key="send-msg-to" />
	<%=PortalUtil.getUserName(toUserId, "")%>
</p>
<aui:form action="<%=addAssetMessageURL%>" method="POST"
	name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%=redirect%>" />
		<aui:input name="assetId" type="hidden"
			value="<%=String.valueOf(assetId)%>" />
		<aui:input name="toUserId" type="hidden"
			value="<%=String.valueOf(toUserId)%>" />

		<aui:input name="messageType" type="hidden" value="<%=messageType%>" />

		<aui:input name="message" type="textarea" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="send"></aui:button>
		<aui:button type="cancel" onClick="<%= redirect %>"></aui:button>
	</aui:button-row>

</aui:form>