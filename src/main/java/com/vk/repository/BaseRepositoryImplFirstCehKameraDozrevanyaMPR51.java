package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
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
public class BaseRepositoryImplFirstCehKameraDozrevanyaMPR51  /*extends BaseRepositoryImpl*/ implements BaseRepositoryFirstCehKameraDozrevanyaMPR51{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addValue(TableModelFirstCehKameraDozrevanyaMPR51 deviceModel) {
        entityManager.merge(deviceModel);
    }

    @Override
    @SuppressWarnings(value = {"unchecked"})
    public List<TableModelFirstCehKameraDozrevanyaMPR51> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
        Query query = entityManager.createQuery("SELECT t FROM TableModelFirstCehKameraDozrevanyaMPR51 t WHERE t.date >= :start AND t.date <= :end", TableModelFirstCehKameraDozrevanyaMPR51.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
        return (List<TableModelFirstCehKameraDozrevanyaMPR51>) query.getResultList();
    }
}
