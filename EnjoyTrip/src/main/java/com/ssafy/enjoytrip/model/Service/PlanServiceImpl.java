package com.ssafy.enjoytrip.model.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.model.Notice;
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
//		planMapper.getPlanId(plan);
		System.out.println(plan.getPlanId());
		planMapper.insertPlanTravels(plan.getPlanId(), plan.getPlanTravels());
	}

	@Override
	public List<Plan> getPlanAll() throws Exception {
		return planMapper.selectGetAll();
	}

	@Override
	public Plan getPlanDetail(int planId) throws Exception {
		return planMapper.selectGetDetail(planId);
	}

	@Override
	public void deletePlan(int planId) throws Exception {
		planMapper.deletePlan(planId);
	}
	
}
