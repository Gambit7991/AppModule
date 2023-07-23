//package org.tundor.app.controllers.info_controllers;//package org.tundor.app.controllers.info_controllers;
//
//
//import org.springframework.web.bind.annotation.*;
//import org.tundor.data.data_interacting.services.info_services.UserInfoService;
//import org.tundor.data.models.UserInfo;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/UserInfoEntity")
//public class UserInfoController {
//    private final UserInfoService service;
//
//    public UserInfoController(UserInfoService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public List<UserInfo> getAllUserInfo() {
//        return service.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<UserInfo> findById(@PathVariable Long id) {
//        return service.findById(id);
//    }
//
//    @PostMapping
//    public Optional<UserInfo> createUserInfo(@RequestBody UserInfo userInfo) {
//        return service.save(userInfo);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable Long id) {
//        service.deleteById(id);
//    }
//
//    @PatchMapping("/id")
//    public Optional<UserInfo> updateUserInfo(@PathVariable Long id, @RequestBody  UserInfo newUserInfo){
//        return service.findById(id).map(userInfo->{
//           userInfo.setLoginInfo(newUserInfo.getLoginInfo());
//           userInfo.setBirthDay(newUserInfo.getBirthDay());
//           userInfo.setFirstName(newUserInfo.getFirstName());
//           userInfo.setLastName(newUserInfo.getLastName());
//           userInfo.setGender(newUserInfo.getGender());
//           userInfo.setPhoneNumber(newUserInfo.getPhoneNumber());
//           userInfo.setMainPicture(newUserInfo.getMainPicture());
//           userInfo.setAddress(newUserInfo.getAddress());
//           userInfo.setUserType(newUserInfo.getUserType());
//           return service.save(userInfo).orElse(null);
//        });
//    }
//}
