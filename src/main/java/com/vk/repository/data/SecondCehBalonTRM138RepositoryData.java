package com.vk.repository.data;

import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface SecondCehBalonTRM138RepositoryData  extends RootRepositoryData<TableModelSecondCehBalonTRM138> {

//    List<TableModelSecondCehBalonTRM138> findByDateBetween (LocalDateTime start, LocalDateTime end);

    @Query(value = "SELECT * FROM secondCehBalonTRM138 ORDER BY date DESC LIMIT 1",nativeQuery = true)
    TableModelSecondCehBalonTRM138 findLastValueByDate ();
}
