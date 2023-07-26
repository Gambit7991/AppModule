package org.tundor.app.api.flows;

import org.tundor.app.api.requests.user_requests.TutorRequests;
import org.tundor.data.DTOs.user_roles.TutorDTO;

public class TutorFlow extends BaseUserFlow<TutorDTO> {

    @Override
    public TutorRequests getUserRequests() {
        return new TutorRequests();
    }
}
