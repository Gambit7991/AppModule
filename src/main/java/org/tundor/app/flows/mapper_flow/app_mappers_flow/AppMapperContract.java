package org.tundor.app.flows.mapper_flow.app_mappers_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.forms.SignUpForm;

public interface AppMapperContract <User extends AppBaseUserDTO> {

    User getAppDTO(SignUpForm signUpForm);
}
