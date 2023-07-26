package org.tundor.app.flows.mapper_flow.app_mappers_flow;

import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.mappers.user_mappers.form_mappers.AppAdminFormMapper;

public class AdminMapperFlowApp extends AppBaseMapperFlow<AppAdminDTO> {
    @Override
    public AppAdminFormMapper getMapper() {
        return AppAdminFormMapper.INSTANCE;
    }
}
