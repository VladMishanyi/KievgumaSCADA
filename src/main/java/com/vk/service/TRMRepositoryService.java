package com.vk.service;

import com.vk.entity.*;
import com.vk.repository.TRMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import java.util.Calendar;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2017-07-18.
 */
@Service
public class TRMRepositoryService {

    @Autowired
    private TRMRepository trmRepository;

    @Transactional
    public void addTRMvalue(TRM201_Energrtic trm201_energrtic){
        trmRepository.addTRMvalue(trm201_energrtic);
    }

    @Transactional(readOnly = true)
    public List<TRM201_Energrtic> rangeTimestamp(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestamp(startTimestamp, endTimestamp);
    }

    public TRM201_Energrtic getTRM201(int slaveAdrr){
        return trmRepository.getTRM201(slaveAdrr);
    }

    public ThirdCehAutoclav getThirdCehAutoclavTRM202(int slaveAdrr){
        return trmRepository.getThirdCehAutoclavTRM202(slaveAdrr);
    }

    @Transactional
    public void addThirdCehAutoclavTRM202(ThirdCehAutoclav thirdCehAutoclav){
        trmRepository.addThirdCehAutoclavTRM202(thirdCehAutoclav);
    }

    @Transactional(readOnly = true)
    public List<ThirdCehAutoclav> rangeTimestampThirdCehAutoclav(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampThirdCehAutoclav(startTimestamp, endTimestamp);
    }

    public FirstCehAutoclav getFirstCehAutoclavTRM202(int slaveAdrr){
        return trmRepository.getFirstCehAutoclavTRM202(slaveAdrr);
    }

    @Transactional
    public void addFirstCehAutoclavTRM202(FirstCehAutoclav firstCehAutoclav){
        trmRepository.addFirstCehAutoclavTRM202(firstCehAutoclav);
    }

    @Transactional(readOnly = true)
    public List<FirstCehAutoclav> rangeTimestampFirstCehAutoclav(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehAutoclav(startTimestamp, endTimestamp);
    }

    public FirstCehKameraDozrevanya getFirstCehKameraDozrevanyaMPR51(int slaveAdrr){
        return trmRepository.getFirstCehKameraDozrevanyaMPR51(slaveAdrr);
    }

    @Transactional
    public void addFirstCehKameraDozrevanyaMPR51(FirstCehKameraDozrevanya firstCehKameraDozrevanya){
        trmRepository.addFirstCehKameraDozrevanyaMPR51(firstCehKameraDozrevanya);
    }

    @Transactional(readOnly = true)
    public List<FirstCehKameraDozrevanya> rangeTimestampFirstCehKameraDozrevanya(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehKameraDozrevanya(startTimestamp, endTimestamp);
    }

    public FirstCehBuzuluk getFirstCehBuzulukTRM200(int slaveAdrr){
        return trmRepository.getFirstCehBuzulukTRM200(slaveAdrr);
    }

    @Transactional
    public void addFirstCehBuzulukTRM200(FirstCehBuzuluk firstCehBuzuluk){
        trmRepository.addFirstCehBuzulukTRM200(firstCehBuzuluk);
    }

    @Transactional(readOnly = true)
    public List<FirstCehBuzuluk> rangeTimestampFirstCehBuzuluk(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehBuzuluk(startTimestamp, endTimestamp);
    }

    @Transactional(readOnly = true)
    public BigInteger getSizeTableFirstChehBuzulukTRM200(){
        return trmRepository.getSizeTableFirstChehBuzulukTRM200();
    }

    @Transactional(readOnly = true)
    public BigInteger getSizeTableFirstCehKameraDozrevanyaMPR51(){
        return trmRepository.getSizeTableFirstCehKameraDozrevanyaMPR51();
    }

    @Transactional(readOnly = true)
    public BigInteger getSizeTableFirstCehAutoclavTRM202(){
        return trmRepository.getSizeTableFirstCehAutoclavTRM202();
    }

    @Transactional(readOnly = true)
    public BigInteger getSizeTableThirdCehAutoclavTRM202(){
        return trmRepository.getSizeTableThirdCehAutoclavTRM202();
    }

    @Transactional(readOnly = true)
    public BigInteger getSizeTableOtdelEnergetikaTRM202(){
        return trmRepository.getSizeTableOtdelEnergetikaTRM202();
    }

}
