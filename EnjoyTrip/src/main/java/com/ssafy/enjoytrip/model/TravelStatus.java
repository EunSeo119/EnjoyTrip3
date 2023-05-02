package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TravelStatus : 여행지 상태 정보", description = "여행지 상태 정보")
public class TravelStatus {
    @ApiModelProperty(value = "여행지 상태 아이디")
    private int travelStatusId;
    @ApiModelProperty(value = "사용자 아이디")
    private String userId;
    @ApiModelProperty(value = "여행지 아이디")
    private int travelInfoId;
    @ApiModelProperty(value = "좋아요")
    private int like;
    @ApiModelProperty(value = "별점")
    private Double star;


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

    public Double getStar() {
        return star;
    }

    public void setStar(Double star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "TravelStatus{" + "travelStatusId=" + travelStatusId + ", userId='" + userId + '\'' + ", travelInfoId=" + travelInfoId + ", like=" + like + ", star=" + star + '}';
    }
}
