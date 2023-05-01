package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TravelDescription : 여행지 정보", description = "여행지 정보")
public class TravelDescription {
    @ApiModelProperty(value = "여행지 설명 아이디")
    private int travelDescriptionId;
    @ApiModelProperty(value = "여행지 홈페이지")
    private String homepage;
    @ApiModelProperty(value = "여행지 설명")
    private String overview;
    @ApiModelProperty(value = "여행지 전화번호")
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