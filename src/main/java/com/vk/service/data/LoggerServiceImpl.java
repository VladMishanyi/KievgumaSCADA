package com.vk.service.data;

import com.vk.entity.table.TableModelLogger;
import com.vk.repository.data.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class LoggerServiceImpl implements LoggerService{

    private LoggerRepository loggerRepository;

    @Autowired
    public LoggerServiceImpl(LoggerRepository loggerRepository) {
        this.loggerRepository = loggerRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelLogger> findByName(final String name) {
        return loggerRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    @Override
    public List<TableModelLogger> findByDateBetween(final LocalDateTime start, final LocalDateTime end) {
        return loggerRepository.findByDateBetween(start, end);
    }

    @Transactional
    @Override
    public void addByType(TableModelLogger tableModelLogger) {
        loggerRepository.saveAndFlush(tableModelLogger);
    }

    @Transactional
    @Override
    public void deleteByType(final TableModelLogger tableModelLogger) {
        loggerRepository.delete(tableModelLogger);
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        loggerRepository.deleteById(id);
    }
}
