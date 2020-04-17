package com.vk.repository.data;

import com.vk.entity.table.TableModelLogger;

import java.util.Date;
import java.util.List;

public interface LoggerRepository extends RootRepositoryData<TableModelLogger> {

    List<TableModelLogger> findByName (String name);
}
