package org.tundor.app.api.flows;

import org.tundor.app.api.requests.user_requests.StudentRequest;
import org.tundor.data.DTOs.user_roles.StudentDTO;

public class StudentFlow extends BaseUserFlow<StudentDTO> {

    @Override
    public StudentRequest getUserRequests() {
        return new StudentRequest();
    }
}
