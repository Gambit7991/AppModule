package org.tundor.app.flows.mapper_flow.user_mapper_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.AppMapperContract;
import org.tundor.app.flows.mapper_flow.data_mapper_flow.DataMapperContract;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;

public abstract class BaseMapper<DataUser extends BaseUserDTO, AppUser extends AppBaseUserDTO,
        DataMapper extends DataMapperContract<DataUser, AppUser>,
        AppMapper extends AppMapperContract<AppUser>> {

    private final DataMapper dataMapper = getDataMapper();
    private final AppMapper appMapper = getAppMapper();

    abstract DataMapper getDataMapper();

    abstract AppMapper getAppMapper();


    public DataUser getDataDTO(AppUser user) {
        return dataMapper.getDataDTO(user);
    }

    public DataUser getDataDTO(SignUpForm form) {
        return dataMapper.getDataDTO(appMapper.getAppDTO(form));
    }

    public AppUser getAppDTO(DataUser user) {
        return dataMapper.getAppDTO(user);
    }

    public AppUser getAppDTO(SignUpForm form) {
        return appMapper.getAppDTO(form);
    }


}
