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

    public SevenCehAutoclav getSevenCehAutoclavSPK(int slaveAdrr){
        return trmRepository.getSevenCehAutoclavSPK(slaveAdrr);
    }
    @Transactional
    public void addSevenCehAutoclavSPK(SevenCehAutoclav sevenCehAutoclav){
        trmRepository.addSevenCehAutoclavSPK(sevenCehAutoclav);
    }
    @Transactional(readOnly = true)
    public List<SevenCehAutoclav> rangeTimestampSevenCehAutoclav(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampSevenCehAutoclav(startTimestamp, endTimestamp);
    }

    public FirstCehSmesitel1KMSF1 getFirstCehSmesitel1KMSF1(int slaveAdrr){
        return trmRepository.getFirstCehSmesitel1KMSF1(slaveAdrr);
    }
    @Transactional
    public void addFirstCehSmesitel1KMSF1(FirstCehSmesitel1KMSF1 firstCehSmesitel1KMSF1){
        trmRepository.addFirstCehSmesitel1KMSF1(firstCehSmesitel1KMSF1);
    }
    @Transactional(readOnly = true)
    public List<FirstCehSmesitel1KMSF1> rangeTimestampFirstCehSmesitel1KMSF1(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehSmesitel1KMSF1(startTimestamp, endTimestamp);
    }

    public FirstCehSmesitel2KMSF1 getFirstCehSmesitel2KMSF1(int slaveAdrr){
        return trmRepository.getFirstCehSmesitel2KMSF1(slaveAdrr);
    }
    @Transactional
    public void addFirstCehSmesitel2KMSF1(FirstCehSmesitel2KMSF1 firstCehSmesitel2KMSF1){
        trmRepository.addFirstCehSmesitel2KMSF1(firstCehSmesitel2KMSF1);
    }
    @Transactional(readOnly = true)
    public List<FirstCehSmesitel2KMSF1> rangeTimestampFirstCehSmesitel2KMSF1(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehSmesitel2KMSF1(startTimestamp, endTimestamp);
    }

    public FirstCehSmesitel3KMSF1 getFirstCehSmesitel3KMSF1(int slaveAdrr){
        return trmRepository.getFirstCehSmesitel3KMSF1(slaveAdrr);
    }
    @Transactional
    public void addFirstCehSmesitel3KMSF1(FirstCehSmesitel3KMSF1 firstCehSmesitel3KMSF1){
        trmRepository.addFirstCehSmesitel3KMSF1(firstCehSmesitel3KMSF1);
    }
    @Transactional(readOnly = true)
    public List<FirstCehSmesitel3KMSF1> rangeTimestampFirstCehSmesitel3KMSF1(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehSmesitel3KMSF1(startTimestamp, endTimestamp);
    }

    public FirstCehSmesitel4KMSF1 getFirstCehSmesitel4KMSF1(int slaveAdrr){
        return trmRepository.getFirstCehSmesitel4KMSF1(slaveAdrr);
    }
    @Transactional
    public void addFirstCehSmesitel4KMSF1(FirstCehSmesitel4KMSF1 firstCehSmesitel4KMSF1){
        trmRepository.addFirstCehSmesitel4KMSF1(firstCehSmesitel4KMSF1);
    }
    @Transactional(readOnly = true)
    public List<FirstCehSmesitel4KMSF1> rangeTimestampFirstCehSmesitel4KMSF1(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehSmesitel4KMSF1(startTimestamp, endTimestamp);
    }

    public FirstCehSmesitel5KMSF1 getFirstCehSmesitel5KMSF1(int slaveAdrr){
        return trmRepository.getFirstCehSmesitel5KMSF1(slaveAdrr);
    }
    @Transactional
    public void addFirstCehSmesitel5KMSF1(FirstCehSmesitel5KMSF1 firstCehSmesitel5KMSF1){
        trmRepository.addFirstCehSmesitel5KMSF1(firstCehSmesitel5KMSF1);
    }
    @Transactional(readOnly = true)
    public List<FirstCehSmesitel5KMSF1> rangeTimestampFirstCehSmesitel5KMSF1(Date startTimestamp, Date endTimestamp){
        return trmRepository.rangeTimestampFirstCehSmesitel5KMSF1(startTimestamp, endTimestamp);
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
