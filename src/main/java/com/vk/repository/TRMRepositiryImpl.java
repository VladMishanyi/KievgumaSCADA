package com.vk.repository;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
//import com.serotonin.modbus4j.exception.ErrorResponseException;
import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.vk.entity.*;
import com.vk.util.ModbusFactoryMaster1;
import com.vk.util.ModbusFactoryMaster1Impl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2017-07-18.
 */
@Repository
public class TRMRepositiryImpl implements TRMRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ModbusMaster modbusMasterSerial;

    private final Logger LOGGER = Logger.getLogger(TRMRepositiryImpl.class);

    @Override
    public void addTRMvalue(TRM201_Energrtic trm201_energrtic) {
        entityManager.merge(trm201_energrtic);
    }

    @Override
    public List<TRM201_Energrtic> rangeTimestamp(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM TRM201_Energrtic t WHERE t.date >= :start AND t.date <= :end", TRM201_Energrtic.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<TRM201_Energrtic>) query.getResultList();
    }

    @Override
    public TRM201_Energrtic getTRM201(int slaveAdrr){
        TRM201_Energrtic trm201_energrtic = new TRM201_Energrtic();
        try {
            modbusMasterSerial.init();
//            System.out.println("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
//            System.out.println("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(1, slaveAdrr, RegisterRange.HOLDING_REGISTER, 1, DataType.TWO_BYTE_INT_SIGNED);
            batchRead.addLocator(2, slaveAdrr, RegisterRange.HOLDING_REGISTER, 2, DataType.TWO_BYTE_INT_SIGNED);
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerial.send(batchRead);
            int value1 = (short) batchResults.getValue(1);
            int value2 = (short) batchResults.getValue(2);
            float value3 = (float) batchResults.getValue(3);
            float value4 = (float) batchResults.getValue(4);
//            System.out.println(value1 +" : : "+value2+" : : "+value3+" : : "+value4);
            trm201_energrtic.setDate(new Date());
            trm201_energrtic.setValue1(value1);
            trm201_energrtic.setValue2(value2);
            trm201_energrtic.setValue3(value3);
            trm201_energrtic.setValue4(value4);
        }catch (Exception e){
//            System.out.println("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            trm201_energrtic.setDate(new Date());
            trm201_energrtic.setValue1(0);
            trm201_energrtic.setValue2(0);
            trm201_energrtic.setValue3(0);
            trm201_energrtic.setValue4(0);
            return trm201_energrtic;
        }
        finally {
            modbusMasterSerial.destroy();
//            System.out.println("ModBus Close connection, slave address №"+slaveAdrr);
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return trm201_energrtic;
    }

    @Override
    public ThirdCehAutoclav getThirdCehAutoclavTRM202(int slaveAdrr){
        ThirdCehAutoclav thirdCehAutoclav = new ThirdCehAutoclav();
        try {
            modbusMasterSerial.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerial.send(batchRead);
            float channel1 = (float) batchResults.getValue(3);
            float channel2 = (float) batchResults.getValue(4);
            thirdCehAutoclav.setDate(new Date());
            thirdCehAutoclav.setChannel1(channel1);
            thirdCehAutoclav.setChannel2(channel2);
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            thirdCehAutoclav.setDate(new Date());
            thirdCehAutoclav.setChannel1(0);
            thirdCehAutoclav.setChannel2(0);
            return thirdCehAutoclav;
        }
        finally {
            modbusMasterSerial.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return thirdCehAutoclav;
    }

    @Override
    public void addThirdCehAutoclavTRM202(ThirdCehAutoclav thirdCehAutoclav) {
        entityManager.merge(thirdCehAutoclav);
    }

    @Override
    public List<ThirdCehAutoclav> rangeTimestampThirdCehAutoclav(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM ThirdCehAutoclav t WHERE t.date >= :start AND t.date <= :end", ThirdCehAutoclav.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<ThirdCehAutoclav>) query.getResultList();
    }

    @Override
    public FirstCehAutoclav getFirstCehAutoclavTRM202(int slaveAdrr){
        FirstCehAutoclav firstCehAutoclav = new FirstCehAutoclav();
        try {
            modbusMasterSerial.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerial.send(batchRead);
            float channel1 = (float) batchResults.getValue(3);
            float channel2 = (float) batchResults.getValue(4);
            firstCehAutoclav.setDate(new Date());
            firstCehAutoclav.setChannel1(channel1);
            firstCehAutoclav.setChannel2(channel2);
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            firstCehAutoclav.setDate(new Date());
            firstCehAutoclav.setChannel1(0);
            firstCehAutoclav.setChannel2(0);
            return firstCehAutoclav;
        }
        finally {
            modbusMasterSerial.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return firstCehAutoclav;
    }

    @Override
    public void addFirstCehAutoclavTRM202(FirstCehAutoclav firstCehAutoclav) {
        entityManager.merge(firstCehAutoclav);
    }

    @Override
    public List<FirstCehAutoclav> rangeTimestampFirstCehAutoclav(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM FirstCehAutoclav t WHERE t.date >= :start AND t.date <= :end", FirstCehAutoclav.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<FirstCehAutoclav>) query.getResultList();
    }

    @Override
    public FirstCehKameraDozrevanya getFirstCehKameraDozrevanyaMPR51(int slaveAdrr){
        FirstCehKameraDozrevanya firstCehKameraDozrevanya = new FirstCehKameraDozrevanya();
        try {
            modbusMasterSerial.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(2, slaveAdrr, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerial.send(batchRead);
            float channel1 = (float) batchResults.getValue(2);
            float channel2 = (float) batchResults.getValue(3);
            float channel3 = (float) batchResults.getValue(4);
            firstCehKameraDozrevanya.setDate(new Date());
            firstCehKameraDozrevanya.setChannel1(channel1);
            firstCehKameraDozrevanya.setChannel2(channel2);
            firstCehKameraDozrevanya.setChannel3(channel3);
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            firstCehKameraDozrevanya.setDate(new Date());
            firstCehKameraDozrevanya.setChannel1(0);
            firstCehKameraDozrevanya.setChannel2(0);
            firstCehKameraDozrevanya.setChannel3(0);
            return firstCehKameraDozrevanya;
        }
        finally {
            modbusMasterSerial.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return firstCehKameraDozrevanya;
    }

    @Override
    public void addFirstCehKameraDozrevanyaMPR51(FirstCehKameraDozrevanya firstCehKameraDozrevanya) {
        entityManager.merge(firstCehKameraDozrevanya);
    }

    @Override
    public List<FirstCehKameraDozrevanya> rangeTimestampFirstCehKameraDozrevanya(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM FirstCehKameraDozrevanya t WHERE t.date >= :start AND t.date <= :end", FirstCehKameraDozrevanya.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<FirstCehKameraDozrevanya>) query.getResultList();
    }

    @Override
    public FirstCehBuzuluk getFirstCehBuzulukTRM200(int slaveAdrr){
        FirstCehBuzuluk firstCehBuzuluk = new FirstCehBuzuluk();
        try {
            modbusMasterSerial.init();
//            LOGGER.info("ModBus Listen slave address №"+slaveAdrr+"--"+modbusMasterSerial.testSlaveNode(slaveAdrr));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+slaveAdrr+"--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            batchRead.addLocator(3, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
            batchRead.addLocator(4, slaveAdrr, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
            BatchResults batchResults = modbusMasterSerial.send(batchRead);
            float channel1 = (float) batchResults.getValue(3);
            float channel2 = (float) batchResults.getValue(4);
            firstCehBuzuluk.setDate(new Date());
            firstCehBuzuluk.setChannel1(channel1);
            firstCehBuzuluk.setChannel2(channel2);
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+slaveAdrr+"--"+e.getMessage());
            firstCehBuzuluk.setDate(new Date());
            firstCehBuzuluk.setChannel1(0);
            firstCehBuzuluk.setChannel2(0);
            return firstCehBuzuluk;
        }
        finally {
            modbusMasterSerial.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+slaveAdrr);
        }
        return firstCehBuzuluk;
    }

    @Override
    public void addFirstCehBuzulukTRM200(FirstCehBuzuluk firstCehBuzuluk) {
        entityManager.merge(firstCehBuzuluk);
    }

    @Override
    public List<FirstCehBuzuluk> rangeTimestampFirstCehBuzuluk(Date startTimestamp, Date endTimestamp) {

        Query query = entityManager.createQuery("SELECT t FROM FirstCehBuzuluk t WHERE t.date >= :start AND t.date <= :end", FirstCehBuzuluk.class);
        query.setParameter("start", startTimestamp, TemporalType.TIMESTAMP);
        query.setParameter("end", endTimestamp, TemporalType.TIMESTAMP);

        return (List<FirstCehBuzuluk>) query.getResultList();
    }

    @Override
    public BigInteger getSizeTableFirstChehBuzulukTRM200(){
        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase' and table_name='FirstCehBuzuluk'");
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigInteger getSizeTableFirstCehKameraDozrevanyaMPR51(){
        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase' and table_name='FirstCehKameraDozrevanya'");
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigInteger getSizeTableFirstCehAutoclavTRM202(){
        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase' and table_name='FirstCehAutoclav'");
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigInteger getSizeTableThirdCehAutoclavTRM202(){
        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase' and table_name='ThirdCehAutoclav'");
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigInteger getSizeTableOtdelEnergetikaTRM202(){
        Query query = entityManager.createNativeQuery("SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase' and table_name='Trm201Energetic'");
        return (BigInteger) query.getSingleResult();
    }
}
