<%@page
	import="com.rivetlogic.assetmanagement.notifications.NotificationType"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@include file="/html/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	String currentURL = PortalUtil.getCurrentURL(renderRequest);

	String tab = ParamUtil.getString(request, "tabs1");

	long assetId = ParamUtil.getLong(request, "assetId");

	Asset asset = AssetLocalServiceUtil.getAsset(assetId);

	String orderByCol = ParamUtil.getString(renderRequest, "orderByCol");
	String orderByType = ParamUtil.getString(renderRequest, "orderByType");

	if (Validator.isNull(orderByCol)) {
		orderByCol = "createDate";
	}
	if (Validator.isNull(orderByType)) {
		orderByType = "desc";
	}

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("tabs1", tab);
	portletURL.setParameter("mvcPath", "/html/asset/request_asset.jsp");
	portletURL.setParameter("assetId", String.valueOf(assetId));
	portletURL.setParameter("redirect", redirect);

	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, themeDisplay.getLocale());
%>

<portlet:renderURL var="viewAssetsURL">
	<portlet:param name="tabs1" value="<%=tab%>" />
</portlet:renderURL>

<portlet:actionURL var="bookAssetURL" name="bookAsset" />
<portlet:actionURL var="returnAssetURL" name="returnAsset" />

<portlet:actionURL var="receiveAssetURL" name="receiveAsset">
	<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:actionURL>

<portlet:actionURL var="deleteAssetRequestURL" name="deleteAssetRequest">
	<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:actionURL>

<portlet:actionURL var="rejectAssetRequestURL" name="rejectAssetRequest">
	<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:actionURL>

<portlet:renderURL var="messageAssetURL">
	<portlet:param name="mvcPath" value="/html/asset/message_asset.jsp" />
	<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
	<portlet:param name="messageType"
		value="<%=NotificationType.MESSAGE_SEND%>" />
	<portlet:param name="toUserId"
		value="<%=String.valueOf(asset.getCurrentUserId())%>" />
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>

<liferay-ui:header backURL="<%=viewAssetsURL%>" escapeXml="false"
	localizeTitle="true" showBackURL="true" title="request-asset" />

<aui:row>
	<aui:col cssClass="resource-image-container" width="30">
		<portlet:resourceURL var="imageResourceURL">
			<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
		</portlet:resourceURL>
		<img class="" src="<%=imageResourceURL.toString()%>"
				alt="<%=asset.getName()%>" />
	</aui:col>
	<aui:column width="70">

		<!-- Info of asset and request date -->
		<liferay-ui:message key="location" />:
		<%=AssetLocationLocalServiceUtil.fetchAssetLocation(asset.getLocation()).getName()%><br />

		<liferay-ui:message key="category" />:
		<%=AssetCategoryLocalServiceUtil.fetchAssetCategory(asset.getCategory()).getName()%><br />

		<liferay-ui:message key="name" />:
		<%=asset.getName()%><br />

		<liferay-ui:message key="description" />:
		<br />
		<div><%=asset.getDescription()%></div>
		<br />

		<liferay-ui:message key="status" />:
		<span
			style="color: <%=AssetStatus.valueOf(asset.getStatus()).getColor()%>"><%=LanguageUtil.get(pageContext, AssetStatus.valueOf(asset.getStatus()).getName())%></span>

		<c:if
			test="<%=asset.getStatus().equals(AssetStatus.BOOKED.toString())%>">

			<liferay-ui:message key="assigned-user" />
			<%=PortalUtil.getUserName(asset.getCurrentUserId(), "")%>

			<c:if
				test="<%=themeDisplay.getUserId() != asset.getCurrentUserId()%>">
				
					(<aui:a value="send-message" id="send-message"
					href="<%=messageAssetURL%>">
					<liferay-ui:message key="send-message" />
				</aui:a>)
				
			</c:if>
		</c:if>
		
		<!--TODO: check if already in waiting list   -->
		<c:choose>
			<c:when
				test="<%=asset.getStatus().equals(AssetStatus.BOOKED.toString()) && themeDisplay.getUserId() == asset.getCurrentUserId()%>">
				<aui:form action="<%=returnAssetURL%>" method="POST"
					name="<portlet:namespace />fm">
					<aui:input name="assetId" type="hidden" value="<%=assetId%>" />
					<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
					<aui:button-row>
						<aui:button type="submit" value="return-asset"></aui:button>
					</aui:button-row>
				</aui:form>
			</c:when>
			<c:when
				test='<%=AssetRequestLocalServiceUtil.hasUserAssetRequests(assetId, themeDisplay.getUserId(), "REQUESTED")%>'>

				<aui:button-row>
					<aui:button type="submit" disabled="true" value="receive-asset"></aui:button>
					<aui:button type="submit" onClick="<%= deleteAssetRequestURL %>"
						cssClass="btn-danger" value="cancel-pending-booking"></aui:button>
				</aui:button-row>
			</c:when>
			<c:when
				test='<%=AssetRequestLocalServiceUtil.hasUserAssetRequests(assetId, themeDisplay.getUserId(), "ASSIGNED")%>'>

				<aui:button-row>
					<aui:button type="submit" onClick="<%= receiveAssetURL %>"
						value="receive-asset"></aui:button>
					<aui:button type="submit" onClick="<%= rejectAssetRequestURL %>"
						cssClass="btn-danger" value="cancel-pending-booking"></aui:button>
				</aui:button-row>

			</c:when>
			<c:otherwise>
				<aui:form action="<%=bookAssetURL%>" method="POST"
					name="<portlet:namespace />fm">
					<aui:input name="assetId" type="hidden" value="<%=assetId%>" />
					<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
					<aui:button-row>
						<aui:button type="submit" value="book-asset"></aui:button>
					</aui:button-row>
				</aui:form>
			</c:otherwise>
		</c:choose>
	</aui:column>
