package de.github.joshu4l.asterixexercise;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/asterix")
public class AsterixController {

    // FINAL ATTRIBUTE (declaring an immutable CharacterRepo instance)
    private final CharacterRepo characterRepo;

    /*
        ENABLE DEPENDENCY INJECTION HERE
        By telling the AsterixController-Constructor, that it shall (by default) instantiate a CharacterRepo,
        we can make use of its methods
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
