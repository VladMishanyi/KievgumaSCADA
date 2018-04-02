package com.vk.repository;

import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
@Repository
public class BaseRepositoryImplThirdCehAutoclavTRM202  /*extends BaseRepositoryImpl*/ implements BaseRepositoryThirdCehAutoclavTRM202{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelThirdCehAutoclavTRM202 deviceModel) {
        entityManager.merge(deviceModel);
    }

    @Override
    @SuppressWarnings(value = {"unchecked"})
    public List<TableModelThirdCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
        Query query = entityManager.createQuery("SELECT t FROM TableModelThirdCehAutoclavTRM202 t WHERE t.date >= :start AND t.date <= :end", TableModelThirdCehAutoclavTRM202.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
        return (List<TableModelThirdCehAutoclavTRM202>) query.getResultList();
    }
}
