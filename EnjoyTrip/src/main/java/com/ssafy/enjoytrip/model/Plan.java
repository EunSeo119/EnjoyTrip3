package com.ssafy.enjoytrip.model;

import java.util.List;

public class Plan {
	private int planId;
	private String title;
	private String startDate;
	private String endDate;
	private String description;
	private String image;
	private String userId;
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
