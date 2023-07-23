package org.tundor.app.DTOs.user_info;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class AppAddressDTO {
    private Integer aptNum;
    private Integer buildingNumber;
    private String street;
    private String city;
    private Integer countryId;
    private Integer postalCode;
}
