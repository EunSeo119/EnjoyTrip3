package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Gugun : 구군", description = "구군 정보")
public class Gugun {
    @ApiModelProperty(value = "구군 코드")
    private int gugunCode;
    @ApiModelProperty(value = "구군 이름")
    private String gugunName;
    @ApiModelProperty(value = "시도 코드")
    private int sidoCode;

    public int getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(int gugunCode) {
        this.gugunCode = gugunCode;
    }

    public String getGugunName() {
        return gugunName;
    }

    public void setGugunName(String gugunName) {
        this.gugunName = gugunName;
    }

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

}
