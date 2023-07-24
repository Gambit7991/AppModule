package org.tundor.app.flows.mapper_flow.app_mappers_flow;

import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.mappers.form_mappers.AccountInfoFormMapper;
import org.tundor.app.mappers.form_mappers.AddressFormMapper;
import org.tundor.app.mappers.form_mappers.LoginFormMapper;
import org.tundor.app.mappers.user_mappers.form_mappers.AppBaseMapper;
import org.tundor.app.forms.SignUpForm;


public abstract class AppBaseMapperFlow<User extends AppBaseUserDTO, Mapper extends AppBaseMapper<User>> implements AppMapperContract<User>{

    private final Mapper mapper = getMapperInterface();

    /**
     * Provides Interface Mapper
     * @return AppBaseMapper form to app
     */
    abstract Mapper getMapperInterface();

    /**
     * Transfer data from form to the App layer DTO
     * Uses getAppAccountInfo to map SignUpForm to AppAccountInfo that needs to create a User
     * @param form -> is a signup form received from the web page
     * @return User -> extends AppBaseUserDTO class and parent of user_roles classes
     */
    public User getAppDTO(SignUpForm form) {
        return mapper.toAppDTO(getAppAccountInfo(form));
    }

    /**
     * Transfer data from form to the App layer DTO
     * @param form -> is a signup form received from the web page
     * @return AppAccountInfo entity mapped from form
     */
    private AppAccountInfo getAppAccountInfo(SignUpForm form) {
        return AccountInfoFormMapper.INSTANCE.toAppDTO(form,
                AddressFormMapper.INSTANCE.toAppDTO(form),
                LoginFormMapper.INSTANCE.toAppDTO(form));
    }

}
