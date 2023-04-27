package com.ssafy.enjoytrip.model.Service;

import com.ssafy.enjoytrip.model.Gugun;
import com.ssafy.enjoytrip.model.TravelInfo;
import com.ssafy.enjoytrip.model.mapper.TravelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {

    private final TravelMapper travelMapper;

    public TravelServiceImpl(TravelMapper travelMapper) {
        this.travelMapper = travelMapper;
    }

    @Override
    public List<TravelInfo> getTravelAll() throws Exception {
        return travelMapper.selectGetAll();
    }

    @Override
    public List<Gugun> getGugun(int sidoCode) throws Exception {
        return travelMapper.selectBySidoCode(sidoCode);
    }

    @Override
    public List<TravelInfo> getTravel(int sidoCode) throws Exception {
        return travelMapper.selectBySidoCodeGugunCode(sidoCode);
    }

    @Override
    public List<TravelInfo> getTravel(int sidoCode, int gugunCode) throws Exception {
        return travelMapper.selectBySidoCodeGugunCode(sidoCode, gugunCode);
    }

    @Override
    public List<TravelInfo> getTravel(int sidoCode, int gugunCode, int travelTypeId) throws Exception {
        return travelMapper.selectBySidoCodeGugunCode(sidoCode, gugunCode, travelTypeId);
    }
}
