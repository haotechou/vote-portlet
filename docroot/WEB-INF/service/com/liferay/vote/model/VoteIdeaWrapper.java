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
 * This class is a wrapper for {@link VoteIdea}.
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdea
 * @generated
 */
public class VoteIdeaWrapper implements VoteIdea, ModelWrapper<VoteIdea> {
	public VoteIdeaWrapper(VoteIdea voteIdea) {
		_voteIdea = voteIdea;
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

	/**
	* Returns the primary key of this vote idea.
	*
	* @return the primary key of this vote idea
	*/
	@Override
	public long getPrimaryKey() {
		return _voteIdea.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vote idea.
	*
	* @param primaryKey the primary key of this vote idea
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_voteIdea.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vote idea ID of this vote idea.
	*
	* @return the vote idea ID of this vote idea
	*/
	@Override
	public long getVoteIdeaId() {
		return _voteIdea.getVoteIdeaId();
	}

	/**
	* Sets the vote idea ID of this vote idea.
	*
	* @param voteIdeaId the vote idea ID of this vote idea
	*/
	@Override
	public void setVoteIdeaId(long voteIdeaId) {
		_voteIdea.setVoteIdeaId(voteIdeaId);
	}

	/**
	* Returns the company ID of this vote idea.
	*
	* @return the company ID of this vote idea
	*/
	@Override
	public long getCompanyId() {
		return _voteIdea.getCompanyId();
	}

	/**
	* Sets the company ID of this vote idea.
	*
	* @param companyId the company ID of this vote idea
	*/
	@Override
	public void setCompanyId(long companyId) {
		_voteIdea.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vote idea.
	*
	* @return the user ID of this vote idea
	*/
	@Override
	public long getUserId() {
		return _voteIdea.getUserId();
	}

	/**
	* Sets the user ID of this vote idea.
	*
	* @param userId the user ID of this vote idea
	*/
	@Override
	public void setUserId(long userId) {
		_voteIdea.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vote idea.
	*
	* @return the user uuid of this vote idea
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdea.getUserUuid();
	}

	/**
	* Sets the user uuid of this vote idea.
	*
	* @param userUuid the user uuid of this vote idea
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_voteIdea.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vote idea.
	*
	* @return the user name of this vote idea
	*/
	@Override
	public java.lang.String getUserName() {
		return _voteIdea.getUserName();
	}

	/**
	* Sets the user name of this vote idea.
	*
	* @param userName the user name of this vote idea
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_voteIdea.setUserName(userName);
	}

	/**
	* Returns the create date of this vote idea.
	*
	* @return the create date of this vote idea
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _voteIdea.getCreateDate();
	}

	/**
	* Sets the create date of this vote idea.
	*
	* @param createDate the create date of this vote idea
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_voteIdea.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vote idea.
	*
	* @return the modified date of this vote idea
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _voteIdea.getModifiedDate();
	}

	/**
	* Sets the modified date of this vote idea.
	*
	* @param modifiedDate the modified date of this vote idea
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_voteIdea.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the vote idea type ID of this vote idea.
	*
	* @return the vote idea type ID of this vote idea
	*/
	@Override
	public long getVoteIdeaTypeId() {
		return _voteIdea.getVoteIdeaTypeId();
	}

	/**
	* Sets the vote idea type ID of this vote idea.
	*
	* @param voteIdeaTypeId the vote idea type ID of this vote idea
	*/
	@Override
	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteIdea.setVoteIdeaTypeId(voteIdeaTypeId);
	}

	/**
	* Returns the name of this vote idea.
	*
	* @return the name of this vote idea
	*/
	@Override
	public java.lang.String getName() {
		return _voteIdea.getName();
	}

	/**
	* Sets the name of this vote idea.
	*
	* @param name the name of this vote idea
	*/
	@Override
	public void setName(java.lang.String name) {
		_voteIdea.setName(name);
	}

	/**
	* Returns the description of this vote idea.
	*
	* @return the description of this vote idea
	*/
	@Override
	public java.lang.String getDescription() {
		return _voteIdea.getDescription();
	}

	/**
	* Sets the description of this vote idea.
	*
	* @param description the description of this vote idea
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_voteIdea.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _voteIdea.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_voteIdea.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _voteIdea.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_voteIdea.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _voteIdea.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _voteIdea.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_voteIdea.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _voteIdea.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_voteIdea.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_voteIdea.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_voteIdea.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VoteIdeaWrapper((VoteIdea)_voteIdea.clone());
	}

	@Override
	public int compareTo(com.liferay.vote.model.VoteIdea voteIdea) {
		return _voteIdea.compareTo(voteIdea);
	}

	@Override
	public int hashCode() {
		return _voteIdea.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.vote.model.VoteIdea> toCacheModel() {
		return _voteIdea.toCacheModel();
	}

	@Override
	public com.liferay.vote.model.VoteIdea toEscapedModel() {
		return new VoteIdeaWrapper(_voteIdea.toEscapedModel());
	}

	@Override
	public com.liferay.vote.model.VoteIdea toUnescapedModel() {
		return new VoteIdeaWrapper(_voteIdea.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _voteIdea.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _voteIdea.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_voteIdea.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VoteIdeaWrapper)) {
			return false;
		}

		VoteIdeaWrapper voteIdeaWrapper = (VoteIdeaWrapper)obj;

		if (Validator.equals(_voteIdea, voteIdeaWrapper._voteIdea)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VoteIdea getWrappedVoteIdea() {
		return _voteIdea;
	}

	@Override
	public VoteIdea getWrappedModel() {
		return _voteIdea;
	}

	@Override
	public void resetOriginalValues() {
		_voteIdea.resetOriginalValues();
	}

	private VoteIdea _voteIdea;
}