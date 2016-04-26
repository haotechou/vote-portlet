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

import com.liferay.vote.model.VoteEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VoteEntry in entity cache.
 *
 * @author Howie Chou
 * @see VoteEntry
 * @generated
 */
public class VoteEntryCacheModel implements CacheModel<VoteEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{voteEntryId=");
		sb.append(voteEntryId);
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
		sb.append(", voteBallotId=");
		sb.append(voteBallotId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VoteEntry toEntityModel() {
		VoteEntryImpl voteEntryImpl = new VoteEntryImpl();

		voteEntryImpl.setVoteEntryId(voteEntryId);
		voteEntryImpl.setCompanyId(companyId);
		voteEntryImpl.setUserId(userId);

		if (userName == null) {
			voteEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			voteEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			voteEntryImpl.setCreateDate(null);
		}
		else {
			voteEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			voteEntryImpl.setModifiedDate(null);
		}
		else {
			voteEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		voteEntryImpl.setVoteBallotId(voteBallotId);

		voteEntryImpl.resetOriginalValues();

		return voteEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		voteEntryId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		voteBallotId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(voteEntryId);
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
		objectOutput.writeLong(voteBallotId);
	}

	public long voteEntryId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long voteBallotId;
}