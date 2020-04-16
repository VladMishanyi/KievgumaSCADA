package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehBuzuluk")
public class TableModelFirstCehBuzulukTRM200 extends TableModel{

    private static final long serialVersionUID = 1L;

    @Column (name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    public TableModelFirstCehBuzulukTRM200(){}

    @Override
    public String toString() {
        return "TableModelFirstCehBuzulukTRM200{"
                +super.toString()
                +"channel1="+this.channel1
                +", channel2="+this.channel2 +"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = (TableModelFirstCehBuzulukTRM200) object;
            result = (this.channel1 == tableModelFirstCehBuzulukTRM200.channel1) &&
                    (this.channel2 == tableModelFirstCehBuzulukTRM200.channel2);
        }
        return result;
    }

    @Override
    public TableModelFirstCehBuzulukTRM200 clone(){
        return (TableModelFirstCehBuzulukTRM200) super.clone();
    }

    @Override
    public int hashCode(){
        return  Long.hashCode(this.getId())+
                this.getDate().hashCode()+
                Float.hashCode(this.channel1) +
                Float.hashCode(this.channel2);
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
}
