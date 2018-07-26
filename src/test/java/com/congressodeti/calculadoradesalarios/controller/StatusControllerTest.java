package com.congressodeti.calculadoradesalarios.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StatusControllerTest {

    @Value("${local.server.port}")
    protected int serverPort;

    @Before
    public void iniciaTeste() {
        RestAssured.port = serverPort;
    }

    @Test
    public void quandoServidorEstaNoAREntaoRetornaOk() {
        RestAssured.given()
                .when()
                .get("/status")
                .then()
                .statusCode(200)
                .body("status", Matchers.equalTo("ok"));
    }

}