package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplSecondCehKameraVulcan3MPR51
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelSecondCehKameraVulcan3MPR51>
        implements ModbusRepositorySecondCehKameraVulcan3MPR51 {

    private final ModbusMasterSerialModel modbusMasterSerialFourth;

    private final DeviceModelSecondCehKameraVulcan3MPR51 deviceModelSecondCehKameraVulcan3MPR51;

    private final BatchRead<Integer> batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    private ModbusShort modbusShort;

    @Autowired
    public ModbusRepositoryImplSecondCehKameraVulcan3MPR51(final ModbusMasterSerialModel modbusMasterSerialFourth,
                                                           final DeviceModelSecondCehKameraVulcan3MPR51 deviceModelSecondCehKameraVulcan3MPR51,
                                                           final BatchRead<Integer> batchRead,
                                                           final ModbusFloat modbusFloat) {
        super(modbusMasterSerialFourth, modbusFloat);
        this.modbusMasterSerialFourth = modbusMasterSerialFourth;
        this.deviceModelSecondCehKameraVulcan3MPR51 = deviceModelSecondCehKameraVulcan3MPR51;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelSecondCehKameraVulcan3MPR51 getDeviceModel(final boolean enableBatch) {

        final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator0r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator1r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator2r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator3r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator4r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator5r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator6r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator7r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator8r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator9r,()
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator10r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator11r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator12r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator13r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator14r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator15r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator16r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator17r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator18r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator19r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator20r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator21r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator22r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator23r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator24r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator25r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator26r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator27r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator28r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator29r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator30r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator31r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator32r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator33r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator34r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator35r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator36r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator37r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator38r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator39r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator40r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator41r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator42r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator43r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator44r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator45r()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator46r()
                );
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister0(listFloat.get(0));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister1(listFloat.get(1));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister2(listFloat.get(2));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister3(listFloat.get(3));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister4(listFloat.get(4));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister5(listFloat.get(5));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister6(listFloat.get(6));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister7(listFloat.get(7));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister8(listFloat.get(8));
        //        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister9 (istFloat.get(9)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister10(listFloat.get(9));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister11(listFloat.get(10));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister12(listFloat.get(12)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister13(listFloat.get(11));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister14(listFloat.get(12));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister15(listFloat.get(15)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister16(listFloat.get(13));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister17(listFloat.get(14));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister18(listFloat.get(18)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister19(listFloat.get(15));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister20(listFloat.get(16));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister21(listFloat.get(21)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister22(listFloat.get(17));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister23(listFloat.get(18));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister24(listFloat.get(24)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister25(listFloat.get(19));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister26(listFloat.get(20));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister27(listFloat.get(27)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister28(listFloat.get(21));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister29(listFloat.get(22));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister30(listFloat.get(30)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister31(listFloat.get(23));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister32(listFloat.get(24));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister33(listFloat.get(33)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister34(listFloat.get(25));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister35(listFloat.get(26));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister36(listFloat.get(36)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister37(listFloat.get(27));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister38(listFloat.get(28));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister39(listFloat.get(39)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister40(listFloat.get(29));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister41(listFloat.get(30));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister42(listFloat.get(42)));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister43(listFloat.get(31));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister44(listFloat.get(32));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister45(listFloat.get(33));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister46(listFloat.get(46)));

        final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator0r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator1r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator2r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator3r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator4r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator5r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator6r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator7r,()
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator8r,()
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator9r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator10r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator11r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator12r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator13r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator14r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator15r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator16r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator17r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator18r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator19r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator20r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator21r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator22r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator23r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator24r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator25r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator26r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator27r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator28r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator29r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator30r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator31r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator32r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator33r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator34r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator35r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator36r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator37r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator38r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator39r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator40r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator41r(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator42r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator43r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator44r(),
//                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator45r()
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator46r()
        );
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister0 (stFloat.get(0);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister1 (stFloat.get(1);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister2 (stFloat.get(2);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister3 (stFloat.get(3);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister4 (stFloat.get(4);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister5 (stFloat.get(5);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister6 (stFloat.get(6);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister7 (stFloat.get(7);
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister8 (stFloat.get(8);
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister9(listShort.get(0));
        //        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister10(istFloat.get(10));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister11(istFloat.get(11));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister12(listShort.get(1));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister13(istFloat.get(13));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister14(istFloat.get(14));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister15(listShort.get(2));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister16(istFloat.get(16));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister17(istFloat.get(17));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister18(listShort.get(3));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister19(istFloat.get(19));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister20(istFloat.get(20));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister21(listShort.get(4));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister22(istFloat.get(22));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister23(istFloat.get(23));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister24(listShort.get(5));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister25(istFloat.get(25));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister26(istFloat.get(26));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister27(listShort.get(6));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister28(istFloat.get(28));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister29(istFloat.get(29));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister30(listShort.get(7));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister31(istFloat.get(31));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister32(istFloat.get(32));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister33(listShort.get(8));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister34(istFloat.get(34));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister35(istFloat.get(35));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister36(listShort.get(9));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister37(istFloat.get(37));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister38(istFloat.get(38));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister39(listShort.get(10));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister40(istFloat.get(40));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister41(istFloat.get(41));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister42(listShort.get(11));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister43(istFloat.get(43));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister44(istFloat.get(44));
//        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister45(istFloat.get(45));
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister46(listShort.get(12));


        return deviceModelSecondCehKameraVulcan3MPR51;
    }

    @Override
    public void readDataFromRegister0(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator0r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister0(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister1(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator1r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister1(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister2(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator2r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister2(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister3(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator3r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister3(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister4(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator4r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister4(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister5(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator5r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister5(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister6(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator6r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister6(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister7(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator7r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister7(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister8(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator8r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister8(listFloat.get(0));
        }
    }

//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister9(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator9r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister9(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister10(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator10r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister10(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister11(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator11r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister11(listFloat.get(0));
        }
    }
//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
@Override
public void readDataFromRegister12(final boolean enableBatch){
    if (Objects.nonNull(modbusShort)){
        final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator12r());
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister12(listShort.get(0));
    }
}
    @Override
    public void readDataFromRegister13(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator13r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister13(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister14(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator14r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister14(listFloat.get(0));
        }
    }
//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
@Override
public void readDataFromRegister15(final boolean enableBatch){
    if (Objects.nonNull(modbusShort)){
        final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator15r());
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister15(listShort.get(0));
    }
}
    @Override
    public void readDataFromRegister16(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator16r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister16(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister17(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator17r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister17(listFloat.get(0));
        }
    }
//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
@Override
public void readDataFromRegister18(final boolean enableBatch){
    if (Objects.nonNull(modbusShort)){
        final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator18r());
        deviceModelSecondCehKameraVulcan3MPR51.setInputRegister18(listShort.get(0));
    }
}
    @Override
    public void readDataFromRegister19(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator19r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister19(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister20(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator20r());
            deviceModelSecondCehKameraVulcan3MPR51.setInputRegister20(listFloat.get(0));
        }
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    public void writeDataToRegister0(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator0());
            deviceModelSecondCehKameraVulcan3MPR51.setHoldingRegister0(value);
        }

    }

}