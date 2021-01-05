package com.vk.entity.table;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "secondCehBalonTRM138")
public class TableModelSecondCehBalonTRM138 extends TableModel{

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "id")
//    private long id;
//
//    @Column(name = "date", columnDefinition = "TIMESTAMP")
//    private LocalDateTime date;

    @Column(name = "inputRegister0")
    private float inputRegister0 = 0F;

    @Column(name = "inputRegister1")
    private float inputRegister1 = 0F;

    @Column(name = "inputRegister2")
    private float inputRegister2 = 0F;

    @Column(name = "inputRegister3")
    private float inputRegister3 = 0F;

    @Column(name = "inputRegister4")
    private float inputRegister4 = 0F;

    public TableModelSecondCehBalonTRM138(){}

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

    public float getInputRegister0() {
        return inputRegister0;
    }

    public void setInputRegister0(float inputRegister0) {
        this.inputRegister0 = inputRegister0;
    }

    public float getInputRegister1() {
        return inputRegister1;
    }

    public void setInputRegister1(float inputRegister1) {
        this.inputRegister1 = inputRegister1;
    }

    public float getInputRegister2() {
        return inputRegister2;
    }

    public void setInputRegister2(float inputRegister2) {
        this.inputRegister2 = inputRegister2;
    }

    public float getInputRegister3() {
        return inputRegister3;
    }

    public void setInputRegister3(float inputRegister3) {
        this.inputRegister3 = inputRegister3;
    }

    public float getInputRegister4() {
        return inputRegister4;
    }

    public void setInputRegister4(float inputRegister4) {
        this.inputRegister4 = inputRegister4;
    }

    @Override
    public boolean equals(Object object) {
        boolean result = super.equals(object);
        if (result){
            TableModelSecondCehBalonTRM138 that = (TableModelSecondCehBalonTRM138) object;
            result = Float.compare(that.inputRegister0, inputRegister0) == 0 &&
                    Float.compare(that.inputRegister1, inputRegister1) == 0 &&
                    Float.compare(that.inputRegister2, inputRegister2) == 0 &&
                    Float.compare(that.inputRegister3, inputRegister3) == 0 &&
                    Float.compare(that.inputRegister4, inputRegister4) == 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDate(), inputRegister0, inputRegister1, inputRegister2, inputRegister3, inputRegister4);
    }

    @Override
    public String toString() {
        return "TableModelSecondCehBalonTRM138{" +
                super.toString()+
                ", inputRegister0=" + inputRegister0 +
                ", inputRegister1=" + inputRegister1 +
                ", inputRegister2=" + inputRegister2 +
                ", inputRegister3=" + inputRegister3 +
                ", inputRegister4=" + inputRegister4 +
                '}';
    }

    @Override
    public TableModelSecondCehBalonTRM138 clone() {
        return (TableModelSecondCehBalonTRM138) super.clone();
    }
}
