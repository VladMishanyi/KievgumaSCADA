package com.vk.entity.table;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 2018-02-27.
 */
@Entity
@Table(name = "Trm201Energetic")
public class TableModelEnergeticRoomTRM201 extends TableModel {

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column(name = "value1")
    private Integer value1;

    @Column(name = "value2")
    private  Integer value2;

    @Column(name = "value3")
    private  Float value3;

    @Column(name = "value4")
    private  Float value4;

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
            result = (this.value1.equals(tableModelEnergeticRoomTRM201.value1)) &&
                    (this.value2.equals(tableModelEnergeticRoomTRM201.value2)) &&
                    (this.value3.equals(tableModelEnergeticRoomTRM201.value3)) &&
                    (this.value4.equals(tableModelEnergeticRoomTRM201.value4));
        }
        return result;
    }

    @Override
    public TableModelEnergeticRoomTRM201 clone(){
        return (TableModelEnergeticRoomTRM201) super.clone();
    }

    @Override
    public int hashCode(){
        return this.value1.hashCode() +
                this.value2.hashCode() +
                this.value3.hashCode() +
                this.value4.hashCode();
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    public Float getValue3() {
        return value3;
    }

    public void setValue3(Float value3) {
        this.value3 = value3;
    }

    public Float getValue4() {
        return value4;
    }

    public void setValue4(Float value4) {
        this.value4 = value4;
    }

}
