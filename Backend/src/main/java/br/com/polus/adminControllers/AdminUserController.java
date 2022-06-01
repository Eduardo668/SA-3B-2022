package br.com.polus.adminControllers;

import br.com.polus.services.adminService.AdminServiceImpl;
import br.com.polus.models.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminUserController {

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private Argon2PasswordEncoder encoder;

    @PostMapping("/login")
    public ResponseEntity<String> adminUser(@RequestBody AdminUser adminUserLogin){
        boolean admExists = false;

        for (AdminUser adminUser : adminService.findAll()){
            var passwordVerification  = encoder.matches(adminUserLogin.getPassword(),
                    adminUser.getPassword());

            if (adminUser.getAdmUsername().equals(adminUserLogin.getAdmUsername())
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
