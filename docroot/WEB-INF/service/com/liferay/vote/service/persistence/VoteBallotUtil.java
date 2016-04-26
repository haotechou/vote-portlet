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

import com.liferay.vote.model.VoteBallot;

import java.util.List;

/**
 * The persistence utility for the vote ballot service. This utility wraps {@link VoteBallotPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteBallotPersistence
 * @see VoteBallotPersistenceImpl
 * @generated
 */
public class VoteBallotUtil {
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
	public static void clearCache(VoteBallot voteBallot) {
		getPersistence().clearCache(voteBallot);
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
	public static List<VoteBallot> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VoteBallot> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VoteBallot> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VoteBallot update(VoteBallot voteBallot)
		throws SystemException {
		return getPersistence().update(voteBallot);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VoteBallot update(VoteBallot voteBallot,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(voteBallot, serviceContext);
	}

	/**
	* Caches the vote ballot in the entity cache if it is enabled.
	*
	* @param voteBallot the vote ballot
	*/
	public static void cacheResult(com.liferay.vote.model.VoteBallot voteBallot) {
		getPersistence().cacheResult(voteBallot);
	}

	/**
	* Caches the vote ballots in the entity cache if it is enabled.
	*
	* @param voteBallots the vote ballots
	*/
	public static void cacheResult(
		java.util.List<com.liferay.vote.model.VoteBallot> voteBallots) {
		getPersistence().cacheResult(voteBallots);
	}

	/**
	* Creates a new vote ballot with the primary key. Does not add the vote ballot to the database.
	*
	* @param voteBallotId the primary key for the new vote ballot
	* @return the new vote ballot
	*/
	public static com.liferay.vote.model.VoteBallot create(long voteBallotId) {
		return getPersistence().create(voteBallotId);
	}

	/**
	* Removes the vote ballot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteBallotId the primary key of the vote ballot
	* @return the vote ballot that was removed
	* @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteBallot remove(long voteBallotId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchBallotException {
		return getPersistence().remove(voteBallotId);
	}

	public static com.liferay.vote.model.VoteBallot updateImpl(
		com.liferay.vote.model.VoteBallot voteBallot)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(voteBallot);
	}

	/**
	* Returns the vote ballot with the primary key or throws a {@link com.liferay.vote.NoSuchBallotException} if it could not be found.
	*
	* @param voteBallotId the primary key of the vote ballot
	* @return the vote ballot
	* @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteBallot findByPrimaryKey(
		long voteBallotId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.vote.NoSuchBallotException {
		return getPersistence().findByPrimaryKey(voteBallotId);
	}

	/**
	* Returns the vote ballot with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param voteBallotId the primary key of the vote ballot
	* @return the vote ballot, or <code>null</code> if a vote ballot with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.vote.model.VoteBallot fetchByPrimaryKey(
		long voteBallotId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(voteBallotId);
	}

	/**
	* Returns all the vote ballots.
	*
	* @return the vote ballots
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteBallot> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.vote.model.VoteBallot> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vote ballots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.vote.model.impl.VoteBallotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vote ballots
	* @param end the upper bound of the range of vote ballots (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vote ballots
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.vote.model.VoteBallot> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vote ballots from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vote ballots.
	*
	* @return the number of vote ballots
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VoteBallotPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VoteBallotPersistence)PortletBeanLocatorUtil.locate(com.liferay.vote.service.ClpSerializer.getServletContextName(),
					VoteBallotPersistence.class.getName());

			ReferenceRegistry.registerReference(VoteBallotUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VoteBallotPersistence persistence) {
	}

	private static VoteBallotPersistence _persistence;
}