package com.ssafy.enjoytrip.model.mapper;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface TravelMapper {
    List<TravelInfo> selectGetAll() throws SQLException;

    List<Gugun> selectBySidoCode(int sidoCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode, @Param("gugunCode") int gugunCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode) throws SQLException;

    List<TravelInfo> selectBySidoCodeGugunCode(@Param("sidoCode") int sidoCode, @Param("gugunCode") int gugunCode, @Param("travelInfoId") int travelInfoId) throws SQLException;
}
