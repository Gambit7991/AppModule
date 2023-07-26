package org.tundor.app.flows.mapper_flow.app_mappers_flow;

import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.mappers.user_mappers.form_mappers.AppTutorFormMapper;

public class TutorMapperFlowApp extends AppBaseMapperFlow<AppTutorDTO> {
    @Override
    public AppTutorFormMapper getMapper() {
        return AppTutorFormMapper.INSTANCE;
    }
}
