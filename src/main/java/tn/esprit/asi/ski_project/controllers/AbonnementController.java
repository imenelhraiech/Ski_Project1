package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Abonnement;
import tn.esprit.asi.ski_project.services.IAbonnementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abonnement")

public class AbonnementController {

    //  http://localhost:8080/abonnement
    @Autowired //implementation de l interface IAbonnementService

    private IAbonnementService iabonnementService;

    @PostMapping
    public void add (@RequestBody Abonnement a){
        iabonnementService.add(a);
    }

    @PutMapping
    public Abonnement update(@RequestBody Abonnement a){
       return iabonnementService.update(a);

    }
    @GetMapping
    public List<Abonnement> getAll(){
        return iabonnementService.getAll() ;
    }

    @GetMapping("/{id}")
    public Abonnement getById(@PathVariable long id){
        return iabonnementService.getById(id) ;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iabonnementService.remove(id);

    }




}
