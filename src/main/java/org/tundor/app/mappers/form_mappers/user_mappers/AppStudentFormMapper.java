package org.tundor.app.mappers.form_mappers.user_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;

@Mapper
public interface AppStudentFormMapper {
    AppStudentFormMapper INSTANCE = Mappers.getMapper(AppStudentFormMapper.class);

    AppStudentDTO toAppDTO(AppAccountInfo accountInfo);

    AppAccountInfo toForm(AppStudentDTO student);

}
