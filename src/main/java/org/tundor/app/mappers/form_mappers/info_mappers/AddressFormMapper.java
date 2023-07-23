package org.tundor.app.mappers.form_mappers.info_mappers;

import ch.qos.logback.classic.pattern.DateConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAddressDTO;
import org.tundor.app.forms.SignUpForm;

@Mapper(uses = DateConverter.class)
public interface AddressFormMapper {
    AddressFormMapper INSTANCE = Mappers.getMapper(AddressFormMapper.class);

    AppAddressDTO toAppDTO(SignUpForm form);

    SignUpForm DTOtoForm(AppAddressDTO form);


}
