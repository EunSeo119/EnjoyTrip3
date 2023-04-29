package com.ssafy.enjoytrip.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.model.Plan;
import com.ssafy.enjoytrip.model.PlanTravel;

@Mapper
public interface PlanMapper {
	int insertPlan(Plan plan);
	
	void insertPlanTravels(@Param("planId") int planId, @Param("planTravels") List<PlanTravel> planTravels);
	
	List<Plan> selectGetAll() throws SQLException;
	
	Plan selectGetDetail(int planId) throws SQLException;
	
}
