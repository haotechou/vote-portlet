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
 * This class is a wrapper for {@link VoteBallot}.
 * </p>
 *
 * @author Howie Chou
 * @see VoteBallot
 * @generated
 */
public class VoteBallotWrapper implements VoteBallot, ModelWrapper<VoteBallot> {
	public VoteBallotWrapper(VoteBallot voteBallot) {
		_voteBallot = voteBallot;
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

	/**
	* Returns the primary key of this vote ballot.
	*
	* @return the primary key of this vote ballot
	*/
	@Override
	public long getPrimaryKey() {
		return _voteBallot.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vote ballot.
	*
	* @param primaryKey the primary key of this vote ballot
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_voteBallot.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vote ballot ID of this vote ballot.
	*
	* @return the vote ballot ID of this vote ballot
	*/
	@Override
	public long getVoteBallotId() {
		return _voteBallot.getVoteBallotId();
	}

	/**
	* Sets the vote ballot ID of this vote ballot.
	*
	* @param voteBallotId the vote ballot ID of this vote ballot
	*/
	@Override
	public void setVoteBallotId(long voteBallotId) {
		_voteBallot.setVoteBallotId(voteBallotId);
	}

	/**
	* Returns the company ID of this vote ballot.
	*
	* @return the company ID of this vote ballot
	*/
	@Override
	public long getCompanyId() {
		return _voteBallot.getCompanyId();
	}

	/**
	* Sets the company ID of this vote ballot.
	*
	* @param companyId the company ID of this vote ballot
	*/
	@Override
	public void setCompanyId(long companyId) {
		_voteBallot.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vote ballot.
	*
	* @return the user ID of this vote ballot
	*/
	@Override
	public long getUserId() {
		return _voteBallot.getUserId();
	}

	/**
	* Sets the user ID of this vote ballot.
	*
	* @param userId the user ID of this vote ballot
	*/
	@Override
	public void setUserId(long userId) {
		_voteBallot.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vote ballot.
	*
	* @return the user uuid of this vote ballot
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallot.getUserUuid();
	}

	/**
	* Sets the user uuid of this vote ballot.
	*
	* @param userUuid the user uuid of this vote ballot
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_voteBallot.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vote ballot.
	*
	* @return the user name of this vote ballot
	*/
	@Override
	public java.lang.String getUserName() {
		return _voteBallot.getUserName();
	}

	/**
	* Sets the user name of this vote ballot.
	*
	* @param userName the user name of this vote ballot
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_voteBallot.setUserName(userName);
	}

	/**
	* Returns the create date of this vote ballot.
	*
	* @return the create date of this vote ballot
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _voteBallot.getCreateDate();
	}

	/**
	* Sets the create date of this vote ballot.
	*
	* @param createDate the create date of this vote ballot
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_voteBallot.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vote ballot.
	*
	* @return the modified date of this vote ballot
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _voteBallot.getModifiedDate();
	}

	/**
	* Sets the modified date of this vote ballot.
	*
	* @param modifiedDate the modified date of this vote ballot
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_voteBallot.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the vote idea type ID of this vote ballot.
	*
	* @return the vote idea type ID of this vote ballot
	*/
	@Override
	public long getVoteIdeaTypeId() {
		return _voteBallot.getVoteIdeaTypeId();
	}

	/**
	* Sets the vote idea type ID of this vote ballot.
	*
	* @param voteIdeaTypeId the vote idea type ID of this vote ballot
	*/
	@Override
	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteBallot.setVoteIdeaTypeId(voteIdeaTypeId);
	}

	/**
	* Returns the name of this vote ballot.
	*
	* @return the name of this vote ballot
	*/
	@Override
	public java.lang.String getName() {
		return _voteBallot.getName();
	}

	/**
	* Sets the name of this vote ballot.
	*
	* @param name the name of this vote ballot
	*/
	@Override
	public void setName(java.lang.String name) {
		_voteBallot.setName(name);
	}

	/**
	* Returns the description of this vote ballot.
	*
	* @return the description of this vote ballot
	*/
	@Override
	public java.lang.String getDescription() {
		return _voteBallot.getDescription();
	}

	/**
	* Sets the description of this vote ballot.
	*
	* @param description the description of this vote ballot
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_voteBallot.setDescription(description);
	}

	/**
	* Returns the end date of this vote ballot.
	*
	* @return the end date of this vote ballot
	*/
	@Override
	public java.util.Date getEndDate() {
		return _voteBallot.getEndDate();
	}

	/**
	* Sets the end date of this vote ballot.
	*
	* @param endDate the end date of this vote ballot
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_voteBallot.setEndDate(endDate);
	}

	@Override
	public boolean isNew() {
		return _voteBallot.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_voteBallot.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _voteBallot.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_voteBallot.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _voteBallot.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _voteBallot.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_voteBallot.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _voteBallot.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_voteBallot.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_voteBallot.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_voteBallot.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VoteBallotWrapper((VoteBallot)_voteBallot.clone());
	}

	@Override
	public int compareTo(com.liferay.vote.model.VoteBallot voteBallot) {
		return _voteBallot.compareTo(voteBallot);
	}

	@Override
	public int hashCode() {
		return _voteBallot.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.vote.model.VoteBallot> toCacheModel() {
		return _voteBallot.toCacheModel();
	}

	@Override
	public com.liferay.vote.model.VoteBallot toEscapedModel() {
		return new VoteBallotWrapper(_voteBallot.toEscapedModel());
	}

	@Override
	public com.liferay.vote.model.VoteBallot toUnescapedModel() {
		return new VoteBallotWrapper(_voteBallot.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _voteBallot.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _voteBallot.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_voteBallot.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VoteBallotWrapper)) {
			return false;
		}

		VoteBallotWrapper voteBallotWrapper = (VoteBallotWrapper)obj;

		if (Validator.equals(_voteBallot, voteBallotWrapper._voteBallot)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VoteBallot getWrappedVoteBallot() {
		return _voteBallot;
	}

	@Override
	public VoteBallot getWrappedModel() {
		return _voteBallot;
	}

	@Override
	public void resetOriginalValues() {
		_voteBallot.resetOriginalValues();
	}

	private VoteBallot _voteBallot;
}