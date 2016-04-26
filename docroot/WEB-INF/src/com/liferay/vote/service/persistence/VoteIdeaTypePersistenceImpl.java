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

import com.liferay.vote.NoSuchIdeaTypeException;
import com.liferay.vote.model.VoteIdeaType;
import com.liferay.vote.model.impl.VoteIdeaTypeImpl;
import com.liferay.vote.model.impl.VoteIdeaTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vote idea type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see VoteIdeaTypePersistence
 * @see VoteIdeaTypeUtil
 * @generated
 */
public class VoteIdeaTypePersistenceImpl extends BasePersistenceImpl<VoteIdeaType>
	implements VoteIdeaTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VoteIdeaTypeUtil} to access the vote idea type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VoteIdeaTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeModelImpl.FINDER_CACHE_ENABLED, VoteIdeaTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeModelImpl.FINDER_CACHE_ENABLED, VoteIdeaTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VoteIdeaTypePersistenceImpl() {
		setModelClass(VoteIdeaType.class);
	}

	/**
	 * Caches the vote idea type in the entity cache if it is enabled.
	 *
	 * @param voteIdeaType the vote idea type
	 */
	@Override
	public void cacheResult(VoteIdeaType voteIdeaType) {
		EntityCacheUtil.putResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeImpl.class, voteIdeaType.getPrimaryKey(), voteIdeaType);

		voteIdeaType.resetOriginalValues();
	}

	/**
	 * Caches the vote idea types in the entity cache if it is enabled.
	 *
	 * @param voteIdeaTypes the vote idea types
	 */
	@Override
	public void cacheResult(List<VoteIdeaType> voteIdeaTypes) {
		for (VoteIdeaType voteIdeaType : voteIdeaTypes) {
			if (EntityCacheUtil.getResult(
						VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
						VoteIdeaTypeImpl.class, voteIdeaType.getPrimaryKey()) == null) {
				cacheResult(voteIdeaType);
			}
			else {
				voteIdeaType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vote idea types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VoteIdeaTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VoteIdeaTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vote idea type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VoteIdeaType voteIdeaType) {
		EntityCacheUtil.removeResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeImpl.class, voteIdeaType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VoteIdeaType> voteIdeaTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VoteIdeaType voteIdeaType : voteIdeaTypes) {
			EntityCacheUtil.removeResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
				VoteIdeaTypeImpl.class, voteIdeaType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vote idea type with the primary key. Does not add the vote idea type to the database.
	 *
	 * @param voteIdeaTypeId the primary key for the new vote idea type
	 * @return the new vote idea type
	 */
	@Override
	public VoteIdeaType create(long voteIdeaTypeId) {
		VoteIdeaType voteIdeaType = new VoteIdeaTypeImpl();

		voteIdeaType.setNew(true);
		voteIdeaType.setPrimaryKey(voteIdeaTypeId);

		return voteIdeaType;
	}

	/**
	 * Removes the vote idea type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param voteIdeaTypeId the primary key of the vote idea type
	 * @return the vote idea type that was removed
	 * @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType remove(long voteIdeaTypeId)
		throws NoSuchIdeaTypeException, SystemException {
		return remove((Serializable)voteIdeaTypeId);
	}

	/**
	 * Removes the vote idea type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vote idea type
	 * @return the vote idea type that was removed
	 * @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType remove(Serializable primaryKey)
		throws NoSuchIdeaTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VoteIdeaType voteIdeaType = (VoteIdeaType)session.get(VoteIdeaTypeImpl.class,
					primaryKey);

			if (voteIdeaType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIdeaTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(voteIdeaType);
		}
		catch (NoSuchIdeaTypeException nsee) {
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
	protected VoteIdeaType removeImpl(VoteIdeaType voteIdeaType)
		throws SystemException {
		voteIdeaType = toUnwrappedModel(voteIdeaType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(voteIdeaType)) {
				voteIdeaType = (VoteIdeaType)session.get(VoteIdeaTypeImpl.class,
						voteIdeaType.getPrimaryKeyObj());
			}

			if (voteIdeaType != null) {
				session.delete(voteIdeaType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (voteIdeaType != null) {
			clearCache(voteIdeaType);
		}

		return voteIdeaType;
	}

	@Override
	public VoteIdeaType updateImpl(
		com.liferay.vote.model.VoteIdeaType voteIdeaType)
		throws SystemException {
		voteIdeaType = toUnwrappedModel(voteIdeaType);

		boolean isNew = voteIdeaType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (voteIdeaType.isNew()) {
				session.save(voteIdeaType);

				voteIdeaType.setNew(false);
			}
			else {
				session.merge(voteIdeaType);
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

		EntityCacheUtil.putResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
			VoteIdeaTypeImpl.class, voteIdeaType.getPrimaryKey(), voteIdeaType);

		return voteIdeaType;
	}

	protected VoteIdeaType toUnwrappedModel(VoteIdeaType voteIdeaType) {
		if (voteIdeaType instanceof VoteIdeaTypeImpl) {
			return voteIdeaType;
		}

		VoteIdeaTypeImpl voteIdeaTypeImpl = new VoteIdeaTypeImpl();

		voteIdeaTypeImpl.setNew(voteIdeaType.isNew());
		voteIdeaTypeImpl.setPrimaryKey(voteIdeaType.getPrimaryKey());

		voteIdeaTypeImpl.setVoteIdeaTypeId(voteIdeaType.getVoteIdeaTypeId());
		voteIdeaTypeImpl.setCompanyId(voteIdeaType.getCompanyId());
		voteIdeaTypeImpl.setUserId(voteIdeaType.getUserId());
		voteIdeaTypeImpl.setUserName(voteIdeaType.getUserName());
		voteIdeaTypeImpl.setCreateDate(voteIdeaType.getCreateDate());
		voteIdeaTypeImpl.setModifiedDate(voteIdeaType.getModifiedDate());
		voteIdeaTypeImpl.setName(voteIdeaType.getName());

		return voteIdeaTypeImpl;
	}

	/**
	 * Returns the vote idea type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote idea type
	 * @return the vote idea type
	 * @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIdeaTypeException, SystemException {
		VoteIdeaType voteIdeaType = fetchByPrimaryKey(primaryKey);

		if (voteIdeaType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIdeaTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return voteIdeaType;
	}

	/**
	 * Returns the vote idea type with the primary key or throws a {@link com.liferay.vote.NoSuchIdeaTypeException} if it could not be found.
	 *
	 * @param voteIdeaTypeId the primary key of the vote idea type
	 * @return the vote idea type
	 * @throws com.liferay.vote.NoSuchIdeaTypeException if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType findByPrimaryKey(long voteIdeaTypeId)
		throws NoSuchIdeaTypeException, SystemException {
		return findByPrimaryKey((Serializable)voteIdeaTypeId);
	}

	/**
	 * Returns the vote idea type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vote idea type
	 * @return the vote idea type, or <code>null</code> if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VoteIdeaType voteIdeaType = (VoteIdeaType)EntityCacheUtil.getResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
				VoteIdeaTypeImpl.class, primaryKey);

		if (voteIdeaType == _nullVoteIdeaType) {
			return null;
		}

		if (voteIdeaType == null) {
			Session session = null;

			try {
				session = openSession();

				voteIdeaType = (VoteIdeaType)session.get(VoteIdeaTypeImpl.class,
						primaryKey);

				if (voteIdeaType != null) {
					cacheResult(voteIdeaType);
				}
				else {
					EntityCacheUtil.putResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
						VoteIdeaTypeImpl.class, primaryKey, _nullVoteIdeaType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VoteIdeaTypeModelImpl.ENTITY_CACHE_ENABLED,
					VoteIdeaTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return voteIdeaType;
	}

	/**
	 * Returns the vote idea type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param voteIdeaTypeId the primary key of the vote idea type
	 * @return the vote idea type, or <code>null</code> if a vote idea type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VoteIdeaType fetchByPrimaryKey(long voteIdeaTypeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)voteIdeaTypeId);
	}

	/**
	 * Returns all the vote idea types.
	 *
	 * @return the vote idea types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VoteIdeaType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<VoteIdeaType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<VoteIdeaType> findAll(int start, int end,
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

		List<VoteIdeaType> list = (List<VoteIdeaType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VOTEIDEATYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VOTEIDEATYPE;

				if (pagination) {
					sql = sql.concat(VoteIdeaTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VoteIdeaType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VoteIdeaType>(list);
				}
				else {
					list = (List<VoteIdeaType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vote idea types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VoteIdeaType voteIdeaType : findAll()) {
			remove(voteIdeaType);
		}
	}

	/**
	 * Returns the number of vote idea types.
	 *
	 * @return the number of vote idea types
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

				Query q = session.createQuery(_SQL_COUNT_VOTEIDEATYPE);

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
	 * Initializes the vote idea type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.vote.model.VoteIdeaType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VoteIdeaType>> listenersList = new ArrayList<ModelListener<VoteIdeaType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VoteIdeaType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VoteIdeaTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VOTEIDEATYPE = "SELECT voteIdeaType FROM VoteIdeaType voteIdeaType";
	private static final String _SQL_COUNT_VOTEIDEATYPE = "SELECT COUNT(voteIdeaType) FROM VoteIdeaType voteIdeaType";
	private static final String _ORDER_BY_ENTITY_ALIAS = "voteIdeaType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VoteIdeaType exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VoteIdeaTypePersistenceImpl.class);
	private static VoteIdeaType _nullVoteIdeaType = new VoteIdeaTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VoteIdeaType> toCacheModel() {
				return _nullVoteIdeaTypeCacheModel;
			}
		};

	private static CacheModel<VoteIdeaType> _nullVoteIdeaTypeCacheModel = new CacheModel<VoteIdeaType>() {
			@Override
			public VoteIdeaType toEntityModel() {
				return _nullVoteIdeaType;
			}
		};
}