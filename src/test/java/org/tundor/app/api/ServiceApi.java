package org.tundor.app.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Data;

@Data
public abstract class ServiceApi {
    private final RequestSpecification requestSpecification;

    public abstract String getUserURL();

    public ServiceApi(){
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://localhost/")
                .setPort(8080)
                .setBasePath(getUserURL())
                .setContentType(ContentType.JSON)
                .build();
    }

}
