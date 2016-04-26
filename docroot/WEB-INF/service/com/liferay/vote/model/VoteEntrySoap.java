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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Howie Chou
 * @generated
 */
public class VoteEntrySoap implements Serializable {
	public static VoteEntrySoap toSoapModel(VoteEntry model) {
		VoteEntrySoap soapModel = new VoteEntrySoap();

		soapModel.setVoteEntryId(model.getVoteEntryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setVoteBallotId(model.getVoteBallotId());

		return soapModel;
	}

	public static VoteEntrySoap[] toSoapModels(VoteEntry[] models) {
		VoteEntrySoap[] soapModels = new VoteEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VoteEntrySoap[][] toSoapModels(VoteEntry[][] models) {
		VoteEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VoteEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VoteEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VoteEntrySoap[] toSoapModels(List<VoteEntry> models) {
		List<VoteEntrySoap> soapModels = new ArrayList<VoteEntrySoap>(models.size());

		for (VoteEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VoteEntrySoap[soapModels.size()]);
	}

	public VoteEntrySoap() {
	}

	public long getPrimaryKey() {
		return _voteEntryId;
	}

	public void setPrimaryKey(long pk) {
		setVoteEntryId(pk);
	}

	public long getVoteEntryId() {
		return _voteEntryId;
	}

	public void setVoteEntryId(long voteEntryId) {
		_voteEntryId = voteEntryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getVoteBallotId() {
		return _voteBallotId;
	}

	public void setVoteBallotId(long voteBallotId) {
		_voteBallotId = voteBallotId;
	}

	private long _voteEntryId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _voteBallotId;
}