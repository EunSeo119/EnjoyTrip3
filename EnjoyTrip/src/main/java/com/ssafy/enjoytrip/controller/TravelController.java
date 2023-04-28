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

    @GetMapping("list")
    public ResponseEntity<List<TravelInfo>> getAttractionAll() throws Exception {
        return new ResponseEntity<>(travelService.getTravelAll(), HttpStatus.OK);
    }

    @GetMapping("/list/{sidoCode}")
    public ResponseEntity<List<TravelInfo>> getAttractionByArea(@PathVariable("sidoCode") int sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, -1, -1), HttpStatus.OK);
    }

    @GetMapping("/list/gugun/{sidoCode}")
    public ResponseEntity<List<Gugun>> getGugun(@PathVariable("sidoCode") int sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getGugun(sidoCode), HttpStatus.OK);
    }

    @GetMapping("/list/{sidoCode}/{gugunCode}")
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable("sidoCode") int sidoCode, @PathVariable("gugunCode") Integer gugunCode) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, -1), HttpStatus.OK);
    }


    @GetMapping("/list/{sidoCode}/{gugunCode}/{travelTypeId}")
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugunType(@PathVariable("sidoCode") Integer sidoCode, @PathVariable("gugunCode") int gugunCode, @PathVariable("travelTypeId") int travelTypeId) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, travelTypeId), HttpStatus.OK);
    }

    @PutMapping("status/like")
    public ResponseEntity<?> updateLike(@RequestBody Map<String, String> map) {
        TravelStatus travelStatus = travelService.getTravelStatus(map.get("userId"), Integer.valueOf(map.get("travelInfoId")));

        if (travelStatus == null) {
            travelService.registLike(map.get("userId"), Integer.parseInt(map.get("travelInfoId")));
            return new ResponseEntity<>("좋아요 성공", HttpStatus.OK);
        } else {
            System.out.println(travelStatus.getUserId());
            return new ResponseEntity<>(travelService.updateLike(travelStatus.getUserId(), travelStatus.getTravelInfoId(), travelStatus.getLike()), HttpStatus.OK);
        }
    }

    @PutMapping("status/star/{userId}")
    public ResponseEntity<?> updateStar(@PathVariable("userId") String userId, @RequestBody Map<String, Object> map) {
        TravelStatus travelStatus = travelService.getTravelStatus(userId, (Integer) map.get("travelInfoId"));

        if (travelStatus == null) {
            travelService.registStar(new TravelStatus(userId, (Integer) map.get("travelInfoId"), (Double) map.get("star")));
            return new ResponseEntity<>("별점 등록 성공", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(travelService.updateStar(travelStatus), HttpStatus.OK);
        }
    }
}