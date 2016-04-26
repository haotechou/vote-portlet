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

import com.liferay.vote.model.VoteIdeaType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VoteIdeaType in entity cache.
 *
 * @author Howie Chou
 * @see VoteIdeaType
 * @generated
 */
public class VoteIdeaTypeCacheModel implements CacheModel<VoteIdeaType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{voteIdeaTypeId=");
		sb.append(voteIdeaTypeId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VoteIdeaType toEntityModel() {
		VoteIdeaTypeImpl voteIdeaTypeImpl = new VoteIdeaTypeImpl();

		voteIdeaTypeImpl.setVoteIdeaTypeId(voteIdeaTypeId);
		voteIdeaTypeImpl.setCompanyId(companyId);
		voteIdeaTypeImpl.setUserId(userId);

		if (userName == null) {
			voteIdeaTypeImpl.setUserName(StringPool.BLANK);
		}
		else {
			voteIdeaTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			voteIdeaTypeImpl.setCreateDate(null);
		}
		else {
			voteIdeaTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			voteIdeaTypeImpl.setModifiedDate(null);
		}
		else {
			voteIdeaTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			voteIdeaTypeImpl.setName(StringPool.BLANK);
		}
		else {
			voteIdeaTypeImpl.setName(name);
		}

		voteIdeaTypeImpl.resetOriginalValues();

		return voteIdeaTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		voteIdeaTypeId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(voteIdeaTypeId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long voteIdeaTypeId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
}