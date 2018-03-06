package com.vk.entity.table;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 2018-03-06.
 */
@Entity
@Table(name = "FirstCehSmesitel1KMSF1")
public class TableModelFirstCehSmesitel1KMSF1 extends TableModel{

    private static final long SERIAL_VERSION_UDI = 1L;

    @Column(name = "channel1")
    private int channel1;

    public TableModelFirstCehSmesitel1KMSF1(){}

    @Override
    public String toString() {
        return "TableModelFirstCehSmesitel1KMSF1{"
                +"channel1="+this.channel1 +"}";
    }

    @Override
    public boolean equals(Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = (TableModelFirstCehSmesitel1KMSF1) object;
            result = (this.channel1 == tableModelFirstCehSmesitel1KMSF1.channel1);
        }
        return result;
    }

    @Override
    public TableModelFirstCehSmesitel1KMSF1 clone(){
        return (TableModelFirstCehSmesitel1KMSF1) super.clone();
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(this.channel1);
    }

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(int channel1) {
        this.channel1 = channel1;
    }
}
