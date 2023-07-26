package org.tundor.app.api.user_tests;

import org.tundor.app.api.flows.TutorFlow;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.user_roles.TutorDTO;

import java.util.UUID;

public class TutorTests extends BaseUserTests<TutorDTO> {

    @Override
    public UUID getId() {
        return UUID.fromString("079efca5-b086-4310-a795-bf7d1562f9e9");
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
                .userType("TUTOR")
                .build();
    }

    @Override
    public TutorFlow getUserFlow() {
        return new TutorFlow();
    }

}
