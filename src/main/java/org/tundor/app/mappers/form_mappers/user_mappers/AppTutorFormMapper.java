package org.tundor.app.mappers.form_mappers.user_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;

@Mapper
public interface AppTutorFormMapper {
    AppTutorFormMapper INSTANCE = Mappers.getMapper(AppTutorFormMapper.class);

    AppTutorDTO toAppDTO(AppAccountInfo accountInfo);

    AppAccountInfo toForm(AppTutorDTO tutor);

}
