package org.tundor.app.mappers.user_mappers.form_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;

@Mapper
public interface AppTutorFormMapper extends AppBaseMapper<AppTutorDTO> {
    AppTutorFormMapper INSTANCE = Mappers.getMapper(AppTutorFormMapper.class);

}
