package org.tundor.app.mappers.form_mappers.info_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppLoginInfo;
import org.tundor.app.forms.SignUpForm;

@Mapper
public interface LoginFormMapper {
    LoginFormMapper INSTANCE = Mappers.getMapper(LoginFormMapper.class);

    AppLoginInfo toAppDTO(SignUpForm form);

    SignUpForm DTOtoForm(AppLoginInfo form);
}
