package com.vk.repository.data;

import com.vk.entity.table.TableModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
@NoRepositoryBean
public interface RootRepositoryData<E extends TableModel> extends JpaRepository<E ,Long> {

    @Query(value = "SELECT (data_length+index_length) tablesize FROM information_schema.tables WHERE table_schema='KievgumaBase'", nativeQuery = true)
    List<BigInteger> readBaseSize();

    List<E> findByDateBetween (Date start, Date end);

}
