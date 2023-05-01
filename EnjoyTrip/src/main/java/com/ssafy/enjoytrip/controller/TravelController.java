package com.ssafy.enjoytrip.controller;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.Service.TravelService;
import com.ssafy.enjoytrip.model.TravelInfo;
import com.ssafy.enjoytrip.model.TravelStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/travel")
@CrossOrigin("*")
public class TravelController {
    private final TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }


    @GetMapping({"list", "/list/{sidoCode}/{gugunCode}", "/list/{sidoCode}", "/list/{sidoCode}/{gugunCode}/{travelTypeId}"})
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable(value = "sidoCode", required = false) Integer sidoCode, @PathVariable(value = "gugunCode", required = false) Integer gugunCode, @PathVariable(value = "travelTypeId", required = false) Integer travelTypeId) throws Exception {
        if (sidoCode == null) return new ResponseEntity<>(travelService.getTravelAll(), HttpStatus.OK);
        else if (gugunCode == null)
            return new ResponseEntity<>(travelService.getTravel(sidoCode, null, null), HttpStatus.OK);
        else if (travelTypeId == null)
            return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, null), HttpStatus.OK);
        else return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, travelTypeId), HttpStatus.OK);
    }

    @GetMapping("/list/gugun/{sidoCode}")
    public ResponseEntity<List<Gugun>> getGugun(@PathVariable("sidoCode") int sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getGugun(sidoCode), HttpStatus.OK);
    }

    @PutMapping("status/like")
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