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

package com.liferay.vote.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.vote.model.VoteEntry;

/**
 * The persistence interface for the vote entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteEntryPersistenceImpl
 * @see VoteEntryUtil
 * @generated
 */
public interface VoteEntryPersistence extends BasePersistence<VoteEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VoteEntryUtil} to access the vote entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vote entry in the entity cache if it is enabled.
	*
	* @param voteEntry the vote entry
	*/
	public void cacheResult(com.liferay.vote.model.VoteEntry voteEntry);

	/**
	* Caches the vote entries in the entity cache if it is enabled.
	*
	* @param voteEntries the vote entries
	*/
	public void cacheResult(
		java.util.List<com.liferay.vote.model.VoteEntry> voteEntries);

	/**
	* Creates a new vote entry with the primary key. Does not add the vote entry to the database.
	*
	* @param voteEntryId the primary key for the new vote entry
	* @return the new vote entry
	*/
	public com.liferay.vote.model.VoteEntry create(long voteEntryId);

	/**
	* Removes the vote entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteEntryId the primary key of the vote entry
	* @return the vote entry that was removed
	* @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.vote.model.VoteEntry remove(long voteEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchEntryException;

	public com.liferay.vote.model.VoteEntry updateImpl(
		com.liferay.vote.model.VoteEntry voteEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vote entry with the primary key or throws a {@link com.liferay.vote.NoSuchEntryException} if it could not be found.
	*
	* @param voteEntryId the primary key of the vote entry
	* @return the vote entry
	* @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.vote.model.VoteEntry findByPrimaryKey(long voteEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchEntryException;

	/**
	* Returns the vote entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param voteEntryId the primary key of the vote entry
	* @return the vote entry, or <code>null</code> if a vote entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.vote.model.VoteEntry fetchByPrimaryKey(long voteEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vote entries.
	*
	* @return the vote entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.vote.model.VoteEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vote entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote entries
	* @param end the upper bound of the range of vote entries (not inclusive)
	* @return the range of vote entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.vote.model.VoteEntry> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vote entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote entries
	* @param end the upper bound of the range of vote entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vote entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.vote.model.VoteEntry> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vote entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vote entries.
	*
	* @return the number of vote entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}