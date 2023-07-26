package org.tundor.app.api.flows;

import org.tundor.app.api.requests.user_requests.AdminRequest;
import org.tundor.data.DTOs.user_roles.AdminDTO;

public class AdminFlow extends BaseUserFlow<AdminDTO> {

    @Override
    public AdminRequest getUserRequests() {
        return new AdminRequest();
    }
}
