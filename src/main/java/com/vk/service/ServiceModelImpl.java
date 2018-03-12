package com.vk.service;

import com.vk.repository.BaseRepository;
import com.vk.repository.BaseRepositoryEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by User on 2018-03-12.
 */
@Repository
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImpl implements ServiceModel{

    @Autowired
    private BaseRepository baseRepository;

    public List<BigInteger> readBaseSize(){
        return baseRepository.readBaseSize();
    }
}
