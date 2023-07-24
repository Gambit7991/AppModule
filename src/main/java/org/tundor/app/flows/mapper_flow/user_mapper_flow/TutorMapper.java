package org.tundor.app.flows.mapper_flow.user_mapper_flow;

import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.TutorMapperFlowApp;
import org.tundor.app.flows.mapper_flow.data_mapper_flow.TutorMapperFlowData;
import org.tundor.data.DTOs.user_roles.TutorDTO;

public class TutorMapper extends BaseMapper<TutorDTO, AppTutorDTO, TutorMapperFlowData, TutorMapperFlowApp> {

    @Override
    TutorMapperFlowData getDataMapper() {
        return new TutorMapperFlowData();
    }

    @Override
    TutorMapperFlowApp getAppMapper() {
        return new TutorMapperFlowApp();
    }
}
