package com.ssafy.enjoytrip.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.model.Notice;
import com.ssafy.enjoytrip.model.Service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/board")
@CrossOrigin("*")
@Api(tags = "공지사항 관리")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        super();
        this.boardService = boardService;
    }

    @ApiOperation(value= "공지사항목록", notes = "공지사항의 전체 목록을 리턴합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항목록 OK"), @ApiResponse(code = 500, message = "서버에러")})
    @GetMapping("list")
    public ResponseEntity<List<Notice>> getNoticeAll() throws Exception {
        System.out.println("getNoticeAll");
        return new ResponseEntity<>(boardService.getNoticeAll(), HttpStatus.OK);
    }

    @ApiOperation(value= "공자사항등록", notes = "공지사항을 저장합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항등록 OK"), @ApiResponse(code = 500, message = "서버에러")})
    @PostMapping("regist")
    public ResponseEntity<?> registNotice(@RequestBody Notice notice) throws Exception {
        boardService.writeNotice(notice);
        return new ResponseEntity<>(notice, HttpStatus.OK);
    }

    @ApiOperation(value= "공자사항 상세정보", notes = "공지사항 상세 정보를 리턴합니다.")
	@ApiResponses({@ApiResponse(code = 200, message = "공지사항상세페이지 OK"), @ApiResponse(code = 500, message = "서버에러")})
    @GetMapping("/detail/{noticeId}")
    public ResponseEntity<Notice> getNoticeDetail(@PathVariable("noticeId") int noticeId) throws Exception {
        System.out.println("getNoticeDetail");
        return new ResponseEntity<>(boardService.getNoticeDetail(noticeId), HttpStatus.OK);
    }

}
