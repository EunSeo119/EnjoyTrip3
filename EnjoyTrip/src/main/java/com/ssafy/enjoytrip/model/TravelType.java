package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TravelType : 여행지 타입 정보", description = "여행지 타입 정보")
public class TravelType {
    @ApiModelProperty(value = "여행지 타입 아이디")
    private int travelTypeId;
    @ApiModelProperty(value = "여행지 타입 이름")
    private String name;

    public int getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(int travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
