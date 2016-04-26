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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VoteIdeaType}.
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdeaType
 * @generated
 */
public class VoteIdeaTypeWrapper implements VoteIdeaType,
	ModelWrapper<VoteIdeaType> {
	public VoteIdeaTypeWrapper(VoteIdeaType voteIdeaType) {
		_voteIdeaType = voteIdeaType;
	}

	@Override
	public Class<?> getModelClass() {
		return VoteIdeaType.class;
	}

	@Override
	public String getModelClassName() {
		return VoteIdeaType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("voteIdeaTypeId", getVoteIdeaTypeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long voteIdeaTypeId = (Long)attributes.get("voteIdeaTypeId");

		if (voteIdeaTypeId != null) {
			setVoteIdeaTypeId(voteIdeaTypeId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this vote idea type.
	*
	* @return the primary key of this vote idea type
	*/
	@Override
	public long getPrimaryKey() {
		return _voteIdeaType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vote idea type.
	*
	* @param primaryKey the primary key of this vote idea type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_voteIdeaType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vote idea type ID of this vote idea type.
	*
	* @return the vote idea type ID of this vote idea type
	*/
	@Override
	public long getVoteIdeaTypeId() {
		return _voteIdeaType.getVoteIdeaTypeId();
	}

	/**
	* Sets the vote idea type ID of this vote idea type.
	*
	* @param voteIdeaTypeId the vote idea type ID of this vote idea type
	*/
	@Override
	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteIdeaType.setVoteIdeaTypeId(voteIdeaTypeId);
	}

	/**
	* Returns the company ID of this vote idea type.
	*
	* @return the company ID of this vote idea type
	*/
	@Override
	public long getCompanyId() {
		return _voteIdeaType.getCompanyId();
	}

	/**
	* Sets the company ID of this vote idea type.
	*
	* @param companyId the company ID of this vote idea type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_voteIdeaType.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vote idea type.
	*
	* @return the user ID of this vote idea type
	*/
	@Override
	public long getUserId() {
		return _voteIdeaType.getUserId();
	}

	/**
	* Sets the user ID of this vote idea type.
	*
	* @param userId the user ID of this vote idea type
	*/
	@Override
	public void setUserId(long userId) {
		_voteIdeaType.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vote idea type.
	*
	* @return the user uuid of this vote idea type
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaType.getUserUuid();
	}

	/**
	* Sets the user uuid of this vote idea type.
	*
	* @param userUuid the user uuid of this vote idea type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_voteIdeaType.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vote idea type.
	*
	* @return the user name of this vote idea type
	*/
	@Override
	public java.lang.String getUserName() {
		return _voteIdeaType.getUserName();
	}

	/**
	* Sets the user name of this vote idea type.
	*
	* @param userName the user name of this vote idea type
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_voteIdeaType.setUserName(userName);
	}

	/**
	* Returns the create date of this vote idea type.
	*
	* @return the create date of this vote idea type
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _voteIdeaType.getCreateDate();
	}

	/**
	* Sets the create date of this vote idea type.
	*
	* @param createDate the create date of this vote idea type
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_voteIdeaType.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vote idea type.
	*
	* @return the modified date of this vote idea type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _voteIdeaType.getModifiedDate();
	}

	/**
	* Sets the modified date of this vote idea type.
	*
	* @param modifiedDate the modified date of this vote idea type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_voteIdeaType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this vote idea type.
	*
	* @return the name of this vote idea type
	*/
	@Override
	public java.lang.String getName() {
		return _voteIdeaType.getName();
	}

	/**
	* Sets the name of this vote idea type.
	*
	* @param name the name of this vote idea type
	*/
	@Override
	public void setName(java.lang.String name) {
		_voteIdeaType.setName(name);
	}

	@Override
	public boolean isNew() {
		return _voteIdeaType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_voteIdeaType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _voteIdeaType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_voteIdeaType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _voteIdeaType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _voteIdeaType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_voteIdeaType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _voteIdeaType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_voteIdeaType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_voteIdeaType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_voteIdeaType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VoteIdeaTypeWrapper((VoteIdeaType)_voteIdeaType.clone());
	}

	@Override
	public int compareTo(com.liferay.vote.model.VoteIdeaType voteIdeaType) {
		return _voteIdeaType.compareTo(voteIdeaType);
	}

	@Override
	public int hashCode() {
		return _voteIdeaType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.vote.model.VoteIdeaType> toCacheModel() {
		return _voteIdeaType.toCacheModel();
	}

	@Override
	public com.liferay.vote.model.VoteIdeaType toEscapedModel() {
		return new VoteIdeaTypeWrapper(_voteIdeaType.toEscapedModel());
	}

	@Override
	public com.liferay.vote.model.VoteIdeaType toUnescapedModel() {
		return new VoteIdeaTypeWrapper(_voteIdeaType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _voteIdeaType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _voteIdeaType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_voteIdeaType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VoteIdeaTypeWrapper)) {
			return false;
		}

		VoteIdeaTypeWrapper voteIdeaTypeWrapper = (VoteIdeaTypeWrapper)obj;

		if (Validator.equals(_voteIdeaType, voteIdeaTypeWrapper._voteIdeaType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VoteIdeaType getWrappedVoteIdeaType() {
		return _voteIdeaType;
	}

	@Override
	public VoteIdeaType getWrappedModel() {
		return _voteIdeaType;
	}

	@Override
	public void resetOriginalValues() {
		_voteIdeaType.resetOriginalValues();
	}

	private VoteIdeaType _voteIdeaType;
}