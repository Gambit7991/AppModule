package org.tundor.app.api.user_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tundor.app.api.BaseTests;
import org.tundor.app.api.flows.BaseUserFlow;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;

import java.util.UUID;

public abstract class BaseUserTests<DataUser extends BaseUserDTO> extends BaseTests {
    private SignUpForm form;
    BaseUserFlow<DataUser> userFlow = getUserFlow();

    //TODO: Temporary solution must be deleted
    public abstract UUID getId();

    @BeforeEach
    public void setup() {
        form = getSignUpForm();
    }

    public abstract SignUpForm getSignUpForm();

    public abstract BaseUserFlow<DataUser> getUserFlow();

    @Test
    public void createUserTest() {
        Assertions.assertEquals(userFlow.createUser(form), form);
    }

    @Test
    public void updateUserTest() {
        SignUpForm form1 = form;
        form1.setFirstName(UUID.randomUUID().toString());
        userFlow.updateUser(form, getId());
        Assertions.assertEquals(userFlow.findUserById(getId()).getInfo().getFirstName(), form.getFirstName());
    }

}
