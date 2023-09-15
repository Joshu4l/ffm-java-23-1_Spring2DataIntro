package de.github.joshu4l.asterixexercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/asterix")
public class AsterixController {

    // FINAL ATTRIBUTE (declaring an immutable CharacterRepo instance)
    private final CharacterRepo characterRepo;


    /*
        ENABLE DEPENDENCY INJECTION HERE,
        by telling the AsterixController-Constructor,
        that it shall (by default) instantiate a CharacterRepo,
        whose methods we can use below.

        Special benefit about Dependency Injection:
        The whole program can use the very same DB instance! :)
     */
    public AsterixController(CharacterRepo characterRepo){
        this.characterRepo = characterRepo;
    }


    // REST API MAPPINGS
    @GetMapping("/characters")
    public List<Character> findAllCharacters() {
        /*
            Making use of the characterRepo's default method of getting all DB-entries
         */
        return characterRepo.findAll();
    }




}
