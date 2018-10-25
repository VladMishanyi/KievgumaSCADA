package com.vk.entity.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehKameraDozrevanya")
//@Component
public class TableModelFirstCehKameraDozrevanyaMPR51 extends TableModel{

    private static final long serialVersionUID = 1L;

    @Column (name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    @Column (name = "channel4")
    private float channel4;

    @Column (name = "channel5")
    private float channel5;

    @Column (name = "channel6")
    private float channel6;

    @Column (name = "channel7")
    private float channel7;

    @Column (name = "channel8")
    private float channel8;

    public TableModelFirstCehKameraDozrevanyaMPR51(){}

    @Override
    public String toString() {
        return "TableModelFirstCehKameraDozrevanyaMPR51{"
                +super.toString()
                +"channel1="+this.channel1
                +", channel2="+this.channel2
                +", channel3="+this.channel3
                +", channel4="+this.channel4
                +", channel5="+this.channel5
                +", channel6="+this.channel6
                +", channel7="+this.channel7
                +", channel8="+this.channel8
                +"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = (TableModelFirstCehKameraDozrevanyaMPR51) object;
            result = (this.channel1 == tableModelFirstCehKameraDozrevanyaMPR51.channel1) &&
                    (this.channel2 == tableModelFirstCehKameraDozrevanyaMPR51.channel2) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel3) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel4) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel5) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel6) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel7) &&
                    (this.channel3 == tableModelFirstCehKameraDozrevanyaMPR51.channel8);
        }
        return result;
    }

    @Override
    public TableModelFirstCehKameraDozrevanyaMPR51 clone(){
        return (TableModelFirstCehKameraDozrevanyaMPR51) super.clone();
    }

    @Override
    public int hashCode(){
        return  Long.hashCode(this.getId())+
                this.getDate().hashCode()+
                Float.hashCode(this.channel1) +
                Float.hashCode(this.channel2) +
                Float.hashCode(this.channel3) +
                Float.hashCode(this.channel4) +
                Float.hashCode(this.channel5) +
                Float.hashCode(this.channel6) +
                Float.hashCode(this.channel7) +
                Float.hashCode(this.channel8);
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

    public float getChannel4() {
        return channel4;
    }

    public void setChannel4(final float channel4) {
        this.channel4 = channel4;
    }

    public float getChannel5() {
        return channel5;
    }

    public void setChannel5(final float channel5) {
        this.channel5 = channel5;
    }

    public float getChannel6() {
        return channel6;
    }

    public void setChannel6(final float channel6) {
        this.channel6 = channel6;
    }

    public float getChannel7() {
        return channel7;
    }

    public void setChannel7(final float channel7) {
        this.channel7 = channel7;
    }

    public float getChannel8() {
        return channel8;
    }

    public void setChannel8(final float channel8) {
        this.channel8 = channel8;
    }
}
