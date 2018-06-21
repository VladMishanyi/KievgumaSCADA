package com.vk.service;

import com.vk.repository.old_jpql.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by User on 2018-03-12.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class ServiceModelImpl implements ServiceModel{

    @Autowired
    private BaseRepository baseRepository;

    public List<BigInteger> readBaseSize(){
        return baseRepository.readBaseSize();
    }
}
