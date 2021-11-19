package com.hans.webflux_board_public.web;

import com.hans.webflux_board_public.annotation.Test;
import com.hans.webflux_board_public.dto.user.*;
import com.hans.webflux_board_public.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/all")
    @Test
    public Mono<?> findAllUser() {
        return userService.findAll();
    }

    @PostMapping("/add")
    public Mono<?> addUser(@RequestBody Mono<ReqAddUser> user) {
        return userService.addUser(user);
    }

    @PostMapping("/get")
    public Mono<?> findUser(@RequestBody Mono<ReqGetUser> req) {
        return userService.findByUid(req);
    }

    @PostMapping("/remove")
    public Mono<?> removeUser(@RequestBody Mono<ReqRemoveUser> req) {
        return userService.removeByUid(req);
    }

    @PostMapping("/edit")
    public Mono<?> editUser(@RequestBody Mono<ReqEditUser> req) {
        return userService.editUser(req);
    }

    @PostMapping("/sign-in")
    public Mono<?> signIn(@RequestBody Mono<ReqSignIn> req) {
        return userService.signIn(req);
    }

    @PostMapping("/sign-up")
    public Mono<?> signUp(@RequestBody Mono<ReqSignUp> req) {
        return userService.signUp(req);
    }

    @PostMapping("/disable")
    public Mono<?> disableUser(@RequestBody Mono<ReqRemoveUser> req) {
        return userService.disableUser(req);
    }
}
