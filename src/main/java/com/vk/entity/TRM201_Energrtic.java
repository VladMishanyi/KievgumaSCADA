package com.vk.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2017-07-18.
 */
@Entity
@Table(name = "Trm201Energetic")
public class TRM201_Energrtic implements Serializable{

    private static final long serialVersionUDI = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", columnDefinition="DATETIME")
//    @Column(name = "date")
    private Date date;

    @Column(name = "value1")
    private int value1;

    @Column(name = "value2")
    private  int value2;

    @Column(name = "value3")
    private  float value3;

    @Column(name = "value4")
    private  float value4;

    public TRM201_Energrtic(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public float getValue3() {
        return value3;
    }

    public void setValue3(float value3) {
        this.value3 = value3;
    }

    public float getValue4() {
        return value4;
    }

    public void setValue4(float value4) {
        this.value4 = value4;
    }

    @Override
    public String toString() {
        return "id: "+this.id
                +"\ndatetime: "+this.date
                +"\nvalue1: "+this.value1
                +"\nvalue2: "+this.value2
                +"\nvalue3: "+this.value3
                +"\nvalue4: "+this.value4;
    }
}
