package com.ssafy.enjoytrip.model;

public class TravelDescription {
	private int travelDescriptionId;
	private String homepage;
	private String overview;
	private String telname;

	public int getTravelDescriptionId() {
		return travelDescriptionId;
	}

	public void setTravelDescriptionId(int travelDescriptionId) {
		this.travelDescriptionId = travelDescriptionId;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getTelname() {
		return telname;
	}

	public void setTelname(String telname) {
		this.telname = telname;
	}

}