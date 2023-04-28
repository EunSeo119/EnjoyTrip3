package com.ssafy.enjoytrip.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.model.Plan;
import com.ssafy.enjoytrip.model.PlanTravel;

@Mapper
public interface PlanMapper {
	void insertPlan(Plan plan);
	Plan insertPlanTravels(List<PlanTravel> planTravels);
}
