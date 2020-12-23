package com.vk.entity.json;

import com.vk.entity.table.TableModelEnergeticRoomTRM202;


import java.util.List;

public class JsonBodyListForTableModelTRM202 {

    private List<TableModelEnergeticRoomTRM202> tableModelEnergeticRoomTRM202;

    public JsonBodyListForTableModelTRM202() {
    }

    public JsonBodyListForTableModelTRM202(List<TableModelEnergeticRoomTRM202> tableModelTRM202List) {
        this.tableModelEnergeticRoomTRM202 = tableModelTRM202List;
    }

    public List<TableModelEnergeticRoomTRM202> getTableModelTRM202List() {
        return tableModelEnergeticRoomTRM202;
    }

    public void setTableModelTRM202List(List<TableModelEnergeticRoomTRM202> tableModelTRM202List) {
        this.tableModelEnergeticRoomTRM202 = tableModelTRM202List;
    }
}
