package com.vk.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2018-01-24.
 */
@Entity
@Table(name = "SevenCehAutoclav")
public class SevenCehAutoclav implements Serializable {

    private static final long serialVersionUDI = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", columnDefinition="DATETIME")
    private Date date;

    @Column (name = "channel1")
    private float channel1;

    @Column (name = "channel2")
    private float channel2;

    @Column (name = "channel3")
    private float channel3;

    public SevenCehAutoclav(){}

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

    @Override
    public String toString() {
        return "id: "+this.id
                +"\ndatetime: "+this.date
                +"\nvalue1: "+this.channel1
                +"\nvalue2: "+this.channel2
                +"\nvalue2: "+this.channel3;
    }
}
