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

package com.liferay.vote.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.vote.model.VoteBallot;
import com.liferay.vote.model.VoteBallotModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VoteBallot service. Represents a row in the &quot;VoteBallot&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.vote.model.VoteBallotModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VoteBallotImpl}.
 * </p>
 *
 * @author Howie Chou
 * @see VoteBallotImpl
 * @see com.liferay.vote.model.VoteBallot
 * @see com.liferay.vote.model.VoteBallotModel
 * @generated
 */
public class VoteBallotModelImpl extends BaseModelImpl<VoteBallot>
	implements VoteBallotModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vote ballot model instance should use the {@link com.liferay.vote.model.VoteBallot} interface instead.
	 */
	public static final String TABLE_NAME = "VoteBallot";
	public static final Object[][] TABLE_COLUMNS = {
			{ "voteBallotId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "voteIdeaTypeId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "endDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table VoteBallot (voteBallotId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,voteIdeaTypeId LONG,name VARCHAR(75) null,description VARCHAR(75) null,endDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table VoteBallot";
	public static final String ORDER_BY_JPQL = " ORDER BY voteBallot.voteBallotId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VoteBallot.voteBallotId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.vote.model.VoteBallot"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.vote.model.VoteBallot"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.vote.model.VoteBallot"));

	public VoteBallotModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _voteBallotId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVoteBallotId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _voteBallotId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VoteBallot.class;
	}

	@Override
	public String getModelClassName() {
		return VoteBallot.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("voteBallotId", getVoteBallotId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("voteIdeaTypeId", getVoteIdeaTypeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long voteBallotId = (Long)attributes.get("voteBallotId");

		if (voteBallotId != null) {
			setVoteBallotId(voteBallotId);
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

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	@Override
	public long getVoteBallotId() {
		return _voteBallotId;
	}

	@Override
	public void setVoteBallotId(long voteBallotId) {
		_voteBallotId = voteBallotId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
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
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getVoteIdeaTypeId() {
		return _voteIdeaTypeId;
	}

	@Override
	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteIdeaTypeId = voteIdeaTypeId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			VoteBallot.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VoteBallot toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VoteBallot)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VoteBallotImpl voteBallotImpl = new VoteBallotImpl();

		voteBallotImpl.setVoteBallotId(getVoteBallotId());
		voteBallotImpl.setCompanyId(getCompanyId());
		voteBallotImpl.setUserId(getUserId());
		voteBallotImpl.setUserName(getUserName());
		voteBallotImpl.setCreateDate(getCreateDate());
		voteBallotImpl.setModifiedDate(getModifiedDate());
		voteBallotImpl.setVoteIdeaTypeId(getVoteIdeaTypeId());
		voteBallotImpl.setName(getName());
		voteBallotImpl.setDescription(getDescription());
		voteBallotImpl.setEndDate(getEndDate());

		voteBallotImpl.resetOriginalValues();

		return voteBallotImpl;
	}

	@Override
	public int compareTo(VoteBallot voteBallot) {
		long primaryKey = voteBallot.getPrimaryKey();

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

		if (!(obj instanceof VoteBallot)) {
			return false;
		}

		VoteBallot voteBallot = (VoteBallot)obj;

		long primaryKey = voteBallot.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<VoteBallot> toCacheModel() {
		VoteBallotCacheModel voteBallotCacheModel = new VoteBallotCacheModel();

		voteBallotCacheModel.voteBallotId = getVoteBallotId();

		voteBallotCacheModel.companyId = getCompanyId();

		voteBallotCacheModel.userId = getUserId();

		voteBallotCacheModel.userName = getUserName();

		String userName = voteBallotCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			voteBallotCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			voteBallotCacheModel.createDate = createDate.getTime();
		}
		else {
			voteBallotCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			voteBallotCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			voteBallotCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		voteBallotCacheModel.voteIdeaTypeId = getVoteIdeaTypeId();

		voteBallotCacheModel.name = getName();

		String name = voteBallotCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			voteBallotCacheModel.name = null;
		}

		voteBallotCacheModel.description = getDescription();

		String description = voteBallotCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			voteBallotCacheModel.description = null;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			voteBallotCacheModel.endDate = endDate.getTime();
		}
		else {
			voteBallotCacheModel.endDate = Long.MIN_VALUE;
		}

		return voteBallotCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{voteBallotId=");
		sb.append(getVoteBallotId());
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
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.vote.model.VoteBallot");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>voteBallotId</column-name><column-value><![CDATA[");
		sb.append(getVoteBallotId());
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
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VoteBallot.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			VoteBallot.class
		};
	private long _voteBallotId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _voteIdeaTypeId;
	private String _name;
	private String _description;
	private Date _endDate;
	private VoteBallot _escapedModel;
}