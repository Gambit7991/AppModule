package org.tundor.app.flows.mapper_flow.data_mapper_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.mappers.user_mappers.data_mappers.AppDataBaseMapper;
import org.tundor.data.DTOs.BaseUserDTO;


public abstract class DataBaseMapperFlow<DataUser extends BaseUserDTO, AppUser extends AppBaseUserDTO> {

    /**
     * Mapper to map {@link BaseUserDTO} and {@link AppBaseUserDTO}
     */
    private final AppDataBaseMapper<DataUser, AppUser> mapper = getMapperInterface();

    /**
     * Provides required Mapper
     *
     * @return {@link AppDataBaseMapper}
     */
    abstract AppDataBaseMapper<DataUser, AppUser> getMapperInterface();

    /**
     * Transfers data from a {@link BaseUserDTO} object to an {@link AppBaseUserDTO} object.
     *
     * @param dataDTO The data object of type {@code DataUser} that extends {@link BaseUserDTO}.
     * @return An {@link AppUser} object that extends {@link AppBaseUserDTO}.
     */
    public AppUser getAppDTO(DataUser dataDTO) {
        return mapper.toAppDTO(dataDTO);
    }

    /**
     * Transfer data from {@link AppBaseUserDTO} object  to a {@link BaseUserDTO}
     *
     * @param appDTO The data object of type {@code AppUser} that extends {@link AppBaseUserDTO}
     * @return A {@link DataUser} object that extends {@link BaseUserDTO}.
     */
    public DataUser getDataDTO(AppUser appDTO) {
        return mapper.toDataDTO(appDTO);
    }


}
