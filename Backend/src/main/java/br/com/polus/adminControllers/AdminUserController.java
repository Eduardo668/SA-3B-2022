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
@CrossOrigin(origins = "http://localhost:3000")
public class AdminUserController {

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private Argon2PasswordEncoder encoder;

    @PostMapping("/login")
    public ResponseEntity<String> adminUser(@RequestBody AdminUser admin){

        System.out.println(admin);
        boolean admExists = false;
        for (AdminUser adminUser : adminService.findAll()){
            var passwordVerification  = encoder.matches(admin.getPassword(), adminUser.getPassword());
            if (adminUser.getAdmUsername().equals(admin.getAdmUsername())
                    && passwordVerification){
                 admExists = true;
            }
        }
        String admConfirmation = "";
        if (admExists){
           admConfirmation = "true";
        }
        else{
            admConfirmation = "false";
        }
        return new ResponseEntity<>(admConfirmation, HttpStatus.OK);

    }

    @GetMapping("/listAdms")
    public ResponseEntity<List<AdminUser>> listAdm(){
        return new ResponseEntity<>(adminService.findAll(), HttpStatus.OK);
    }

}
