package org.tundor.app.controllers.user_controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.manager.services.BaseService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class BaseController <UserDTO extends BaseUserDTO, ID extends UUID>{
    private final BaseService<UserDTO, ID> service;

    public BaseController(BaseService<UserDTO, ID> service) {
        this.service = service;
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserDTO> findById(@PathVariable ID id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public /*Optional<UserDTO>*/void  save(@RequestBody SignUpForm user) {
        System.out.println("save requested body : " + user);

//        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id) {
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Optional<UserDTO> update(@PathVariable ID id, @RequestBody UserDTO userDTO){
        return service.update(id, userDTO);
    }
    @PostMapping("/signup")
    public UserDTO signUp(@RequestBody UserDTO user) {
        return service.save(user).orElse(null);
    }
}
