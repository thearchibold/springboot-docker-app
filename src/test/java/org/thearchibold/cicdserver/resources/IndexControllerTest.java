package org.thearchibold.cicdserver.resources;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IndexControllerTest {

    @Autowired
    IndexController indexController;


    @Test
    void index() {
    }

    @Test
    void getHealth(){
        assertEquals(HttpStatus.OK, indexController.getHealth().getStatusCode());
    }
}