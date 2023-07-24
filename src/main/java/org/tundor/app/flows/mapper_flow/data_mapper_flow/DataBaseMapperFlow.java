package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataBaseMapper;
import org.tundor.data.DTOs.BaseUserDTO;


public abstract class DataBaseMapperFlow<DataUser extends BaseUserDTO, AppUser extends AppBaseUserDTO,
        Mapper extends AppDataBaseMapper<DataUser, AppUser>> implements DataMapperContract<DataUser, AppUser>{

    private final Mapper mapper = getMapperInterface();

    /**
     * Provides Interface Mapper
     *
     * @return AppBaseMapper form to app
     */
    abstract Mapper getMapperInterface();

    /**
     * Transfer data from Data layer DTO to the App layer DTO
     *
     * @param dataDTO -> is a DTO from a Data layer
     * @return AppUser -> extends AppBaseUserDTO class
     */
    public AppUser getAppDTO(DataUser dataDTO) {
        return mapper.toAppDTO(dataDTO);
    }

    /**
     * Transfer data from App layer DTO to the Data layer DTO
     *
     * @param appDTO -> is a DTO from an App layer
     * @return DataUser -> extends BaseUserDTO class
     */
    public DataUser getDataDTO(AppUser appDTO) {
        return mapper.toDataDTO(appDTO);
    }


}
