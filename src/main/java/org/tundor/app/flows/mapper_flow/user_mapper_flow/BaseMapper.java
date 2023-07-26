package org.tundor.app.flows.mapper_flow.user_mapper_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.AppBaseMapperFlow;
import org.tundor.app.flows.mapper_flow.data_mapper_flow.DataBaseMapperFlow;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;

import java.util.Optional;

public abstract class BaseMapper<DataUser extends BaseUserDTO, AppUser extends AppBaseUserDTO> {

    private final DataBaseMapperFlow<DataUser, AppUser> dataMapper = getDataMapper();
    private final AppBaseMapperFlow<AppUser> appMapper = getAppMapper();

    abstract DataBaseMapperFlow<DataUser, AppUser> getDataMapper();

    abstract AppBaseMapperFlow<AppUser> getAppMapper();


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

    //TODO: Finish next method!
    public <User extends BaseUserDTO> Optional<User> getDataDTO(String responseString) {
        return null;
    }
//TODO: Finish next method!

    public SignUpForm getForm(DataUser user) {

        return new SignUpForm();
    }
//TODO: Finish next method!

    public SignUpForm getForm(AppUser user) {

        return new SignUpForm();
    }

}
