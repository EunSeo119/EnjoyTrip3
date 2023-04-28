package com.ssafy.enjoytrip.model.Service;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;
import com.ssafy.enjoytrip.model.TravelStatus;

import java.util.List;

public interface TravelService {
    List<TravelInfo> getTravelAll() throws Exception;

    List<Gugun> getGugun(int sidoCode) throws Exception;

    List<TravelInfo> getTravel(Integer sidoCode, Integer gugunCode, Integer travelTypeId) throws Exception;

    int updateLike(String userId, Integer travelInfoId, Integer like);

    TravelStatus getTravelStatus(TravelStatus travelStatus);

    void registLike(TravelStatus travelStatus);

    void registStar(TravelStatus travelStatus);

    int updateStar(TravelStatus travelStatus);
}
