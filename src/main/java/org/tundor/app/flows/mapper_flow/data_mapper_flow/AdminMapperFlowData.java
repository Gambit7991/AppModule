package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataAdminMapper;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataBaseMapper;
import org.tundor.data.DTOs.user_roles.AdminDTO;

public class AdminMapperFlowData extends DataBaseMapperFlow<AdminDTO, AppAdminDTO,
        AppDataBaseMapper<AdminDTO, AppAdminDTO>>
        {
    @Override
    public AppDataAdminMapper getMapperInterface() {
        return AppDataAdminMapper.INSTANCE;
    }
}
