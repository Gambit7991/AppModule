package org.tundor.app.forms;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class SignUpForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String createdTime;
    private String birthday;
    private String gender;
    private String phoneNumber;
    private String mainPicture;
    private String aptNum;
    private String buildingNumber;
    private String street;
    private String city;
    private String countryId;
    private String postalCode;
    private String userType;
}
