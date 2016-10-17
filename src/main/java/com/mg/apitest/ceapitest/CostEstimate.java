package com.mg.apitest.ceapitest;

import com.jayway.restassured.module.jsv.JsonSchemaValidator;
import com.jayway.restassured.response.ValidatableResponse;
import com.mg.apitest.apihelpers.CeBaseTestScript;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by jaspreetwalia on 11/10/2016.
 */

public class CostEstimate extends CeBaseTestScript {

    @Test(description = "API request fails when null request ID is passed")
    public  void  testCEAPIWhenServiceIdIsNull() throws IOException {
        String testFileName = "costEstimationSIdNull.json";
        String jsonFile = loadJsonFile(testFileName);
                 given()
                         .header("Content-Type","application/json")
                         .body(jsonFile)
                 .when()
                         .post(ceAPIEndPoint)
                .then()
                         .body("status", equalTo("failure"))
                         .and().body("message",equalTo("Service ID cannot be null on any item inputs"))
                         .and().statusCode(400)
                         .log().all();
    }


    @Test(description = "API request succeeds  when not null request ID is passed")
    public  void  testCEAPIWhenServiceIdIsNotNull() throws IOException {
        String testFileName = "costEstimationSIdNotNull.json";
        String jsonFile = loadJsonFile(testFileName);

        given()
                .header("Content-Type","application/json")
                .body(jsonFile)
        .when()
                .post(ceAPIEndPoint)
        .then()
                .body("status", equalTo("success"))
                .and().statusCode(202)
                .log().all();
    }

    @Test(description = "API request succeeds  when not null request ID is passed")
    public  ValidatableResponse getLoginResponse() throws IOException {
        String testFileName = "costEstimationSIdNotNull.json";
        String jsonFile = loadJsonFile(testFileName);

        ValidatableResponse response =
                 given()
                    .header("Content-Type","application/json")
                    .body(jsonFile)
                .when()
                    .post(ceAPIEndPoint).then();
        response.log().all();
        return response;
    }

    @Test(description = "validated schema")
    public void testSchema() throws IOException
    {
       // String testFileName = "costEstimationSIdNotNull.json";
        String testFileName = "costEstimationSIdNull.json";
        String jsonFile = loadJsonFile(testFileName);
        given()
                .header("Content-Type","application/json")
                .body(jsonFile)
        .when()
                .post(ceAPIEndPoint)
        .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("ceschemavalidator/serviceIdSchema.json")).log().body();
        // json schema created using http://jsonschema.net/#/
    }
}
