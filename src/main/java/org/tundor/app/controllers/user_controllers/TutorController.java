package org.tundor.app.controllers.user_controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor.manager.services.user_service.TutorService;

import java.util.UUID;

@RestController
@RequestMapping("/tutors")
public class TutorController extends BaseController<TutorDTO, UUID> {

    @Autowired
    public TutorController(TutorService service) {
       super(service);
    }




}
