package org.tundor.app.mappers.form_mappers.user_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.forms.SignUpForm;

@Mapper
public interface AppAdminFormMapper {
    AppAdminFormMapper INSTANCE = Mappers.getMapper(AppAdminFormMapper.class);

    AppAdminDTO toAppDTO(AppAccountInfo accountInfo);

    SignUpForm toForm(AppAdminDTO admin);
}
