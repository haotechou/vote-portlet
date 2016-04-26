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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.vote.model.VoteIdea;

import java.util.List;

/**
 * The persistence utility for the vote idea service. This utility wraps {@link VoteIdeaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdeaPersistence
 * @see VoteIdeaPersistenceImpl
 * @generated
 */
public class VoteIdeaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VoteIdea voteIdea) {
		getPersistence().clearCache(voteIdea);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VoteIdea> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VoteIdea> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VoteIdea> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VoteIdea update(VoteIdea voteIdea) throws SystemException {
		return getPersistence().update(voteIdea);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VoteIdea update(VoteIdea voteIdea,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(voteIdea, serviceContext);
	}

	/**
	* Caches the vote idea in the entity cache if it is enabled.
	*
	* @param voteIdea the vote idea
	*/
	public static void cacheResult(com.liferay.vote.model.VoteIdea voteIdea) {
		getPersistence().cacheResult(voteIdea);
	}

	/**
	* Caches the vote ideas in the entity cache if it is enabled.
	*
	* @param voteIdeas the vote ideas
	*/
	public static void cacheResult(
		java.util.List<com.liferay.vote.model.VoteIdea> voteIdeas) {
		getPersistence().cacheResult(voteIdeas);
	}

	/**
	* Creates a new vote idea with the primary key. Does not add the vote idea to the database.
	*
	* @param voteIdeaId the primary key for the new vote idea
	* @return the new vote idea
	*/
	public static com.liferay.vote.model.VoteIdea create(long voteIdeaId) {
		return getPersistence().create(voteIdeaId);
	}

	/**
	* Removes the vote idea with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaId the primary key of the vote idea
	* @return the vote idea that was removed
	* @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdea remove(long voteIdeaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchIdeaException {
		return getPersistence().remove(voteIdeaId);
	}

	public static com.liferay.vote.model.VoteIdea updateImpl(
		com.liferay.vote.model.VoteIdea voteIdea)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(voteIdea);
	}

	/**
	* Returns the vote idea with the primary key or throws a {@link com.liferay.vote.NoSuchIdeaException} if it could not be found.
	*
	* @param voteIdeaId the primary key of the vote idea
	* @return the vote idea
	* @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdea findByPrimaryKey(
		long voteIdeaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchIdeaException {
		return getPersistence().findByPrimaryKey(voteIdeaId);
	}

	/**
	* Returns the vote idea with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param voteIdeaId the primary key of the vote idea
	* @return the vote idea, or <code>null</code> if a vote idea with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdea fetchByPrimaryKey(
		long voteIdeaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(voteIdeaId);
	}

	/**
	* Returns all the vote ideas.
	*
	* @return the vote ideas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteIdea> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.vote.model.VoteIdea> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vote ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote ideas
	* @param end the upper bound of the range of vote ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vote ideas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteIdea> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vote ideas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vote ideas.
	*
	* @return the number of vote ideas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VoteIdeaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VoteIdeaPersistence)PortletBeanLocatorUtil.locate(com.liferay.vote.service.ClpSerializer.getServletContextName(),
					VoteIdeaPersistence.class.getName());

			ReferenceRegistry.registerReference(VoteIdeaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VoteIdeaPersistence persistence) {
	}

	private static VoteIdeaPersistence _persistence;
}