package org.tundor.app.mappers.user_mappers.form_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;

@Mapper
public interface AppAdminFormMapper extends AppBaseMapper<AppAdminDTO> {
    AppAdminFormMapper INSTANCE = Mappers.getMapper(AppAdminFormMapper.class);

}
