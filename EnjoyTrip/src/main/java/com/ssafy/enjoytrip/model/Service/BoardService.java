package com.ssafy.enjoytrip.model.Service;

import java.util.List;

import com.ssafy.enjoytrip.model.Notice;

public interface BoardService {
	List<Notice> getNoticeAll() throws Exception;
	
	void writeNotice(Notice notice);
	
	Notice getNoticeDetail(int noticeId) throws Exception;
	
	void modifyNotice(Notice notice);
}
