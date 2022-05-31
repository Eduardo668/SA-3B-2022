package br.com.polus.adminControllers;

import br.com.polus.adminService.AdminService;
import br.com.polus.models.AdminUser;
import br.com.polus.models.User;
import br.com.polus.services.userservice.UserServiceImpl;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminUserController {

    private AdminServiceImp

    @GetMapping("/login")
    public ResponseEntity<User> adminUser(@ModelAttribute AdminUser admin){

        try{

        }

    }
}
