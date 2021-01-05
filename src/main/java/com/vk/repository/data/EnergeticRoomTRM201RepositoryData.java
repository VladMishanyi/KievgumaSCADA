package com.vk.repository.data;

import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;


/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface EnergeticRoomTRM201RepositoryData  extends RootRepositoryData<TableModelEnergeticRoomTRM202> {

//    List<TableModelEnergeticRoomTRM202> findByDateBetween (LocalDateTime start, LocalDateTime end);
//
    @Query(value = "SELECT * FROM trm202 ORDER BY date DESC LIMIT 1",nativeQuery = true)
    TableModelEnergeticRoomTRM202 findLastValueByDate ();
}
