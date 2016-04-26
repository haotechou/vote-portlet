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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.vote.NoSuchBallotException;
import com.liferay.vote.model.VoteBallot;
import com.liferay.vote.model.impl.VoteBallotImpl;
import com.liferay.vote.model.impl.VoteBallotModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vote ballot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteBallotPersistence
 * @see VoteBallotUtil
 * @generated
 */
public class VoteBallotPersistenceImpl extends BasePersistenceImpl<VoteBallot>
	implements VoteBallotPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VoteBallotUtil} to access the vote ballot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VoteBallotImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotModelImpl.FINDER_CACHE_ENABLED, VoteBallotImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotModelImpl.FINDER_CACHE_ENABLED, VoteBallotImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VoteBallotPersistenceImpl() {
		setModelClass(VoteBallot.class);
	}

	/**
	 * Caches the vote ballot in the entity cache if it is enabled.
	 *
	 * @param voteBallot the vote ballot
	 */
	@Override
	public void cacheResult(VoteBallot voteBallot) {
		EntityCacheUtil.putResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotImpl.class, voteBallot.getPrimaryKey(), voteBallot);

		voteBallot.resetOriginalValues();
	}

	/**
	 * Caches the vote ballots in the entity cache if it is enabled.
	 *
	 * @param voteBallots the vote ballots
	 */
	@Override
	public void cacheResult(List<VoteBallot> voteBallots) {
		for (VoteBallot voteBallot : voteBallots) {
			if (EntityCacheUtil.getResult(
						VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
						VoteBallotImpl.class, voteBallot.getPrimaryKey()) == null) {
				cacheResult(voteBallot);
			}
			else {
				voteBallot.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vote ballots.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VoteBallotImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VoteBallotImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vote ballot.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VoteBallot voteBallot) {
		EntityCacheUtil.removeResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotImpl.class, voteBallot.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VoteBallot> voteBallots) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VoteBallot voteBallot : voteBallots) {
			EntityCacheUtil.removeResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
				VoteBallotImpl.class, voteBallot.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vote ballot with the primary key. Does not add the vote ballot to the database.
	 *
	 * @param voteBallotId the primary key for the new vote ballot
	 * @return the new vote ballot
	 */
	@Override
	public VoteBallot create(long voteBallotId) {
		VoteBallot voteBallot = new VoteBallotImpl();

		voteBallot.setNew(true);
		voteBallot.setPrimaryKey(voteBallotId);

		return voteBallot;
	}

	/**
	 * Removes the vote ballot with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voteBallotId the primary key of the vote ballot
	 * @return the vote ballot that was removed
	 * @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot remove(long voteBallotId)
		throws NoSuchBallotException, SystemException {
		return remove((Serializable)voteBallotId);
	}

	/**
	 * Removes the vote ballot with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vote ballot
	 * @return the vote ballot that was removed
	 * @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot remove(Serializable primaryKey)
		throws NoSuchBallotException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VoteBallot voteBallot = (VoteBallot)session.get(VoteBallotImpl.class,
					primaryKey);

			if (voteBallot == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBallotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(voteBallot);
		}
		catch (NoSuchBallotException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected VoteBallot removeImpl(VoteBallot voteBallot)
		throws SystemException {
		voteBallot = toUnwrappedModel(voteBallot);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(voteBallot)) {
				voteBallot = (VoteBallot)session.get(VoteBallotImpl.class,
						voteBallot.getPrimaryKeyObj());
			}

			if (voteBallot != null) {
				session.delete(voteBallot);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (voteBallot != null) {
			clearCache(voteBallot);
		}

		return voteBallot;
	}

	@Override
	public VoteBallot updateImpl(com.liferay.vote.model.VoteBallot voteBallot)
		throws SystemException {
		voteBallot = toUnwrappedModel(voteBallot);

		boolean isNew = voteBallot.isNew();

		Session session = null;

		try {
			session = openSession();

			if (voteBallot.isNew()) {
				session.save(voteBallot);

				voteBallot.setNew(false);
			}
			else {
				session.merge(voteBallot);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
			VoteBallotImpl.class, voteBallot.getPrimaryKey(), voteBallot);

		return voteBallot;
	}

	protected VoteBallot toUnwrappedModel(VoteBallot voteBallot) {
		if (voteBallot instanceof VoteBallotImpl) {
			return voteBallot;
		}

		VoteBallotImpl voteBallotImpl = new VoteBallotImpl();

		voteBallotImpl.setNew(voteBallot.isNew());
		voteBallotImpl.setPrimaryKey(voteBallot.getPrimaryKey());

		voteBallotImpl.setVoteBallotId(voteBallot.getVoteBallotId());
		voteBallotImpl.setCompanyId(voteBallot.getCompanyId());
		voteBallotImpl.setUserId(voteBallot.getUserId());
		voteBallotImpl.setUserName(voteBallot.getUserName());
		voteBallotImpl.setCreateDate(voteBallot.getCreateDate());
		voteBallotImpl.setModifiedDate(voteBallot.getModifiedDate());
		voteBallotImpl.setVoteIdeaTypeId(voteBallot.getVoteIdeaTypeId());
		voteBallotImpl.setName(voteBallot.getName());
		voteBallotImpl.setDescription(voteBallot.getDescription());
		voteBallotImpl.setEndDate(voteBallot.getEndDate());

		return voteBallotImpl;
	}

	/**
	 * Returns the vote ballot with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote ballot
	 * @return the vote ballot
	 * @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBallotException, SystemException {
		VoteBallot voteBallot = fetchByPrimaryKey(primaryKey);

		if (voteBallot == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBallotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return voteBallot;
	}

	/**
	 * Returns the vote ballot with the primary key or throws a {@link com.liferay.vote.NoSuchBallotException} if it could not be found.
	 *
	 * @param voteBallotId the primary key of the vote ballot
	 * @return the vote ballot
	 * @throws com.liferay.vote.NoSuchBallotException if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot findByPrimaryKey(long voteBallotId)
		throws NoSuchBallotException, SystemException {
		return findByPrimaryKey((Serializable)voteBallotId);
	}

	/**
	 * Returns the vote ballot with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote ballot
	 * @return the vote ballot, or <code>null</code> if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VoteBallot voteBallot = (VoteBallot)EntityCacheUtil.getResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
				VoteBallotImpl.class, primaryKey);

		if (voteBallot == _nullVoteBallot) {
			return null;
		}

		if (voteBallot == null) {
			Session session = null;

			try {
				session = openSession();

				voteBallot = (VoteBallot)session.get(VoteBallotImpl.class,
						primaryKey);

				if (voteBallot != null) {
					cacheResult(voteBallot);
				}
				else {
					EntityCacheUtil.putResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
						VoteBallotImpl.class, primaryKey, _nullVoteBallot);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VoteBallotModelImpl.ENTITY_CACHE_ENABLED,
					VoteBallotImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return voteBallot;
	}

	/**
	 * Returns the vote ballot with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voteBallotId the primary key of the vote ballot
	 * @return the vote ballot, or <code>null</code> if a vote ballot with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteBallot fetchByPrimaryKey(long voteBallotId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)voteBallotId);
	}

	/**
	 * Returns all the vote ballots.
	 *
	 * @return the vote ballots
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VoteBallot> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<VoteBallot> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<VoteBallot> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<VoteBallot> list = (List<VoteBallot>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VOTEBALLOT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VOTEBALLOT;

				if (pagination) {
					sql = sql.concat(VoteBallotModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VoteBallot>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VoteBallot>(list);
				}
				else {
					list = (List<VoteBallot>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vote ballots from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VoteBallot voteBallot : findAll()) {
			remove(voteBallot);
		}
	}

	/**
	 * Returns the number of vote ballots.
	 *
	 * @return the number of vote ballots
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VOTEBALLOT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the vote ballot persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.vote.model.VoteBallot")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VoteBallot>> listenersList = new ArrayList<ModelListener<VoteBallot>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VoteBallot>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VoteBallotImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VOTEBALLOT = "SELECT voteBallot FROM VoteBallot voteBallot";
	private static final String _SQL_COUNT_VOTEBALLOT = "SELECT COUNT(voteBallot) FROM VoteBallot voteBallot";
	private static final String _ORDER_BY_ENTITY_ALIAS = "voteBallot.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VoteBallot exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VoteBallotPersistenceImpl.class);
	private static VoteBallot _nullVoteBallot = new VoteBallotImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VoteBallot> toCacheModel() {
				return _nullVoteBallotCacheModel;
			}
		};

	private static CacheModel<VoteBallot> _nullVoteBallotCacheModel = new CacheModel<VoteBallot>() {
			@Override
			public VoteBallot toEntityModel() {
				return _nullVoteBallot;
			}
		};
}