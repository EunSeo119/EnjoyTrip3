package com.ssafy.enjoytrip.model;

public class TravelStatus {
	private int travelStatusId;
	private String userId;
	private int travelInfoId;
	private int like;
	private double star;

	public int getTravelStatusId() {
		return travelStatusId;
	}

	public void setTravelStatusId(int travelStatusId) {
		this.travelStatusId = travelStatusId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getTravelInfoId() {
		return travelInfoId;
	}

	public void setTravelInfoId(int travelInfoId) {
		this.travelInfoId = travelInfoId;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

}
