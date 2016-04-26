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

import com.liferay.vote.model.VoteIdeaType;

import java.util.List;

/**
 * The persistence utility for the vote idea type service. This utility wraps {@link VoteIdeaTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdeaTypePersistence
 * @see VoteIdeaTypePersistenceImpl
 * @generated
 */
public class VoteIdeaTypeUtil {
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
	public static void clearCache(VoteIdeaType voteIdeaType) {
		getPersistence().clearCache(voteIdeaType);
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
	public static List<VoteIdeaType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VoteIdeaType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VoteIdeaType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VoteIdeaType update(VoteIdeaType voteIdeaType)
		throws SystemException {
		return getPersistence().update(voteIdeaType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VoteIdeaType update(VoteIdeaType voteIdeaType,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(voteIdeaType, serviceContext);
	}

	/**
	* Caches the vote idea type in the entity cache if it is enabled.
	*
	* @param voteIdeaType the vote idea type
	*/
	public static void cacheResult(
		com.liferay.vote.model.VoteIdeaType voteIdeaType) {
		getPersistence().cacheResult(voteIdeaType);
	}

	/**
	* Caches the vote idea types in the entity cache if it is enabled.
	*
	* @param voteIdeaTypes the vote idea types
	*/
	public static void cacheResult(
		java.util.List<com.liferay.vote.model.VoteIdeaType> voteIdeaTypes) {
		getPersistence().cacheResult(voteIdeaTypes);
	}

	/**
	* Creates a new vote idea type with the primary key. Does not add the vote idea type to the database.
	*
	* @param voteIdeaTypeId the primary key for the new vote idea type
	* @return the new vote idea type
	*/
	public static com.liferay.vote.model.VoteIdeaType create(
		long voteIdeaTypeId) {
		return getPersistence().create(voteIdeaTypeId);
	}

	/**
	* Removes the vote idea type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteIdeaTypeId the primary key of the vote idea type
	* @return the vote idea type that was removed
	* @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdeaType remove(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchIdeaTypeException {
		return getPersistence().remove(voteIdeaTypeId);
	}

	public static com.liferay.vote.model.VoteIdeaType updateImpl(
		com.liferay.vote.model.VoteIdeaType voteIdeaType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(voteIdeaType);
	}

	/**
	* Returns the vote idea type with the primary key or throws a {@link com.liferay.vote.NoSuchIdeaTypeException} if it could not be found.
	*
	* @param voteIdeaTypeId the primary key of the vote idea type
	* @return the vote idea type
	* @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdeaType findByPrimaryKey(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchIdeaTypeException {
		return getPersistence().findByPrimaryKey(voteIdeaTypeId);
	}

	/**
	* Returns the vote idea type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param voteIdeaTypeId the primary key of the vote idea type
	* @return the vote idea type, or <code>null</code> if a vote idea type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteIdeaType fetchByPrimaryKey(
		long voteIdeaTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(voteIdeaTypeId);
	}

	/**
	* Returns all the vote idea types.
	*
	* @return the vote idea types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteIdeaType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.vote.model.VoteIdeaType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vote idea types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteIdeaTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote idea types
	* @param end the upper bound of the range of vote idea types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vote idea types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteIdeaType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vote idea types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vote idea types.
	*
	* @return the number of vote idea types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VoteIdeaTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VoteIdeaTypePersistence)PortletBeanLocatorUtil.locate(com.liferay.vote.service.ClpSerializer.getServletContextName(),
					VoteIdeaTypePersistence.class.getName());

			ReferenceRegistry.registerReference(VoteIdeaTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VoteIdeaTypePersistence persistence) {
	}

	private static VoteIdeaTypePersistence _persistence;
}