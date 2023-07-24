package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.data.DTOs.BaseUserDTO;

public interface DataMapperContract <DataUser extends BaseUserDTO, AppUser extends AppBaseUserDTO> {


    AppUser getAppDTO(DataUser dataDTO);

    DataUser getDataDTO(AppUser appDTO);
}
