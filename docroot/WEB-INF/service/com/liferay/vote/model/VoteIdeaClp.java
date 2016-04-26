/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.vote.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.vote.service.ClpSerializer;
import com.liferay.vote.service.VoteIdeaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Howie Chou
 */
public class VoteIdeaClp extends BaseModelImpl<VoteIdea> implements VoteIdea {
	public VoteIdeaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VoteIdea.class;
	}

	@Override
	public String getModelClassName() {
		return VoteIdea.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _voteIdeaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVoteIdeaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _voteIdeaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("voteIdeaId", getVoteIdeaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("voteIdeaTypeId", getVoteIdeaTypeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long voteIdeaId = (Long)attributes.get("voteIdeaId");

		if (voteIdeaId != null) {
			setVoteIdeaId(voteIdeaId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long voteIdeaTypeId = (Long)attributes.get("voteIdeaTypeId");

		if (voteIdeaTypeId != null) {
			setVoteIdeaTypeId(voteIdeaTypeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getVoteIdeaId() {
		return _voteIdeaId;
	}

	@Override
	public void setVoteIdeaId(long voteIdeaId) {
		_voteIdeaId = voteIdeaId;

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setVoteIdeaId", long.class);

				method.invoke(_voteIdeaRemoteModel, voteIdeaId);
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

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_voteIdeaRemoteModel, companyId);
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

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_voteIdeaRemoteModel, userId);
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
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_voteIdeaRemoteModel, userName);
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

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_voteIdeaRemoteModel, createDate);
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

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_voteIdeaRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVoteIdeaTypeId() {
		return _voteIdeaTypeId;
	}

	@Override
	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteIdeaTypeId = voteIdeaTypeId;

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setVoteIdeaTypeId", long.class);

				method.invoke(_voteIdeaRemoteModel, voteIdeaTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_voteIdeaRemoteModel, name);
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

		if (_voteIdeaRemoteModel != null) {
			try {
				Class<?> clazz = _voteIdeaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_voteIdeaRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVoteIdeaRemoteModel() {
		return _voteIdeaRemoteModel;
	}

	public void setVoteIdeaRemoteModel(BaseModel<?> voteIdeaRemoteModel) {
		_voteIdeaRemoteModel = voteIdeaRemoteModel;
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

		Class<?> remoteModelClass = _voteIdeaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_voteIdeaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VoteIdeaLocalServiceUtil.addVoteIdea(this);
		}
		else {
			VoteIdeaLocalServiceUtil.updateVoteIdea(this);
		}
	}

	@Override
	public VoteIdea toEscapedModel() {
		return (VoteIdea)ProxyUtil.newProxyInstance(VoteIdea.class.getClassLoader(),
			new Class[] { VoteIdea.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VoteIdeaClp clone = new VoteIdeaClp();

		clone.setVoteIdeaId(getVoteIdeaId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setVoteIdeaTypeId(getVoteIdeaTypeId());
		clone.setName(getName());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(VoteIdea voteIdea) {
		long primaryKey = voteIdea.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VoteIdeaClp)) {
			return false;
		}

		VoteIdeaClp voteIdea = (VoteIdeaClp)obj;

		long primaryKey = voteIdea.getPrimaryKey();

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

		sb.append("{voteIdeaId=");
		sb.append(getVoteIdeaId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", voteIdeaTypeId=");
		sb.append(getVoteIdeaTypeId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.vote.model.VoteIdea");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>voteIdeaId</column-name><column-value><![CDATA[");
		sb.append(getVoteIdeaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>voteIdeaTypeId</column-name><column-value><![CDATA[");
		sb.append(getVoteIdeaTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _voteIdeaId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _voteIdeaTypeId;
	private String _name;
	private String _description;
	private BaseModel<?> _voteIdeaRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.vote.service.ClpSerializer.class;
}