package org.tundor.app.mappers.user_mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.data.DTOs.user_roles.TutorDTO;

@Mapper
public interface AppDataTutorMapper extends AppDataBaseMapper<TutorDTO, AppTutorDTO>{
    AppDataTutorMapper INSTANCE = Mappers.getMapper(AppDataTutorMapper.class);

}
