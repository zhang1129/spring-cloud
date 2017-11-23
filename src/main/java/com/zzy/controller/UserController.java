package com.zzy.controller;

import com.zzy.dao.UserRepository;
import com.zzy.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/23.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/simple/{id}") //http://localhost:8001/simple/1
    public UserDTO findByid(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }


}
