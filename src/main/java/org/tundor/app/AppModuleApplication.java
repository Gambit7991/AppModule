package org.tundor.app;

import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.AdminMapperFlowApp;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.StudentMapperFlowApp;
import org.tundor.app.flows.mapper_flow.app_mappers_flow.TutorMapperFlowApp;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.AdminMapper;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.StudentMapper;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.TutorMapper;
import org.tundor.app.forms.SignUpForm;
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

        AdminMapperFlowApp adminMapperFlow = new AdminMapperFlowApp();
        StudentMapperFlowApp studentMapperFlow = new StudentMapperFlowApp();
        TutorMapperFlowApp tutorMapperFlow = new TutorMapperFlowApp();

        AppAdminDTO appAdminDTO1 = adminMapperFlow.getAppDTO(signUpForm) ;
        AppStudentDTO appStudentDTO1 = studentMapperFlow.getAppDTO(signUpForm1);
        AppTutorDTO appTutorDTO1 = tutorMapperFlow.getAppDTO(signUpForm2);

        System.out.println(appAdminDTO1);
        System.out.println(appStudentDTO1);
        System.out.println(appTutorDTO1);

        AdminMapper adminMapper = new AdminMapper();
        StudentMapper studentMapper = new StudentMapper();
        TutorMapper tutorMapper = new TutorMapper();

        AdminDTO adminDTO1 = adminMapper.getDataDTO(appAdminDTO1) ;
        StudentDTO studentDTO1 = studentMapper.getDataDTO(appStudentDTO1);
        TutorDTO tutorDTO1 = tutorMapper.getDataDTO(appTutorDTO1);
        TutorDTO tutorDTO2 = tutorMapper.getDataDTO(signUpForm);
        System.out.println(adminDTO1);
        System.out.println(studentDTO1);
        System.out.println(tutorDTO1);
        System.out.println(tutorDTO2);
    }


    @Bean
    public JodaModule jodaModule() {
        return new JodaModule();
    }
}
