package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TravelInfo : 여행지 정보", description = "여행지 정보")
public class TravelInfo {
    @ApiModelProperty(value = "여행지 아이디")
    private int travelInfoId;
    @ApiModelProperty(value = "여행지 타입 아이디")
    private int travelTypeId;
    @ApiModelProperty(value = "여행지 이름")
    private String title;
    @ApiModelProperty(value = "여행지 주소")
    private String addr1;
    @ApiModelProperty(value = "여행지 상세주소")
    private String addr2;
    @ApiModelProperty(value = "여행지 우편번호")
    private int zipcode;
    @ApiModelProperty(value = "여행지 전화번호")
    private String tel;
    @ApiModelProperty(value = "여행지 이미지")
    private String firstImage;
    @ApiModelProperty(value = "여행지 이미지2")
    private String firstImage2;
    @ApiModelProperty(value = "여행지 조회수")
    private int readcount;
    @ApiModelProperty(value = "여행지 시도코드")
    private int sidoCode;
    @ApiModelProperty(value = "여행지 구군코드")
    private int gugunCode;
    @ApiModelProperty(value = "여행지 위도")
    private double latitude;
    @ApiModelProperty(value = "여행지 경도")
    private double longitude;
    @ApiModelProperty(value = "여행지 레벨")
    private int mlevel;

    public int getTravelInfoId() {
        return travelInfoId;
    }

    public void setTravelInfoId(int travelInfoId) {
        this.travelInfoId = travelInfoId;
    }

    public int getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(int travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getFirstImage2() {
        return firstImage2;
    }

    public void setFirstImage2(String firstImage2) {
        this.firstImage2 = firstImage2;
    }

    public int getReadcount() {
        return readcount;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

    public int getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(int gugunCode) {
        this.gugunCode = gugunCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getMlevel() {
        return mlevel;
    }

    public void setMlevel(int mlevel) {
        this.mlevel = mlevel;
    }

}