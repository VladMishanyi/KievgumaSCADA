package com.vk.repository.data;

        import com.vk.entity.table.TableModelEnergeticRoomTRM201;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.jpa.repository.Temporal;
        import org.springframework.data.repository.query.Param;

        import javax.persistence.TemporalType;
        import java.util.Date;
        import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface EnergeticRoomTRM201RepositoryData extends RootRepositoryData<TableModelEnergeticRoomTRM201> {

//    @Query("SELECT t FROM TableModelEnergeticRoomTRM201 t WHERE t.date >= :start AND t.date <= :end")
//    List<TableModelEnergeticRoomTRM201> findByDateBetween (@Param("start") @Temporal(value = TemporalType.TIMESTAMP) Date start,
//                                                               @Param("end") @Temporal(value = TemporalType.TIMESTAMP)Date end);
}
