package com.vk.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2018-02-07.
 */
@Entity
@Table(name = "FirstCehSmesitel5KMSF1")
public class FirstCehSmesitel5KMSF1 implements Serializable {

    private static final long serialVersionUDI = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", columnDefinition="DATETIME")
    private Date date;

    @Column(name = "channel1")
    private int channel1;

    public FirstCehSmesitel5KMSF1(){}

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

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(int channel1) {
        this.channel1 = channel1;
    }

    @Override
    public String toString() {
        return "id: "+this.id
                +"\ndatetime: "+this.date
                +"\nvalue1: "+this.channel1;
    }
}
