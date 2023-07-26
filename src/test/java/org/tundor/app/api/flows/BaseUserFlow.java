package org.tundor.app.api.flows;

import org.tundor.app.api.requests.user_requests.BaseUserRequests;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;

import java.util.UUID;

public abstract class BaseUserFlow<DataUser extends BaseUserDTO> {
    private final BaseUserRequests<DataUser> userRequests = getUserRequests();

    public abstract BaseUserRequests<DataUser> getUserRequests();

    public SignUpForm createUser(SignUpForm form) {
        return userRequests.createUser(form);
    }

    public UUID updateUser(SignUpForm form, UUID id) {
        DataUser retrievalDataUser = userRequests.findUserById(id);
        userRequests.updateUser(form, retrievalDataUser.getId());
        return retrievalDataUser.getId();
    }

    public DataUser findUserById(UUID id) {
        return userRequests.findUserById(id);
    }

    public void deleteUser(UUID id) {
        userRequests.deleteById(id);
    }

}
