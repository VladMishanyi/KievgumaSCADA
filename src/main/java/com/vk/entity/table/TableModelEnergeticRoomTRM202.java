package com.vk.entity.table;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by User on 2018-02-27.
 */
@Entity
@Table(name = "trm202")
//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TableModelEnergeticRoomTRM202  extends TableModel {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private long id;
//
//    //    @Temporal(value = TemporalType.TIMESTAMP)
//    @Column(name = "date", columnDefinition = "TIMESTAMP")
//    private LocalDateTime date;

    @Column(name = "holdingRegister0")
    private float holdingRegister0 = 0F;

    @Column(name = "holdingRegister1")
    private float holdingRegister1 = 0F;

    public TableModelEnergeticRoomTRM202(){}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }

    public float getHoldingRegister0() {
        return holdingRegister0;
    }

    public void setHoldingRegister0(float holdingRegister0) {
        this.holdingRegister0 = holdingRegister0;
    }

    public float getHoldingRegister1() {
        return holdingRegister1;
    }

    public void setHoldingRegister1(float holdingRegister1) {
        this.holdingRegister1 = holdingRegister1;
    }

    @Override
    public boolean equals(Object object) {
        boolean result = super.equals(object);
        if (result){
            TableModelEnergeticRoomTRM202 that = (TableModelEnergeticRoomTRM202) object;
            result = Float.compare(that.holdingRegister0, holdingRegister0) == 0 &&
                    Float.compare(that.holdingRegister1, holdingRegister1) == 0;
        }
        return result;

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDate(), holdingRegister0, holdingRegister1);
    }

    @Override
    public String toString() {
        return "TableModelEnergeticRoomTRM201{" +
                super.toString()+
                ", holdingRegister0=" + holdingRegister0 +
                ", holdingRegister1=" + holdingRegister1 +
                '}';
    }

    @Override
    public TableModelEnergeticRoomTRM202 clone() {
        return (TableModelEnergeticRoomTRM202) super.clone();
    }
}
