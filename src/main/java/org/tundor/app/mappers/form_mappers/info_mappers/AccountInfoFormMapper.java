package org.tundor.app.mappers.form_mappers.info_mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_info.AppAddressDTO;
import org.tundor.app.DTOs.user_info.AppLoginInfo;
import org.tundor.app.forms.SignUpForm;

@Mapper
public interface AccountInfoFormMapper {

    AccountInfoFormMapper INSTANCE = Mappers.getMapper(AccountInfoFormMapper.class);

    @Mapping(source = "form.createdTime", target = "createdTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(source = "form.birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    AppAccountInfo toAppDTO (SignUpForm form, AppAddressDTO address, AppLoginInfo loginInfo);

    @Mapping(source = "createdTime", target = "createdTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    SignUpForm toDTO (AppAccountInfo accountInfo);
}
