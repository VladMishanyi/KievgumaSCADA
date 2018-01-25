package com.vk.repository;

//import com.vk.entity.PLC;
import com.vk.entity.*;

//import java.util.Calendar;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2017-07-18.
 */
public interface TRMRepository {
    TRM201_Energrtic getTRM201(int slaveAdrr);
    void addTRMvalue(TRM201_Energrtic trm201_energrtic);
    List<TRM201_Energrtic> rangeTimestamp(Date startTimestamp, Date endTimestamp);

    ThirdCehAutoclav getThirdCehAutoclavTRM202(int slaveAdrr);
    void addThirdCehAutoclavTRM202(ThirdCehAutoclav thirdCehAutoclav);
    List<ThirdCehAutoclav> rangeTimestampThirdCehAutoclav(Date startTimestamp, Date endTimestamp);

    FirstCehAutoclav getFirstCehAutoclavTRM202(int slaveAdrr);
    void addFirstCehAutoclavTRM202(FirstCehAutoclav firstCehAutoclav);
    List<FirstCehAutoclav> rangeTimestampFirstCehAutoclav(Date startTimestamp, Date endTimestamp);

    FirstCehKameraDozrevanya getFirstCehKameraDozrevanyaMPR51(int slaveAdrr);
    void addFirstCehKameraDozrevanyaMPR51(FirstCehKameraDozrevanya firstCehKameraDozrevanya);
    List<FirstCehKameraDozrevanya> rangeTimestampFirstCehKameraDozrevanya(Date startTimestamp, Date endTimestamp);

    FirstCehBuzuluk getFirstCehBuzulukTRM200(int slaveAdrr);
    void addFirstCehBuzulukTRM200(FirstCehBuzuluk firstCehBuzuluk);
    List<FirstCehBuzuluk> rangeTimestampFirstCehBuzuluk(Date startTimestamp, Date endTimestamp);

    SevenCehAutoclav getSevenCehAutoclavSPK(int slaveAdrr);
    void addSevenCehAutoclavSPK(SevenCehAutoclav sevenCehAutoclav);
    List<SevenCehAutoclav> rangeTimestampSevenCehAutoclav(Date startTimestamp, Date endTimestamp);





    BigInteger getSizeTableFirstChehBuzulukTRM200();
    BigInteger getSizeTableFirstCehKameraDozrevanyaMPR51();
    BigInteger getSizeTableFirstCehAutoclavTRM202();
    BigInteger getSizeTableThirdCehAutoclavTRM202();
    BigInteger getSizeTableOtdelEnergetikaTRM202();
}
