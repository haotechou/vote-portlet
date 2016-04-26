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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.vote.model.VoteIdea;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VoteIdea in entity cache.
 *
 * @author Howie Chou
 * @see VoteIdea
 * @generated
 */
public class VoteIdeaCacheModel implements CacheModel<VoteIdea>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{voteIdeaId=");
		sb.append(voteIdeaId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", voteIdeaTypeId=");
		sb.append(voteIdeaTypeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VoteIdea toEntityModel() {
		VoteIdeaImpl voteIdeaImpl = new VoteIdeaImpl();

		voteIdeaImpl.setVoteIdeaId(voteIdeaId);
		voteIdeaImpl.setCompanyId(companyId);
		voteIdeaImpl.setUserId(userId);

		if (userName == null) {
			voteIdeaImpl.setUserName(StringPool.BLANK);
		}
		else {
			voteIdeaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			voteIdeaImpl.setCreateDate(null);
		}
		else {
			voteIdeaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			voteIdeaImpl.setModifiedDate(null);
		}
		else {
			voteIdeaImpl.setModifiedDate(new Date(modifiedDate));
		}

		voteIdeaImpl.setVoteIdeaTypeId(voteIdeaTypeId);

		if (name == null) {
			voteIdeaImpl.setName(StringPool.BLANK);
		}
		else {
			voteIdeaImpl.setName(name);
		}

		if (description == null) {
			voteIdeaImpl.setDescription(StringPool.BLANK);
		}
		else {
			voteIdeaImpl.setDescription(description);
		}

		voteIdeaImpl.resetOriginalValues();

		return voteIdeaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		voteIdeaId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		voteIdeaTypeId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(voteIdeaId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(voteIdeaTypeId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long voteIdeaId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long voteIdeaTypeId;
	public String name;
	public String description;
}