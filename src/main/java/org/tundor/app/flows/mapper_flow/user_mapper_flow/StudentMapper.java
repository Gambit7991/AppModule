package org.tundor.app.flows.mapper_flow.user_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.StudentMapperFlowApp;
import org.tundor.app.flows.mapper_flow.data_mapper_flow.StudentMapperFlowData;
import org.tundor.data.DTOs.user_roles.StudentDTO;

public class StudentMapper extends BaseMapper<StudentDTO, AppStudentDTO, StudentMapperFlowData, StudentMapperFlowApp> {

    @Override
    StudentMapperFlowData getDataMapper() {
        return new StudentMapperFlowData();
    }

    @Override
    StudentMapperFlowApp getAppMapper() {
        return new StudentMapperFlowApp();
    }
}
