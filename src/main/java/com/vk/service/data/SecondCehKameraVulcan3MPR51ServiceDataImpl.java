package com.vk.service.data;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.ModbusRepositorySecondCehKameraVulcan3MPR51;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class SecondCehKameraVulcan3MPR51ServiceDataImpl extends RootServiceDataImpl<Float, TableModelSecondCehKameraVulcan3MPR51, DeviceModelSecondCehKameraVulcan3MPR51> implements SecondCehKameraVulcan3MPR51ServiceData{

    private final RootRepositoryData<TableModelSecondCehKameraVulcan3MPR51> rootRepositoryData;

    private final RootModbusRepository<DeviceModelSecondCehKameraVulcan3MPR51> rootModbusRepository;

    @Autowired
    private ModbusRepositorySecondCehKameraVulcan3MPR51 modbusRepositorySecondCehKameraVulcan3MPR51;

    @Autowired
    public SecondCehKameraVulcan3MPR51ServiceDataImpl(final RootRepositoryData<TableModelSecondCehKameraVulcan3MPR51> rootRepositoryData,
                                                      final RootModbusRepository<DeviceModelSecondCehKameraVulcan3MPR51> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }

    @Override
    public void readDataFromRegister0(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister0(false);
    }

    @Override
    public void readDataFromRegister1(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister1(false);
    }

    @Override
    public void readDataFromRegister2(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister2(false);
    }

    @Override
    public void readDataFromRegister3(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister3(false);
    }

    @Override
    public void readDataFromRegister4(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister4(false);
    }

    @Override
    public void readDataFromRegister5(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister5(false);
    }

    @Override
    public void readDataFromRegister6(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister6(false);
    }

    @Override
    public void readDataFromRegister7(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister7(false);
    }

    @Override
    public void readDataFromRegister8(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister8(false);
    }

    @Override
    public void readDataFromRegister9(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister9(false);
    }

    @Override
    public void readDataFromRegister10(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister10(false);
    }

    @Override
    public void readDataFromRegister11(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister11(false);
    }

    @Override
    public void readDataFromRegister12(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister12(false);
    }

    @Override
    public void readDataFromRegister13(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister13(false);
    }

    @Override
    public void readDataFromRegister14(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister14(false);
    }

    @Override
    public void readDataFromRegister15(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister15(false);
    }

    @Override
    public void readDataFromRegister16(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister16(false);
    }

    @Override
    public void readDataFromRegister17(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister17(false);
    }

    @Override
    public void readDataFromRegister18(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister18(false);
    }

    @Override
    public void readDataFromRegister19(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister19(false);
    }

    @Override
    public void readDataFromRegister20(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister20(false);
    }

    @Override
    public void readDataFromRegister21(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister21(false);
    }

    @Override
    public void readDataFromRegister22(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister22(false);
    }

    @Override
    public void readDataFromRegister23(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister23(false);
    }

    @Override
    public void readDataFromRegister24(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister24(false);
    }

    @Override
    public void readDataFromRegister25(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister25(false);
    }

    @Override
    public void readDataFromRegister26(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister26(false);
    }

    @Override
    public void readDataFromRegister27(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister27(false);
    }

    @Override
    public void readDataFromRegister28(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister28(false);
    }

    @Override
    public void readDataFromRegister29(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister29(false);
    }

    @Override
    public void readDataFromRegister30(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister30(false);
    }

    @Override
    public void readDataFromRegister31(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister31(false);
    }

    @Override
    public void readDataFromRegister32(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister32(false);
    }

    @Override
    public void readDataFromRegister33(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister33(false);
    }

    @Override
    public void readDataFromRegister34(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister34(false);
    }

    @Override
    public void readDataFromRegister35(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister35(false);
    }

    @Override
    public void readDataFromRegister36(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister36(false);
    }

    @Override
    public void readDataFromRegister37(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister37(false);
    }

    @Override
    public void readDataFromRegister38(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister38(false);
    }

    @Override
    public void readDataFromRegister39(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister39(false);
    }

    @Override
    public void readDataFromRegister40(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister40(false);
    }

    @Override
    public void readDataFromRegister41(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister41(false);
    }

    @Override
    public void readDataFromRegister42(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister42(false);
    }

    @Override
    public void readDataFromRegister43(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister43(false);
    }

    @Override
    public void readDataFromRegister44(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister44(false);
    }

    @Override
    public void readDataFromRegister45(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister45(false);
    }

    @Override
    public void readDataFromRegister46(){
        modbusRepositorySecondCehKameraVulcan3MPR51.readDataFromRegister46(false);
    }





    @Override
    public void writeDataToRegister0(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister0(value);
    }

    @Override
    public void writeDataToRegister1(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister1(value);
    }

    @Override
    public void writeDataToRegister2(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister2(value);
    }

    @Override
    public void writeDataToRegister3(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister3(value);
    }

    @Override
    public void writeDataToRegister4(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister4(value);
    }

    @Override
    public void writeDataToRegister5(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister5(value);
    }

    @Override
    public void writeDataToRegister6(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister6(value);
    }

    @Override
    public void writeDataToRegister7(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister7(value);
    }

    @Override
    public void writeDataToRegister8(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister8(value);
    }

    @Override
    public void writeDataToRegister9(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister9(value);
    }
    @Override
    public void writeDataToRegister10(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister10(value);
    }
    @Override
    public void writeDataToRegister11(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister11(value);
    }

    @Override
    public void writeDataToRegister12(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister12(value);
    }
    @Override
    public void writeDataToRegister13(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister13(value);
    }
    @Override
    public void writeDataToRegister14(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister14(value);
    }

    @Override
    public void writeDataToRegister15(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister15(value);
    }
    @Override
    public void writeDataToRegister16(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister16(value);
    }
    @Override
    public void writeDataToRegister17(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister17(value);
    }

    @Override
    public void writeDataToRegister18(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister18(value);
    }
    @Override
    public void writeDataToRegister19(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister19(value);
    }
    @Override
    public void writeDataToRegister20(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister20(value);
    }

    @Override
    public void writeDataToRegister21(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister21(value);
    }
    @Override
    public void writeDataToRegister22(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister22(value);
    }
    @Override
    public void writeDataToRegister23(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister23(value);
    }

    @Override
    public void writeDataToRegister24(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister24(value);
    }
    @Override
    public void writeDataToRegister25(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister25(value);
    }
    @Override
    public void writeDataToRegister26(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister26(value);
    }

    @Override
    public void writeDataToRegister27(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister27(value);
    }
    @Override
    public void writeDataToRegister28(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister28(value);
    }
    @Override
    public void writeDataToRegister29(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister29(value);
    }

    @Override
    public void writeDataToRegister30(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister30(value);
    }
    @Override
    public void writeDataToRegister31(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister31(value);
    }
    @Override
    public void writeDataToRegister32(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister32(value);
    }

    @Override
    public void writeDataToRegister33(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister33(value);
    }
    @Override
    public void writeDataToRegister34(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister34(value);
    }
    @Override
    public void writeDataToRegister35(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister35(value);
    }

    @Override
    public void writeDataToRegister36(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister36(value);
    }
    @Override
    public void writeDataToRegister37(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister37(value);
    }
    @Override
    public void writeDataToRegister38(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister38(value);
    }

    @Override
    public void writeDataToRegister39(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister39(value);
    }
    @Override
    public void writeDataToRegister40(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister40(value);
    }
    @Override
    public void writeDataToRegister41(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister41(value);
    }

    @Override
    public void writeDataToRegister42(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister42(value);
    }
    @Override
    public void writeDataToRegister43(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister43(value);
    }
    @Override
    public void writeDataToRegister44(final float value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister44(value);
    }

    @Override
    public void writeDataToRegister45(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister45(value);
    }

    @Override
    public void writeDataToRegister46(final short value){
        modbusRepositorySecondCehKameraVulcan3MPR51.writeDataToRegister46(value);
    }

}
