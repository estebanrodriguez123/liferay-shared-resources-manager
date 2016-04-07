/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.rivetlogic.assetmanagement.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Manrique Varela
 */
public class AssetRequestClp extends BaseModelImpl<AssetRequest>
	implements AssetRequest {
	public AssetRequestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssetRequest.class;
	}

	@Override
	public String getModelClassName() {
		return AssetRequest.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _assetRequestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetRequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetRequestId", getAssetRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("assetId", getAssetId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("userName", getUserName());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("assingedDate", getAssingedDate());
		attributes.put("bookedDate", getBookedDate());
		attributes.put("returnedDate", getReturnedDate());
		attributes.put("status", getStatus());
		attributes.put("priority", getPriority());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetRequestId = (Long)attributes.get("assetRequestId");

		if (assetRequestId != null) {
			setAssetRequestId(assetRequestId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		Date assingedDate = (Date)attributes.get("assingedDate");

		if (assingedDate != null) {
			setAssingedDate(assingedDate);
		}

		Date bookedDate = (Date)attributes.get("bookedDate");

		if (bookedDate != null) {
			setBookedDate(bookedDate);
		}

		Date returnedDate = (Date)attributes.get("returnedDate");

		if (returnedDate != null) {
			setReturnedDate(returnedDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_assetRequestRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetRequestId() {
		return _assetRequestId;
	}

	@Override
	public void setAssetRequestId(long assetRequestId) {
		_assetRequestId = assetRequestId;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetRequestId", long.class);

				method.invoke(_assetRequestRemoteModel, assetRequestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_assetRequestRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_assetRequestRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_assetRequestRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_assetRequestRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_assetRequestRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_assetRequestRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_assetRequestRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_assetRequestRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAssingedDate() {
		return _assingedDate;
	}

	@Override
	public void setAssingedDate(Date assingedDate) {
		_assingedDate = assingedDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAssingedDate", Date.class);

				method.invoke(_assetRequestRemoteModel, assingedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBookedDate() {
		return _bookedDate;
	}

	@Override
	public void setBookedDate(Date bookedDate) {
		_bookedDate = bookedDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setBookedDate", Date.class);

				method.invoke(_assetRequestRemoteModel, bookedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReturnedDate() {
		return _returnedDate;
	}

	@Override
	public void setReturnedDate(Date returnedDate) {
		_returnedDate = returnedDate;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setReturnedDate", Date.class);

				method.invoke(_assetRequestRemoteModel, returnedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_assetRequestRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPriority() {
		return _priority;
	}

	@Override
	public void setPriority(String priority) {
		_priority = priority;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", String.class);

				method.invoke(_assetRequestRemoteModel, priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_assetRequestRemoteModel != null) {
			try {
				Class<?> clazz = _assetRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_assetRequestRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				AssetRequest.class.getName()));
	}

	public BaseModel<?> getAssetRequestRemoteModel() {
		return _assetRequestRemoteModel;
	}

	public void setAssetRequestRemoteModel(BaseModel<?> assetRequestRemoteModel) {
		_assetRequestRemoteModel = assetRequestRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assetRequestRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assetRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetRequestLocalServiceUtil.addAssetRequest(this);
		}
		else {
			AssetRequestLocalServiceUtil.updateAssetRequest(this);
		}
	}

	@Override
	public AssetRequest toEscapedModel() {
		return (AssetRequest)ProxyUtil.newProxyInstance(AssetRequest.class.getClassLoader(),
			new Class[] { AssetRequest.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetRequestClp clone = new AssetRequestClp();

		clone.setUuid(getUuid());
		clone.setAssetRequestId(getAssetRequestId());
		clone.setGroupId(getGroupId());
		clone.setAssetId(getAssetId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCompanyId(getCompanyId());
		clone.setUserName(getUserName());
		clone.setRequestedDate(getRequestedDate());
		clone.setAssingedDate(getAssingedDate());
		clone.setBookedDate(getBookedDate());
		clone.setReturnedDate(getReturnedDate());
		clone.setStatus(getStatus());
		clone.setPriority(getPriority());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(AssetRequest assetRequest) {
		int value = 0;

		if (getAssetRequestId() < assetRequest.getAssetRequestId()) {
			value = -1;
		}
		else if (getAssetRequestId() > assetRequest.getAssetRequestId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetRequestClp)) {
			return false;
		}

		AssetRequestClp assetRequest = (AssetRequestClp)obj;

		long primaryKey = assetRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assetRequestId=");
		sb.append(getAssetRequestId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", assingedDate=");
		sb.append(getAssingedDate());
		sb.append(", bookedDate=");
		sb.append(getBookedDate());
		sb.append(", returnedDate=");
		sb.append(getReturnedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.assetmanagement.model.AssetRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetRequestId</column-name><column-value><![CDATA[");
		sb.append(getAssetRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assingedDate</column-name><column-value><![CDATA[");
		sb.append(getAssingedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookedDate</column-name><column-value><![CDATA[");
		sb.append(getBookedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>returnedDate</column-name><column-value><![CDATA[");
		sb.append(getReturnedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _assetRequestId;
	private long _groupId;
	private long _assetId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _companyId;
	private String _userName;
	private Date _requestedDate;
	private Date _assingedDate;
	private Date _bookedDate;
	private Date _returnedDate;
	private String _status;
	private String _priority;
	private String _description;
	private BaseModel<?> _assetRequestRemoteModel;
	private Class<?> _clpSerializerClass = com.rivetlogic.assetmanagement.service.ClpSerializer.class;
}