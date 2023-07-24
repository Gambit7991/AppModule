package org.tundor.app.mappers.user_mappers.form_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;

@Mapper
public interface AppStudentFormMapper extends AppBaseMapper<AppStudentDTO> {
    AppStudentFormMapper INSTANCE = Mappers.getMapper(AppStudentFormMapper.class);

}
