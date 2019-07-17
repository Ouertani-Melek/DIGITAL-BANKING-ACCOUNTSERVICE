package tn.com.biat.account_service.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompteController {

    @RequestMapping(value = "/helloTest" , method = RequestMethod.GET)
    public String testGreetings() {
        return "Hello";
    }

}
