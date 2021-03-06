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
 * Provides a wrapper for {@link VoteIdeaLocalService}.
 *
 * @author Howie Chou
 * @see VoteIdeaLocalService
 * @generated
 */
public class VoteIdeaLocalServiceWrapper implements VoteIdeaLocalService,
	ServiceWrapper<VoteIdeaLocalService> {
	public VoteIdeaLocalServiceWrapper(
		VoteIdeaLocalService voteIdeaLocalService) {
		_voteIdeaLocalService = voteIdeaLocalService;
	}

	/**
	* Adds the vote idea to the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdea the vote idea
	* @return the vote idea that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdea addVoteIdea(
		com.liferay.vote.model.VoteIdea voteIdea)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.addVoteIdea(voteIdea);
	}

	/**
	* Creates a new vote idea with the primary key. Does not add the vote idea to the database.
	*
	* @param voteIdeaId the primary key for the new vote idea
	* @return the new vote idea
	*/
	@Override
	public com.liferay.vote.model.VoteIdea createVoteIdea(long voteIdeaId) {
		return _voteIdeaLocalService.createVoteIdea(voteIdeaId);
	}

	/**
	* Deletes the vote idea with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaId the primary key of the vote idea
	* @return the vote idea that was removed
	* @throws PortalException if a vote idea with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdea deleteVoteIdea(long voteIdeaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.deleteVoteIdea(voteIdeaId);
	}

	/**
	* Deletes the vote idea from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdea the vote idea
	* @return the vote idea that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdea deleteVoteIdea(
		com.liferay.vote.model.VoteIdea voteIdea)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.deleteVoteIdea(voteIdea);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voteIdeaLocalService.dynamicQuery();
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
		return _voteIdeaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteIdeaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _voteIdeaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _voteIdeaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _voteIdeaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.vote.model.VoteIdea fetchVoteIdea(long voteIdeaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.fetchVoteIdea(voteIdeaId);
	}

	/**
	* Returns the vote idea with the primary key.
	*
	* @param voteIdeaId the primary key of the vote idea
	* @return the vote idea
	* @throws PortalException if a vote idea with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdea getVoteIdea(long voteIdeaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.getVoteIdea(voteIdeaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vote ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote ideas
	* @param end the upper bound of the range of vote ideas (not inclusive)
	* @return the range of vote ideas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.vote.model.VoteIdea> getVoteIdeas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.getVoteIdeas(start, end);
	}

	/**
	* Returns the number of vote ideas.
	*
	* @return the number of vote ideas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVoteIdeasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.getVoteIdeasCount();
	}

	/**
	* Updates the vote idea in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param voteIdea the vote idea
	* @return the vote idea that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.vote.model.VoteIdea updateVoteIdea(
		com.liferay.vote.model.VoteIdea voteIdea)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteIdeaLocalService.updateVoteIdea(voteIdea);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _voteIdeaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_voteIdeaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _voteIdeaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VoteIdeaLocalService getWrappedVoteIdeaLocalService() {
		return _voteIdeaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVoteIdeaLocalService(
		VoteIdeaLocalService voteIdeaLocalService) {
		_voteIdeaLocalService = voteIdeaLocalService;
	}

	@Override
	public VoteIdeaLocalService getWrappedService() {
		return _voteIdeaLocalService;
	}

	@Override
	public void setWrappedService(VoteIdeaLocalService voteIdeaLocalService) {
		_voteIdeaLocalService = voteIdeaLocalService;
	}

	private VoteIdeaLocalService _voteIdeaLocalService;
}