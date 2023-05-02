package com.ssafy.enjoytrip.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;
import com.ssafy.enjoytrip.model.TravelStatus;
import com.ssafy.enjoytrip.model.Service.TravelService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Parameters;

@RestController
@RequestMapping("/travel")
@CrossOrigin("*")
@Api(tags = "여행지 관리")
public class TravelController {
    private final TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }


//    @GetMapping({"/list/{sidoCode}/{gugunCode}", "/list/{sidoCode}/{gugunCode}/{travelTypeId}"})
//    @ApiOperation(value = "여행지 정보 조회", notes = "여행지 정보를 조회한다.")
//    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
//    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable(value = "sidoCode", required = false) Integer sidoCode, @PathVariable(value = "gugunCode", required = false) Integer gugunCode, @PathVariable(value = "travelTypeId", required = false) Integer travelTypeId) throws Exception {
//        if (sidoCode == null) return new ResponseEntity<>(travelService.getTravelAll(), HttpStatus.OK);
//        else if (gugunCode == null)
//            return new ResponseEntity<>(travelService.getTravel(sidoCode, null, null), HttpStatus.OK);
//        else if (travelTypeId == null)
//            return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, null), HttpStatus.OK);
//        else return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, travelTypeId), HttpStatus.OK);
//    }

    @GetMapping({"/list/{sidoCode}/{gugunCode}/{travelTypeId}"})
    @ApiOperation(value = "여행지 정보 조회", notes = "여행지 정보를 조회한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@Nullable @PathVariable(value = "sidoCode", required = false) Integer sidoCode, @PathVariable("gugunCode") Integer gugunCode, @PathVariable("travelTypeId") Integer travelTypeId) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, travelTypeId), HttpStatus.OK);
    }

    @GetMapping({"/list/{sidoCode}/{gugunCode}"})
    @ApiOperation(value = "여행지 정보 조회", notes = "여행지 정보를 조회한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable(value = "sidoCode", required = false) Integer sidoCode, @PathVariable(value = "gugunCode", required = false) Integer gugunCode) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, null), HttpStatus.OK);
    }

    @GetMapping("/list/{sidoCode}")
    @ApiOperation(value = "여행지 정보 조회", notes = "여행지 정보를 조회한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable(value = "sidoCode", required = false) Integer sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, null, null), HttpStatus.OK);
    }

    @GetMapping("/list")
    @ApiOperation(value = "여행지 정보 조회", notes = "여행지 정보를 조회한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun() throws Exception {
        return new ResponseEntity<>(travelService.getTravelAll(), HttpStatus.OK);
    }

    @GetMapping("/list/gugun/{sidoCode}")
    @ApiOperation(value = "구군 정보 조회", notes = "구군 정보를 조회한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    @Parameters({@io.swagger.v3.oas.annotations.Parameter(name = "sidoCode", description = "시도 코드", required = true)})
    public ResponseEntity<List<Gugun>> getGugun(@PathVariable("sidoCode") int sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getGugun(sidoCode), HttpStatus.OK);
    }

    @PutMapping("status/like")
    @ApiOperation(value = "좋아요 정보 수정", notes = "좋아요 정보를 수정한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    @Parameters({@io.swagger.v3.oas.annotations.Parameter(name = "userId", description = "유저 아이디", required = true), @io.swagger.v3.oas.annotations.Parameter(name = "travelInfoId", description = "여행지 아이디", required = true)})
    public ResponseEntity<?> updateLike(@RequestBody TravelStatus param) {
        TravelStatus travelStatus = travelService.getTravelStatus(param);
        if (travelStatus == null) {
            travelService.registLike(param);
            return new ResponseEntity<>("좋아요 성공", HttpStatus.OK);
        } else {
            if (travelService.updateLike(travelStatus.getUserId(), travelStatus.getTravelInfoId(), travelStatus.getLike()) == 1)
                return new ResponseEntity<>("좋아요 성공", HttpStatus.OK);
            else {
                return new ResponseEntity<>("좋아요 실패", HttpStatus.BAD_REQUEST);
            }
        }
    }

    @PutMapping("status/star")
    @ApiOperation(value = "별점 정보 수정", notes = "별점 정보를 수정한다.")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "OK"), @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"), @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error")})
    @Parameters({@io.swagger.v3.oas.annotations.Parameter(name = "userId", description = "유저 아이디", required = true), @io.swagger.v3.oas.annotations.Parameter(name = "travelInfoId", description = "여행지 아이디", required = true)})
    public ResponseEntity<?> updateStar(@RequestBody TravelStatus param) {
        TravelStatus travelStatus = travelService.getTravelStatus(param);
        if (travelStatus == null) {
            travelService.registStar(param);
            return new ResponseEntity<>("별점 등록 성공", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(travelService.updateStar(param), HttpStatus.OK);
        }
    }
}