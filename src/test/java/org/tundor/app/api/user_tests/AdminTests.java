package org.tundor.app.api.user_tests;

import org.tundor.app.api.flows.AdminFlow;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.user_roles.AdminDTO;

import java.util.UUID;

public class AdminTests extends BaseUserTests<AdminDTO> {

    @Override
    public UUID getId() {
        return UUID.fromString("33daf252-8ca8-44fd-bf8c-1032e450daaa");
    }

    @Override
    public SignUpForm getSignUpForm() {
        return SignUpForm.builder()
                .firstName("John")
                .lastName("Doe")
                .email("johndoe@example.com")
                .password("secretpassword")
                .createdTime("2023-07-22T07:55:32")
                .birthday("1995-10-15")
                .gender("male")
                .phoneNumber("1234567890")
                .mainPicture("profile.jpg")
                .aptNum("3")
                .buildingNumber("2")
                .street("Main Street")
                .city("New York")
                .countryId("1")
                .postalCode("10001")
                .userType("ADMIN")
                .build();
    }

    @Override
    public AdminFlow getUserFlow() {
        return new AdminFlow();
    }

}
