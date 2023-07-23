package org.tundor.app.mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.data.DTOs.user_roles.StudentDTO;

@Mapper
public interface AppDataStudentMapper {
    AppDataStudentMapper INSTANCE = Mappers.getMapper(AppDataStudentMapper.class);

    @Mapping(source = "student.info.loginInfoDTO", target = "info.loginInfo")
    @Mapping(source = "student.info.addressDTO", target = "info.address")
    @Mapping(source = "student.info.albumId", target = "info.album")
    @Mapping(source = "student.info.scheduleId", target = "info.schedule")
    @Mapping(source = "student.info.cardsId", target = "info.bankCards")
    @Mapping(source = "student.info.userTypeDTO", target = "info.userType")
    AppStudentDTO toAppDTO(StudentDTO student);


    @Mapping(target = "info.loginInfoDTO", source = "student.info.loginInfo")
    @Mapping(target = "info.addressDTO", source = "student.info.address")
    @Mapping(target = "info.albumId", source = "student.info.album")
    @Mapping(target = "info.scheduleId", source = "student.info.schedule")
    @Mapping(target = "info.cardsId", source = "student.info.bankCards")
    @Mapping(target = "info.userTypeDTO", source = "student.info.userType")
    StudentDTO toDataDTO(AppStudentDTO student);


}
