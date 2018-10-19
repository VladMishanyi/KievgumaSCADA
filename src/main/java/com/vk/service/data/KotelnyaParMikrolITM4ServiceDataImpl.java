package com.vk.service.data;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelKotelnyaParMikrolITM4;
import com.vk.repository.data.RootRepositoryData;
import com.vk.repository.modbus.RootModbusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Service
@ComponentScan(basePackages = {"com.vk.repository"})
public class KotelnyaParMikrolITM4ServiceDataImpl extends RootServiceDataImpl<Float, TableModelKotelnyaParMikrolITM4, DeviceModelKotelnyaParMikrolITM4> implements KotelnyaParMikrolITM4ServiceData{


    private RootRepositoryData<TableModelKotelnyaParMikrolITM4> rootRepositoryData;

    private RootModbusRepository<DeviceModelKotelnyaParMikrolITM4> rootModbusRepository;

    @Autowired
    public KotelnyaParMikrolITM4ServiceDataImpl(RootRepositoryData<TableModelKotelnyaParMikrolITM4> rootRepositoryData,
                                                RootModbusRepository<DeviceModelKotelnyaParMikrolITM4> rootModbusRepository){
        super(rootRepositoryData, rootModbusRepository);
        this.rootRepositoryData = rootRepositoryData;
        this.rootModbusRepository = rootModbusRepository;
    }
}
