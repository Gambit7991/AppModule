package org.tundor.app.api.requests.user_requests;

import com.fasterxml.jackson.core.type.TypeReference;
import org.tundor.app.JsonUtils;
import org.tundor.data.DTOs.user_roles.AdminDTO;

public class AdminRequest extends BaseUserRequests<AdminDTO> {

    @Override
    public String getUserURL() {
        return "/admins";
    }

    @Override
    public AdminDTO parseUser(String user) {
        TypeReference<? extends AdminDTO> admin = new TypeReference<>() {
        };
        return JsonUtils.deserialize(user, admin);
    }
}
