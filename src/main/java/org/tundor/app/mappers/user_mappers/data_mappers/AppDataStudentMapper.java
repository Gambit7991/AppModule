package org.tundor.app.mappers.user_mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.data.DTOs.user_roles.StudentDTO;

@Mapper
public interface AppDataStudentMapper extends AppDataBaseMapper<StudentDTO, AppStudentDTO>{
    AppDataStudentMapper INSTANCE = Mappers.getMapper(AppDataStudentMapper.class);

}
