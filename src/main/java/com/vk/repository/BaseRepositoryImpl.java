package com.vk.repository;

import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-26.
 */
@Repository
public abstract class BaseRepositoryImpl<E extends TableModel> implements BaseRepository<E> {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public void addValue(E deviceModel) {
        entityManager.merge(deviceModel);
    }

    public abstract List<E> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
