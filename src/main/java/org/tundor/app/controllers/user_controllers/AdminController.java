package org.tundor.app.controllers.user_controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.app.DTOs.user_roles.AppAdminDTO;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.AdminMapper;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.manager.services.user_service.AdminService;

import java.util.UUID;

@RestController
@RequestMapping("/admins")
public class AdminController extends BaseController<AdminDTO, AppAdminDTO, UUID, AdminMapper> {

    /**
     * @param service provides {@link AdminService} to send data to the Manager layer
     */
    @Autowired
    public AdminController(AdminService service) {
        super(service);
    }

    /**
     * @inheritDoc {@link BaseController }
     */

    @Override
    public AdminMapper getMapper() {
        return new AdminMapper();
    }
}
