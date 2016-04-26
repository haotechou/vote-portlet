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
 * This class is a wrapper for {@link VoteEntry}.
 * </p>
 *
 * @author Howie Chou
 * @see VoteEntry
 * @generated
 */
public class VoteEntryWrapper implements VoteEntry, ModelWrapper<VoteEntry> {
	public VoteEntryWrapper(VoteEntry voteEntry) {
		_voteEntry = voteEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return VoteEntry.class;
	}

	@Override
	public String getModelClassName() {
		return VoteEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("voteEntryId", getVoteEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("voteBallotId", getVoteBallotId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long voteEntryId = (Long)attributes.get("voteEntryId");

		if (voteEntryId != null) {
			setVoteEntryId(voteEntryId);
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

		Long voteBallotId = (Long)attributes.get("voteBallotId");

		if (voteBallotId != null) {
			setVoteBallotId(voteBallotId);
		}
	}

	/**
	* Returns the primary key of this vote entry.
	*
	* @return the primary key of this vote entry
	*/
	@Override
	public long getPrimaryKey() {
		return _voteEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vote entry.
	*
	* @param primaryKey the primary key of this vote entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_voteEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vote entry ID of this vote entry.
	*
	* @return the vote entry ID of this vote entry
	*/
	@Override
	public long getVoteEntryId() {
		return _voteEntry.getVoteEntryId();
	}

	/**
	* Sets the vote entry ID of this vote entry.
	*
	* @param voteEntryId the vote entry ID of this vote entry
	*/
	@Override
	public void setVoteEntryId(long voteEntryId) {
		_voteEntry.setVoteEntryId(voteEntryId);
	}

	/**
	* Returns the company ID of this vote entry.
	*
	* @return the company ID of this vote entry
	*/
	@Override
	public long getCompanyId() {
		return _voteEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this vote entry.
	*
	* @param companyId the company ID of this vote entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_voteEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vote entry.
	*
	* @return the user ID of this vote entry
	*/
	@Override
	public long getUserId() {
		return _voteEntry.getUserId();
	}

	/**
	* Sets the user ID of this vote entry.
	*
	* @param userId the user ID of this vote entry
	*/
	@Override
	public void setUserId(long userId) {
		_voteEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vote entry.
	*
	* @return the user uuid of this vote entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this vote entry.
	*
	* @param userUuid the user uuid of this vote entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_voteEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vote entry.
	*
	* @return the user name of this vote entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _voteEntry.getUserName();
	}

	/**
	* Sets the user name of this vote entry.
	*
	* @param userName the user name of this vote entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_voteEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this vote entry.
	*
	* @return the create date of this vote entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _voteEntry.getCreateDate();
	}

	/**
	* Sets the create date of this vote entry.
	*
	* @param createDate the create date of this vote entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_voteEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vote entry.
	*
	* @return the modified date of this vote entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _voteEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this vote entry.
	*
	* @param modifiedDate the modified date of this vote entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_voteEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the vote ballot ID of this vote entry.
	*
	* @return the vote ballot ID of this vote entry
	*/
	@Override
	public long getVoteBallotId() {
		return _voteEntry.getVoteBallotId();
	}

	/**
	* Sets the vote ballot ID of this vote entry.
	*
	* @param voteBallotId the vote ballot ID of this vote entry
	*/
	@Override
	public void setVoteBallotId(long voteBallotId) {
		_voteEntry.setVoteBallotId(voteBallotId);
	}

	@Override
	public boolean isNew() {
		return _voteEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_voteEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _voteEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_voteEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _voteEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _voteEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_voteEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _voteEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_voteEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_voteEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_voteEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VoteEntryWrapper((VoteEntry)_voteEntry.clone());
	}

	@Override
	public int compareTo(com.liferay.vote.model.VoteEntry voteEntry) {
		return _voteEntry.compareTo(voteEntry);
	}

	@Override
	public int hashCode() {
		return _voteEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.vote.model.VoteEntry> toCacheModel() {
		return _voteEntry.toCacheModel();
	}

	@Override
	public com.liferay.vote.model.VoteEntry toEscapedModel() {
		return new VoteEntryWrapper(_voteEntry.toEscapedModel());
	}

	@Override
	public com.liferay.vote.model.VoteEntry toUnescapedModel() {
		return new VoteEntryWrapper(_voteEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _voteEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _voteEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_voteEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VoteEntryWrapper)) {
			return false;
		}

		VoteEntryWrapper voteEntryWrapper = (VoteEntryWrapper)obj;

		if (Validator.equals(_voteEntry, voteEntryWrapper._voteEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VoteEntry getWrappedVoteEntry() {
		return _voteEntry;
	}

	@Override
	public VoteEntry getWrappedModel() {
		return _voteEntry;
	}

	@Override
	public void resetOriginalValues() {
		_voteEntry.resetOriginalValues();
	}

	private VoteEntry _voteEntry;
}