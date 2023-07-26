package org.tundor.app.controllers.user_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.app.DTOs.user_roles.AppStudentDTO;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.StudentMapper;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.manager.services.user_service.StudentService;

import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController extends BaseController<StudentDTO, AppStudentDTO, UUID, StudentMapper> {

    /**
     * @param service provides {@link StudentService} to send data to the Manager layer
     */
    @Autowired
    public StudentController(StudentService service) {
        super(service);
    }

    /**
     * @inheritDoc -> {@link BaseController}
     */
    @Override
    public StudentMapper getMapper() {
        return new StudentMapper();
    }
}
