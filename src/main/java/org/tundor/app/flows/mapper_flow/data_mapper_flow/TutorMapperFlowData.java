package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataTutorMapper;
import org.tundor.data.DTOs.user_roles.TutorDTO;

public class TutorMapperFlowData extends DataBaseMapperFlow<TutorDTO, AppTutorDTO> {
    @Override
    public AppDataTutorMapper getMapperInterface() {
        return AppDataTutorMapper.INSTANCE;
    }
}