</aui:row>

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-requests">

	<liferay-ui:search-container-results
		results="<%=AssetRequestLocalServiceUtil.getRequestsByAsset(assetId, searchContainer.getStart(), searchContainer.getEnd(), orderByCol,
						orderByType)%>"
		total="<%=AssetRequestLocalServiceUtil.getRequestsCountByAsset(assetId)%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetRequest"
		keyProperty="assetRequestId" modelVar="assetRequest">

		<liferay-ui:search-container-column-date property="requestedDate" />
		<liferay-ui:search-container-column-date property="assingedDate" />
		<liferay-ui:search-container-column-date property="bookedDate" />
		<liferay-ui:search-container-column-date property="returnedDate" />
		<liferay-ui:search-container-column-text name="user-name"
			value="<%=PortalUtil.getUserName(assetRequest.getUserId(),\"\")%>" />
		<liferay-ui:search-container-column-text name="status" value="<%=LanguageUtil.get(pageContext, assetRequest.getStatus().toLowerCase())%>" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>



<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-messages">

	<liferay-ui:search-container-results
		results="<%=AssetMessageLocalServiceUtil.getAssetMessages(assetId, themeDisplay.getUserId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS)%>"
		total="<%=AssetMessageLocalServiceUtil.getAssetMessagesCount(assetId, themeDisplay.getUserId())%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetMessage"
		keyProperty="assetMessageId" modelVar="message">

		<liferay-ui:search-container-column-text name="messages">

			<aui:row>
				<aui:column columnWidth="10">
					<img class="avatar"
						src="<%=UserLocalServiceUtil.getUser(message.getFromUserId()).getPortraitURL(themeDisplay)%>">
				</aui:column>
				<aui:column columnWidth="90">
					<aui:row>
						<aui:column>
							<b><%=PortalUtil.getUserName(message.getFromUserId(), "")%></b>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column>
							<i><small><%=df.format(message.getCreateDate())%></small></i>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="100" cssClass="asset-message">
							<%=StringUtil.replace(message.getMessage(), "\n", "<br/>")%>
						</aui:column>
					</aui:row>

					<c:if
						test="<%=themeDisplay.getUserId() != message.getFromUserId()%>">
						<aui:row>
							<aui:column>
								<portlet:renderURL var="replyAssetURL">
									<portlet:param name="mvcPath"
										value="/html/asset/message_asset.jsp" />
									<portlet:param name="messageType"
										value="<%=NotificationType.MESSAGE_REPLY%>" />
									<portlet:param name="assetId"
										value="<%=String.valueOf(assetId)%>" />
									<portlet:param name="toUserId"
										value="<%=String.valueOf(message.getFromUserId())%>" />
									<portlet:param name="redirect" value="<%=currentURL%>" />
								</portlet:renderURL>

								<aui:a href="<%=replyAssetURL%>">Reply</aui:a>
							</aui:column>
						</aui:row>
					</c:if>
				</aui:column>
			</aui:row>

		</liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="false" />
</liferay-ui:search-container>


