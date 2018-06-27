package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehAutoclav")
//@Component
public class TableModelFirstCehAutoclavTRM202 extends TableModel{

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column (name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    public TableModelFirstCehAutoclavTRM202(){}

    @Override
    public String toString() {
        return "TableModelFirstCehAutoclavTRM202{"
                +"channel1="+this.channel1
                +", channel2="+this.channel2 +"}";
    }

    @Override
    public boolean equals(Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = (TableModelFirstCehAutoclavTRM202) object;
            result = (this.channel1 == tableModelFirstCehAutoclavTRM202.channel1) &&
                    (this.channel2 == tableModelFirstCehAutoclavTRM202.channel2);
        }
        return result;
    }

    @Override
    public TableModelFirstCehAutoclavTRM202 clone(){
        return (TableModelFirstCehAutoclavTRM202) super.clone();
    }

    @Override
    public int hashCode(){
        return Float.hashCode(this.channel1) +
                Float.hashCode(this.channel2);
    }

    public float getChannel1() {
        return channel1;
    }

    public void setChannel1(float channel1) {
        this.channel1 = channel1;
    }

    public float getChannel2() {
        return channel2;
    }

    public void setChannel2(float channel2) {
        this.channel2 = channel2;
    }
}
