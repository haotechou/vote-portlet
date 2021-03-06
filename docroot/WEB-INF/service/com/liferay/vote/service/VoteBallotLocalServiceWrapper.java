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
 * Provides a wrapper for {@link VoteBallotLocalService}.
 *
 * @author Howie Chou
 * @see VoteBallotLocalService
 * @generated
 */
public class VoteBallotLocalServiceWrapper implements VoteBallotLocalService,
	ServiceWrapper<VoteBallotLocalService> {
	public VoteBallotLocalServiceWrapper(
		VoteBallotLocalService voteBallotLocalService) {
		_voteBallotLocalService = voteBallotLocalService;
	}

	/**
	* Adds the vote ballot to the database. Also notifies the appropriate model listeners.
	*
	* @param voteBallot the vote ballot
	* @return the vote ballot that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteBallot addVoteBallot(
		com.liferay.vote.model.VoteBallot voteBallot)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.addVoteBallot(voteBallot);
	}

	/**
	* Creates a new vote ballot with the primary key. Does not add the vote ballot to the database.
	*
	* @param voteBallotId the primary key for the new vote ballot
	* @return the new vote ballot
	*/
	@Override
	public com.liferay.vote.model.VoteBallot createVoteBallot(long voteBallotId) {
		return _voteBallotLocalService.createVoteBallot(voteBallotId);
	}

	/**
	* Deletes the vote ballot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteBallotId the primary key of the vote ballot
	* @return the vote ballot that was removed
	* @throws PortalException if a vote ballot with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteBallot deleteVoteBallot(long voteBallotId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.deleteVoteBallot(voteBallotId);
	}

	/**
	* Deletes the vote ballot from the database. Also notifies the appropriate model listeners.
	*
	* @param voteBallot the vote ballot
	* @return the vote ballot that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteBallot deleteVoteBallot(
		com.liferay.vote.model.VoteBallot voteBallot)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.deleteVoteBallot(voteBallot);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voteBallotLocalService.dynamicQuery();
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
		return _voteBallotLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteBallotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteBallotLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteBallotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteBallotLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _voteBallotLocalService.dynamicQueryCount(dynamicQuery);
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
		return _voteBallotLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.vote.model.VoteBallot fetchVoteBallot(long voteBallotId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.fetchVoteBallot(voteBallotId);
	}

	/**
	* Returns the vote ballot with the primary key.
	*
	* @param voteBallotId the primary key of the vote ballot
	* @return the vote ballot
	* @throws PortalException if a vote ballot with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteBallot getVoteBallot(long voteBallotId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.getVoteBallot(voteBallotId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vote ballots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteBallotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote ballots
	* @param end the upper bound of the range of vote ballots (not inclusive)
	* @return the range of vote ballots
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.vote.model.VoteBallot> getVoteBallots(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.getVoteBallots(start, end);
	}

	/**
	* Returns the number of vote ballots.
	*
	* @return the number of vote ballots
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVoteBallotsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.getVoteBallotsCount();
	}

	/**
	* Updates the vote ballot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param voteBallot the vote ballot
	* @return the vote ballot that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteBallot updateVoteBallot(
		com.liferay.vote.model.VoteBallot voteBallot)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteBallotLocalService.updateVoteBallot(voteBallot);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _voteBallotLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_voteBallotLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _voteBallotLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VoteBallotLocalService getWrappedVoteBallotLocalService() {
		return _voteBallotLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVoteBallotLocalService(
		VoteBallotLocalService voteBallotLocalService) {
		_voteBallotLocalService = voteBallotLocalService;
	}

	@Override
	public VoteBallotLocalService getWrappedService() {
		return _voteBallotLocalService;
	}

	@Override
	public void setWrappedService(VoteBallotLocalService voteBallotLocalService) {
		_voteBallotLocalService = voteBallotLocalService;
	}

	private VoteBallotLocalService _voteBallotLocalService;
}