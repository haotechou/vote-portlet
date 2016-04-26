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

import com.liferay.vote.model.VoteBallot;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VoteBallot in entity cache.
 *
 * @author Howie Chou
 * @see VoteBallot
 * @generated
 */
public class VoteBallotCacheModel implements CacheModel<VoteBallot>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{voteBallotId=");
		sb.append(voteBallotId);
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
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VoteBallot toEntityModel() {
		VoteBallotImpl voteBallotImpl = new VoteBallotImpl();

		voteBallotImpl.setVoteBallotId(voteBallotId);
		voteBallotImpl.setCompanyId(companyId);
		voteBallotImpl.setUserId(userId);

		if (userName == null) {
			voteBallotImpl.setUserName(StringPool.BLANK);
		}
		else {
			voteBallotImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			voteBallotImpl.setCreateDate(null);
		}
		else {
			voteBallotImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			voteBallotImpl.setModifiedDate(null);
		}
		else {
			voteBallotImpl.setModifiedDate(new Date(modifiedDate));
		}

		voteBallotImpl.setVoteIdeaTypeId(voteIdeaTypeId);

		if (name == null) {
			voteBallotImpl.setName(StringPool.BLANK);
		}
		else {
			voteBallotImpl.setName(name);
		}

		if (description == null) {
			voteBallotImpl.setDescription(StringPool.BLANK);
		}
		else {
			voteBallotImpl.setDescription(description);
		}

		if (endDate == Long.MIN_VALUE) {
			voteBallotImpl.setEndDate(null);
		}
		else {
			voteBallotImpl.setEndDate(new Date(endDate));
		}

		voteBallotImpl.resetOriginalValues();

		return voteBallotImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		voteBallotId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		voteIdeaTypeId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		endDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(voteBallotId);
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

		objectOutput.writeLong(endDate);
	}

	public long voteBallotId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long voteIdeaTypeId;
	public String name;
	public String description;
	public long endDate;
}