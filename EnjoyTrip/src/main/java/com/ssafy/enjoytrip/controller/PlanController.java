package com.ssafy.enjoytrip.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.model.Plan;
import com.ssafy.enjoytrip.model.Service.PlanService;

@RestController
@RequestMapping("/plan")
@CrossOrigin("*")
public class PlanController {
	private final PlanService planService;

	public PlanController(PlanService planService) {
		this.planService = planService;
	}
	
	@PostMapping("regist")
	public ResponseEntity<?> registPlan(@RequestBody Plan plan) throws Exception {
		planService.registPlan(plan);
		return new ResponseEntity<>(plan, HttpStatus.OK);
	}
}
