package com.ssafy.enjoytrip.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PlanDescription : 여행계획 정보", description = "여행계획 정보")
public class Plan {
	@ApiModelProperty(value = "여행계획 아이디")
	private int planId;
	@ApiModelProperty(value = "여행계획 제목")
	private String title;
	@ApiModelProperty(value = "여행계획 시작일")
	private String startDate;
	@ApiModelProperty(value = "여행계획 종료일")
	private String endDate;
	@ApiModelProperty(value = "여행계획 세부설명")
	private String description;
	@ApiModelProperty(value = "여행계획 대표이미지")
	private String image;
	@ApiModelProperty(value = "여행계획 작성자")
	private String userId;
	@ApiModelProperty(value = "여행계획 여행지 리스트")
	private List<PlanTravel> planTravels;

	public List<PlanTravel> getPlanTravels() {
		return planTravels;
	}

	public void setPlanTravels(List<PlanTravel> planTravels) {
		this.planTravels = planTravels;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
