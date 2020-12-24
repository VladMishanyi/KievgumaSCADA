package com.vk.service.data;

import com.vk.entity.table.TableModelLogger;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface LoggerService {

    List<TableModelLogger> findByName (String name);

    List<TableModelLogger> findByDateBetween (LocalDateTime start, LocalDateTime end);

    void addByType(TableModelLogger tableModelLogger);

    void deleteByType(TableModelLogger tableModelLogger);

    void deleteById(long id);
}
