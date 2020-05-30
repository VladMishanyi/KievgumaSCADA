package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by KIP-PC99 on 20.11.2018.
 */
@Component
public class DeviceModelSecondCehKameraVulcan2MPR51 implements DeviceModel{
    private final int deviceAddress = 18;
    private final float hysteresisFloat = 1.0F;
    private final int hysteresisInt = 1;

    private float holdingRegister0 = 0F;
    private float oldHoldingRegister0 = 0F;
    private final ModbusLocator modbusLocator0 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister1 = 0F;
    private float oldHoldingRegister1 = 0F;
    private final ModbusLocator modbusLocator1 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister2 = 0F;
    private float oldHoldingRegister2 = 0F;
    private final ModbusLocator modbusLocator2 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister3 = 0F;
    private float oldHoldingRegister3 = 0F;
    private final ModbusLocator modbusLocator3 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister4 = 0F;
    private float oldHoldingRegister4 = 0F;
    private final ModbusLocator modbusLocator4 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister5 = 0F;
    private float oldHoldingRegister5 = 0F;
    private final ModbusLocator modbusLocator5 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister6 = 0F;
    private float oldHoldingRegister6 = 0F;
    private final ModbusLocator modbusLocator6 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister7 = 0F;
    private float oldHoldingRegister7 = 0F;
    private final ModbusLocator modbusLocator7 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister8 = 0F;
    private float oldHoldingRegister8 = 0F;
    private final ModbusLocator modbusLocator8 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister9 = 0;
    private int oldHoldingRegister9 = 0;
    private final ModbusLocator modbusLocator9 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister10 = 0F;
    private float oldHoldingRegister10 = 0F;
    private final ModbusLocator modbusLocator10 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister11 = 0F;
    private float oldHoldingRegister11 = 0F;
    private final ModbusLocator modbusLocator11 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister12 = 0;
    private int oldHoldingRegister12 = 0;
    private final ModbusLocator modbusLocator12 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister13 = 0F;
    private float oldHoldingRegister13 = 0F;
    private final ModbusLocator modbusLocator13 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister14 = 0F;
    private float oldHoldingRegister14 = 0F;
    private final ModbusLocator modbusLocator14 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister15 = 0;
    private int oldHoldingRegister15 = 0;
    private final ModbusLocator modbusLocator15 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister16 = 0F;
    private float oldHoldingRegister16 = 0F;
    private final ModbusLocator modbusLocator16 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister17 = 0F;
    private float oldHoldingRegister17 = 0F;
    private final ModbusLocator modbusLocator17 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister18 = 0;
    private int oldHoldingRegister18 = 0;
    private final ModbusLocator modbusLocator18 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister19 = 0F;
    private float oldHoldingRegister19 = 0F;
    private final ModbusLocator modbusLocator19 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister20 = 0F;
    private float oldHoldingRegister20 = 0F;
    private final ModbusLocator modbusLocator20 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister21 = 0;
    private int oldHoldingRegister21 = 0;
    private final ModbusLocator modbusLocator21 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister22 = 0F;
    private float oldHoldingRegister22 = 0F;
    private final ModbusLocator modbusLocator22 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister23 = 0F;
    private float oldHoldingRegister23 = 0F;
    private final ModbusLocator modbusLocator23 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister24 = 0;
    private int oldHoldingRegister24 = 0;
    private final ModbusLocator modbusLocator24 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister25 = 0F;
    private float oldHoldingRegister25 = 0F;
    private final ModbusLocator modbusLocator25 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister26 = 0F;
    private float oldHoldingRegister26 = 0F;
    private final ModbusLocator modbusLocator26 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister27 = 0;
    private int oldHoldingRegister27 = 0;
    private final ModbusLocator modbusLocator27 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister28 = 0F;
    private float oldHoldingRegister28 = 0F;
    private final ModbusLocator modbusLocator28 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister29 = 0F;
    private float oldHoldingRegister29 = 0F;
    private final ModbusLocator modbusLocator29 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister30 = 0;
    private int oldHoldingRegister30 = 0;
    private final ModbusLocator modbusLocator30 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister31 = 0F;
    private float oldHoldingRegister31 = 0F;
    private final ModbusLocator modbusLocator31 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister32 = 0F;
    private float oldHoldingRegister32 = 0F;
    private final ModbusLocator modbusLocator32 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister33 = 0;
    private int oldHoldingRegister33 = 0;
    private final ModbusLocator modbusLocator33 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister34 = 0F;
    private float oldHoldingRegister34 = 0F;
    private final ModbusLocator modbusLocator34 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister35 = 0F;
    private float oldHoldingRegister35 = 0F;
    private final ModbusLocator modbusLocator35 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister36 = 0;
    private int oldHoldingRegister36 = 0;
    private final ModbusLocator modbusLocator36 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister37 = 0F;
    private float oldHoldingRegister37 = 0F;
    private final ModbusLocator modbusLocator37 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister38 = 0F;
    private float oldHoldingRegister38 = 0F;
    private final ModbusLocator modbusLocator38 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister39 = 0;
    private int oldHoldingRegister39 = 0;
    private final ModbusLocator modbusLocator39 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister40 = 0F;
    private float oldHoldingRegister40 = 0F;
    private final ModbusLocator modbusLocator40 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister41 = 0F;
    private float oldHoldingRegister41 = 0F;
    private final ModbusLocator modbusLocator41 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister42 = 0;
    private int oldHoldingRegister42 = 0;
    private final ModbusLocator modbusLocator42 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);

    private float holdingRegister43 = 0F;
    private float oldHoldingRegister43 = 0F;
    private final ModbusLocator modbusLocator43 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);

    private float holdingRegister44 = 0F;
    private float oldHoldingRegister44 = 0F;
    private final ModbusLocator modbusLocator44 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);

    private int holdingRegister45 = 0;//write number of program here
    private int oldHoldingRegister45 = 0;
    private final ModbusLocator modbusLocator45 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 78, DataType.TWO_BYTE_INT_SIGNED);

    private int holdingRegister46 = 0;//write permission to save program 2 is read, 1 is write, 0 is not.
    private int oldHoldingRegister46 = 0;
    private final ModbusLocator modbusLocator46 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 79, DataType.TWO_BYTE_INT_SIGNED);

    /*----------------inputs registers----------------------*/
    private float inputRegister0 = 0F;
    private float oldInputRegister0 = 0F;
    private final ModbusLocator modbusLocator0r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister1 = 0F;
    private float oldInputRegister1 = 0F;
    private final ModbusLocator modbusLocator1r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister2 = 0F;
    private float oldInputRegister2 = 0F;
    private final ModbusLocator modbusLocator2r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister3 = 0F;
    private float oldInputRegister3 = 0F;
    private final ModbusLocator modbusLocator3r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister4 = 0F;
    private float oldInputRegister4 = 0F;
    private final ModbusLocator modbusLocator4r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister5 = 0F;
    private float oldInputRegister5 = 0F;
    private final ModbusLocator modbusLocator5r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister6 = 0F;
    private float oldInputRegister6 = 0F;
    private final ModbusLocator modbusLocator6r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister7 = 0F;
    private float oldInputRegister7 = 0F;
    private final ModbusLocator modbusLocator7r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister8 = 0F;
    private float oldInputRegister8 = 0F;
    private final ModbusLocator modbusLocator8r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister9 = 0;
    private int oldInputRegister9 = 0;
    private final ModbusLocator modbusLocator9r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister10 = 0F;
    private float oldInputRegister10 = 0F;
    private final ModbusLocator modbusLocator10r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister11 = 0F;
    private float oldInputRegister11 = 0F;
    private final ModbusLocator modbusLocator11r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister12 = 0;
    private int oldInputRegister12 = 0;
    private final ModbusLocator modbusLocator12r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister13 = 0F;
    private float oldInputRegister13 = 0F;
    private final ModbusLocator modbusLocator13r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister14 = 0F;
    private float oldInputRegister14 = 0F;
    private final ModbusLocator modbusLocator14r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister15 = 0;
    private int oldInputRegister15 = 0;
    private final ModbusLocator modbusLocator15r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister16 = 0F;
    private float oldInputRegister16 = 0F;
    private final ModbusLocator modbusLocator16r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister17 = 0F;
    private float oldInputRegister17 = 0F;
    private final ModbusLocator modbusLocator17r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister18 = 0;
    private int oldInputRegister18 = 0;
    private final ModbusLocator modbusLocator18r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister19 = 0F;
    private float oldInputRegister19 = 0F;
    private final ModbusLocator modbusLocator19r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister20 = 0F;
    private float oldInputRegister20 = 0F;
    private final ModbusLocator modbusLocator20r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister21 = 0;
    private int oldInputRegister21 = 0;
    private final ModbusLocator modbusLocator21r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister22 = 0F;
    private float oldInputRegister22 = 0F;
    private final ModbusLocator modbusLocator22r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister23 = 0F;
    private float oldInputRegister23 = 0F;
    private final ModbusLocator modbusLocator23r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister24 = 0;
    private int oldInputRegister24 = 0;
    private final ModbusLocator modbusLocator24r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister25 = 0F;
    private float oldInputRegister25 = 0F;
    private final ModbusLocator modbusLocator25r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister26 = 0F;
    private float oldInputRegister26 = 0F;
    private final ModbusLocator modbusLocator26r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister27 = 0;
    private int oldInputRegister27 = 0;
    private final ModbusLocator modbusLocator27r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister28 = 0F;
    private float oldInputRegister28 = 0F;
    private final ModbusLocator modbusLocator28r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister29 = 0F;
    private float oldInputRegister29 = 0F;
    private final ModbusLocator modbusLocator29r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister30 = 0;
    private int oldInputRegister30 = 0;
    private final ModbusLocator modbusLocator30r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister31 = 0F;
    private float oldInputRegister31 = 0F;
    private final ModbusLocator modbusLocator31r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister32 = 0F;
    private float oldInputRegister32 = 0F;
    private final ModbusLocator modbusLocator32r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister33 = 0;
    private int oldInputRegister33 = 0;
    private final ModbusLocator modbusLocator33r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister34 = 0F;
    private float oldInputRegister34 = 0F;
    private final ModbusLocator modbusLocator34r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister35 = 0F;
    private float oldInputRegister35 = 0F;
    private final ModbusLocator modbusLocator35r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister36 = 0;
    private int oldInputRegister36 = 0;
    private final ModbusLocator modbusLocator36r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister37 = 0F;
    private float oldInputRegister37 = 0F;
    private final ModbusLocator modbusLocator37r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister38 = 0F;
    private float oldInputRegister38 = 0F;
    private final ModbusLocator modbusLocator38r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister39 = 0;
    private int oldInputRegister39 = 0;
    private final ModbusLocator modbusLocator39r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister40 = 0F;
    private float oldInputRegister40 = 0F;
    private final ModbusLocator modbusLocator40r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister41 = 0F;
    private float oldInputRegister41 = 0F;
    private final ModbusLocator modbusLocator41r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);

    private int inputRegister42 = 0;
    private int oldInputRegister42 = 0;
    private final ModbusLocator modbusLocator42r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);

    private float inputRegister43 = 0F;
    private float oldInputRegister43 = 0F;
    private final ModbusLocator modbusLocator43r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister44 = 0F;
    private float oldInputRegister44 = 0F;
    private final ModbusLocator modbusLocator44r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister45 = 0F;
    private float oldInputRegister45 = 0F;
    private final ModbusLocator modbusLocator45r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 78, DataType.FOUR_BYTE_FLOAT);//read temperature

    private int inputRegister46 = 0;
    private int oldInputRegister46 = 0;
    private final ModbusLocator modbusLocator46r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 80, DataType.TWO_BYTE_INT_SIGNED);//get program number

    public DeviceModelSecondCehKameraVulcan2MPR51(){}

    public float getHysteresisFloat() {
        return hysteresisFloat;
    }

    public int getHysteresisInt() {
        return hysteresisInt;
    }

    public float getHoldingRegister0() {
        return holdingRegister0;
    }

    public void setHoldingRegister0(float holdingRegister0) {
        this.holdingRegister0 = holdingRegister0;
    }

    public float getOldHoldingRegister0() {
        return oldHoldingRegister0;
    }

    public void setOldHoldingRegister0(float oldHoldingRegister0) {
        this.oldHoldingRegister0 = oldHoldingRegister0;
    }

    public ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public float getHoldingRegister1() {
        return holdingRegister1;
    }

    public void setHoldingRegister1(float holdingRegister1) {
        this.holdingRegister1 = holdingRegister1;
    }

    public float getOldHoldingRegister1() {
        return oldHoldingRegister1;
    }

    public void setOldHoldingRegister1(float oldHoldingRegister1) {
        this.oldHoldingRegister1 = oldHoldingRegister1;
    }

    public ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public float getHoldingRegister2() {
        return holdingRegister2;
    }

    public void setHoldingRegister2(float holdingRegister2) {
        this.holdingRegister2 = holdingRegister2;
    }

    public float getOldHoldingRegister2() {
        return oldHoldingRegister2;
    }

    public void setOldHoldingRegister2(float oldHoldingRegister2) {
        this.oldHoldingRegister2 = oldHoldingRegister2;
    }

    public ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    public float getHoldingRegister3() {
        return holdingRegister3;
    }

    public void setHoldingRegister3(float holdingRegister3) {
        this.holdingRegister3 = holdingRegister3;
    }

    public float getOldHoldingRegister3() {
        return oldHoldingRegister3;
    }

    public void setOldHoldingRegister3(float oldHoldingRegister3) {
        this.oldHoldingRegister3 = oldHoldingRegister3;
    }

    public ModbusLocator getModbusLocator3() {
        return modbusLocator3;
    }

    public float getHoldingRegister4() {
        return holdingRegister4;
    }

    public void setHoldingRegister4(float holdingRegister4) {
        this.holdingRegister4 = holdingRegister4;
    }

    public float getOldHoldingRegister4() {
        return oldHoldingRegister4;
    }

    public void setOldHoldingRegister4(float oldHoldingRegister4) {
        this.oldHoldingRegister4 = oldHoldingRegister4;
    }

    public ModbusLocator getModbusLocator4() {
        return modbusLocator4;
    }

    public float getHoldingRegister5() {
        return holdingRegister5;
    }

    public void setHoldingRegister5(float holdingRegister5) {
        this.holdingRegister5 = holdingRegister5;
    }

    public float getOldHoldingRegister5() {
        return oldHoldingRegister5;
    }

    public void setOldHoldingRegister5(float oldHoldingRegister5) {
        this.oldHoldingRegister5 = oldHoldingRegister5;
    }

    public ModbusLocator getModbusLocator5() {
        return modbusLocator5;
    }

    public float getHoldingRegister6() {
        return holdingRegister6;
    }

    public void setHoldingRegister6(float holdingRegister6) {
        this.holdingRegister6 = holdingRegister6;
    }

    public float getOldHoldingRegister6() {
        return oldHoldingRegister6;
    }

    public void setOldHoldingRegister6(float oldHoldingRegister6) {
        this.oldHoldingRegister6 = oldHoldingRegister6;
    }

    public ModbusLocator getModbusLocator6() {
        return modbusLocator6;
    }

    public float getHoldingRegister7() {
        return holdingRegister7;
    }

    public void setHoldingRegister7(float holdingRegister7) {
        this.holdingRegister7 = holdingRegister7;
    }

    public float getOldHoldingRegister7() {
        return oldHoldingRegister7;
    }

    public void setOldHoldingRegister7(float oldHoldingRegister7) {
        this.oldHoldingRegister7 = oldHoldingRegister7;
    }

    public ModbusLocator getModbusLocator7() {
        return modbusLocator7;
    }

    public float getHoldingRegister8() {
        return holdingRegister8;
    }

    public void setHoldingRegister8(float holdingRegister8) {
        this.holdingRegister8 = holdingRegister8;
    }

    public float getOldHoldingRegister8() {
        return oldHoldingRegister8;
    }

    public void setOldHoldingRegister8(float oldHoldingRegister8) {
        this.oldHoldingRegister8 = oldHoldingRegister8;
    }

    public ModbusLocator getModbusLocator8() {
        return modbusLocator8;
    }

    public int getHoldingRegister9() {
        return holdingRegister9;
    }

    public void setHoldingRegister9(int holdingRegister9) {
        this.holdingRegister9 = holdingRegister9;
    }

    public int getOldHoldingRegister9() {
        return oldHoldingRegister9;
    }

    public void setOldHoldingRegister9(int oldHoldingRegister9) {
        this.oldHoldingRegister9 = oldHoldingRegister9;
    }

    public ModbusLocator getModbusLocator9() {
        return modbusLocator9;
    }

    public float getHoldingRegister10() {
        return holdingRegister10;
    }

    public void setHoldingRegister10(float holdingRegister10) {
        this.holdingRegister10 = holdingRegister10;
    }

    public float getOldHoldingRegister10() {
        return oldHoldingRegister10;
    }

    public void setOldHoldingRegister10(float oldHoldingRegister10) {
        this.oldHoldingRegister10 = oldHoldingRegister10;
    }

    public ModbusLocator getModbusLocator10() {
        return modbusLocator10;
    }

    public float getHoldingRegister11() {
        return holdingRegister11;
    }

    public void setHoldingRegister11(float holdingRegister11) {
        this.holdingRegister11 = holdingRegister11;
    }

    public float getOldHoldingRegister11() {
        return oldHoldingRegister11;
    }

    public void setOldHoldingRegister11(float oldHoldingRegister11) {
        this.oldHoldingRegister11 = oldHoldingRegister11;
    }

    public ModbusLocator getModbusLocator11() {
        return modbusLocator11;
    }

    public int getHoldingRegister12() {
        return holdingRegister12;
    }

    public void setHoldingRegister12(int holdingRegister12) {
        this.holdingRegister12 = holdingRegister12;
    }

    public int getOldHoldingRegister12() {
        return oldHoldingRegister12;
    }

    public void setOldHoldingRegister12(int oldHoldingRegister12) {
        this.oldHoldingRegister12 = oldHoldingRegister12;
    }

    public ModbusLocator getModbusLocator12() {
        return modbusLocator12;
    }

    public float getHoldingRegister13() {
        return holdingRegister13;
    }

    public void setHoldingRegister13(float holdingRegister13) {
        this.holdingRegister13 = holdingRegister13;
    }

    public float getOldHoldingRegister13() {
        return oldHoldingRegister13;
    }

    public void setOldHoldingRegister13(float oldHoldingRegister13) {
        this.oldHoldingRegister13 = oldHoldingRegister13;
    }

    public ModbusLocator getModbusLocator13() {
        return modbusLocator13;
    }

    public float getHoldingRegister14() {
        return holdingRegister14;
    }

    public void setHoldingRegister14(float holdingRegister14) {
        this.holdingRegister14 = holdingRegister14;
    }

    public float getOldHoldingRegister14() {
        return oldHoldingRegister14;
    }

    public void setOldHoldingRegister14(float oldHoldingRegister14) {
        this.oldHoldingRegister14 = oldHoldingRegister14;
    }

    public ModbusLocator getModbusLocator14() {
        return modbusLocator14;
    }

    public int getHoldingRegister15() {
        return holdingRegister15;
    }

    public void setHoldingRegister15(int holdingRegister15) {
        this.holdingRegister15 = holdingRegister15;
    }

    public int getOldHoldingRegister15() {
        return oldHoldingRegister15;
    }

    public void setOldHoldingRegister15(int oldHoldingRegister15) {
        this.oldHoldingRegister15 = oldHoldingRegister15;
    }

    public ModbusLocator getModbusLocator15() {
        return modbusLocator15;
    }

    public float getHoldingRegister16() {
        return holdingRegister16;
    }

    public void setHoldingRegister16(float holdingRegister16) {
        this.holdingRegister16 = holdingRegister16;
    }

    public float getOldHoldingRegister16() {
        return oldHoldingRegister16;
    }

    public void setOldHoldingRegister16(float oldHoldingRegister16) {
        this.oldHoldingRegister16 = oldHoldingRegister16;
    }

    public ModbusLocator getModbusLocator16() {
        return modbusLocator16;
    }

    public float getHoldingRegister17() {
        return holdingRegister17;
    }

    public void setHoldingRegister17(float holdingRegister17) {
        this.holdingRegister17 = holdingRegister17;
    }

    public float getOldHoldingRegister17() {
        return oldHoldingRegister17;
    }

    public void setOldHoldingRegister17(float oldHoldingRegister17) {
        this.oldHoldingRegister17 = oldHoldingRegister17;
    }

    public ModbusLocator getModbusLocator17() {
        return modbusLocator17;
    }

    public int getHoldingRegister18() {
        return holdingRegister18;
    }

    public void setHoldingRegister18(int holdingRegister18) {
        this.holdingRegister18 = holdingRegister18;
    }

    public int getOldHoldingRegister18() {
        return oldHoldingRegister18;
    }

    public void setOldHoldingRegister18(int oldHoldingRegister18) {
        this.oldHoldingRegister18 = oldHoldingRegister18;
    }

    public ModbusLocator getModbusLocator18() {
        return modbusLocator18;
    }

    public float getHoldingRegister19() {
        return holdingRegister19;
    }

    public void setHoldingRegister19(float holdingRegister19) {
        this.holdingRegister19 = holdingRegister19;
    }

    public float getOldHoldingRegister19() {
        return oldHoldingRegister19;
    }

    public void setOldHoldingRegister19(float oldHoldingRegister19) {
        this.oldHoldingRegister19 = oldHoldingRegister19;
    }

    public ModbusLocator getModbusLocator19() {
        return modbusLocator19;
    }

    public float getHoldingRegister20() {
        return holdingRegister20;
    }

    public void setHoldingRegister20(float holdingRegister20) {
        this.holdingRegister20 = holdingRegister20;
    }

    public float getOldHoldingRegister20() {
        return oldHoldingRegister20;
    }

    public void setOldHoldingRegister20(float oldHoldingRegister20) {
        this.oldHoldingRegister20 = oldHoldingRegister20;
    }

    public ModbusLocator getModbusLocator20() {
        return modbusLocator20;
    }

    public int getHoldingRegister21() {
        return holdingRegister21;
    }

    public void setHoldingRegister21(int holdingRegister21) {
        this.holdingRegister21 = holdingRegister21;
    }

    public int getOldHoldingRegister21() {
        return oldHoldingRegister21;
    }

    public void setOldHoldingRegister21(int oldHoldingRegister21) {
        this.oldHoldingRegister21 = oldHoldingRegister21;
    }

    public ModbusLocator getModbusLocator21() {
        return modbusLocator21;
    }

    public float getHoldingRegister22() {
        return holdingRegister22;
    }

    public void setHoldingRegister22(float holdingRegister22) {
        this.holdingRegister22 = holdingRegister22;
    }

    public float getOldHoldingRegister22() {
        return oldHoldingRegister22;
    }

    public void setOldHoldingRegister22(float oldHoldingRegister22) {
        this.oldHoldingRegister22 = oldHoldingRegister22;
    }

    public ModbusLocator getModbusLocator22() {
        return modbusLocator22;
    }

    public float getHoldingRegister23() {
        return holdingRegister23;
    }

    public void setHoldingRegister23(float holdingRegister23) {
        this.holdingRegister23 = holdingRegister23;
    }

    public float getOldHoldingRegister23() {
        return oldHoldingRegister23;
    }

    public void setOldHoldingRegister23(float oldHoldingRegister23) {
        this.oldHoldingRegister23 = oldHoldingRegister23;
    }

    public ModbusLocator getModbusLocator23() {
        return modbusLocator23;
    }

    public int getHoldingRegister24() {
        return holdingRegister24;
    }

    public void setHoldingRegister24(int holdingRegister24) {
        this.holdingRegister24 = holdingRegister24;
    }

    public int getOldHoldingRegister24() {
        return oldHoldingRegister24;
    }

    public void setOldHoldingRegister24(int oldHoldingRegister24) {
        this.oldHoldingRegister24 = oldHoldingRegister24;
    }

    public ModbusLocator getModbusLocator24() {
        return modbusLocator24;
    }

    public float getHoldingRegister25() {
        return holdingRegister25;
    }

    public void setHoldingRegister25(float holdingRegister25) {
        this.holdingRegister25 = holdingRegister25;
    }

    public float getOldHoldingRegister25() {
        return oldHoldingRegister25;
    }

    public void setOldHoldingRegister25(float oldHoldingRegister25) {
        this.oldHoldingRegister25 = oldHoldingRegister25;
    }

    public ModbusLocator getModbusLocator25() {
        return modbusLocator25;
    }

    public float getHoldingRegister26() {
        return holdingRegister26;
    }

    public void setHoldingRegister26(float holdingRegister26) {
        this.holdingRegister26 = holdingRegister26;
    }

    public float getOldHoldingRegister26() {
        return oldHoldingRegister26;
    }

    public void setOldHoldingRegister26(float oldHoldingRegister26) {
        this.oldHoldingRegister26 = oldHoldingRegister26;
    }

    public ModbusLocator getModbusLocator26() {
        return modbusLocator26;
    }

    public int getHoldingRegister27() {
        return holdingRegister27;
    }

    public void setHoldingRegister27(int holdingRegister27) {
        this.holdingRegister27 = holdingRegister27;
    }

    public int getOldHoldingRegister27() {
        return oldHoldingRegister27;
    }

    public void setOldHoldingRegister27(int oldHoldingRegister27) {
        this.oldHoldingRegister27 = oldHoldingRegister27;
    }

    public ModbusLocator getModbusLocator27() {
        return modbusLocator27;
    }

    public float getHoldingRegister28() {
        return holdingRegister28;
    }

    public void setHoldingRegister28(float holdingRegister28) {
        this.holdingRegister28 = holdingRegister28;
    }

    public float getOldHoldingRegister28() {
        return oldHoldingRegister28;
    }

    public void setOldHoldingRegister28(float oldHoldingRegister28) {
        this.oldHoldingRegister28 = oldHoldingRegister28;
    }

    public ModbusLocator getModbusLocator28() {
        return modbusLocator28;
    }

    public float getHoldingRegister29() {
        return holdingRegister29;
    }

    public void setHoldingRegister29(float holdingRegister29) {
        this.holdingRegister29 = holdingRegister29;
    }

    public float getOldHoldingRegister29() {
        return oldHoldingRegister29;
    }

    public void setOldHoldingRegister29(float oldHoldingRegister29) {
        this.oldHoldingRegister29 = oldHoldingRegister29;
    }

    public ModbusLocator getModbusLocator29() {
        return modbusLocator29;
    }

    public int getHoldingRegister30() {
        return holdingRegister30;
    }

    public void setHoldingRegister30(int holdingRegister30) {
        this.holdingRegister30 = holdingRegister30;
    }

    public int getOldHoldingRegister30() {
        return oldHoldingRegister30;
    }

    public void setOldHoldingRegister30(int oldHoldingRegister30) {
        this.oldHoldingRegister30 = oldHoldingRegister30;
    }

    public ModbusLocator getModbusLocator30() {
        return modbusLocator30;
    }

    public float getHoldingRegister31() {
        return holdingRegister31;
    }

    public void setHoldingRegister31(float holdingRegister31) {
        this.holdingRegister31 = holdingRegister31;
    }

    public float getOldHoldingRegister31() {
        return oldHoldingRegister31;
    }

    public void setOldHoldingRegister31(float oldHoldingRegister31) {
        this.oldHoldingRegister31 = oldHoldingRegister31;
    }

    public ModbusLocator getModbusLocator31() {
        return modbusLocator31;
    }

    public float getHoldingRegister32() {
        return holdingRegister32;
    }

    public void setHoldingRegister32(float holdingRegister32) {
        this.holdingRegister32 = holdingRegister32;
    }

    public float getOldHoldingRegister32() {
        return oldHoldingRegister32;
    }

    public void setOldHoldingRegister32(float oldHoldingRegister32) {
        this.oldHoldingRegister32 = oldHoldingRegister32;
    }

    public ModbusLocator getModbusLocator32() {
        return modbusLocator32;
    }

    public int getHoldingRegister33() {
        return holdingRegister33;
    }

    public void setHoldingRegister33(int holdingRegister33) {
        this.holdingRegister33 = holdingRegister33;
    }

    public int getOldHoldingRegister33() {
        return oldHoldingRegister33;
    }

    public void setOldHoldingRegister33(int oldHoldingRegister33) {
        this.oldHoldingRegister33 = oldHoldingRegister33;
    }

    public ModbusLocator getModbusLocator33() {
        return modbusLocator33;
    }

    public float getHoldingRegister34() {
        return holdingRegister34;
    }

    public void setHoldingRegister34(float holdingRegister34) {
        this.holdingRegister34 = holdingRegister34;
    }

    public float getOldHoldingRegister34() {
        return oldHoldingRegister34;
    }

    public void setOldHoldingRegister34(float oldHoldingRegister34) {
        this.oldHoldingRegister34 = oldHoldingRegister34;
    }

    public ModbusLocator getModbusLocator34() {
        return modbusLocator34;
    }

    public float getHoldingRegister35() {
        return holdingRegister35;
    }

    public void setHoldingRegister35(float holdingRegister35) {
        this.holdingRegister35 = holdingRegister35;
    }

    public float getOldHoldingRegister35() {
        return oldHoldingRegister35;
    }

    public void setOldHoldingRegister35(float oldHoldingRegister35) {
        this.oldHoldingRegister35 = oldHoldingRegister35;
    }

    public ModbusLocator getModbusLocator35() {
        return modbusLocator35;
    }

    public int getHoldingRegister36() {
        return holdingRegister36;
    }

    public void setHoldingRegister36(int holdingRegister36) {
        this.holdingRegister36 = holdingRegister36;
    }

    public int getOldHoldingRegister36() {
        return oldHoldingRegister36;
    }

    public void setOldHoldingRegister36(int oldHoldingRegister36) {
        this.oldHoldingRegister36 = oldHoldingRegister36;
    }

    public ModbusLocator getModbusLocator36() {
        return modbusLocator36;
    }

    public float getHoldingRegister37() {
        return holdingRegister37;
    }

    public void setHoldingRegister37(float holdingRegister37) {
        this.holdingRegister37 = holdingRegister37;
    }

    public float getOldHoldingRegister37() {
        return oldHoldingRegister37;
    }

    public void setOldHoldingRegister37(float oldHoldingRegister37) {
        this.oldHoldingRegister37 = oldHoldingRegister37;
    }

    public ModbusLocator getModbusLocator37() {
        return modbusLocator37;
    }

    public float getHoldingRegister38() {
        return holdingRegister38;
    }

    public void setHoldingRegister38(float holdingRegister38) {
        this.holdingRegister38 = holdingRegister38;
    }

    public float getOldHoldingRegister38() {
        return oldHoldingRegister38;
    }

    public void setOldHoldingRegister38(float oldHoldingRegister38) {
        this.oldHoldingRegister38 = oldHoldingRegister38;
    }

    public ModbusLocator getModbusLocator38() {
        return modbusLocator38;
    }

    public int getHoldingRegister39() {
        return holdingRegister39;
    }

    public void setHoldingRegister39(int holdingRegister39) {
        this.holdingRegister39 = holdingRegister39;
    }

    public int getOldHoldingRegister39() {
        return oldHoldingRegister39;
    }

    public void setOldHoldingRegister39(int oldHoldingRegister39) {
        this.oldHoldingRegister39 = oldHoldingRegister39;
    }

    public ModbusLocator getModbusLocator39() {
        return modbusLocator39;
    }

    public float getHoldingRegister40() {
        return holdingRegister40;
    }

    public void setHoldingRegister40(float holdingRegister40) {
        this.holdingRegister40 = holdingRegister40;
    }

    public float getOldHoldingRegister40() {
        return oldHoldingRegister40;
    }

    public void setOldHoldingRegister40(float oldHoldingRegister40) {
        this.oldHoldingRegister40 = oldHoldingRegister40;
    }

    public ModbusLocator getModbusLocator40() {
        return modbusLocator40;
    }

    public float getHoldingRegister41() {
        return holdingRegister41;
    }

    public void setHoldingRegister41(float holdingRegister41) {
        this.holdingRegister41 = holdingRegister41;
    }

    public float getOldHoldingRegister41() {
        return oldHoldingRegister41;
    }

    public void setOldHoldingRegister41(float oldHoldingRegister41) {
        this.oldHoldingRegister41 = oldHoldingRegister41;
    }

    public ModbusLocator getModbusLocator41() {
        return modbusLocator41;
    }

    public int getHoldingRegister42() {
        return holdingRegister42;
    }

    public void setHoldingRegister42(int holdingRegister42) {
        this.holdingRegister42 = holdingRegister42;
    }

    public int getOldHoldingRegister42() {
        return oldHoldingRegister42;
    }

    public void setOldHoldingRegister42(int oldHoldingRegister42) {
        this.oldHoldingRegister42 = oldHoldingRegister42;
    }

    public ModbusLocator getModbusLocator42() {
        return modbusLocator42;
    }

    public float getHoldingRegister43() {
        return holdingRegister43;
    }

    public void setHoldingRegister43(float holdingRegister43) {
        this.holdingRegister43 = holdingRegister43;
    }

    public float getOldHoldingRegister43() {
        return oldHoldingRegister43;
    }

    public void setOldHoldingRegister43(float oldHoldingRegister43) {
        this.oldHoldingRegister43 = oldHoldingRegister43;
    }

    public ModbusLocator getModbusLocator43() {
        return modbusLocator43;
    }

    public float getHoldingRegister44() {
        return holdingRegister44;
    }

    public void setHoldingRegister44(float holdingRegister44) {
        this.holdingRegister44 = holdingRegister44;
    }

    public float getOldHoldingRegister44() {
        return oldHoldingRegister44;
    }

    public void setOldHoldingRegister44(float oldHoldingRegister44) {
        this.oldHoldingRegister44 = oldHoldingRegister44;
    }

    public ModbusLocator getModbusLocator44() {
        return modbusLocator44;
    }

    public int getHoldingRegister45() {
        return holdingRegister45;
    }

    public void setHoldingRegister45(int holdingRegister45) {
        this.holdingRegister45 = holdingRegister45;
    }

    public int getOldHoldingRegister45() {
        return oldHoldingRegister45;
    }

    public void setOldHoldingRegister45(int oldHoldingRegister45) {
        this.oldHoldingRegister45 = oldHoldingRegister45;
    }

    public ModbusLocator getModbusLocator45() {
        return modbusLocator45;
    }

    public int getHoldingRegister46() {
        return holdingRegister46;
    }

    public void setHoldingRegister46(int holdingRegister46) {
        this.holdingRegister46 = holdingRegister46;
    }

    public int getOldHoldingRegister46() {
        return oldHoldingRegister46;
    }

    public void setOldHoldingRegister46(int oldHoldingRegister46) {
        this.oldHoldingRegister46 = oldHoldingRegister46;
    }

    public ModbusLocator getModbusLocator46() {
        return modbusLocator46;
    }

    public float getInputRegister0() {
        return inputRegister0;
    }

    public void setInputRegister0(float inputRegister0) {
        this.inputRegister0 = inputRegister0;
    }

    public float getOldInputRegister0() {
        return oldInputRegister0;
    }

    public void setOldInputRegister0(float oldInputRegister0) {
        this.oldInputRegister0 = oldInputRegister0;
    }

    public ModbusLocator getModbusLocator0r() {
        return modbusLocator0r;
    }

    public float getInputRegister1() {
        return inputRegister1;
    }

    public void setInputRegister1(float inputRegister1) {
        this.inputRegister1 = inputRegister1;
    }

    public float getOldInputRegister1() {
        return oldInputRegister1;
    }

    public void setOldInputRegister1(float oldInputRegister1) {
        this.oldInputRegister1 = oldInputRegister1;
    }

    public ModbusLocator getModbusLocator1r() {
        return modbusLocator1r;
    }

    public float getInputRegister2() {
        return inputRegister2;
    }

    public void setInputRegister2(float inputRegister2) {
        this.inputRegister2 = inputRegister2;
    }

    public float getOldInputRegister2() {
        return oldInputRegister2;
    }

    public void setOldInputRegister2(float oldInputRegister2) {
        this.oldInputRegister2 = oldInputRegister2;
    }

    public ModbusLocator getModbusLocator2r() {
        return modbusLocator2r;
    }

    public float getInputRegister3() {
        return inputRegister3;
    }

    public void setInputRegister3(float inputRegister3) {
        this.inputRegister3 = inputRegister3;
    }

    public float getOldInputRegister3() {
        return oldInputRegister3;
    }

    public void setOldInputRegister3(float oldInputRegister3) {
        this.oldInputRegister3 = oldInputRegister3;
    }

    public ModbusLocator getModbusLocator3r() {
        return modbusLocator3r;
    }

    public float getInputRegister4() {
        return inputRegister4;
    }

    public void setInputRegister4(float inputRegister4) {
        this.inputRegister4 = inputRegister4;
    }

    public float getOldInputRegister4() {
        return oldInputRegister4;
    }

    public void setOldInputRegister4(float oldInputRegister4) {
        this.oldInputRegister4 = oldInputRegister4;
    }

    public ModbusLocator getModbusLocator4r() {
        return modbusLocator4r;
    }

    public float getInputRegister5() {
        return inputRegister5;
    }

    public void setInputRegister5(float inputRegister5) {
        this.inputRegister5 = inputRegister5;
    }

    public float getOldInputRegister5() {
        return oldInputRegister5;
    }

    public void setOldInputRegister5(float oldInputRegister5) {
        this.oldInputRegister5 = oldInputRegister5;
    }

    public ModbusLocator getModbusLocator5r() {
        return modbusLocator5r;
    }

    public float getInputRegister6() {
        return inputRegister6;
    }

    public void setInputRegister6(float inputRegister6) {
        this.inputRegister6 = inputRegister6;
    }

    public float getOldInputRegister6() {
        return oldInputRegister6;
    }

    public void setOldInputRegister6(float oldInputRegister6) {
        this.oldInputRegister6 = oldInputRegister6;
    }

    public ModbusLocator getModbusLocator6r() {
        return modbusLocator6r;
    }

    public float getInputRegister7() {
        return inputRegister7;
    }

    public void setInputRegister7(float inputRegister7) {
        this.inputRegister7 = inputRegister7;
    }

    public float getOldInputRegister7() {
        return oldInputRegister7;
    }

    public void setOldInputRegister7(float oldInputRegister7) {
        this.oldInputRegister7 = oldInputRegister7;
    }

    public ModbusLocator getModbusLocator7r() {
        return modbusLocator7r;
    }

    public float getInputRegister8() {
        return inputRegister8;
    }

    public void setInputRegister8(float inputRegister8) {
        this.inputRegister8 = inputRegister8;
    }

    public float getOldInputRegister8() {
        return oldInputRegister8;
    }

    public void setOldInputRegister8(float oldInputRegister8) {
        this.oldInputRegister8 = oldInputRegister8;
    }

    public ModbusLocator getModbusLocator8r() {
        return modbusLocator8r;
    }

    public int getInputRegister9() {
        return inputRegister9;
    }

    public void setInputRegister9(int inputRegister9) {
        this.inputRegister9 = inputRegister9;
    }

    public int getOldInputRegister9() {
        return oldInputRegister9;
    }

    public void setOldInputRegister9(int oldInputRegister9) {
        this.oldInputRegister9 = oldInputRegister9;
    }

    public ModbusLocator getModbusLocator9r() {
        return modbusLocator9r;
    }

    public float getInputRegister10() {
        return inputRegister10;
    }

    public void setInputRegister10(float inputRegister10) {
        this.inputRegister10 = inputRegister10;
    }

    public float getOldInputRegister10() {
        return oldInputRegister10;
    }

    public void setOldInputRegister10(float oldInputRegister10) {
        this.oldInputRegister10 = oldInputRegister10;
    }

    public ModbusLocator getModbusLocator10r() {
        return modbusLocator10r;
    }

    public float getInputRegister11() {
        return inputRegister11;
    }

    public void setInputRegister11(float inputRegister11) {
        this.inputRegister11 = inputRegister11;
    }

    public float getOldInputRegister11() {
        return oldInputRegister11;
    }

    public void setOldInputRegister11(float oldInputRegister11) {
        this.oldInputRegister11 = oldInputRegister11;
    }

    public ModbusLocator getModbusLocator11r() {
        return modbusLocator11r;
    }

    public int getInputRegister12() {
        return inputRegister12;
    }

    public void setInputRegister12(int inputRegister12) {
        this.inputRegister12 = inputRegister12;
    }

    public int getOldInputRegister12() {
        return oldInputRegister12;
    }

    public void setOldInputRegister12(int oldInputRegister12) {
        this.oldInputRegister12 = oldInputRegister12;
    }

    public ModbusLocator getModbusLocator12r() {
        return modbusLocator12r;
    }

    public float getInputRegister13() {
        return inputRegister13;
    }

    public void setInputRegister13(float inputRegister13) {
        this.inputRegister13 = inputRegister13;
    }

    public float getOldInputRegister13() {
        return oldInputRegister13;
    }

    public void setOldInputRegister13(float oldInputRegister13) {
        this.oldInputRegister13 = oldInputRegister13;
    }

    public ModbusLocator getModbusLocator13r() {
        return modbusLocator13r;
    }

    public float getInputRegister14() {
        return inputRegister14;
    }

    public void setInputRegister14(float inputRegister14) {
        this.inputRegister14 = inputRegister14;
    }

    public float getOldInputRegister14() {
        return oldInputRegister14;
    }

    public void setOldInputRegister14(float oldInputRegister14) {
        this.oldInputRegister14 = oldInputRegister14;
    }

    public ModbusLocator getModbusLocator14r() {
        return modbusLocator14r;
    }

    public int getInputRegister15() {
        return inputRegister15;
    }

    public void setInputRegister15(int inputRegister15) {
        this.inputRegister15 = inputRegister15;
    }

    public int getOldInputRegister15() {
        return oldInputRegister15;
    }

    public void setOldInputRegister15(int oldInputRegister15) {
        this.oldInputRegister15 = oldInputRegister15;
    }

    public ModbusLocator getModbusLocator15r() {
        return modbusLocator15r;
    }

    public float getInputRegister16() {
        return inputRegister16;
    }

    public void setInputRegister16(float inputRegister16) {
        this.inputRegister16 = inputRegister16;
    }

    public float getOldInputRegister16() {
        return oldInputRegister16;
    }

    public void setOldInputRegister16(float oldInputRegister16) {
        this.oldInputRegister16 = oldInputRegister16;
    }

    public ModbusLocator getModbusLocator16r() {
        return modbusLocator16r;
    }

    public float getInputRegister17() {
        return inputRegister17;
    }

    public void setInputRegister17(float inputRegister17) {
        this.inputRegister17 = inputRegister17;
    }

    public float getOldInputRegister17() {
        return oldInputRegister17;
    }

    public void setOldInputRegister17(float oldInputRegister17) {
        this.oldInputRegister17 = oldInputRegister17;
    }

    public ModbusLocator getModbusLocator17r() {
        return modbusLocator17r;
    }

    public int getInputRegister18() {
        return inputRegister18;
    }

    public void setInputRegister18(int inputRegister18) {
        this.inputRegister18 = inputRegister18;
    }

    public int getOldInputRegister18() {
        return oldInputRegister18;
    }

    public void setOldInputRegister18(int oldInputRegister18) {
        this.oldInputRegister18 = oldInputRegister18;
    }

    public ModbusLocator getModbusLocator18r() {
        return modbusLocator18r;
    }

    public float getInputRegister19() {
        return inputRegister19;
    }

    public void setInputRegister19(float inputRegister19) {
        this.inputRegister19 = inputRegister19;
    }

    public float getOldInputRegister19() {
        return oldInputRegister19;
    }

    public void setOldInputRegister19(float oldInputRegister19) {
        this.oldInputRegister19 = oldInputRegister19;
    }

    public ModbusLocator getModbusLocator19r() {
        return modbusLocator19r;
    }

    public float getInputRegister20() {
        return inputRegister20;
    }

    public void setInputRegister20(float inputRegister20) {
        this.inputRegister20 = inputRegister20;
    }

    public float getOldInputRegister20() {
        return oldInputRegister20;
    }

    public void setOldInputRegister20(float oldInputRegister20) {
        this.oldInputRegister20 = oldInputRegister20;
    }

    public ModbusLocator getModbusLocator20r() {
        return modbusLocator20r;
    }

    public int getInputRegister21() {
        return inputRegister21;
    }

    public void setInputRegister21(int inputRegister21) {
        this.inputRegister21 = inputRegister21;
    }

    public int getOldInputRegister21() {
        return oldInputRegister21;
    }

    public void setOldInputRegister21(int oldInputRegister21) {
        this.oldInputRegister21 = oldInputRegister21;
    }

    public ModbusLocator getModbusLocator21r() {
        return modbusLocator21r;
    }

    public float getInputRegister22() {
        return inputRegister22;
    }

    public void setInputRegister22(float inputRegister22) {
        this.inputRegister22 = inputRegister22;
    }

    public float getOldInputRegister22() {
        return oldInputRegister22;
    }

    public void setOldInputRegister22(float oldInputRegister22) {
        this.oldInputRegister22 = oldInputRegister22;
    }

    public ModbusLocator getModbusLocator22r() {
        return modbusLocator22r;
    }

    public float getInputRegister23() {
        return inputRegister23;
    }

    public void setInputRegister23(float inputRegister23) {
        this.inputRegister23 = inputRegister23;
    }

    public float getOldInputRegister23() {
        return oldInputRegister23;
    }

    public void setOldInputRegister23(float oldInputRegister23) {
        this.oldInputRegister23 = oldInputRegister23;
    }

    public ModbusLocator getModbusLocator23r() {
        return modbusLocator23r;
    }

    public int getInputRegister24() {
        return inputRegister24;
    }

    public void setInputRegister24(int inputRegister24) {
        this.inputRegister24 = inputRegister24;
    }

    public int getOldInputRegister24() {
        return oldInputRegister24;
    }

    public void setOldInputRegister24(int oldInputRegister24) {
        this.oldInputRegister24 = oldInputRegister24;
    }

    public ModbusLocator getModbusLocator24r() {
        return modbusLocator24r;
    }

    public float getInputRegister25() {
        return inputRegister25;
    }

    public void setInputRegister25(float inputRegister25) {
        this.inputRegister25 = inputRegister25;
    }

    public float getOldInputRegister25() {
        return oldInputRegister25;
    }

    public void setOldInputRegister25(float oldInputRegister25) {
        this.oldInputRegister25 = oldInputRegister25;
    }

    public ModbusLocator getModbusLocator25r() {
        return modbusLocator25r;
    }

    public float getInputRegister26() {
        return inputRegister26;
    }

    public void setInputRegister26(float inputRegister26) {
        this.inputRegister26 = inputRegister26;
    }

    public float getOldInputRegister26() {
        return oldInputRegister26;
    }

    public void setOldInputRegister26(float oldInputRegister26) {
        this.oldInputRegister26 = oldInputRegister26;
    }

    public ModbusLocator getModbusLocator26r() {
        return modbusLocator26r;
    }

    public int getInputRegister27() {
        return inputRegister27;
    }

    public void setInputRegister27(int inputRegister27) {
        this.inputRegister27 = inputRegister27;
    }

    public int getOldInputRegister27() {
        return oldInputRegister27;
    }

    public void setOldInputRegister27(int oldInputRegister27) {
        this.oldInputRegister27 = oldInputRegister27;
    }

    public ModbusLocator getModbusLocator27r() {
        return modbusLocator27r;
    }

    public float getInputRegister28() {
        return inputRegister28;
    }

    public void setInputRegister28(float inputRegister28) {
        this.inputRegister28 = inputRegister28;
    }

    public float getOldInputRegister28() {
        return oldInputRegister28;
    }

    public void setOldInputRegister28(float oldInputRegister28) {
        this.oldInputRegister28 = oldInputRegister28;
    }

    public ModbusLocator getModbusLocator28r() {
        return modbusLocator28r;
    }

    public float getInputRegister29() {
        return inputRegister29;
    }

    public void setInputRegister29(float inputRegister29) {
        this.inputRegister29 = inputRegister29;
    }

    public float getOldInputRegister29() {
        return oldInputRegister29;
    }

    public void setOldInputRegister29(float oldInputRegister29) {
        this.oldInputRegister29 = oldInputRegister29;
    }

    public ModbusLocator getModbusLocator29r() {
        return modbusLocator29r;
    }

    public int getInputRegister30() {
        return inputRegister30;
    }

    public void setInputRegister30(int inputRegister30) {
        this.inputRegister30 = inputRegister30;
    }

    public int getOldInputRegister30() {
        return oldInputRegister30;
    }

    public void setOldInputRegister30(int oldInputRegister30) {
        this.oldInputRegister30 = oldInputRegister30;
    }

    public ModbusLocator getModbusLocator30r() {
        return modbusLocator30r;
    }

    public float getInputRegister31() {
        return inputRegister31;
    }

    public void setInputRegister31(float inputRegister31) {
        this.inputRegister31 = inputRegister31;
    }

    public float getOldInputRegister31() {
        return oldInputRegister31;
    }

    public void setOldInputRegister31(float oldInputRegister31) {
        this.oldInputRegister31 = oldInputRegister31;
    }

    public ModbusLocator getModbusLocator31r() {
        return modbusLocator31r;
    }

    public float getInputRegister32() {
        return inputRegister32;
    }

    public void setInputRegister32(float inputRegister32) {
        this.inputRegister32 = inputRegister32;
    }

    public float getOldInputRegister32() {
        return oldInputRegister32;
    }

    public void setOldInputRegister32(float oldInputRegister32) {
        this.oldInputRegister32 = oldInputRegister32;
    }

    public ModbusLocator getModbusLocator32r() {
        return modbusLocator32r;
    }

    public int getInputRegister33() {
        return inputRegister33;
    }

    public void setInputRegister33(int inputRegister33) {
        this.inputRegister33 = inputRegister33;
    }

    public int getOldInputRegister33() {
        return oldInputRegister33;
    }

    public void setOldInputRegister33(int oldInputRegister33) {
        this.oldInputRegister33 = oldInputRegister33;
    }

    public ModbusLocator getModbusLocator33r() {
        return modbusLocator33r;
    }

    public float getInputRegister34() {
        return inputRegister34;
    }

    public void setInputRegister34(float inputRegister34) {
        this.inputRegister34 = inputRegister34;
    }

    public float getOldInputRegister34() {
        return oldInputRegister34;
    }

    public void setOldInputRegister34(float oldInputRegister34) {
        this.oldInputRegister34 = oldInputRegister34;
    }

    public ModbusLocator getModbusLocator34r() {
        return modbusLocator34r;
    }

    public float getInputRegister35() {
        return inputRegister35;
    }

    public void setInputRegister35(float inputRegister35) {
        this.inputRegister35 = inputRegister35;
    }

    public float getOldInputRegister35() {
        return oldInputRegister35;
    }

    public void setOldInputRegister35(float oldInputRegister35) {
        this.oldInputRegister35 = oldInputRegister35;
    }

    public ModbusLocator getModbusLocator35r() {
        return modbusLocator35r;
    }

    public int getInputRegister36() {
        return inputRegister36;
    }

    public void setInputRegister36(int inputRegister36) {
        this.inputRegister36 = inputRegister36;
    }

    public int getOldInputRegister36() {
        return oldInputRegister36;
    }

    public void setOldInputRegister36(int oldInputRegister36) {
        this.oldInputRegister36 = oldInputRegister36;
    }

    public ModbusLocator getModbusLocator36r() {
        return modbusLocator36r;
    }

    public float getInputRegister37() {
        return inputRegister37;
    }

    public void setInputRegister37(float inputRegister37) {
        this.inputRegister37 = inputRegister37;
    }

    public float getOldInputRegister37() {
        return oldInputRegister37;
    }

    public void setOldInputRegister37(float oldInputRegister37) {
        this.oldInputRegister37 = oldInputRegister37;
    }

    public ModbusLocator getModbusLocator37r() {
        return modbusLocator37r;
    }

    public float getInputRegister38() {
        return inputRegister38;
    }

    public void setInputRegister38(float inputRegister38) {
        this.inputRegister38 = inputRegister38;
    }

    public float getOldInputRegister38() {
        return oldInputRegister38;
    }

    public void setOldInputRegister38(float oldInputRegister38) {
        this.oldInputRegister38 = oldInputRegister38;
    }

    public ModbusLocator getModbusLocator38r() {
        return modbusLocator38r;
    }

    public int getInputRegister39() {
        return inputRegister39;
    }

    public void setInputRegister39(int inputRegister39) {
        this.inputRegister39 = inputRegister39;
    }

    public int getOldInputRegister39() {
        return oldInputRegister39;
    }

    public void setOldInputRegister39(int oldInputRegister39) {
        this.oldInputRegister39 = oldInputRegister39;
    }

    public ModbusLocator getModbusLocator39r() {
        return modbusLocator39r;
    }

    public float getInputRegister40() {
        return inputRegister40;
    }

    public void setInputRegister40(float inputRegister40) {
        this.inputRegister40 = inputRegister40;
    }

    public float getOldInputRegister40() {
        return oldInputRegister40;
    }

    public void setOldInputRegister40(float oldInputRegister40) {
        this.oldInputRegister40 = oldInputRegister40;
    }

    public ModbusLocator getModbusLocator40r() {
        return modbusLocator40r;
    }

    public float getInputRegister41() {
        return inputRegister41;
    }

    public void setInputRegister41(float inputRegister41) {
        this.inputRegister41 = inputRegister41;
    }

    public float getOldInputRegister41() {
        return oldInputRegister41;
    }

    public void setOldInputRegister41(float oldInputRegister41) {
        this.oldInputRegister41 = oldInputRegister41;
    }

    public ModbusLocator getModbusLocator41r() {
        return modbusLocator41r;
    }

    public int getInputRegister42() {
        return inputRegister42;
    }

    public void setInputRegister42(int inputRegister42) {
        this.inputRegister42 = inputRegister42;
    }

    public int getOldInputRegister42() {
        return oldInputRegister42;
    }

    public void setOldInputRegister42(int oldInputRegister42) {
        this.oldInputRegister42 = oldInputRegister42;
    }

    public ModbusLocator getModbusLocator42r() {
        return modbusLocator42r;
    }

    public float getInputRegister43() {
        return inputRegister43;
    }

    public void setInputRegister43(float inputRegister43) {
        this.inputRegister43 = inputRegister43;
    }

    public float getOldInputRegister43() {
        return oldInputRegister43;
    }

    public void setOldInputRegister43(float oldInputRegister43) {
        this.oldInputRegister43 = oldInputRegister43;
    }

    public ModbusLocator getModbusLocator43r() {
        return modbusLocator43r;
    }

    public float getInputRegister44() {
        return inputRegister44;
    }

    public void setInputRegister44(float inputRegister44) {
        this.inputRegister44 = inputRegister44;
    }

    public float getOldInputRegister44() {
        return oldInputRegister44;
    }

    public void setOldInputRegister44(float oldInputRegister44) {
        this.oldInputRegister44 = oldInputRegister44;
    }

    public ModbusLocator getModbusLocator44r() {
        return modbusLocator44r;
    }

    public float getInputRegister45() {
        return inputRegister45;
    }

    public void setInputRegister45(float inputRegister45) {
        this.inputRegister45 = inputRegister45;
    }

    public float getOldInputRegister45() {
        return oldInputRegister45;
    }

    public void setOldInputRegister45(float oldInputRegister45) {
        this.oldInputRegister45 = oldInputRegister45;
    }

    public ModbusLocator getModbusLocator45r() {
        return modbusLocator45r;
    }

    public int getInputRegister46() {
        return inputRegister46;
    }

    public void setInputRegister46(int inputRegister46) {
        this.inputRegister46 = inputRegister46;
    }

    public int getOldInputRegister46() {
        return oldInputRegister46;
    }

    public void setOldInputRegister46(int oldInputRegister46) {
        this.oldInputRegister46 = oldInputRegister46;
    }

    public ModbusLocator getModbusLocator46r() {
        return modbusLocator46r;
    }

    @Override
    public int getDeviceAddress() {
        return deviceAddress;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(oldInputRegister45,
                inputRegister45,
                hysteresisFloat);

        if (inner){
            oldInputRegister45 = inputRegister45;
        }
        return inner;
    }
}
