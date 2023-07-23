package org.tundor.app;

import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.tundor.app.DTOs.user_info.AppAccountInfo;
import org.tundor.app.DTOs.user_info.AppAddressDTO;
import org.tundor.app.DTOs.user_info.AppLoginInfo;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.forms.SignUpForm;
import org.tundor.app.mappers.data_mappers.AppDataAdminMapper;
import org.tundor.app.mappers.data_mappers.AppDataStudentMapper;
import org.tundor.app.mappers.data_mappers.AppDataTutorMapper;
import org.tundor.app.mappers.form_mappers.info_mappers.AccountInfoFormMapper;
import org.tundor.app.mappers.form_mappers.info_mappers.AddressFormMapper;
import org.tundor.app.mappers.form_mappers.info_mappers.LoginFormMapper;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.DTOs.user_roles.TutorDTO;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"org.tundor.data.data_interacting"})
@EntityScan(basePackages = {"org.tundor.data"})
@ComponentScan(basePackages = {"org.tundor.app", "org.tundor.manager.services"})
public class AppModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppModuleApplication.class, args);
        SignUpForm signUpForm = SignUpForm.builder()
                .firstName("John")
                .lastName("Doe")
                .email("johndoe@example.com")
                .password("secretpassword")
                .createdTime("2023-07-22T07:55:32")
                .birthday("1995-10-15")
                .gender("male")
                .phoneNumber("1234567890")
                .mainPicture("profile.jpg")
                .aptNum("3")
                .buildingNumber("2")
                .street("Main Street")
                .city("New York")
                .countryId("1")
                .postalCode("10001")
                .userType("TUTOR")
                .build();

        SignUpForm signUpForm1 = SignUpForm.builder()
                .firstName("Alice")
                .lastName("Smith")
                .email("alice.smith@example.com")
                .password("securepassword123")
                .createdTime("2023-07-22T08:15:30")
                .birthday("1990-05-20")
                .gender("female")
                .phoneNumber("9876543210")
                .mainPicture("profile.png")
                .aptNum("456")
                .buildingNumber("789")
                .street("Oak Street")
                .city("San Francisco")
                .countryId("2")
                .postalCode("94105")
                .userType("ADMIN")
                .build();

        SignUpForm signUpForm2 = SignUpForm.builder()
                .firstName("Bob")
                .lastName("Johnson")
                .email("bob.johnson@example.com")
                .password("strongpassword456")
                .createdTime("2023-07-22T14:30:00")
                .birthday("1985-11-10")
                .gender("male")
                .phoneNumber("1112223333")
                .mainPicture("avatar.jpg")
                .aptNum("789")
                .buildingNumber("123")
                .street("Maple Avenue")
                .city("Los Angeles")
                .countryId("3")
                .postalCode("90001")
                .userType("STUDENT")
                .build();

        AppAddressDTO addressDTO = AddressFormMapper.INSTANCE.toAppDTO(signUpForm);
        AppLoginInfo loginInfo = LoginFormMapper.INSTANCE.toAppDTO(signUpForm);
        AppAccountInfo accountInfo = AccountInfoFormMapper.INSTANCE.toAppDTO(signUpForm, addressDTO, loginInfo);
        System.out.println(addressDTO);
        System.out.println(loginInfo);
        System.out.println(accountInfo);
        AppAdminDTO appAdminDTO = AppAdminDTO.builder().info(accountInfo).build();
        AppAccountInfo accountInfo1 = AccountInfoFormMapper.INSTANCE.toAppDTO(signUpForm1,
                AddressFormMapper.INSTANCE.toAppDTO(signUpForm1),
                LoginFormMapper.INSTANCE.toAppDTO(signUpForm1));
        AppAccountInfo accountInfo2 = AccountInfoFormMapper.INSTANCE.toAppDTO(signUpForm2,
                AddressFormMapper.INSTANCE.toAppDTO(signUpForm2),
                LoginFormMapper.INSTANCE.toAppDTO(signUpForm2));

//        AppAdminDTO appAdminDTO = AppAdminFormMapper.INSTANCE
//                .toAppDTO(AccountInfoFormMapper.INSTANCE.toAppDTO(signUpForm,
//                        AddressFormMapper.INSTANCE.toAppDTO(signUpForm),
//                        LoginFormMapper.INSTANCE.toAppDTO(signUpForm))
//                );


        AppTutorDTO appTutorDTO = AppTutorDTO.builder().info(accountInfo1).build();

        AppStudentDTO appStudentDTO = AppStudentDTO.builder().info(accountInfo2).build();

        System.out.println(appAdminDTO);
        System.out.println(appTutorDTO);
        System.out.println(appStudentDTO);

        AdminDTO adminDTO = AppDataAdminMapper.INSTANCE.toDataDTO(appAdminDTO);
        TutorDTO tutorDTO = AppDataTutorMapper.INSTANCE.toDataDTO(appTutorDTO);
        StudentDTO studentDTO = AppDataStudentMapper.INSTANCE.toDataDTO(appStudentDTO);

        System.out.println("next must be data objects ->>");
        System.out.println(adminDTO);
        System.out.println(tutorDTO);
        System.out.println(studentDTO);

    }


    @Bean
    public JodaModule jodaModule() {
        return new JodaModule();
    }
}
