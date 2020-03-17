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
@ApplicationScope
public class DeviceModelSecondCehKameraVulcan3MPR51 implements DeviceModel{
    protected static final int deviceAddress = 19;
    protected static final float hysteresisFloat = 1.0F;

    protected static float holdingRegister0 = 0F;
    protected static float oldHoldingRegister0 = 0F;
    protected static final ModbusLocator modbusLocator0 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister1 = 0F;
    protected static float oldHoldingRegister1 = 0F;
    protected static final ModbusLocator modbusLocator1 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister2 = 0F;
    protected static float oldHoldingRegister2 = 0F;
    protected static final ModbusLocator modbusLocator2 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister3 = 0F;
    protected static float oldHoldingRegister3 = 0F;
    protected static final ModbusLocator modbusLocator3 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister4 = 0F;
    protected static float oldHoldingRegister4 = 0F;
    protected static final ModbusLocator modbusLocator4 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister5 = 0F;
    protected static float oldHoldingRegister5 = 0F;
    protected static final ModbusLocator modbusLocator5 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister6 = 0F;
    protected static float oldHoldingRegister6 = 0F;
    protected static final ModbusLocator modbusLocator6 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister7 = 0F;
    protected static float oldHoldingRegister7 = 0F;
    protected static final ModbusLocator modbusLocator7 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister8 = 0F;
    protected static float oldHoldingRegister8 = 0F;
    protected static final ModbusLocator modbusLocator8 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister9 = 0;
    protected static int oldHoldingRegister9 = 0;
    protected static final ModbusLocator modbusLocator9 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister10 = 0F;
    protected static float oldHoldingRegister10 = 0F;
    protected static final ModbusLocator modbusLocator10 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister11 = 0F;
    protected static float oldHoldingRegister11 = 0F;
    protected static final ModbusLocator modbusLocator11 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister12 = 0;
    protected static int oldHoldingRegister12 = 0;
    protected static final ModbusLocator modbusLocator12 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister13 = 0F;
    protected static float oldHoldingRegister13 = 0F;
    protected static final ModbusLocator modbusLocator13 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister14 = 0F;
    protected static float oldHoldingRegister14 = 0F;
    protected static final ModbusLocator modbusLocator14 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister15 = 0;
    protected static int oldHoldingRegister15 = 0;
    protected static final ModbusLocator modbusLocator15 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister16 = 0F;
    protected static float oldHoldingRegister16 = 0F;
    protected static final ModbusLocator modbusLocator16 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister17 = 0F;
    protected static float oldHoldingRegister17 = 0F;
    protected static final ModbusLocator modbusLocator17 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister18 = 0;
    protected static int oldHoldingRegister18 = 0;
    protected static final ModbusLocator modbusLocator18 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister19 = 0F;
    protected static float oldHoldingRegister19 = 0F;
    protected static final ModbusLocator modbusLocator19 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister20 = 0F;
    protected static float oldHoldingRegister20 = 0F;
    protected static final ModbusLocator modbusLocator20 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister21 = 0;
    protected static int oldHoldingRegister21 = 0;
    protected static final ModbusLocator modbusLocator21 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister22 = 0F;
    protected static float oldHoldingRegister22 = 0F;
    protected static final ModbusLocator modbusLocator22 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister23 = 0F;
    protected static float oldHoldingRegister23 = 0F;
    protected static final ModbusLocator modbusLocator23 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister24 = 0;
    protected static int oldHoldingRegister24 = 0;
    protected static final ModbusLocator modbusLocator24 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister25 = 0F;
    protected static float oldHoldingRegister25 = 0F;
    protected static final ModbusLocator modbusLocator25 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister26 = 0F;
    protected static float oldHoldingRegister26 = 0F;
    protected static final ModbusLocator modbusLocator26 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister27 = 0;
    protected static int oldHoldingRegister27 = 0;
    protected static final ModbusLocator modbusLocator27 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister28 = 0F;
    protected static float oldHoldingRegister28 = 0F;
    protected static final ModbusLocator modbusLocator28 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister29 = 0F;
    protected static float oldHoldingRegister29 = 0F;
    protected static final ModbusLocator modbusLocator29 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister30 = 0;
    protected static int oldHoldingRegister30 = 0;
    protected static final ModbusLocator modbusLocator30 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister31 = 0F;
    protected static float oldHoldingRegister31 = 0F;
    protected static final ModbusLocator modbusLocator31 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister32 = 0F;
    protected static float oldHoldingRegister32 = 0F;
    protected static final ModbusLocator modbusLocator32 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister33 = 0;
    protected static int oldHoldingRegister33 = 0;
    protected static final ModbusLocator modbusLocator33 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister34 = 0F;
    protected static float oldHoldingRegister34 = 0F;
    protected static final ModbusLocator modbusLocator34 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister35 = 0F;
    protected static float oldHoldingRegister35 = 0F;
    protected static final ModbusLocator modbusLocator35 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister36 = 0;
    protected static int oldHoldingRegister36 = 0;
    protected static final ModbusLocator modbusLocator36 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister37 = 0F;
    protected static float oldHoldingRegister37 = 0F;
    protected static final ModbusLocator modbusLocator37 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister38 = 0F;
    protected static float oldHoldingRegister38 = 0F;
    protected static final ModbusLocator modbusLocator38 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister39 = 0;
    protected static int oldHoldingRegister39 = 0;
    protected static final ModbusLocator modbusLocator39 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister40 = 0F;
    protected static float oldHoldingRegister40 = 0F;
    protected static final ModbusLocator modbusLocator40 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister41 = 0F;
    protected static float oldHoldingRegister41 = 0F;
    protected static final ModbusLocator modbusLocator41 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister42 = 0;
    protected static int oldHoldingRegister42 = 0;
    protected static final ModbusLocator modbusLocator42 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister43 = 0F;
    protected static float oldHoldingRegister43 = 0F;
    protected static final ModbusLocator modbusLocator43 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);

    protected static float holdingRegister44 = 0F;
    protected static float oldHoldingRegister44 = 0F;
    protected static final ModbusLocator modbusLocator44 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);

    protected static int holdingRegister45 = 0;//write number of program here
    protected static int oldHoldingRegister45 = 0;
    protected static final ModbusLocator modbusLocator45 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 78, DataType.TWO_BYTE_INT_SIGNED);

    protected static float holdingRegister46 = 0F;//write permission to save program 1 is save, 0 is not.
    protected static float oldHoldingRegister46 = 0F;
    protected static final ModbusLocator modbusLocator46 = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 79, DataType.TWO_BYTE_INT_SIGNED);

    protected static float inputRegister0 = 0F;//write permission to save program 1 is save, 0 is not.
    protected static float oldInputRegister0 = 0F;
    protected static final ModbusLocator modbusLocator0r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator1r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator2r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator3r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 6, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator4r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 8, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator5r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator6r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 12, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator7r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 14, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator8r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 16, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator9r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 18, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator10r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 19, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator11r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator12r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 23, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator13r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 24, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator14r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 26, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator15r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 28, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator16r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator17r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 31, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator18r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 33, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator19r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 34, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator20r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 36, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator21r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 38, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator22r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 39, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator23r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 41, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator24r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 43, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator25r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 44, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator26r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 46, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator27r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 48, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator28r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 49, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator29r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 51, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator30r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 53, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator31r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 54, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator32r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 56, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator33r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 58, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator34r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 59, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator35r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 61, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator36r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 63, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator37r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 64, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator38r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 66, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator39r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 68, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator40r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 69, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator41r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 71, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator42r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 73, DataType.TWO_BYTE_INT_SIGNED);
    protected static final ModbusLocator modbusLocator43r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 74, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator44r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 76, DataType.FOUR_BYTE_FLOAT);
    protected static final ModbusLocator modbusLocator45r = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 78, DataType.FOUR_BYTE_FLOAT);//read temperature

    public DeviceModelSecondCehKameraVulcan3MPR51(){}

    @Override
    public int getDeviceAddress() {
        return deviceAddress;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters1(),
                getDeviceValuesRegister1(),
                getHysteresis1());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters2(),
                getDeviceValuesRegister2(),
                getHysteresis2());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
        }
        return inner;
    }
}
