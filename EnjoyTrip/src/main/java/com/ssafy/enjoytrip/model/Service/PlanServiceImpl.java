package com.ssafy.enjoytrip.model.Service;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.model.Plan;
import com.ssafy.enjoytrip.model.mapper.PlanMapper;

@Service
public class PlanServiceImpl implements PlanService{
	private final PlanMapper planMapper;

	public PlanServiceImpl(PlanMapper planMapper) {
		super();
		this.planMapper = planMapper;
	}

	@Override
	public void registPlan(Plan plan) {
		planMapper.insertPlan(plan);
		planMapper.getPlanId(plan);
		planMapper.insertPlanTravels(plan.getPlanTravels());
	}
}
