package org.tundor.app.mappers.form_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppLoginInfo;
import org.tundor.app.forms.SignUpForm;

@Mapper
public interface LoginFormMapper {
    LoginFormMapper INSTANCE = Mappers.getMapper(LoginFormMapper.class);

    /**
     * toAppDTO takes data from form and transfer it to the AppLoginInfo
     * @param form -> sign up form received from the user
     * @return AppLoginInfo mapped from form
     */
    AppLoginInfo toAppDTO(SignUpForm form);

    /**
     * DTOToForm takes the data from AppLoginInfo and transfer it to the SignUpForm
     * @param form -> login info received from backend
     * @return SignUpForm mapped from received address
     */
    SignUpForm DTOToForm(AppLoginInfo form);
}
