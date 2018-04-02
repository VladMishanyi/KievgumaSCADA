package com.vk.repository;


import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
@Repository
public class BaseRepositoryImplEnergeticRoomTRM201 /*extends BaseRepositoryImpl*/ implements BaseRepositoryEnergeticRoomTRM201 {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelEnergeticRoomTRM201 deviceModel){
        entityManager.merge(deviceModel);
    }

    @Override
    @SuppressWarnings(value = {"unchecked"})
    public List<TableModelEnergeticRoomTRM201> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        Query query = entityManager.createQuery("SELECT t FROM TableModelEnergeticRoomTRM201 t WHERE t.date >= :start AND t.date <= :end", TableModelEnergeticRoomTRM201.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
        return (List<TableModelEnergeticRoomTRM201>) query.getResultList();
    }
}
