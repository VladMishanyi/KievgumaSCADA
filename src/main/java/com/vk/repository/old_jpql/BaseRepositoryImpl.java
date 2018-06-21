//package com.vk.repository.old_jpql;
//
//import com.vk.repository.old_jpql.BaseRepository;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.math.BigInteger;
//import java.util.List;
//
///**
// * Created by User on 2018-03-12.
// */
//@Repository
//public class BaseRepositoryImpl implements BaseRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    @SuppressWarnings(value = {"unchecked"})
//    public List<BigInteger> readBaseSize(){
//        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase'");
//        return (List<BigInteger>) query.getResultList();
//    }
//}
