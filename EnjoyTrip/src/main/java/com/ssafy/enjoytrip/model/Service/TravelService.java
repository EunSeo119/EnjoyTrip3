package com.ssafy.enjoytrip.model.Service;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;

import java.util.List;

public interface TravelService {
    List<TravelInfo> getTravelAll() throws Exception;

    List<Gugun> getGugun(int sidoCode) throws Exception;

    List<TravelInfo> getTravel(int sidoCode) throws Exception;

    List<TravelInfo> getTravel(int sidoCode, int gugunCode) throws Exception;

    List<TravelInfo> getTravel(int sidoCode, int gugunCode, int travelTypeId) throws Exception;
}
