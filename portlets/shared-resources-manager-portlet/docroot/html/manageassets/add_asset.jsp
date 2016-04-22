<%@include file="/html/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	Asset asset = AssetLocalServiceUtil.createAsset(0);

	List<AssetCategory> categories = AssetCategoryLocalServiceUtil.getAssetCategories(themeDisplay.getScopeGroupId(),
			themeDisplay.getCompanyId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	List<AssetLocation> locations = AssetLocationLocalServiceUtil.getAssetLocations(themeDisplay.getScopeGroupId(),
			themeDisplay.getCompanyId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<portlet:renderURL var="viewManageAssetsURL" />

<portlet:actionURL var="addAssetURL" name="addAsset" />

<liferay-ui:header backURL="<%=viewManageAssetsURL%>"
	escapeXml="<%=false%>" localizeTitle="<%=true%>"
	showBackURL="<%=true%>" title="add-asset" />

<liferay-ui:error key="asset-location-required"
	message="asset-location-required" />
<liferay-ui:error key="asset-category-required"
	message="asset-category-required" />
<liferay-ui:error key="asset-name-required"
	message="asset-name-required" />
<liferay-ui:error key="asset-description-required"
	message="asset-description-required" />


<aui:model-context bean="<%=asset%>" model="<%=Asset.class%>" />

<aui:form action="<%=addAssetURL%>" method="POST"
	name="<portlet:namespace />fm">

	<aui:fieldset>

		<aui:input name="redirect" type="hidden" value="<%=redirect%>" />

		<aui:select name="location" showEmptyOption="true">
			<%
				for (AssetLocation location : locations) {
			%>
			<aui:option value="<%=location.getPrimaryKey()%>"><%=location.getName()%></aui:option>
			<%
				}
			%>
		</aui:select>

		<aui:select name="category" showEmptyOption="true">
			<%
				for (AssetCategory category : categories) {
			%>
			<aui:option value="<%=category.getPrimaryKey()%>"><%=category.getName()%></aui:option>
			<%
				}
			%>
		</aui:select>

		<aui:input name="name" />

		<aui:input name="description" type="textarea" />

		<aui:input name="active" type="checkbox" value="true" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>

		<aui:button type="cancel" onClick="<%= viewManageAssetsURL %>"></aui:button>

	</aui:button-row>

</aui:form>