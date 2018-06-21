//package com.vk.repository.old_jpql;
//
//import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehAutoclavTRM202;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.TemporalType;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by User on 2018-03-07.
// */
//@Repository
//public class BaseRepositoryImplFirstCehAutoclavTRM202  /*extends BaseRepositoryImpl*/ implements BaseRepositoryFirstCehAutoclavTRM202 {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void addValue(TableModelFirstCehAutoclavTRM202 deviceModel) {
//        entityManager.merge(deviceModel);
//    }
//
//    @Override
//    @SuppressWarnings(value = {"unchecked"})
//    public List<TableModelFirstCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
//        Query query = entityManager.createQuery("SELECT t FROM TableModelFirstCehAutoclavTRM202 t WHERE t.date >= :start AND t.date <= :end", TableModelFirstCehAutoclavTRM202.class);
//        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
//        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
//        return (List<TableModelFirstCehAutoclavTRM202>) query.getResultList();
//    }
//}
