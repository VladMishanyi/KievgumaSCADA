package com.vk.entity.table;

import javafx.scene.control.Tab;
import org.apache.log4j.Logger;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import com.vk.lib.ObjectValidator;

/**
 * Created by User on 2018-02-27.
 */
@MappedSuperclass
public abstract class TableModel implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(TableModel.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", columnDefinition="DATETIME")
    private Date date;

    public TableModel(){}

    public TableModel(long id, Date date){
        this.id = id;
        this.date = date;
    }

    @Override
    public String toString(){
        return "TableModel{" +
                "id=" + this.id +
                ", date=" + this.date + "}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = ObjectValidator.isNotNull(object) &&
                (this == object) &&
                (this.getClass() == object.getClass());
        if (result){
            TableModel tableModel = (TableModel) object;
            result = (this.id == tableModel.id) &&
                    (this.date.equals(tableModel.date));
        }
        return result;
    }

    @Override
    public TableModel clone(){
        TableModel tableModel = null;
        try {
            tableModel = (TableModel) super.clone();
        }catch (CloneNotSupportedException e){
            LOGGER.error(e.getMessage(), e);
        }
        return tableModel;
    }

    @Override
    public abstract int hashCode();

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }
}
