package se.exjobb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anton on 5/8/17.
 */

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping("/")
    public String index() {

        logger.info("REQUEST has been made");
        return "Devops POC build test";
    }

    @RequestMapping("/test")
    public String test(@RequestParam String string1, @RequestParam String string2){

        logger.info("REQUEST to TEST has been made");

         StringObject t = new StringObject();

         t.TestableStringObject(string1, string2);

         System.out.println(t.getReversedStrings());

         return t.getStrings();

    }

}