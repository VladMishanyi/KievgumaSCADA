package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
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
public class BaseRepositoryImplFirstCehSmesitel4KMSF1 implements BaseRepositoryFirstCehSmesitel4KMSF1{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelFirstCehSmesitel4KMSF1 deviceModel) {
        entityManager.merge(deviceModel);
    }

    @Override
    public List<TableModelFirstCehSmesitel4KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM TableModelFirstCehSmesitel4KMSF1 t WHERE t.date >= :start AND t.date <= :end", TableModelFirstCehSmesitel4KMSF1.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<TableModelFirstCehSmesitel4KMSF1>) query.getResultList();
    }
}