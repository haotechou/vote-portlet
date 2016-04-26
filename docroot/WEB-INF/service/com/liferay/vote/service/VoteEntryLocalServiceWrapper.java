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

package com.liferay.vote.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VoteEntryLocalService}.
 *
 * @author Howie Chou
 * @see VoteEntryLocalService
 * @generated
 */
public class VoteEntryLocalServiceWrapper implements VoteEntryLocalService,
	ServiceWrapper<VoteEntryLocalService> {
	public VoteEntryLocalServiceWrapper(
		VoteEntryLocalService voteEntryLocalService) {
		_voteEntryLocalService = voteEntryLocalService;
	}

	/**
	* Adds the vote entry to the database. Also notifies the appropriate model listeners.
	*
	* @param voteEntry the vote entry
	* @return the vote entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteEntry addVoteEntry(
		com.liferay.vote.model.VoteEntry voteEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.addVoteEntry(voteEntry);
	}

	/**
	* Creates a new vote entry with the primary key. Does not add the vote entry to the database.
	*
	* @param voteEntryId the primary key for the new vote entry
	* @return the new vote entry
	*/
	@Override
	public com.liferay.vote.model.VoteEntry createVoteEntry(long voteEntryId) {
		return _voteEntryLocalService.createVoteEntry(voteEntryId);
	}

	/**
	* Deletes the vote entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteEntryId the primary key of the vote entry
	* @return the vote entry that was removed
	* @throws PortalException if a vote entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteEntry deleteVoteEntry(long voteEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.deleteVoteEntry(voteEntryId);
	}

	/**
	* Deletes the vote entry from the database. Also notifies the appropriate model listeners.
	*
	* @param voteEntry the vote entry
	* @return the vote entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteEntry deleteVoteEntry(
		com.liferay.vote.model.VoteEntry voteEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.deleteVoteEntry(voteEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voteEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.vote.model.VoteEntry fetchVoteEntry(long voteEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.fetchVoteEntry(voteEntryId);
	}

	/**
	* Returns the vote entry with the primary key.
	*
	* @param voteEntryId the primary key of the vote entry
	* @return the vote entry
	* @throws PortalException if a vote entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteEntry getVoteEntry(long voteEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.getVoteEntry(voteEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.liferay.vote.model.VoteEntry> getVoteEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.getVoteEntries(start, end);
	}

	/**
	* Returns the number of vote entries.
	*
	* @return the number of vote entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVoteEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.getVoteEntriesCount();
	}

	/**
	* Updates the vote entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param voteEntry the vote entry
	* @return the vote entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteEntry updateVoteEntry(
		com.liferay.vote.model.VoteEntry voteEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteEntryLocalService.updateVoteEntry(voteEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _voteEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_voteEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _voteEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VoteEntryLocalService getWrappedVoteEntryLocalService() {
		return _voteEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVoteEntryLocalService(
		VoteEntryLocalService voteEntryLocalService) {
		_voteEntryLocalService = voteEntryLocalService;
	}

	@Override
	public VoteEntryLocalService getWrappedService() {
		return _voteEntryLocalService;
	}

	@Override
	public void setWrappedService(VoteEntryLocalService voteEntryLocalService) {
		_voteEntryLocalService = voteEntryLocalService;
	}

	private VoteEntryLocalService _voteEntryLocalService;
}