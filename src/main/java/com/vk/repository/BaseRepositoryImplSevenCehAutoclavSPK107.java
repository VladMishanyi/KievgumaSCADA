package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
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
public class BaseRepositoryImplSevenCehAutoclavSPK107 implements BaseRepositorySevenCehAutoclavSPK107{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelSevenCehAutoclavSPK107 deviceModel) {
        entityManager.merge(deviceModel);
    }

    @Override
    public List<TableModelSevenCehAutoclavSPK107> rangeTimestamp(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM TableModelSevenCehAutoclavSPK107 t WHERE t.date >= :start AND t.date <= :end", TableModelSevenCehAutoclavSPK107.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<TableModelSevenCehAutoclavSPK107>) query.getResultList();
    }
}