package org.tundor.app.api.requests.user_requests;

import com.fasterxml.jackson.core.type.TypeReference;
import org.tundor.app.JsonUtils;
import org.tundor.data.DTOs.user_roles.StudentDTO;

public class StudentRequest extends BaseUserRequests<StudentDTO> {

    @Override
    public String getUserURL() {
        return "/students";
    }

    @Override
    public StudentDTO parseUser(String user) {
        TypeReference<? extends StudentDTO> student = new TypeReference<>() {
        };
        return JsonUtils.deserialize(user, student);
    }
}
