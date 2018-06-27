//package com.vk.repository.old_jpql;
//
//import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehBuzulukTRM200;
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
//public class BaseRepositoryImplFirstCehBuzulukTRM200  /*extends BaseRepositoryImpl*/ implements BaseRepositoryFirstCehBuzulukTRM200 {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void addValue(TableModelFirstCehBuzulukTRM200 deviceModel) {
//        entityManager.merge(deviceModel);
//    }
//
//    @Override
//    @SuppressWarnings(value = {"unchecked"})
//    public List<TableModelFirstCehBuzulukTRM200> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
//        Query query = entityManager.createQuery("SELECT t FROM TableModelFirstCehBuzulukTRM200 t WHERE t.date >= :start AND t.date <= :end", TableModelFirstCehBuzulukTRM200.class);
//        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
//        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
//        return (List<TableModelFirstCehBuzulukTRM200>) query.getResultList();
//    }
//}