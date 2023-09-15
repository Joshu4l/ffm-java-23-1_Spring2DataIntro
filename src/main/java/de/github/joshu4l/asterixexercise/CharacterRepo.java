package de.github.joshu4l.asterixexercise;

import org.springframework.data.mongodb.repository.MongoRepository;


/*
    Declare here, that the CharacterRepo shall
    INHERIT ALL THE METHODS THAT AUTOMATICALLY COME ALONG WITH THE MongoRepository
 */
public interface CharacterRepo extends MongoRepository<Character, String> {

    /*
        As long as we don't need our Interface to dictate any custom methods,
        we don't even need to write any method signatures in here! :)

        The (if you will) 'built-in' methods of MongoRepository,
        already provide lots of functionalities for the most DB-usecases!
    */

}
