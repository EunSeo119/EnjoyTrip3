package com.ssafy.enjoytrip.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.model.Notice;
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
	
	@GetMapping("list")
    public ResponseEntity<List<Plan>> getPlanAll() throws Exception {
        System.out.println("getPlanAll");
        return new ResponseEntity<>(planService.getPlanAll(), HttpStatus.OK);
    }
	
	@GetMapping("/detail/{planId}")
	public ResponseEntity<Plan> getPlanDetail(@PathVariable("planId") int planId) throws Exception {
		System.out.println("getPlanDetail");
		return new ResponseEntity<>(planService.getPlanDetail(planId), HttpStatus.OK);
	}
}
