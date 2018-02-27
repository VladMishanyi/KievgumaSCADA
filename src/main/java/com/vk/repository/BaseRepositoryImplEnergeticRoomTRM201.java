package com.vk.repository;

import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
public class BaseRepositoryImplEnergeticRoomTRM201 extends BaseRepositoryImpl<TableModelEnergeticRoomTRM201> {

    @Override
    public List<TableModelEnergeticRoomTRM201> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        Query query = super.entityManager.createQuery("SELECT t FROM TRM201_Energrtic t WHERE t.date >= :start AND t.date <= :end", TableModelEnergeticRoomTRM201.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<TableModelEnergeticRoomTRM201>) query.getResultList();
    }
}
