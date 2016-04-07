<%@include file="/html/init.jsp"%>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);

	PortletURL portletURL = renderResponse.createRenderURL();

	String orderByCol = ParamUtil.getString(renderRequest, "orderByCol");
	String orderByType = ParamUtil.getString(renderRequest, "orderByType");

	if (Validator.isNull(orderByCol)) {
		orderByCol = "createDate";
	}
	if (Validator.isNull(orderByType)) {
		orderByType = "desc";
	}

	String searchText = ParamUtil.getString(renderRequest, "searchText");

	String category = ParamUtil.getString(renderRequest, "category");

	String location = ParamUtil.getString(renderRequest, "location");

	List<AssetCategory> categories = AssetCategoryLocalServiceUtil.getAssetCategories(themeDisplay.getScopeGroupId(),
			themeDisplay.getCompanyId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	List<AssetLocation> locations = AssetLocationLocalServiceUtil.getAssetLocations(themeDisplay.getScopeGroupId(),
			themeDisplay.getCompanyId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<portlet:renderURL var="viewManageAssetsURL" />

<portlet:renderURL var="addAssetURL">
	<portlet:param name="mvcPath" value="/html/manageassets/add_asset.jsp" />
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:renderURL>

<portlet:renderURL var="vieAssetCategoriesURL">
	<portlet:param name="mvcPath"
		value="/html/manageassets/view_asset_categories.jsp" />
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:renderURL>

<aui:form method="POST" name="<portlet:namespace />fm">
	<aui:input name="searchText" value="<%=searchText%>" type="hidden"></aui:input>
	<aui:row>
		<aui:column>
			<aui:select name="category" showEmptyOption="true"
				onChange="this.form.submit()">
				<%
					for (AssetCategory categoryItem : categories) {
				%>
				<aui:option value="<%=categoryItem.getName()%>"><%=categoryItem.getName()%></aui:option>
				<%
					}
				%>
			</aui:select>
		</aui:column>
		<aui:column>
			<aui:select name="location" showEmptyOption="true"
				onChange="this.form.submit()">
				<%
					for (AssetLocation locationItem : locations) {
				%>
				<aui:option value="<%=locationItem.getName()%>"><%=locationItem.getName()%></aui:option>
				<%
					}
				%>
			</aui:select>
		</aui:column>
	</aui:row>
</aui:form>

<aui:nav-bar>
	<aui:nav>
		<aui:nav-item iconCssClass="icon-plus" label="add-asset"
			href="<%=addAssetURL%>">
		</aui:nav-item>
		<aui:nav-item href="<%=vieAssetCategoriesURL%>"
			iconCssClass="icon-categories" label="view-asset-categories" />
	</aui:nav>
	<aui:nav-bar-search cssClass="pull-right">
		<div class="form-search">
			<aui:form method="POST" name="<portlet:namespace />fm">
				<aui:input name="category" value="<%=category%>" type="hidden"></aui:input>
				<aui:input name="location" value="<%=location%>" type="hidden"></aui:input>
				<liferay-ui:input-search name="searchText" placeholder="Keywords" />
			</aui:form>
		</div>
	</aui:nav-bar-search>
</aui:nav-bar>

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-assets"
	orderByCol="<%=orderByCol%>" orderByType="<%=orderByType%>">

	<liferay-ui:search-container-results
		results="<%=AssetLocalServiceUtil.getAssets(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(), searchContainer.getStart(),
						searchContainer.getEnd(), orderByCol, orderByType, searchText, category, location)%>"
		total="<%=AssetLocalServiceUtil.getAssetsCount(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(), searchText, category,
						location)%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.Asset"
		keyProperty="assetId" modelVar="asset">

		<portlet:renderURL var="editAssetURL">
			<portlet:param name="mvcPath"
				value="/html/manageassets/edit_asset.jsp" />
			<portlet:param name="assetId"
				value="<%=String.valueOf(asset.getAssetId())%>" />
			<portlet:param name="redirect" value="<%=redirect%>" />
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text cssClass="table-column-image" name="image" href="<%=editAssetURL%>"  >

			<portlet:resourceURL var="imageResourceURL">
				<portlet:param name="assetId"
					value="<%=String.valueOf(asset.getAssetId())%>" />
			</portlet:resourceURL>

			<img class="column-image" src="<%=imageResourceURL.toString()%>"
				alt="<%=asset.getName()%>" />

		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text property="location"
			orderable="true" href="<%=editAssetURL%>" />

		<liferay-ui:search-container-column-text property="category"
			orderable="true" href="<%=editAssetURL%>" />

		<liferay-ui:search-container-column-text property="name"
			orderable="true" href="<%=editAssetURL%>" />

		<liferay-ui:search-container-column-text name="description"
			orderable="true" href="<%=editAssetURL%>"
			value="<%=StringUtil.shorten(asset.getDescription(), 35)%>" />

		<liferay-ui:search-container-column-text name="active"
			orderable="true" href="<%=editAssetURL%>">
			<c:choose>
				<c:when test="<%=asset.getActive()%>">
					<liferay-ui:icon image="check" message="" />
				</c:when>
				<c:otherwise>
					<liferay-ui:icon image="close" message="" />
				</c:otherwise>
			</c:choose>
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="status"
			value="<%=LanguageUtil.get(pageContext, AssetStatus.valueOf(asset.getStatus()).getName())%>"
			orderable="true" href="<%=editAssetURL%>" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>