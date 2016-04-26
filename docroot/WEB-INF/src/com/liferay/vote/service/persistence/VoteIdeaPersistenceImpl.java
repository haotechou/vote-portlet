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

import com.liferay.vote.NoSuchIdeaException;
import com.liferay.vote.model.VoteIdea;
import com.liferay.vote.model.impl.VoteIdeaImpl;
import com.liferay.vote.model.impl.VoteIdeaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vote idea service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdeaPersistence
 * @see VoteIdeaUtil
 * @generated
 */
public class VoteIdeaPersistenceImpl extends BasePersistenceImpl<VoteIdea>
	implements VoteIdeaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VoteIdeaUtil} to access the vote idea persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VoteIdeaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaModelImpl.FINDER_CACHE_ENABLED, VoteIdeaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaModelImpl.FINDER_CACHE_ENABLED, VoteIdeaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VoteIdeaPersistenceImpl() {
		setModelClass(VoteIdea.class);
	}

	/**
	 * Caches the vote idea in the entity cache if it is enabled.
	 *
	 * @param voteIdea the vote idea
	 */
	@Override
	public void cacheResult(VoteIdea voteIdea) {
		EntityCacheUtil.putResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaImpl.class, voteIdea.getPrimaryKey(), voteIdea);

		voteIdea.resetOriginalValues();
	}

	/**
	 * Caches the vote ideas in the entity cache if it is enabled.
	 *
	 * @param voteIdeas the vote ideas
	 */
	@Override
	public void cacheResult(List<VoteIdea> voteIdeas) {
		for (VoteIdea voteIdea : voteIdeas) {
			if (EntityCacheUtil.getResult(
						VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
						VoteIdeaImpl.class, voteIdea.getPrimaryKey()) == null) {
				cacheResult(voteIdea);
			}
			else {
				voteIdea.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vote ideas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VoteIdeaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VoteIdeaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vote idea.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VoteIdea voteIdea) {
		EntityCacheUtil.removeResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaImpl.class, voteIdea.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VoteIdea> voteIdeas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VoteIdea voteIdea : voteIdeas) {
			EntityCacheUtil.removeResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
				VoteIdeaImpl.class, voteIdea.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vote idea with the primary key. Does not add the vote idea to the database.
	 *
	 * @param voteIdeaId the primary key for the new vote idea
	 * @return the new vote idea
	 */
	@Override
	public VoteIdea create(long voteIdeaId) {
		VoteIdea voteIdea = new VoteIdeaImpl();

		voteIdea.setNew(true);
		voteIdea.setPrimaryKey(voteIdeaId);

		return voteIdea;
	}

	/**
	 * Removes the vote idea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voteIdeaId the primary key of the vote idea
	 * @return the vote idea that was removed
	 * @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea remove(long voteIdeaId)
		throws NoSuchIdeaException, SystemException {
		return remove((Serializable)voteIdeaId);
	}

	/**
	 * Removes the vote idea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vote idea
	 * @return the vote idea that was removed
	 * @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea remove(Serializable primaryKey)
		throws NoSuchIdeaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VoteIdea voteIdea = (VoteIdea)session.get(VoteIdeaImpl.class,
					primaryKey);

			if (voteIdea == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIdeaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(voteIdea);
		}
		catch (NoSuchIdeaException nsee) {
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
	protected VoteIdea removeImpl(VoteIdea voteIdea) throws SystemException {
		voteIdea = toUnwrappedModel(voteIdea);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(voteIdea)) {
				voteIdea = (VoteIdea)session.get(VoteIdeaImpl.class,
						voteIdea.getPrimaryKeyObj());
			}

			if (voteIdea != null) {
				session.delete(voteIdea);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (voteIdea != null) {
			clearCache(voteIdea);
		}

		return voteIdea;
	}

	@Override
	public VoteIdea updateImpl(com.liferay.vote.model.VoteIdea voteIdea)
		throws SystemException {
		voteIdea = toUnwrappedModel(voteIdea);

		boolean isNew = voteIdea.isNew();

		Session session = null;

		try {
			session = openSession();

			if (voteIdea.isNew()) {
				session.save(voteIdea);

				voteIdea.setNew(false);
			}
			else {
				session.merge(voteIdea);
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

		EntityCacheUtil.putResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaImpl.class, voteIdea.getPrimaryKey(), voteIdea);

		return voteIdea;
	}

	protected VoteIdea toUnwrappedModel(VoteIdea voteIdea) {
		if (voteIdea instanceof VoteIdeaImpl) {
			return voteIdea;
		}

		VoteIdeaImpl voteIdeaImpl = new VoteIdeaImpl();

		voteIdeaImpl.setNew(voteIdea.isNew());
		voteIdeaImpl.setPrimaryKey(voteIdea.getPrimaryKey());

		voteIdeaImpl.setVoteIdeaId(voteIdea.getVoteIdeaId());
		voteIdeaImpl.setCompanyId(voteIdea.getCompanyId());
		voteIdeaImpl.setUserId(voteIdea.getUserId());
		voteIdeaImpl.setUserName(voteIdea.getUserName());
		voteIdeaImpl.setCreateDate(voteIdea.getCreateDate());
		voteIdeaImpl.setModifiedDate(voteIdea.getModifiedDate());
		voteIdeaImpl.setVoteIdeaTypeId(voteIdea.getVoteIdeaTypeId());
		voteIdeaImpl.setName(voteIdea.getName());
		voteIdeaImpl.setDescription(voteIdea.getDescription());

		return voteIdeaImpl;
	}

	/**
	 * Returns the vote idea with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote idea
	 * @return the vote idea
	 * @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIdeaException, SystemException {
		VoteIdea voteIdea = fetchByPrimaryKey(primaryKey);

		if (voteIdea == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIdeaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return voteIdea;
	}

	/**
	 * Returns the vote idea with the primary key or throws a {@link com.liferay.vote.NoSuchIdeaException} if it could not be found.
	 *
	 * @param voteIdeaId the primary key of the vote idea
	 * @return the vote idea
	 * @throws com.liferay.vote.NoSuchIdeaException if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea findByPrimaryKey(long voteIdeaId)
		throws NoSuchIdeaException, SystemException {
		return findByPrimaryKey((Serializable)voteIdeaId);
	}

	/**
	 * Returns the vote idea with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote idea
	 * @return the vote idea, or <code>null</code> if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VoteIdea voteIdea = (VoteIdea)EntityCacheUtil.getResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
				VoteIdeaImpl.class, primaryKey);

		if (voteIdea == _nullVoteIdea) {
			return null;
		}

		if (voteIdea == null) {
			Session session = null;

			try {
				session = openSession();

				voteIdea = (VoteIdea)session.get(VoteIdeaImpl.class, primaryKey);

				if (voteIdea != null) {
					cacheResult(voteIdea);
				}
				else {
					EntityCacheUtil.putResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
						VoteIdeaImpl.class, primaryKey, _nullVoteIdea);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VoteIdeaModelImpl.ENTITY_CACHE_ENABLED,
					VoteIdeaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return voteIdea;
	}

	/**
	 * Returns the vote idea with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voteIdeaId the primary key of the vote idea
	 * @return the vote idea, or <code>null</code> if a vote idea with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdea fetchByPrimaryKey(long voteIdeaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)voteIdeaId);
	}

	/**
	 * Returns all the vote ideas.
	 *
	 * @return the vote ideas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VoteIdea> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<VoteIdea> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<VoteIdea> findAll(int start, int end,
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

		List<VoteIdea> list = (List<VoteIdea>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VOTEIDEA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VOTEIDEA;

				if (pagination) {
					sql = sql.concat(VoteIdeaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VoteIdea>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VoteIdea>(list);
				}
				else {
					list = (List<VoteIdea>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vote ideas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VoteIdea voteIdea : findAll()) {
			remove(voteIdea);
		}
	}

	/**
	 * Returns the number of vote ideas.
	 *
	 * @return the number of vote ideas
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

				Query q = session.createQuery(_SQL_COUNT_VOTEIDEA);

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
	 * Initializes the vote idea persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.vote.model.VoteIdea")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VoteIdea>> listenersList = new ArrayList<ModelListener<VoteIdea>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VoteIdea>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VoteIdeaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VOTEIDEA = "SELECT voteIdea FROM VoteIdea voteIdea";
	private static final String _SQL_COUNT_VOTEIDEA = "SELECT COUNT(voteIdea) FROM VoteIdea voteIdea";
	private static final String _ORDER_BY_ENTITY_ALIAS = "voteIdea.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VoteIdea exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VoteIdeaPersistenceImpl.class);
	private static VoteIdea _nullVoteIdea = new VoteIdeaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VoteIdea> toCacheModel() {
				return _nullVoteIdeaCacheModel;
			}
		};

	private static CacheModel<VoteIdea> _nullVoteIdeaCacheModel = new CacheModel<VoteIdea>() {
			@Override
			public VoteIdea toEntityModel() {
				return _nullVoteIdea;
			}
		};
}