package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Skieur;
import tn.esprit.asi.ski_project.entities.TypeAbonnement;
import tn.esprit.asi.ski_project.services.ISkieurService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/skieur")

public class SkieurController {
    @Autowired

    private ISkieurService iSkieurService;
    @PostMapping
    public void add(@RequestBody Skieur s) {
        iSkieurService.add(s);
    }

    @PutMapping
    public Skieur update(@RequestBody Skieur s) {
        return iSkieurService.update(s);

    }

    @GetMapping
    public List<Skieur> getAll() {
        return iSkieurService.getAll();
    }

    @GetMapping("/{id}")
    public Skieur getById(@PathVariable long id) {
        return iSkieurService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iSkieurService.remove(id);
    }

    @PutMapping("/{piste}")
    public Skieur assignSkierToPiste(long numSkieur, long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur,numPiste);
    }

    @GetMapping("/{bysub}")
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return  iSkieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }


    /*
    public Skieur aasignSkieurToAbonnement(Long numSkieur, Long numAbon) {
        return iSkieurService.aasignSkieurToAbonnement(numSkieur,numAbon);
    }

     */
}
