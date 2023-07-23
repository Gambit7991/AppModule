package org.tundor.app.mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.data.DTOs.user_roles.AdminDTO;

@Mapper
public interface AppDataAdminMapper {
    AppDataAdminMapper INSTANCE = Mappers.getMapper(AppDataAdminMapper.class);

    @Mapping(source = "admin.info.loginInfoDTO", target = "info.loginInfo")
    @Mapping(source = "admin.info.addressDTO", target = "info.address")
    @Mapping(source = "admin.info.albumId", target = "info.album")
    @Mapping(source = "admin.info.scheduleId", target = "info.schedule")
    @Mapping(source = "admin.info.cardsId", target = "info.bankCards")
    @Mapping(source = "admin.info.userTypeDTO", target = "info.userType")
    AppAdminDTO toAppDTO(AdminDTO admin);

    @Mapping(target = "info.loginInfoDTO", source = "admin.info.loginInfo")
    @Mapping(target = "info.addressDTO", source = "admin.info.address")
    @Mapping(target = "info.albumId", source = "admin.info.album")
    @Mapping(target = "info.scheduleId", source = "admin.info.schedule")
    @Mapping(target = "info.cardsId", source = "admin.info.bankCards")
    @Mapping(target = "info.userTypeDTO", source = "admin.info.userType")
    AdminDTO toDataDTO(AppAdminDTO admin);
}
