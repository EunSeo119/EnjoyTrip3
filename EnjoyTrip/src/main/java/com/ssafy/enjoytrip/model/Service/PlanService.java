package com.ssafy.enjoytrip.model.Service;

import java.util.List;

import com.ssafy.enjoytrip.model.Plan;

public interface PlanService {
	void registPlan(Plan plan);
	
	List<Plan> getPlanAll() throws Exception;
	
	Plan getPlanDetail(int planId) throws Exception;
	
	void deletePlan(int planId) throws Exception;
}
