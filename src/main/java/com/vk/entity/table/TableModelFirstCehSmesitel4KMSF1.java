package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehSmesitel4KMSF1")
public class TableModelFirstCehSmesitel4KMSF1 extends TableModel{

    private static final long serialVersionUID = 1L;

    @Column(name = "channel1")
    private int channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    public TableModelFirstCehSmesitel4KMSF1(){}

    @Override
    public String toString() {
        return "TableModelFirstCehSmesitel4KMSF1{"
                +super.toString()
                +"channel1="+this.channel1
                +"channel2="+this.channel2
                +"channel3="+this.channel3+"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = (TableModelFirstCehSmesitel4KMSF1) object;
            result = (this.channel1 == tableModelFirstCehSmesitel4KMSF1.channel1) &&
                    (this.channel2 == tableModelFirstCehSmesitel4KMSF1.channel2) &&
                    (this.channel3 == tableModelFirstCehSmesitel4KMSF1.channel3);
        }
        return result;
    }

    @Override
    public TableModelFirstCehSmesitel4KMSF1 clone(){
        return (TableModelFirstCehSmesitel4KMSF1) super.clone();
    }

    @Override
    public int hashCode(){
        return  Long.hashCode(this.getId())+
                this.getDate().hashCode()+
                Integer.hashCode(this.channel1)+
                Float.hashCode(this.channel2)+
                Float.hashCode(this.channel3);
    }

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(final int channel1) {
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
