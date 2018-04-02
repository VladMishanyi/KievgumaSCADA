package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-04-02.
 */
@Repository
public class BaseRepositoryImplLaboratoryAutoclavMV110 implements BaseRepositoryLaboratoryAutoclavMV110{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelLaboratoryAutoclavMV110 deviceModel) {
        entityManager.merge(deviceModel);
    }

    @Override
    @SuppressWarnings(value = {"unchecked"})
    public List<TableModelLaboratoryAutoclavMV110> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
        Query query = entityManager.createQuery("SELECT t FROM TableModelLaboratoryAutoclavMV110 t WHERE t.date >= :start AND t.date <= :end", TableModelLaboratoryAutoclavMV110.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
        return (List<TableModelLaboratoryAutoclavMV110>) query.getResultList();
    }
}
