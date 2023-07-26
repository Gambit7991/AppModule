package org.tundor.app.controllers.user_controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.app.DTOs.user_roles.AppTutorDTO;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.TutorMapper;
import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor.manager.services.user_service.TutorService;

import java.util.UUID;

@RestController
@RequestMapping("/tutors")
public class TutorController extends BaseController<TutorDTO, AppTutorDTO, UUID, TutorMapper> {

    /**
     * @param service provides {@link TutorService} to send data to the Manager layer
     */
    @Autowired
    public TutorController(TutorService service) {
        super(service);
    }

    /**
     * @inheritDoc ->  {@link  BaseController }
     */
    @Override
    public TutorMapper getMapper() {
        return new TutorMapper();
    }

}
