package org.tundor.app.controllers.info_controllers;//package org.tundor.app.controllers.info_controllers;
//
//import org.springframework.web.bind.annotation.*;
//import org.tundor.data.data_interacting.services.info_services.AddressService;
//import org.tundor.data.models.account_info.address.Address;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/AddressEntity")
//public class AddressController {
//    private final AddressService service;
//
//    public AddressController(AddressService service) {
//        this.service = service;
//    }
//
//    @PostMapping
//    public Optional<Address> save(@RequestBody Address address) {
//        return service.save(address);
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Address> findById(@PathVariable Long id) {
//        return service.findById(id);
//    }
//
//    @PatchMapping("/{id}")
//    public Optional<Address> updateAddress(@PathVariable Long id, @RequestBody Address newAddress) {
//        return service.findById(id)
//                .map(existingAddress -> {
//                    existingAddress.setStreet(newAddress.getStreet());
//                    existingAddress.setCity(newAddress.getCity());
//                    existingAddress.setPostalCode(newAddress.getPostalCode());
//                    return service.save(existingAddress).orElse(null);
//                });
//    }
//
//}
