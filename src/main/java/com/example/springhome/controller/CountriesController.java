package com.example.springhome.controller;

import com.example.springhome.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/countries")
public class CountriesController {

    @Autowired
    MainService service;

    @GetMapping("/findEnemyFriendNeutral")
    public String findEnemyFriendNeutral(@RequestParam("a") String aa, @RequestParam("b") String bb) {
        return service.findEnemyFriendNeutral(aa, bb);
    }

    @GetMapping("/findContinent")
    public String findContinent(@RequestParam("a") String aa) {
        return service.findContinent(aa);
    }

}

