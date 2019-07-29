package tn.com.biat.account_service.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.com.biat.account_service.models.Compte;
import tn.com.biat.account_service.models.User;
import tn.com.biat.account_service.repositories.CompteRepository;
import tn.com.biat.account_service.repositories.UserRepository;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CompteController {

    @Autowired
    CompteRepository compteRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/helloTest" , method = RequestMethod.GET)
    public String testGreetings() {
        return "Hello";
    }

    @RequestMapping(value = "/accounts" , method = RequestMethod.GET)
    public List<Compte> getAllAccounts() {
        return compteRepository.findAll();
    }


    @RequestMapping(value = "/account",method = RequestMethod.POST)
    public void createAccount(@Valid @RequestBody Compte compte)
    {
        compte.setEnabled(true);
        compte.setEtat_du_compte("pending");
        compteRepository.save(compte);
    }

    @RequestMapping(value = "/account/ban/{id}", method = RequestMethod.PUT)
    public void terminateAccount(@PathVariable("id") String id) {
        Compte compte = compteRepository.findById(id).get();
        compte.setId(id);
        compte.setEnabled(false);
        compteRepository.save(compte);
    }

    @RequestMapping(value = "/account/{id}/{etat_du_compte}", method = RequestMethod.PUT)
    public void handleAccount(@PathVariable("id") String id, @PathVariable("etat_du_compte") String etat) {
        Compte compte = compteRepository.findById(id).get();
        compte.setId(id);
       compte.setEtat_du_compte(etat);
        compteRepository.save(compte);
    }

    @RequestMapping(value = "/account/{id}",method = RequestMethod.PUT)
    public void assignAccountToUser(@PathVariable("id") String id, @Valid @RequestBody Compte compte)
    {

        User user =  userRepository.findById(id).get();


        if(user.getComptes()==null){
        user.setComptes(new HashSet<>());
        user.getComptes().add(compte);
        }
        else
            user.getComptes().add(compte);


        compteRepository.save(compte);
        userRepository.save(user);

    }

}
