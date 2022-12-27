package com.example.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    FetchDataService fetchDataService;
    @GetMapping(path = "getdata")
    List<UserModel> getUsers(){
        return fetchDataService.findAll();
    }
}
