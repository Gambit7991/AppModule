package org.tundor.app.controllers.user_controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.manager.services.user_service.AdminService;

import java.util.UUID;

@RestController
@RequestMapping("/admins")
public class AdminController extends BaseController<AdminDTO, UUID> {

    @Autowired
    public AdminController(AdminService service) {
        super(service);
    }

}
