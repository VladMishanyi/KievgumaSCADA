//package com.vk.repository.old_jpql;
//
//import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
//import com.vk.repository.old_jpql.BaseRepositoryFirstCehSmesitel1KMSF1;
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
//public class BaseRepositoryImplFirstCehSmesitel1KMSF1  /*extends BaseRepositoryImpl*/ implements BaseRepositoryFirstCehSmesitel1KMSF1 {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void addValue(TableModelFirstCehSmesitel1KMSF1 deviceModel) {
//        entityManager.merge(deviceModel);
//    }
//
//    @Override
//    @SuppressWarnings(value = {"unchecked"})
//    public List<TableModelFirstCehSmesitel1KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp) {
//        Query query = entityManager.createQuery("SELECT t FROM TableModelFirstCehSmesitel1KMSF1 t WHERE t.date >= :start AND t.date <= :end", TableModelFirstCehSmesitel1KMSF1.class);
//        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
//        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);
//        return (List<TableModelFirstCehSmesitel1KMSF1>) query.getResultList();
//    }
//}
