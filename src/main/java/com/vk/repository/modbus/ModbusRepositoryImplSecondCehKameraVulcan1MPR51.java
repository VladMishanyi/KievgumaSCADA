package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
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
public class ModbusRepositoryImplSecondCehKameraVulcan1MPR51
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelSecondCehKameraVulcan1MPR51>
        implements ModbusRepositorySecondCehKameraVulcan1MPR51 {

    private final ModbusMasterSerialModel modbusMasterSerialFourth;

    private final DeviceModelSecondCehKameraVulcan1MPR51 deviceModelSecondCehKameraVulcan1MPR51;

    private final ModbusFloat modbusFloat;

    private final ModbusShort modbusShort;

    @Autowired
    public ModbusRepositoryImplSecondCehKameraVulcan1MPR51(final ModbusMasterSerialModel modbusMasterSerialFourth,
                                                           final DeviceModelSecondCehKameraVulcan1MPR51 deviceModelSecondCehKameraVulcan1MPR51,
                                                           final ModbusFloat modbusFloat,
                                                           final ModbusShort modbusShort) {
        super(modbusFloat);
        this.modbusMasterSerialFourth = modbusMasterSerialFourth;
        this.deviceModelSecondCehKameraVulcan1MPR51 = deviceModelSecondCehKameraVulcan1MPR51;
        this.modbusFloat = modbusFloat;
        this.modbusShort = modbusShort;
    }

    @Override
    public DeviceModelSecondCehKameraVulcan1MPR51 getDeviceModel(final boolean enableBatch) {

        final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                enableBatch,
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator0r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator1r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator2r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator3r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator4r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator5r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator6r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator7r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator8r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator10r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator11r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator13r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator14r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator16r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator17r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator19r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator20r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator22r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator23r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator25r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator26r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator28r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator29r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator31r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator32r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator34r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator35r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator37r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator38r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator40r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator41r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator43r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator44r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator45r()
        );
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister0(listFloat.get(0));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister1(listFloat.get(1));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister2(listFloat.get(2));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister3(listFloat.get(3));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister4(listFloat.get(4));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister5(listFloat.get(5));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister6(listFloat.get(6));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister7(listFloat.get(7));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister8(listFloat.get(8));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister10(listFloat.get(9));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister11(listFloat.get(10));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister13(listFloat.get(11));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister14(listFloat.get(12));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister16(listFloat.get(13));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister17(listFloat.get(14));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister19(listFloat.get(15));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister20(listFloat.get(16));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister22(listFloat.get(17));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister23(listFloat.get(18));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister25(listFloat.get(19));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister26(listFloat.get(20));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister28(listFloat.get(21));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister29(listFloat.get(22));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister31(listFloat.get(23));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister32(listFloat.get(24));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister34(listFloat.get(25));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister35(listFloat.get(26));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister37(listFloat.get(27));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister38(listFloat.get(28));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister40(listFloat.get(29));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister41(listFloat.get(30));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister43(listFloat.get(31));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister44(listFloat.get(32));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister45(listFloat.get(33));

        final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                enableBatch,
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator9r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator12r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator15r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator18r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator21r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator24r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator27r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator30r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator33r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator36r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator39r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator42r(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator46r()
        );
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister9(listShort.get(0));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister12(listShort.get(1));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister15(listShort.get(2));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister18(listShort.get(3));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister21(listShort.get(4));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister24(listShort.get(5));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister27(listShort.get(6));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister30(listShort.get(7));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister33(listShort.get(8));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister36(listShort.get(9));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister39(listShort.get(10));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister42(listShort.get(11));
        deviceModelSecondCehKameraVulcan1MPR51.setInputRegister46(listShort.get(12));


        return deviceModelSecondCehKameraVulcan1MPR51;
    }

    @Override
    public void readDataFromRegister0(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator0r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister0(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister1(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator1r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister1(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister2(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator2r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister2(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister3(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator3r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister3(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister4(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator4r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister4(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister5(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator5r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister5(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister6(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator6r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister6(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister7(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator7r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister7(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister8(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator8r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister8(listFloat.get(0));
        }
    }

    //--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister9(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator9r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister9(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister10(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator10r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister10(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister11(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator11r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister11(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister12(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator12r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister12(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister13(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator13r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister13(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister14(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator14r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister14(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister15(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator15r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister15(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister16(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator16r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister16(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister17(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator17r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister17(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister18(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator18r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister18(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister19(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator19r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister19(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister20(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator20r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister20(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister21(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator21r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister21(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister22(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator22r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister22(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister23(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator23r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister23(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister24(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator24r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister24(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister25(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator25r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister25(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister26(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator26r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister26(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister27(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator27r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister27(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister28(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator28r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister28(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister29(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator29r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister29(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister30(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator30r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister30(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister31(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator31r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister31(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister32(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator32r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister32(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister33(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator33r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister33(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister34(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator34r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister34(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister35(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator35r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister35(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister36(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator36r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister36(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister37(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator37r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister37(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister38(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator38r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister38(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister39(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator39r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister39(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister40(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator40r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister40(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister41(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator41r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister41(listFloat.get(0));
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void readDataFromRegister42(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator42r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister42(listShort.get(0));
        }
    }
    @Override
    public void readDataFromRegister43(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator43r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister43(listFloat.get(0));
        }
    }
    @Override
    public void readDataFromRegister44(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator44r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister44(listFloat.get(0));
        }
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    public void readDataFromRegister45(final boolean enableBatch){
        if (Objects.nonNull(modbusFloat)){
            final List<Float> listFloat = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator45r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister45(listFloat.get(0));
        }
    }

    @Override
    public void readDataFromRegister46(final boolean enableBatch){
        if (Objects.nonNull(modbusShort)){
            final List<Short>listShort = modbusShort.readDataFromModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    enableBatch,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator46r());
            deviceModelSecondCehKameraVulcan1MPR51.setInputRegister46(listShort.get(0));
        }
    }






    @Override
    public void writeDataToRegister0(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator0());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister0(value);
        }
    }

    @Override
    public void writeDataToRegister1(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator1());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister1(value);
        }
    }

    @Override
    public void writeDataToRegister2(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator2());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister2(value);
        }
    }

    @Override
    public void writeDataToRegister3(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator3());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister3(value);
        }
    }

    @Override
    public void writeDataToRegister4(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator4());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister4(value);
        }
    }

    @Override
    public void writeDataToRegister5(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator5());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister5(value);
        }
    }

    @Override
    public void writeDataToRegister6(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator6());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister6(value);
        }
    }

    @Override
    public void writeDataToRegister7(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator7());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister7(value);
        }
    }

    @Override
    public void writeDataToRegister8(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator8());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister8(value);
        }
    }

    //--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister9(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator9());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister9(value);
        }
    }
    @Override
    public void writeDataToRegister10(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator10());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister10(value);
        }
    }
    @Override
    public void writeDataToRegister11(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator11());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister11(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister12(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator12());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister12(value);
        }
    }
    @Override
    public void writeDataToRegister13(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator13());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister13(value);
        }
    }
    @Override
    public void writeDataToRegister14(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator14());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister14(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister15(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator15());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister15(value);
        }
    }
    @Override
    public void writeDataToRegister16(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator16());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister16(value);
        }
    }
    @Override
    public void writeDataToRegister17(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator17());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister17(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister18(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator18());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister18(value);
        }
    }
    @Override
    public void writeDataToRegister19(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator19());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister19(value);
        }
    }
    @Override
    public void writeDataToRegister20(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator20());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister20(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister21(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator21());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister21(value);
        }
    }
    @Override
    public void writeDataToRegister22(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator22());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister22(value);
        }
    }
    @Override
    public void writeDataToRegister23(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator23());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister23(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister24(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator24());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister24(value);
        }
    }
    @Override
    public void writeDataToRegister25(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator25());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister25(value);
        }
    }
    @Override
    public void writeDataToRegister26(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator26());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister26(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister27(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator27());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister27(value);
        }
    }
    @Override
    public void writeDataToRegister28(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator28());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister28(value);
        }
    }
    @Override
    public void writeDataToRegister29(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator29());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister29(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister30(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator30());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister30(value);
        }
    }
    @Override
    public void writeDataToRegister31(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator31());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister31(value);
        }
    }
    @Override
    public void writeDataToRegister32(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator32());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister32(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister33(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator33());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister33(value);
        }
    }
    @Override
    public void writeDataToRegister34(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator34());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister34(value);
        }
    }
    @Override
    public void writeDataToRegister35(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator35());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister35(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister36(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator36());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister36(value);
        }
    }
    @Override
    public void writeDataToRegister37(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator37());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister37(value);
        }
    }
    @Override
    public void writeDataToRegister38(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator38());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister38(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister39(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator39());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister39(value);
        }
    }
    @Override
    public void writeDataToRegister40(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator40());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister40(value);
        }
    }
    @Override
    public void writeDataToRegister41(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator41());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister41(value);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    @Override
    public void writeDataToRegister42(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator42());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister42(value);
        }
    }
    @Override
    public void writeDataToRegister43(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator43());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister43(value);
        }
    }
    @Override
    public void writeDataToRegister44(final float value){
        if (Objects.nonNull(modbusFloat)){
            modbusFloat.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator44());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister44(value);
        }
    }
//--------------------------------------------------------------------------------------------------------------------

    @Override
    public void writeDataToRegister45(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator45());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister45(value);
        }
    }

    @Override
    public void writeDataToRegister46(final short value){
        if (Objects.nonNull(modbusShort)){
            modbusShort.writeDataToModBus(modbusMasterSerialFourth,
                    deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                    value,
                    deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator46());
            deviceModelSecondCehKameraVulcan1MPR51.setHoldingRegister46(value);
        }
    }
}