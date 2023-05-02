package com.ssafy.enjoytrip.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.model.Plan;
import com.ssafy.enjoytrip.model.Service.PlanService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/plan")
@CrossOrigin("*")
@Api(tags = "여행계획 관리")
public class PlanController {
	private final PlanService planService;

	public PlanController(PlanService planService) {
		this.planService = planService;
	}
	
	@ApiOperation(value= "여행계획등록", notes = "여행계획을 등록합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항목록 OK"), @ApiResponse(code = 500, message = "서버에러")})
	@PostMapping("regist")
	public ResponseEntity<?> registPlan(@RequestBody Plan plan) throws Exception {
		planService.registPlan(plan);
		return new ResponseEntity<>(plan, HttpStatus.OK);
	}
	
	@ApiOperation(value= "여행계획목록", notes = "여행계획의 전체 목록을 리턴합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "여행계획목록 OK"), @ApiResponse(code = 500, message = "서버에러")})
	@GetMapping("list")
    public ResponseEntity<List<Plan>> getPlanAll() throws Exception {
        System.out.println("getPlanAll");
        return new ResponseEntity<>(planService.getPlanAll(), HttpStatus.OK);
    }
	
	@ApiOperation(value= "여행계획 상세정보", notes = "여행계획의 상세정보를 리턴합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항목록 OK"), @ApiResponse(code = 500, message = "서버에러")})
	@GetMapping("/detail/{planId}")
	public ResponseEntity<Plan> getPlanDetail(@PathVariable("planId") int planId) throws Exception {
		System.out.println("getPlanDetail");
		return new ResponseEntity<>(planService.getPlanDetail(planId), HttpStatus.OK);
	}
	
	@ApiOperation(value= "여행계획 삭제", notes = "여행계획을 삭제합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항목록 OK"), @ApiResponse(code = 500, message = "서버에러")})
	@DeleteMapping("/delete/{planId}")
	public ResponseEntity<?> deletePlan(@PathVariable("planId") int planId) throws Exception {
		System.out.println("deletePlan");
		planService.deletePlan(planId);
		List<Plan> list = planService.getPlanAll();
		return new ResponseEntity<List<Plan>>(list, HttpStatus.OK);
	}
}
