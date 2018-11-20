package com.vk.entity.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by KIP-PC99 on 20.11.2018.
 */
@Entity
@Table(name = "SecondCehKameraVulcan1")
public class TableModelSecondCehKameraVulcan1MPR51 extends TableModel{

    private static final long serialVersionUID = 1L;

    @Column(name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    public TableModelSecondCehKameraVulcan1MPR51(){}

    @Override
    public String toString() {
        return "TableModelSecondCehKameraVulcan1MPR51{"
                +super.toString()
                +"channel1="+this.channel1
                +", channel2="+this.channel2
                +", channel3="+this.channel3
                +"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelSecondCehKameraVulcan1MPR51 tableModelSecondCehKameraVulcan1MPR51 = (TableModelSecondCehKameraVulcan1MPR51) object;
            result = (this.channel1 == tableModelSecondCehKameraVulcan1MPR51.channel1) &&
                    (this.channel2 == tableModelSecondCehKameraVulcan1MPR51.channel2) &&
                    (this.channel3 == tableModelSecondCehKameraVulcan1MPR51.channel3);
        }
        return result;
    }

    @Override
    public TableModelSecondCehKameraVulcan1MPR51 clone(){
        return (TableModelSecondCehKameraVulcan1MPR51) super.clone();
    }

    @Override
    public int hashCode(){
        return  Long.hashCode(this.getId())+
                this.getDate().hashCode()+
                Float.hashCode(this.channel1) +
                Float.hashCode(this.channel2) +
                Float.hashCode(this.channel3);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public float getChannel1() {
        return channel1;
    }

    public void setChannel1(final float channel1) {
        this.channel1 = channel1;
    }

    public float getChannel2() {
        return channel2;
    }

    public void setChannel2(final float channel2) {
        this.channel2 = channel2;
    }

    public float getChannel3() {
        return channel3;
    }

    public void setChannel3(final float channel3) {
        this.channel3 = channel3;
    }
}
