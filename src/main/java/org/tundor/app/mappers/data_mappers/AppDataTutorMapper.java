package org.tundor.app.mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.data.DTOs.user_roles.TutorDTO;

@Mapper
public interface AppDataTutorMapper {
    AppDataTutorMapper INSTANCE = Mappers.getMapper(AppDataTutorMapper.class);

    @Mapping(source = "tutor.info.loginInfoDTO", target = "info.loginInfo")
    @Mapping(source = "tutor.info.addressDTO", target = "info.address")
    @Mapping(source = "tutor.info.albumId", target = "info.album")
    @Mapping(source = "tutor.info.scheduleId", target = "info.schedule")
    @Mapping(source = "tutor.info.cardsId", target = "info.bankCards")
    @Mapping(source = "tutor.info.userTypeDTO", target = "info.userType")
    AppTutorDTO toAppDTO(TutorDTO tutor);

    @Mapping(target = "info.loginInfoDTO", source = "tutor.info.loginInfo")
    @Mapping(target = "info.addressDTO", source = "tutor.info.address")
    @Mapping(target = "info.albumId", source = "tutor.info.album")
    @Mapping(target = "info.scheduleId", source = "tutor.info.schedule")
    @Mapping(target = "info.cardsId", source = "tutor.info.bankCards")
    @Mapping(target = "info.userTypeDTO", source = "tutor.info.userType")
    TutorDTO toDataDTO(AppTutorDTO tutor);

}
