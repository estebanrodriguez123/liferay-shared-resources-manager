<%@include file="/html/init.jsp"%>


<%
	String redirect = ParamUtil.getString(request, "redirect");

	String currentURL = PortalUtil.getCurrentURL(renderRequest);

	long assetId = ParamUtil.getLong(request, "assetId");
	
	Asset asset = AssetLocalServiceUtil.getAsset(assetId);
	
	List<AssetCategory> categories = AssetCategoryLocalServiceUtil.getAssetCategories(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
	QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	List<AssetLocation> locations = AssetLocationLocalServiceUtil.getAssetLocations(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
	QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>


<portlet:renderURL var="viewManageAssetsURL" />

<portlet:actionURL var="editAssetURL" name="editAsset" />
<portlet:actionURL var="editAssetPhotoURL" name="editAssetPhoto" />

<portlet:actionURL var="deleteAssetURL" name="deleteAsset">
	<portlet:param name="assetId"
		value="<%=String.valueOf(asset.getAssetId())%>" />
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:actionURL>


<liferay-ui:header backURL="<%=viewManageAssetsURL%>"
	escapeXml="<%=false%>" localizeTitle="<%=true%>"
	showBackURL="<%=true%>" title="edit-asset" />

<liferay-ui:error key="asset-location-required"
	message="asset-location-required" />
<liferay-ui:error key="asset-category-required"
	message="asset-category-required" />
<liferay-ui:error key="asset-name-required"
	message="asset-name-required" />
<liferay-ui:error key="asset-description-required"
	message="asset-description-required" />
<liferay-ui:error key="asset-photo-required"
	message="asset-photo-required" />
<liferay-ui:success key="asset-success-created" 
message="asset-success-created"/>
	
	

<aui:model-context bean="<%=asset%>" model="<%=Asset.class%>" />

<aui:row>

	<aui:col width="40">
		<portlet:resourceURL var="imageResourceURL">
			<portlet:param name="assetId" value="<%=String.valueOf(assetId)%>" />
		</portlet:resourceURL>
		
		<div class="resource-image-container">
			<img class="admin-img" src="<%=imageResourceURL.toString()%>" alt="<%=asset.getName()%>" />
		</div>

		<div class="control-group input-String-wrapper">
			<label class="control-label"> <liferay-ui:message
					key="status" />
			</label> <input class="field disabled lfr-input-text" disabled="disabled"
				name="status" type="text"
				style="color: <%=AssetStatus.valueOf(asset.getStatus()).getColor()%>"
				value="<%=LanguageUtil.get(pageContext, AssetStatus.valueOf(asset.getStatus()).getName())%>">
		</div>

		<aui:form action="<%=editAssetPhotoURL%>" method="POST"
			enctype="multipart/form-data" name="<portlet:namespace />fm">

			<aui:fieldset>
			
				<aui:input name="assetId" type="hidden" value="<%=String.valueOf(asset.getAssetId())%>"></aui:input>
				<aui:input name="redirect" type="hidden" value="<%=currentURL%>" ></aui:input>
			
				<aui:input name="photo" type="file" label="change-photo" />

			</aui:fieldset>

			<aui:button type="submit" value="update"></aui:button>

		</aui:form>


	</aui:col>
	
	<aui:col width="60">

		<aui:form action="<%=editAssetURL%>" method="POST"
			name="<portlet:namespace />fm">

			<aui:fieldset>

				<aui:input name="assetId" type="hidden" />

				<aui:input name="redirect" type="hidden" value="<%=redirect%>" />

				<aui:select name="location" showEmptyOption="true">
					<%
						for (AssetLocation location : locations) {
					%>
					<aui:option value="<%=location.getPrimaryKey()%>"
						selected="<%=location.getPrimaryKey() == asset.getLocation()%>"><%=location.getName()%></aui:option>
					<%
						}
					%>
				</aui:select>

				<aui:select name="category" showEmptyOption="true" >
					<%
						for (AssetCategory category : categories) {
					%>
					<aui:option value="<%=category.getPrimaryKey()%>"
						selected="<%=category.getPrimaryKey() ==asset.getCategory()%>"><%=category.getName()%></aui:option>
					<%
						}
					%>
				</aui:select>

				<aui:input name="name" />

				<aui:input name="description" type="textarea" />

				<aui:input name="active" type="checkbox"
					value="<%=String.valueOf(asset.getActive())%>" />

			</aui:fieldset>

			<aui:button-row>

				<aui:button type="submit"></aui:button>

				<aui:button type="cancel" onClick="<%= viewManageAssetsURL %>"></aui:button>

				<aui:button value="delete-asset" cssClass="btn-danger"
					onClick="javascript:confirmDel()" />

			</aui:button-row>

		</aui:form>

	</aui:col>

</aui:row>

<script type="text/javascript">
	function confirmDel() {
		var msg = "<liferay-ui:message key="asset-delete-confirm-message" />";
		if(confirm(msg)) {
			window.location.href = '<%=deleteAssetURL%>';
		} else {
			return false;
		}
	}
</script>