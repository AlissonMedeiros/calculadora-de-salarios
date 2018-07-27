package com.congressodeti.calculadoradesalarios.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculaControllerTest {

    @Value("${local.server.port}")
    protected int serverPort;

    @Before
    public void iniciaTeste() {
        RestAssured.port = serverPort;
    }

    @Test
    public void quandoRendaBrutal2000RetornaSalarioREal() {
        RestAssured.given()
                .body("2000")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .when()
                .post("/calcula")
                .then()
                .statusCode(200)
                .body("pj", Matchers.equalTo(1880.0F))
                .body("clt", Matchers.equalTo(1833.3334F));

    }
}