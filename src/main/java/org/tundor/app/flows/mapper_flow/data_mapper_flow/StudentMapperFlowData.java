package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataBaseMapper;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataStudentMapper;
import org.tundor.data.DTOs.user_roles.StudentDTO;

public class StudentMapperFlowData extends DataBaseMapperFlow<StudentDTO, AppStudentDTO,
        AppDataBaseMapper<StudentDTO, AppStudentDTO>> {
    @Override
    public AppDataStudentMapper getMapperInterface() {
        return AppDataStudentMapper.INSTANCE;
    }
}
