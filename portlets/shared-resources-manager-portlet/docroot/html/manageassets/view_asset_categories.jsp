<%@include file="/html/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	String currentURL = PortalUtil.getCurrentURL(renderRequest);

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("redirect", redirect);
%>


<portlet:renderURL var="viewManageAssetsURL" />

<liferay-ui:header backURL="<%=viewManageAssetsURL%>"
	escapeXml="<%=false%>" localizeTitle="<%=true%>"
	showBackURL="<%=true%>" title="view-asset-categories" />


<portlet:actionURL name="addAssetCategory" var="addAssetCategoryURL" />


<liferay-ui:panel collapsible="true" extended="true" state="closed"
	title="Add Categories">
	<div class="form-search">
		<aui:form method="POST" action="<%=addAssetCategoryURL%>"
			name="<portlet:namespace />fm">
			<aui:fieldset>
				<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
				<aui:input name="name" placeholder="Category Name"></aui:input>
			</aui:fieldset>
			<aui:button type="submit" value="add-asset-category"></aui:button>
		</aui:form>
	</div>
</liferay-ui:panel>

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-categories">

	<liferay-ui:search-container-results
		results="<%=AssetCategoryLocalServiceUtil.getAssetCategories(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
						searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=AssetCategoryLocalServiceUtil.getAssetCategoriesCount(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId())%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetCategory"
		keyProperty="assetCategoryId" modelVar="assetCategory">

		<liferay-ui:search-container-column-text property="name" />

		<c:choose>
			<c:when
				test="<%=themeDisplay.getScopeGroupId() == assetCategory.getGroupId()%>">
				<portlet:actionURL name="deleteAssetCategory"
					var="deleteAssetCategoryURL">
					<portlet:param name="assetCategoryId"
						value="<%=String.valueOf(assetCategory.getAssetCategoryId())%>" />
					<portlet:param name="redirect" value="<%=currentURL%>" />
				</portlet:actionURL>
				<liferay-ui:search-container-column-text
					href="<%=deleteAssetCategoryURL%>">
					<liferay-ui:icon image="delete" />
				</liferay-ui:search-container-column-text>
			</c:when>
			<c:otherwise>
				<liferay-ui:search-container-column-text>
					<liferay-ui:message key="global-resource-category" />
				</liferay-ui:search-container-column-text>
			</c:otherwise>
		</c:choose>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>


<portlet:actionURL name="addAssetLocation" var="addAssetLocationURL" />


<liferay-ui:panel collapsible="true" extended="true" state="closed"
	title="Add Locations">
	<div class="form-search">
		<aui:form method="POST" action="<%=addAssetLocationURL%>"
			name="<portlet:namespace />fm">
			<aui:fieldset>
				<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
				<aui:input name="name" placeholder="Location Name"></aui:input>
			</aui:fieldset>
			<aui:button type="submit" value="add-asset-location"></aui:button>
		</aui:form>
	</div>
</liferay-ui:panel>

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-locations">

	<liferay-ui:search-container-results
		results="<%=AssetLocationLocalServiceUtil.getAssetLocations(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
						searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=AssetLocationLocalServiceUtil.getAssetLocationsCount(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId())%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetLocation"
		keyProperty="assetLocationId" modelVar="assetLocation">

		<liferay-ui:search-container-column-text property="name" />

		<c:choose>
			<c:when
				test="<%=themeDisplay.getScopeGroupId() == assetLocation.getGroupId()%>">
				<portlet:actionURL name="deleteAssetLocation"
					var="deleteAssetLocationURL">
					<portlet:param name="assetLocationId"
						value="<%=String.valueOf(assetLocation.getAssetLocationId())%>" />
					<portlet:param name="redirect" value="<%=currentURL%>" />
				</portlet:actionURL>
				<liferay-ui:search-container-column-text
					href="<%=deleteAssetLocationURL%>">
					<liferay-ui:icon image="delete" />
				</liferay-ui:search-container-column-text>
			</c:when>
			<c:otherwise>
				<liferay-ui:search-container-column-text>
					<liferay-ui:message key="global-resource-location" />
				</liferay-ui:search-container-column-text>
			</c:otherwise>
		</c:choose>


	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>