package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "SevenCehAutoclav")
//@Component
public class TableModelSevenCehAutoclavSPK107 extends TableModel{

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column (name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    public TableModelSevenCehAutoclavSPK107(){}

    @Override
    public String toString() {
        return "TableModelSevenCehAutoclavSPK107{"
                +"channel1="+this.channel1
                +", channel2="+this.channel2
                +", channel3="+this.channel3 +"}";
    }

    @Override
    public boolean equals(Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = (TableModelSevenCehAutoclavSPK107) object;
            result = (this.channel1 == tableModelSevenCehAutoclavSPK107.channel1) &&
                    (this.channel2 == tableModelSevenCehAutoclavSPK107.channel2) &&
                    (this.channel3 == tableModelSevenCehAutoclavSPK107.channel3);
        }
        return result;
    }

    @Override
    public TableModelSevenCehAutoclavSPK107 clone(){
        return (TableModelSevenCehAutoclavSPK107) super.clone();
    }

    @Override
    public int hashCode(){
        return Float.hashCode(this.channel1) +
                Float.hashCode(this.channel2) +
                Float.hashCode(this.channel3);
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

    public float getChannel3() {
        return channel3;
    }

    public void setChannel3(float channel3) {
        this.channel3 = channel3;
    }
}
