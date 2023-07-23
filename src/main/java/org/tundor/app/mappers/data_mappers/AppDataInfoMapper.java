package org.tundor.app.mappers.data_mappers;

import org.domain.models.userRoles.accountInformation.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.data.DTOs.UserInfoDTO;

@Mapper
public interface AppDataInfoMapper {

    AppDataInfoMapper INSTANCE = Mappers.getMapper(AppDataInfoMapper.class);


    UserInfo toDomain (UserInfoDTO userInfo);

    UserInfoDTO toDTO (UserInfo userInfo);

}
