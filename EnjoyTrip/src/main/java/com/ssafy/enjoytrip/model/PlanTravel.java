package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PlanTravelDescription : 여행계획의 여행지 정보", description = "여행계획의 여행지 정보")
public class PlanTravel {
	@ApiModelProperty(value = "여행지의 여행계획 아이디")
	private int planId;
	@ApiModelProperty(value = "여행지 아이디")
	private int travelInfoId;
	@ApiModelProperty(value = "여행지의 순서")
	private int no;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getTravelInfoId() {
		return travelInfoId;
	}

	public void setTravelInfoId(int travelInfoId) {
		this.travelInfoId = travelInfoId;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}