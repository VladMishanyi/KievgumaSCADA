package com.vk.repository.data;

import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.entity.table.TableModelSiliconeCameraVulcanTRM251;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryDataSiliconCameraVulcanTRM251 extends RootRepositoryData<TableModelSiliconeCameraVulcanTRM251>{
    @Query(value = "SELECT * FROM silicone_camera_vulcan_trm251 ORDER BY date DESC LIMIT 1",nativeQuery = true)
    TableModelSiliconeCameraVulcanTRM251 findLastValueByDate ();
}
