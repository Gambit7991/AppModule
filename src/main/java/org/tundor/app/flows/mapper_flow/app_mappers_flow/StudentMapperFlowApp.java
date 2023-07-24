package org.tundor.app.flows.mapper_flow.app_mappers_flow;

import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.mappers.user_mappers.form_mappers.AppStudentFormMapper;

public class StudentMapperFlowApp extends AppBaseMapperFlow<AppStudentDTO, AppStudentFormMapper> {
    @Override
    public AppStudentFormMapper getMapperInterface() {
        return AppStudentFormMapper.INSTANCE;
    }
}
