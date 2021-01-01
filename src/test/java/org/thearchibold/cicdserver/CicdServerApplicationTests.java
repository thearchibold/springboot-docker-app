package org.thearchibold.cicdserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thearchibold.cicdserver.resources.IndexController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CicdServerApplicationTests {

    @Autowired
    private IndexController indexController;

    @Test
    void contextLoads() {
        assertThat(indexController).isNotNull();
    }

}
