package org.thearchibold.cicdserver.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1")
public class IndexController {


    @GetMapping(value = "/welcome/{name}")
    public ResponseEntity index(
            @PathVariable("name")String name
    ){
        return ResponseEntity.ok().body("Welcome "+name);
    }

    @GetMapping(value = "/health")
    public ResponseEntity getHealth(){
        HashMap<Object, Object> health =  new HashMap<Object, Object>(1);
        health.put("status", "OK");
        return ResponseEntity.ok().body(health);
    }
}
