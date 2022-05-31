package br.com.polus.adminControllers;

import br.com.polus.adminService.AdminService;
import br.com.polus.adminService.AdminServiceImpl;
import br.com.polus.models.AdminUser;
import br.com.polus.models.User;
import br.com.polus.services.userservice.UserServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminUserController {

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private Argon2PasswordEncoder encoder;

    @PostMapping("/login")
    public ResponseEntity<String> adminUser(@ModelAttribute AdminUser admin){
        var passwordVerification  = encoder.matches(admin.getPassword(), admin.getPassword());

        String admExists = "";
        for (AdminUser adminUser : adminService.findAll()){
            if (admin.getAdmUsername().equals(adminUser.getAdmUsername())
                    && passwordVerification){
                 admExists = "True";
            }
            else{
                admExists = "False";
            }
        }
        return new ResponseEntity<>(admExists, HttpStatus.OK);
    }

    @GetMapping("/listAdms")
    public ResponseEntity<List<AdminUser>> listAdm(){
        return new ResponseEntity<>(adminService.findAll(), HttpStatus.OK);
    }

}
