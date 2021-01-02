package org.thearchibold.cicdserver.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        health.put("status", "working");
        return ResponseEntity.ok().body(health);
    }

    @PutMapping(value = "/update-health")
    public ResponseEntity updateHealth(){
        return ResponseEntity.ok().body("Health is updated");
    }

}
