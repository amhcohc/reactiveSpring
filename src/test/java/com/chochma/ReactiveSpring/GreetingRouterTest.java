package com.chochma.ReactiveSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Created by labong on 2018. 1. 2..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingRouterTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testHello() {
        webTestClient.get().uri("/hello").accept(MediaType.TEXT_PLAIN).exchange().expectStatus().isOk().expectBody().equals("Hello, Spring!");
    }
}
