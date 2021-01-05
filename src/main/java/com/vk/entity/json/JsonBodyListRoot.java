package com.vk.entity.json;

import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;

import java.util.List;

public class JsonBodyListRoot<E extends TableModel> {

    private List<E> tableModelList;

    public JsonBodyListRoot() {
    }

    public JsonBodyListRoot(List<E> tableModelList) {
        this.tableModelList = tableModelList;
    }

    public List<E> getTableModelList() {
        return tableModelList;
    }

    public void setTableModelList(List<E> tableModelList) {
        this.tableModelList = tableModelList;
    }
}
