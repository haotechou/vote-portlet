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
 * Provides a wrapper for {@link VoteIdeaTypeLocalService}.
 *
 * @author Howie Chou
 * @see VoteIdeaTypeLocalService
 * @generated
 */
public class VoteIdeaTypeLocalServiceWrapper implements VoteIdeaTypeLocalService,
	ServiceWrapper<VoteIdeaTypeLocalService> {
	public VoteIdeaTypeLocalServiceWrapper(
		VoteIdeaTypeLocalService voteIdeaTypeLocalService) {
		_voteIdeaTypeLocalService = voteIdeaTypeLocalService;
	}

	/**
	* Adds the vote idea type to the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaType the vote idea type
	* @return the vote idea type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType addVoteIdeaType(
		com.liferay.vote.model.VoteIdeaType voteIdeaType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.addVoteIdeaType(voteIdeaType);
	}

	/**
	* Creates a new vote idea type with the primary key. Does not add the vote idea type to the database.
	*
	* @param voteIdeaTypeId the primary key for the new vote idea type
	* @return the new vote idea type
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType createVoteIdeaType(
		long voteIdeaTypeId) {
		return _voteIdeaTypeLocalService.createVoteIdeaType(voteIdeaTypeId);
	}

	/**
	* Deletes the vote idea type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaTypeId the primary key of the vote idea type
	* @return the vote idea type that was removed
	* @throws PortalException if a vote idea type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType deleteVoteIdeaType(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.deleteVoteIdeaType(voteIdeaTypeId);
	}

	/**
	* Deletes the vote idea type from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaType the vote idea type
	* @return the vote idea type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType deleteVoteIdeaType(
		com.liferay.vote.model.VoteIdeaType voteIdeaType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.deleteVoteIdeaType(voteIdeaType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voteIdeaTypeLocalService.dynamicQuery();
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
		return _voteIdeaTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteIdeaTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteIdeaTypeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _voteIdeaTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _voteIdeaTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.vote.model.VoteIdeaType fetchVoteIdeaType(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.fetchVoteIdeaType(voteIdeaTypeId);
	}

	/**
	* Returns the vote idea type with the primary key.
	*
	* @param voteIdeaTypeId the primary key of the vote idea type
	* @return the vote idea type
	* @throws PortalException if a vote idea type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType getVoteIdeaType(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.getVoteIdeaType(voteIdeaTypeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vote idea types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote idea types
	* @param end the upper bound of the range of vote idea types (not inclusive)
	* @return the range of vote idea types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.vote.model.VoteIdeaType> getVoteIdeaTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.getVoteIdeaTypes(start, end);
	}

	/**
	* Returns the number of vote idea types.
	*
	* @return the number of vote idea types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVoteIdeaTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.getVoteIdeaTypesCount();
	}

	/**
	* Updates the vote idea type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaType the vote idea type
	* @return the vote idea type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdeaType updateVoteIdeaType(
		com.liferay.vote.model.VoteIdeaType voteIdeaType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaTypeLocalService.updateVoteIdeaType(voteIdeaType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _voteIdeaTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_voteIdeaTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _voteIdeaTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VoteIdeaTypeLocalService getWrappedVoteIdeaTypeLocalService() {
		return _voteIdeaTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVoteIdeaTypeLocalService(
		VoteIdeaTypeLocalService voteIdeaTypeLocalService) {
		_voteIdeaTypeLocalService = voteIdeaTypeLocalService;
	}

	@Override
	public VoteIdeaTypeLocalService getWrappedService() {
		return _voteIdeaTypeLocalService;
	}

	@Override
	public void setWrappedService(
		VoteIdeaTypeLocalService voteIdeaTypeLocalService) {
		_voteIdeaTypeLocalService = voteIdeaTypeLocalService;
	}

	private VoteIdeaTypeLocalService _voteIdeaTypeLocalService;
}