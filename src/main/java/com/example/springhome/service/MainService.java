package com.example.springhome.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {


    public String findEnemyFriendNeutral(String aa, String bb) {
        if (aa.equalsIgnoreCase("Armenia") || bb.equalsIgnoreCase("Armenia")) {
            return "Enemy";

        } else if (aa.equalsIgnoreCase("Turkey") || bb.equalsIgnoreCase("Turkey")) {
            return "Friend";

        } else if (aa.equalsIgnoreCase("USA") || bb.equalsIgnoreCase("USA")) {
            return "Neutral";

        } else  return "friend";
    }


    public String findContinent (String aa){
        if (aa.equalsIgnoreCase("Armenia")){
            return "Asia";
        } else if (aa.equalsIgnoreCase("Germany")) {
            return "Europe";
        } else if (aa.equalsIgnoreCase("USA")) {
            return "North America";
            
        } else  return "Utopia";



    }
}

