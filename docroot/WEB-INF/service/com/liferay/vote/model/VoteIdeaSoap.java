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
public class VoteIdeaSoap implements Serializable {
	public static VoteIdeaSoap toSoapModel(VoteIdea model) {
		VoteIdeaSoap soapModel = new VoteIdeaSoap();

		soapModel.setVoteIdeaId(model.getVoteIdeaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setVoteIdeaTypeId(model.getVoteIdeaTypeId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static VoteIdeaSoap[] toSoapModels(VoteIdea[] models) {
		VoteIdeaSoap[] soapModels = new VoteIdeaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VoteIdeaSoap[][] toSoapModels(VoteIdea[][] models) {
		VoteIdeaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VoteIdeaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VoteIdeaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VoteIdeaSoap[] toSoapModels(List<VoteIdea> models) {
		List<VoteIdeaSoap> soapModels = new ArrayList<VoteIdeaSoap>(models.size());

		for (VoteIdea model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VoteIdeaSoap[soapModels.size()]);
	}

	public VoteIdeaSoap() {
	}

	public long getPrimaryKey() {
		return _voteIdeaId;
	}

	public void setPrimaryKey(long pk) {
		setVoteIdeaId(pk);
	}

	public long getVoteIdeaId() {
		return _voteIdeaId;
	}

	public void setVoteIdeaId(long voteIdeaId) {
		_voteIdeaId = voteIdeaId;
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

	public long getVoteIdeaTypeId() {
		return _voteIdeaTypeId;
	}

	public void setVoteIdeaTypeId(long voteIdeaTypeId) {
		_voteIdeaTypeId = voteIdeaTypeId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _voteIdeaId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _voteIdeaTypeId;
	private String _name;
	private String _description;
}