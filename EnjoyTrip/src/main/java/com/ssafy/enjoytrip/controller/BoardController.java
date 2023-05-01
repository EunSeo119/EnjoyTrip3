package com.ssafy.enjoytrip.controller;

import java.time.LocalDate;
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

@RestController
@RequestMapping("/board")
@CrossOrigin("*")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        super();
        this.boardService = boardService;
    }

    @GetMapping("list")
    public ResponseEntity<List<Notice>> getNoticeAll() throws Exception {
        System.out.println("getNoticeAll");
        return new ResponseEntity<>(boardService.getNoticeAll(), HttpStatus.OK);
    }

    @PostMapping("regist")
    public ResponseEntity<?> registNotice(@RequestBody Notice notice) throws Exception {
        boardService.writeNotice(notice);
        return new ResponseEntity<>(notice, HttpStatus.OK);
    }

    @GetMapping("/detail/{noticeId}")
    public ResponseEntity<Notice> getNoticeDetail(@PathVariable("noticeId") int noticeId) throws Exception {
        System.out.println("getNoticeDetail");
        return new ResponseEntity<>(boardService.getNoticeDetail(noticeId), HttpStatus.OK);
    }

}
