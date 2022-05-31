package br.com.polus.components;

import br.com.polus.adminService.AdminServiceImpl;
import br.com.polus.models.AdminUser;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Random;

@Component
@Transactional
public class AdminComponent implements CommandLineRunner {

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private Argon2PasswordEncoder encoder;

    @Override public void run(String... args) throws Exception {


//        AdminUser eduardo_adm = new AdminUser();
//        AdminUser thiago_adm = new AdminUser();
//        AdminUser andre_adm = new AdminUser();
//        AdminUser christian_adm = new AdminUser();
//
//        eduardo_adm.setAdmUsername("Eduardo668");
//        thiago_adm.setAdmUsername("Master");
//        andre_adm.setAdmUsername("Andre");
//        christian_adm.setAdmUsername("xaay");
//
//        String password = "@polus123456";
//        String encodedPassword = encoder.encode(password);
//        eduardo_adm.setPassword(encodedPassword);
//        thiago_adm.setPassword(encodedPassword);
//        andre_adm.setPassword(encodedPassword);
//        christian_adm.setPassword(encodedPassword);
//
//        adminService.saveAdm(eduardo_adm);
//        adminService.saveAdm(thiago_adm);
//        adminService.saveAdm(christian_adm);
//        adminService.saveAdm(andre_adm);







    }
}
