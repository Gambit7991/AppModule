package org.tundor.app.DTOs;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.tundor.app.DTOs.user_info.AppAddressDTO;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_info.AppLoginInfo;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode
@ToString
public class AppBaseUserDTO {
    private AppAddressDTO address;
    private AppAccountInfo info;
    private AppLoginInfo loginInformation;


}