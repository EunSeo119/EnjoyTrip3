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

    List<Gugun> selectBySidoCode(@Param("sidoCode") int sidoCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode, @Param("gugunCode") int gugunCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode, @Param("gugunCode") int gugunCode, @Param("travelInfoId") int travelInfoId) throws SQLException;

    int updateLike(@Param("userId") String userId, @Param("travelInfoId") Integer travelInfoId, @Param("like") Integer like);

    TravelStatus selectTravelStatus(@Param("userId") String userId, @Param("travelInfoId") Integer travelInfoId);

    void insertLike(@Param("userId") String userId, @Param("travelInfoId") int travelInfoId);

    void insertStar(TravelStatus travelStatus);

    int updateStar(TravelStatus travelStatus);
}
