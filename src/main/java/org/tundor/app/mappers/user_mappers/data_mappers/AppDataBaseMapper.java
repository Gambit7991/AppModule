package org.tundor.app.mappers.user_mappers.data_mappers;

import org.mapstruct.Mapping;
import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.data.DTOs.BaseUserDTO;

public interface AppDataBaseMapper<DataDTO extends BaseUserDTO, AppDTO extends AppBaseUserDTO> {

    @Mapping(source = "dataDTO.info.loginInfoDTO", target = "info.loginInfo")
    @Mapping(source = "dataDTO.info.addressDTO", target = "info.address")
    @Mapping(source = "dataDTO.info.albumId", target = "info.album")
    @Mapping(source = "dataDTO.info.scheduleId", target = "info.schedule")
    @Mapping(source = "dataDTO.info.cardsId", target = "info.bankCards")
    @Mapping(source = "dataDTO.info.userTypeDTO", target = "info.userType")
    AppDTO toAppDTO(DataDTO dataDTO);

    @Mapping(target = "info.loginInfoDTO", source = "appDTO.info.loginInfo")
    @Mapping(target = "info.addressDTO", source = "appDTO.info.address")
    @Mapping(target = "info.albumId", source = "appDTO.info.album")
    @Mapping(target = "info.scheduleId", source = "appDTO.info.schedule")
    @Mapping(target = "info.cardsId", source = "appDTO.info.bankCards")
    @Mapping(target = "info.userTypeDTO", source = "appDTO.info.userType")
    DataDTO toDataDTO(AppDTO appDTO);
}
