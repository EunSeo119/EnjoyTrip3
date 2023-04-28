package com.ssafy.enjoytrip.model.mapper;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;
import com.ssafy.enjoytrip.model.TravelStatus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface TravelMapper {
    List<TravelInfo> selectGetAll() throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") Integer sidoCode, @Param("gugunCode") Integer gugunCode, @Param("travelTypeId") Integer travelTypeId) throws SQLException;

    int updateLike(@Param("userId") String userId, @Param("travelInfoId") Integer travelInfoId, @Param("like") Integer like);

    TravelStatus selectTravelStatus(TravelStatus travelStatus);

    void insertLike(TravelStatus travelStatus);

    void insertStar(TravelStatus travelStatus);

    int updateStar(TravelStatus travelStatus);

    List<Gugun> selectGugun(@Param("sidoCode") int sidoCode);
}
