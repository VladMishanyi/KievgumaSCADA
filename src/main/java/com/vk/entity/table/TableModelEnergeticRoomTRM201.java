package com.vk.entity.table;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by User on 2018-02-27.
 */
@Entity
@Table(name = "Trm201Energetic")
@Component
public class TableModelEnergeticRoomTRM201 extends TableModel {

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column(name = "value1")
    private int value1;

    @Column(name = "value2")
    private  int value2;

    @Column(name = "value3")
    private  float value3;

    @Column(name = "value4")
    private  float value4;

    public TableModelEnergeticRoomTRM201(){}

    @Override
    public String toString() {
        return "TableModelEnergeticRoomTRM201{"
                +"value1="+this.value1
                +", value2="+this.value2
                +", value3="+this.value3
                +", value4="+this.value4 +"}";
    }

    @Override
    public boolean equals(Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = (TableModelEnergeticRoomTRM201) object;
            result = (this.value1 == tableModelEnergeticRoomTRM201.value1) &&
                    (this.value2 == tableModelEnergeticRoomTRM201.value2) &&
                    (this.value3 == tableModelEnergeticRoomTRM201.value3) &&
                    (this.value4 == tableModelEnergeticRoomTRM201.value4);
        }
        return result;
    }

    @Override
    public TableModelEnergeticRoomTRM201 clone(){
        return (TableModelEnergeticRoomTRM201) super.clone();
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(this.value1) +
                Integer.hashCode(this.value2) +
                Float.hashCode(this.value3) +
                Float.hashCode(this.value4);
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public float getValue3() {
        return value3;
    }

    public void setValue3(float value3) {
        this.value3 = value3;
    }

    public float getValue4() {
        return value4;
    }

    public void setValue4(float value4) {
        this.value4 = value4;
    }
}
