package com.ssafy.enjoytrip.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User : 사용자 정보", description = "사용자 정보")
public class User {
    @ApiModelProperty(value = "사용자 아이디", example = "ssafy")
    private String userId;
    @ApiModelProperty(value = "사용자 비밀번호")
    private String password;
    @ApiModelProperty(value = "사용자 이름")
    private String name;
    @ApiModelProperty(value = "사용자 이메일")
    private String email;
    @ApiModelProperty(value = "사용자 시도코드")
    private int sidoCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sidoCode=" + sidoCode +
                '}';
    }
}
