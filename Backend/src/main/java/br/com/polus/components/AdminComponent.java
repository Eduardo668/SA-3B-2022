package br.com.polus.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Random;

@Component
@Transactional
public class AdminComponent implements CommandLineRunner {

    public String createParameter(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 40;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String parameter = buffer.toString();
        return parameter;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Add Skins route for admins: http://localhost:8080/admin/addSkins"+ createParameter());
    }
}
