package org.tundor.app.api.user_tests;


import org.tundor.app.api.flows.StudentFlow;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.user_roles.StudentDTO;

import java.util.UUID;

public class StudentTests extends BaseUserTests<StudentDTO> {
    @Override
    public UUID getId() {
        return UUID.fromString("0deca014-0fa7-4990-bf99-a854ac21c998");
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
                .userType("STUDENT")
                .build();
    }

    @Override
    public StudentFlow getUserFlow() {
        return new StudentFlow();
    }

}
