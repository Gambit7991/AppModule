package org.tundor.app.mappers.user_mappers.form_mappers;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.DTOs.user_info.AppAccountInfo;

public interface AppBaseMapper<AppDTO extends AppBaseUserDTO>{

    @Mapping(target = "info", source = "form")
    AppDTO toAppDTO(AppAccountInfo form);

}
