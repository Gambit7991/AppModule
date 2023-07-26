package org.tundor.app.flows.mapper_flow.user_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.AdminMapperFlowApp;
import org.tundor.app.flows.mapper_flow.data_mapper_flow.AdminMapperFlowData;
import org.tundor.data.DTOs.user_roles.AdminDTO;

public class AdminMapper extends BaseMapper<AdminDTO, AppAdminDTO> {
    @Override
    AdminMapperFlowData getDataMapper() {
        return new AdminMapperFlowData();
    }

    @Override
    AdminMapperFlowApp getAppMapper() {
        return new AdminMapperFlowApp();
    }
}
