package org.tundor.app.api.requests.user_requests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import org.tundor.app.api.ServiceApi;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public abstract class BaseUserRequests<User extends BaseUserDTO> extends ServiceApi {

    private final ObjectMapper jsonMapper = new ObjectMapper();

    public abstract User parseUser(String user);

    public SignUpForm createUser(SignUpForm form) {
        try {
            return given().spec(super.getRequestSpecification())
                    .body(jsonMapper.writeValueAsString(form))
                    .when().post("/create")
                    .then().statusCode(201)
                    .extract().jsonPath().getObject("", SignUpForm.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateUser(SignUpForm form, UUID id) {
        try {
            given().spec(super.getRequestSpecification())
                    .body(jsonMapper.writeValueAsString(form))
                    .when().pathParam("id", id).put("/update/{id}")
                    .then().statusCode(200);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public User findUserById(UUID id) {
        try {
            return parseUser(given()
                    .spec(super.getRequestSpecification())
                    .pathParam("id", id)
                    .get("/{id}")
                    .then()
                    .statusCode(200)
                    .contentType(ContentType.JSON)
                    .extract()
                    .response().asString());
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while fetching user by ID: " + id, e);
        }
    }
    //TODO : finish deleteById method

    public void deleteById(UUID id) {

    }
    //TODO : finish findAll method

//
//    public ArrayList<User> findAll(){
//        return
//    }


}
