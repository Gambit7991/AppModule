package org.tundor.app.controllers.user_controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tundor.app.DTOs.AppBaseUserDTO;
import org.tundor.app.exceptions.BadRequestException;
import org.tundor.app.exceptions.InternalServerException;
import org.tundor.app.exceptions.ResourceNotFoundException;
import org.tundor.app.flows.mapper_flow.user_mapper_flow.BaseMapper;
import org.tundor.app.forms.SignUpForm;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.manager.services.BaseService;

import java.util.UUID;

public abstract class BaseController<UserDataDTO extends BaseUserDTO, AppUserDTO extends AppBaseUserDTO, ID extends UUID,
        Mapper extends BaseMapper<UserDataDTO, AppUserDTO>> {
    private final BaseService<UserDataDTO, ID> service;
    private final Mapper mapper = getMapper();

    public BaseController(BaseService<UserDataDTO, ID> service) {
        this.service = service;
    }

    /**
     * @return Mapper provides Mapper to transfer data between AppDTO and DataDTO
     */
    public abstract Mapper getMapper();

    /**
     * Handles the HTTP GET request to get a user.
     * <pre>
     * 1) 500 if there is an unexpected server error. {@link InternalServerException}.
     * 2) 400 if the request data is invalid. {@link ResourceNotFoundException}.
     * 3) 200 if the request is OK.
     * URL: /UserType (must be replaced with a proper value)/id
     * Possible UserType:
     * 1) tutors.
     * 2) students.
     * 3) admins.
     * </pre>
     *
     * @param id the user id received from the client.
     * @return ResponseEntity - Returns a response with status code.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable ID id) {
        try {
            UserDataDTO user = service.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("User with ID " + id + " not found."));
            return ResponseEntity.ok(user);
        } catch (ResourceNotFoundException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new InternalServerException("Something went wrong, please come back later.");
        }
    }

    /**
     * Handles the HTTP POST request to create a new user.
     * This method maps the data from a SignUpForm received from the request to a UserDataDTO
     * and sends it to the manager layer to be saved in the database.
     * <pre>
     * 1) 500 if there is an unexpected server error. {@link InternalServerException}.
     * 2) 400 if the request data is invalid. {@link ResourceNotFoundException}.
     * 3) 200 if the request is OK.
     *
     * URL: /UserType (must be replaced with a proper value)/create
     * Possible UserType:
     * 1) tutors.
     * 2) students.
     * 3) admins.
     * </pre>
     *
     * @param form the SignUpForm contains the user details received from the client.
     * @return ResponseEntity - Returns a response with status 200 user and form that has been sent.
     */
    @PostMapping("/create")
    public ResponseEntity<SignUpForm> create(@RequestBody SignUpForm form) {
        try {
            UserDataDTO user = service.save(mapper.getDataDTO(form))
                    .orElseThrow(() -> new BadRequestException("User with ID " + form + " not found."));
            return ResponseEntity.status(HttpStatus.OK).body(mapper.getForm(user));
        } catch (BadRequestException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new InternalServerException("Something went wrong, please come back later.");
        }
    }


    /**
     * Handles the HTTP PUT request to update a user.
     * <pre>
     * 1) 500 if there is an unexpected server error. {@link InternalServerException}.
     * 2) 400 if the request data is invalid. {@link ResourceNotFoundException}.
     * 3) 200 if the request is OK.
     * URL:
     * /UserType (must be replaced with a proper value)/update/id
     * Possible UserType:
     * 1) tutors.
     * 2) students.
     * 3) admins.
     * </pre>
     *
     * @param id   the user id received from the client.
     * @param form the form received from the client with updated fields.
     * @return ResponseEntity - returns a response form with updated information.
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<SignUpForm> update(@PathVariable ID id, @RequestBody SignUpForm form) {
        try {
            UserDataDTO user = service.update(id, mapper.getDataDTO(form))
                    .orElseThrow(() -> new ResourceNotFoundException("User with ID " + id + " not found."));
            return ResponseEntity.status(HttpStatus.OK).body(mapper.getForm(user));
        } catch (ResourceNotFoundException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new InternalServerException("Something went wrong, please come back later.");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id) {
        service.deleteById(id);
    }

}
