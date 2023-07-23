package org.tundor.app.DTOs.user_info;

import lombok.*;
import org.tundor.app.DTOs.utils.AppUserType;
import org.tundor.app.DTOs.utils.Gender;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AppAccountInfo {
    private AppLoginInfo loginInfo;
    private Date createdTime;
    private Date birthday;
    private String firstName;
    private String lastName;
    private Gender sex;
    private String phoneNumber;
    private String mainPicture;
    private AppAddressDTO address;
    private Integer album;
    private Integer schedule;
    private Integer bankCards;
    private AppUserType userType;
}
