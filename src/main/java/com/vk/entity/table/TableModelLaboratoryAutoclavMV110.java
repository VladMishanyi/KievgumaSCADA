package com.vk.entity.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 2018-04-02.
 */
@Entity
@Table(name = "LaboratoryAutoclavMV110")
public class TableModelLaboratoryAutoclavMV110 extends TableModel{

    private static final long serialVersionUID = 1L;

    @Column(name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    public TableModelLaboratoryAutoclavMV110(){}

    @Override
    public String toString() {
        return "TableModelLaboratoryAutoclavMV110{"
                +super.toString()
                +"channel1="+this.channel1
                +", channel2="+this.channel2 +"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelLaboratoryAutoclavMV110 tableModelLaboratoryAutoclavMV110 = (TableModelLaboratoryAutoclavMV110) object;
            result = (this.channel1 == tableModelLaboratoryAutoclavMV110.channel1) &&
                    (this.channel2 == tableModelLaboratoryAutoclavMV110.channel2);
        }
        return result;
    }

    @Override
    public TableModelFirstCehAutoclavTRM202 clone(){
        return (TableModelFirstCehAutoclavTRM202) super.clone();
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
