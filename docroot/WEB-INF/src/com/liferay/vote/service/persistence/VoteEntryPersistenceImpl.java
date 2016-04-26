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

import com.liferay.vote.NoSuchEntryException;
import com.liferay.vote.model.VoteEntry;
import com.liferay.vote.model.impl.VoteEntryImpl;
import com.liferay.vote.model.impl.VoteEntryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vote entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteEntryPersistence
 * @see VoteEntryUtil
 * @generated
 */
public class VoteEntryPersistenceImpl extends BasePersistenceImpl<VoteEntry>
	implements VoteEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VoteEntryUtil} to access the vote entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VoteEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryModelImpl.FINDER_CACHE_ENABLED, VoteEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryModelImpl.FINDER_CACHE_ENABLED, VoteEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VoteEntryPersistenceImpl() {
		setModelClass(VoteEntry.class);
	}

	/**
	 * Caches the vote entry in the entity cache if it is enabled.
	 *
	 * @param voteEntry the vote entry
	 */
	@Override
	public void cacheResult(VoteEntry voteEntry) {
		EntityCacheUtil.putResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryImpl.class, voteEntry.getPrimaryKey(), voteEntry);

		voteEntry.resetOriginalValues();
	}

	/**
	 * Caches the vote entries in the entity cache if it is enabled.
	 *
	 * @param voteEntries the vote entries
	 */
	@Override
	public void cacheResult(List<VoteEntry> voteEntries) {
		for (VoteEntry voteEntry : voteEntries) {
			if (EntityCacheUtil.getResult(
						VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
						VoteEntryImpl.class, voteEntry.getPrimaryKey()) == null) {
				cacheResult(voteEntry);
			}
			else {
				voteEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vote entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VoteEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VoteEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vote entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VoteEntry voteEntry) {
		EntityCacheUtil.removeResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryImpl.class, voteEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VoteEntry> voteEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VoteEntry voteEntry : voteEntries) {
			EntityCacheUtil.removeResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
				VoteEntryImpl.class, voteEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vote entry with the primary key. Does not add the vote entry to the database.
	 *
	 * @param voteEntryId the primary key for the new vote entry
	 * @return the new vote entry
	 */
	@Override
	public VoteEntry create(long voteEntryId) {
		VoteEntry voteEntry = new VoteEntryImpl();

		voteEntry.setNew(true);
		voteEntry.setPrimaryKey(voteEntryId);

		return voteEntry;
	}

	/**
	 * Removes the vote entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voteEntryId the primary key of the vote entry
	 * @return the vote entry that was removed
	 * @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry remove(long voteEntryId)
		throws NoSuchEntryException, SystemException {
		return remove((Serializable)voteEntryId);
	}

	/**
	 * Removes the vote entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vote entry
	 * @return the vote entry that was removed
	 * @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry remove(Serializable primaryKey)
		throws NoSuchEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VoteEntry voteEntry = (VoteEntry)session.get(VoteEntryImpl.class,
					primaryKey);

			if (voteEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(voteEntry);
		}
		catch (NoSuchEntryException nsee) {
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
	protected VoteEntry removeImpl(VoteEntry voteEntry)
		throws SystemException {
		voteEntry = toUnwrappedModel(voteEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(voteEntry)) {
				voteEntry = (VoteEntry)session.get(VoteEntryImpl.class,
						voteEntry.getPrimaryKeyObj());
			}

			if (voteEntry != null) {
				session.delete(voteEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (voteEntry != null) {
			clearCache(voteEntry);
		}

		return voteEntry;
	}

	@Override
	public VoteEntry updateImpl(com.liferay.vote.model.VoteEntry voteEntry)
		throws SystemException {
		voteEntry = toUnwrappedModel(voteEntry);

		boolean isNew = voteEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (voteEntry.isNew()) {
				session.save(voteEntry);

				voteEntry.setNew(false);
			}
			else {
				session.merge(voteEntry);
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

		EntityCacheUtil.putResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
			VoteEntryImpl.class, voteEntry.getPrimaryKey(), voteEntry);

		return voteEntry;
	}

	protected VoteEntry toUnwrappedModel(VoteEntry voteEntry) {
		if (voteEntry instanceof VoteEntryImpl) {
			return voteEntry;
		}

		VoteEntryImpl voteEntryImpl = new VoteEntryImpl();

		voteEntryImpl.setNew(voteEntry.isNew());
		voteEntryImpl.setPrimaryKey(voteEntry.getPrimaryKey());

		voteEntryImpl.setVoteEntryId(voteEntry.getVoteEntryId());
		voteEntryImpl.setCompanyId(voteEntry.getCompanyId());
		voteEntryImpl.setUserId(voteEntry.getUserId());
		voteEntryImpl.setUserName(voteEntry.getUserName());
		voteEntryImpl.setCreateDate(voteEntry.getCreateDate());
		voteEntryImpl.setModifiedDate(voteEntry.getModifiedDate());
		voteEntryImpl.setVoteBallotId(voteEntry.getVoteBallotId());

		return voteEntryImpl;
	}

	/**
	 * Returns the vote entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote entry
	 * @return the vote entry
	 * @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntryException, SystemException {
		VoteEntry voteEntry = fetchByPrimaryKey(primaryKey);

		if (voteEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return voteEntry;
	}

	/**
	 * Returns the vote entry with the primary key or throws a {@link com.liferay.vote.NoSuchEntryException} if it could not be found.
	 *
	 * @param voteEntryId the primary key of the vote entry
	 * @return the vote entry
	 * @throws com.liferay.vote.NoSuchEntryException if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry findByPrimaryKey(long voteEntryId)
		throws NoSuchEntryException, SystemException {
		return findByPrimaryKey((Serializable)voteEntryId);
	}

	/**
	 * Returns the vote entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote entry
	 * @return the vote entry, or <code>null</code> if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VoteEntry voteEntry = (VoteEntry)EntityCacheUtil.getResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
				VoteEntryImpl.class, primaryKey);

		if (voteEntry == _nullVoteEntry) {
			return null;
		}

		if (voteEntry == null) {
			Session session = null;

			try {
				session = openSession();

				voteEntry = (VoteEntry)session.get(VoteEntryImpl.class,
						primaryKey);

				if (voteEntry != null) {
					cacheResult(voteEntry);
				}
				else {
					EntityCacheUtil.putResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
						VoteEntryImpl.class, primaryKey, _nullVoteEntry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VoteEntryModelImpl.ENTITY_CACHE_ENABLED,
					VoteEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return voteEntry;
	}

	/**
	 * Returns the vote entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voteEntryId the primary key of the vote entry
	 * @return the vote entry, or <code>null</code> if a vote entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteEntry fetchByPrimaryKey(long voteEntryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)voteEntryId);
	}

	/**
	 * Returns all the vote entries.
	 *
	 * @return the vote entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VoteEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<VoteEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<VoteEntry> findAll(int start, int end,
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

		List<VoteEntry> list = (List<VoteEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VOTEENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VOTEENTRY;

				if (pagination) {
					sql = sql.concat(VoteEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VoteEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VoteEntry>(list);
				}
				else {
					list = (List<VoteEntry>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vote entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VoteEntry voteEntry : findAll()) {
			remove(voteEntry);
		}
	}

	/**
	 * Returns the number of vote entries.
	 *
	 * @return the number of vote entries
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

				Query q = session.createQuery(_SQL_COUNT_VOTEENTRY);

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
	 * Initializes the vote entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.vote.model.VoteEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VoteEntry>> listenersList = new ArrayList<ModelListener<VoteEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VoteEntry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VoteEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VOTEENTRY = "SELECT voteEntry FROM VoteEntry voteEntry";
	private static final String _SQL_COUNT_VOTEENTRY = "SELECT COUNT(voteEntry) FROM VoteEntry voteEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "voteEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VoteEntry exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VoteEntryPersistenceImpl.class);
	private static VoteEntry _nullVoteEntry = new VoteEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VoteEntry> toCacheModel() {
				return _nullVoteEntryCacheModel;
			}
		};

	private static CacheModel<VoteEntry> _nullVoteEntryCacheModel = new CacheModel<VoteEntry>() {
			@Override
			public VoteEntry toEntityModel() {
				return _nullVoteEntry;
			}
		};
}