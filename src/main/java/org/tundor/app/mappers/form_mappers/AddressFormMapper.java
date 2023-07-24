package org.tundor.app.mappers.form_mappers;

import ch.qos.logback.classic.pattern.DateConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tundor.app.DTOs.user_info.AppAddressDTO;
import org.tundor.app.forms.SignUpForm;

@Mapper(uses = DateConverter.class)
public interface AddressFormMapper {
    AddressFormMapper INSTANCE = Mappers.getMapper(AddressFormMapper.class);

    /**
     * toAppDTO takes data from form and transfer it to the AppAddressDTO
     * @param form -> sign up form received from the user
     * @return AppAddressDTO mapped from received form
     */
    AppAddressDTO toAppDTO(SignUpForm form);

    /**
     * DTOtoForm takes the data from AppAddressDTO and transfer to the SignUpForm
     * @param address -> address received from backend
     * @return SignUpForm mapped from received address
     */
    SignUpForm DTOToForm(AppAddressDTO address);


}
