package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Sido : 시도 정보", description = "시도 정보")
public class Sido {
    @ApiModelProperty(value = "시도 코드")
    private int sidoCode;
    @ApiModelProperty(value = "시도 이름")
    private String sidoName;

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

    public String getSidoName() {
        return sidoName;
    }

    public void setSidoName(String sidoName) {
        this.sidoName = sidoName;
    }
}
