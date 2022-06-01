package br.com.polus.adminControllers;

import br.com.polus.models.Game;
import br.com.polus.services.gameservice.GameService;
import br.com.polus.services.gameservice.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;


@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AddGameController {

    @Autowired
    private GameServiceImpl gameService;

//    @PostMapping("/addGame")
//    public ResponseEntity<String> addGame(@RequestBody Game newGame){
//
//
//    }


}
