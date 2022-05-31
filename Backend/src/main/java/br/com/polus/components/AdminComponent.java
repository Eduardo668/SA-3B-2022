package br.com.polus.components;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Random;

@Component
@Transactional
public class AdminComponent implements CommandLineRunner {

    @Autowired


    @Override public void run(String... args) throws Exception {
        BCrypt bCrypt = new BCrypt();






    }
}
