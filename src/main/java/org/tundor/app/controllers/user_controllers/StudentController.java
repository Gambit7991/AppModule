package org.tundor.app.controllers.user_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.manager.services.user_service.StudentService;

import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController extends BaseController<StudentDTO, UUID> {

    @Autowired
    public StudentController(StudentService service) {
        super(service);
    }

}
