package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehSmesitel2KMSF1")
//@Component
public class TableModelFirstCehSmesitel2KMSF1 extends TableModel{

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column(name = "channel1")
    private int channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    public TableModelFirstCehSmesitel2KMSF1(){}

    @Override
    public String toString() {
        return "TableModelFirstCehSmesitel2KMSF1{"
                +"channel1="+this.channel1
                +"channel2="+this.channel2
                +"channel3="+this.channel3+"}";
    }

    @Override
    public boolean equals(Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = (TableModelFirstCehSmesitel2KMSF1) object;
            result = (this.channel1 == tableModelFirstCehSmesitel2KMSF1.channel1) &&
                    (this.channel2 == tableModelFirstCehSmesitel2KMSF1.channel2) &&
                    (this.channel2 == tableModelFirstCehSmesitel2KMSF1.channel3);
        }
        return result;
    }

    @Override
    public TableModelFirstCehSmesitel2KMSF1 clone(){
        return (TableModelFirstCehSmesitel2KMSF1) super.clone();
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(this.channel1) +
                Float.hashCode(this.channel2) +
                Float.hashCode(this.channel3);
    }

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(int channel1) {
        this.channel1 = channel1;
    }

    public float getChannel2() {
        return channel2;
    }

    public void setChannel2(float channel2) {
        this.channel2 = channel2;
    }

    public float getChannel3() {
        return channel3;
    }

    public void setChannel3(float channel3) {
        this.channel3 = channel3;
    }
}
