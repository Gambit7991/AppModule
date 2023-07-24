package org.tundor.app.mappers.form_mappers;

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

    /**
     * toAppDTO maps info into AppAccountInfo
     * @param form -> contains the whole form
     * @param address -> contains address
     * @param loginInfo -> contains loginInfo
     * @return AppAccountForm based on arguments
     */
    @Mapping(source = "form.createdTime", target = "createdTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(source = "form.birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    AppAccountInfo toAppDTO (SignUpForm form, AppAddressDTO address, AppLoginInfo loginInfo);

    /**
     * Mapper maps AppAccountInfo to SignUpForm
     * @param accountInfo -> AppAccountInfo
     * @return SignUpForm
     */
    @Mapping(source = "createdTime", target = "createdTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
    SignUpForm toDTO (AppAccountInfo accountInfo);
}
