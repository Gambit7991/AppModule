package org.tundor.app.api.requests.user_requests;

import com.fasterxml.jackson.core.type.TypeReference;
import org.tundor.app.JsonUtils;
import org.tundor.data.DTOs.user_roles.TutorDTO;

public class TutorRequests extends BaseUserRequests<TutorDTO> {

    @Override
    public String getUserURL() {
        return "/tutors";
    }

    @Override
    public TutorDTO parseUser(String user) {
        TypeReference<? extends TutorDTO> tutor = new TypeReference<>() {
        };
        return JsonUtils.deserialize(user, tutor);
    }
}
