package com.ssafy.enjoytrip.controller;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.Service.TravelService;
import com.ssafy.enjoytrip.model.TravelInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        System.out.println("getAttractionAll");
        return new ResponseEntity<>(travelService.getTravelAll(), HttpStatus.OK);
    }

    @GetMapping("/list/{sidoCode}")
    public ResponseEntity<List<TravelInfo>> getAttractionByArea(@PathVariable("sidoCode") int sidoCode) throws Exception {
        System.out.println(sidoCode);
        return new ResponseEntity<>(travelService.getTravel(sidoCode, -1, -1), HttpStatus.OK);
    }

    @GetMapping("/list/gugun/{sidoCode}")
    public ResponseEntity<List<Gugun>> getGugun(@PathVariable("sidoCode") int sidoCode) throws Exception {
        return new ResponseEntity<>(travelService.getGugun(sidoCode), HttpStatus.OK);
    }

    @GetMapping("/list/{sidoCode}/{gugunCode}")
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugun(@PathVariable("sidoCode") int sidoCode, @PathVariable("gugunCode") Integer gugunCode) throws Exception {
        System.out.println(sidoCode);
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, -1), HttpStatus.OK);
    }


    @GetMapping("/list/{sidoCode}/{gugunCode}/{travelTypeId}")
    public ResponseEntity<List<TravelInfo>> getAttractionByAreaGugunType(@PathVariable("sidoCode") Integer sidoCode, @PathVariable("gugunCode") int gugunCode, @PathVariable("travelTypeId") int travelTypeId) throws Exception {
        return new ResponseEntity<>(travelService.getTravel(sidoCode, gugunCode, travelTypeId), HttpStatus.OK);
    }
}
