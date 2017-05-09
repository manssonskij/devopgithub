package se.exjobb;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by anton on 5/8/17.
 */

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Devops POC build test";
    }

}