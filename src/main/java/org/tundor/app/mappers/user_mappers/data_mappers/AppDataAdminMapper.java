package org.tundor.app.mappers.user_mappers.data_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.data.DTOs.user_roles.AdminDTO;

@Mapper
public interface AppDataAdminMapper extends AppDataBaseMapper<AdminDTO, AppAdminDTO>{
    AppDataAdminMapper INSTANCE = Mappers.getMapper(AppDataAdminMapper.class);

}
