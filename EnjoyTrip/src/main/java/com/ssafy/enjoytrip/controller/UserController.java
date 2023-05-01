package com.ssafy.enjoytrip.controller;

import com.ssafy.enjoytrip.model.Service.UserService;
import com.ssafy.enjoytrip.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("login")
    public String login() {
        return "user/login";
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody User user, Model model) throws Exception {
        System.out.println(user);
        User login = userService.login(user);

        if (login != null) {
            return new ResponseEntity<>(login, HttpStatus.OK);
        } else {
            model.addAttribute("msg", "아이디 또는 비밀번호를 확인 후 다시 로그인하세요.");
            return new ResponseEntity<>(model, HttpStatus.OK);
        }
    }

    //    @GetMapping(value = "/join")
//    public String join() {
//        return "user/join";
//    }
//
    @PostMapping("join")
    public ResponseEntity<?> join(@RequestBody User user) throws Exception {
        userService.join(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("mypage/{userId}")
    public ResponseEntity<?> mypage(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(userService.selectUserDetail(userId), HttpStatus.OK);
    }

    @GetMapping("findPassword")
    public String findPassword() {
        return "user/findPw";
    }

    @GetMapping("user")
    public ResponseEntity<?> userList() {
        List<User> list = userService.userList();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}