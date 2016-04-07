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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.rivetlogic.assetmanagement.service.AssetMessageLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Manrique Varela
 */
public class AssetMessageClp extends BaseModelImpl<AssetMessage>
	implements AssetMessage {
	public AssetMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssetMessage.class;
	}

	@Override
	public String getModelClassName() {
		return AssetMessage.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _assetMessageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetMessageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetMessageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetMessageId", getAssetMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("assetId", getAssetId());
		attributes.put("fromUserId", getFromUserId());
		attributes.put("toUserId", getToUserId());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetMessageId = (Long)attributes.get("assetMessageId");

		if (assetMessageId != null) {
			setAssetMessageId(assetMessageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long fromUserId = (Long)attributes.get("fromUserId");

		if (fromUserId != null) {
			setFromUserId(fromUserId);
		}

		Long toUserId = (Long)attributes.get("toUserId");

		if (toUserId != null) {
			setToUserId(toUserId);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_assetMessageRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetMessageId() {
		return _assetMessageId;
	}

	@Override
	public void setAssetMessageId(long assetMessageId) {
		_assetMessageId = assetMessageId;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetMessageId", long.class);

				method.invoke(_assetMessageRemoteModel, assetMessageId);
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

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_assetMessageRemoteModel, groupId);
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

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_assetMessageRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_assetMessageRemoteModel, createDate);
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

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_assetMessageRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFromUserId() {
		return _fromUserId;
	}

	@Override
	public void setFromUserId(long fromUserId) {
		_fromUserId = fromUserId;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setFromUserId", long.class);

				method.invoke(_assetMessageRemoteModel, fromUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFromUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getFromUserId(), "uuid", _fromUserUuid);
	}

	@Override
	public void setFromUserUuid(String fromUserUuid) {
		_fromUserUuid = fromUserUuid;
	}

	@Override
	public long getToUserId() {
		return _toUserId;
	}

	@Override
	public void setToUserId(long toUserId) {
		_toUserId = toUserId;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setToUserId", long.class);

				method.invoke(_assetMessageRemoteModel, toUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getToUserId(), "uuid", _toUserUuid);
	}

	@Override
	public void setToUserUuid(String toUserUuid) {
		_toUserUuid = toUserUuid;
	}

	@Override
	public String getMessage() {
		return _message;
	}

	@Override
	public void setMessage(String message) {
		_message = message;

		if (_assetMessageRemoteModel != null) {
			try {
				Class<?> clazz = _assetMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMessage", String.class);

				method.invoke(_assetMessageRemoteModel, message);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetMessageRemoteModel() {
		return _assetMessageRemoteModel;
	}

	public void setAssetMessageRemoteModel(BaseModel<?> assetMessageRemoteModel) {
		_assetMessageRemoteModel = assetMessageRemoteModel;
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

		Class<?> remoteModelClass = _assetMessageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assetMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetMessageLocalServiceUtil.addAssetMessage(this);
		}
		else {
			AssetMessageLocalServiceUtil.updateAssetMessage(this);
		}
	}

	@Override
	public AssetMessage toEscapedModel() {
		return (AssetMessage)ProxyUtil.newProxyInstance(AssetMessage.class.getClassLoader(),
			new Class[] { AssetMessage.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetMessageClp clone = new AssetMessageClp();

		clone.setUuid(getUuid());
		clone.setAssetMessageId(getAssetMessageId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setAssetId(getAssetId());
		clone.setFromUserId(getFromUserId());
		clone.setToUserId(getToUserId());
		clone.setMessage(getMessage());

		return clone;
	}

	@Override
	public int compareTo(AssetMessage assetMessage) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), assetMessage.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof AssetMessageClp)) {
			return false;
		}

		AssetMessageClp assetMessage = (AssetMessageClp)obj;

		long primaryKey = assetMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assetMessageId=");
		sb.append(getAssetMessageId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", fromUserId=");
		sb.append(getFromUserId());
		sb.append(", toUserId=");
		sb.append(getToUserId());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.assetmanagement.model.AssetMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetMessageId</column-name><column-value><![CDATA[");
		sb.append(getAssetMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromUserId</column-name><column-value><![CDATA[");
		sb.append(getFromUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toUserId</column-name><column-value><![CDATA[");
		sb.append(getToUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _assetMessageId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _assetId;
	private long _fromUserId;
	private String _fromUserUuid;
	private long _toUserId;
	private String _toUserUuid;
	private String _message;
	private BaseModel<?> _assetMessageRemoteModel;
	private Class<?> _clpSerializerClass = com.rivetlogic.assetmanagement.service.ClpSerializer.class;
}