package com.vk.entity.table;

import org.apache.log4j.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "logger")
public class TableModelLogger extends TableModel{

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(TableModel.class);

    @Column(name = "name")
    private String name;

    @Column(name = "information")
    private String information;

    public TableModelLogger() {
    }

    @Override
    public String toString() {
        return "TableModelLogger{"
                +super.toString()
                +"name="+this.name
                +", information="+this.information +"}";
    }

    @Override
    public boolean equals(final Object object){
        boolean result = super.equals(object);
        if (result){
            TableModelLogger tableModelLogger = (TableModelLogger) object;
            result = (this.name.equals(tableModelLogger.name)) &&
                    (this.information.equals(tableModelLogger.information));
        }
        return result;
    }

    @Override
    public TableModelLogger clone(){
        return (TableModelLogger) super.clone();
    }

    @Override
    public int hashCode(){
        return  Long.hashCode(this.getId())+
                this.getDate().hashCode()+
                this.name.hashCode() +
                this.information.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
