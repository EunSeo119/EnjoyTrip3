package com.ssafy.enjoytrip.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.model.Notice;

@Mapper
public interface BoardMapper {
	
	List<Notice> selectGetAll() throws SQLException;

	void insertNotice(Notice notice);
	
	Notice selectGetDetail(int noticeId) throws SQLException;
	
	void updateViewCount(@Param("noticeId") int noticeId, @Param("viewCount") int viewCount);
	
	void modifyNotice(Notice notice);
}
