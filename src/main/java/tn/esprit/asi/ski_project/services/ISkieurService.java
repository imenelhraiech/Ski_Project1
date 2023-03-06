package tn.esprit.asi.ski_project.services;

import tn.esprit.asi.ski_project.entities.Skieur;
import tn.esprit.asi.ski_project.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    void add (Skieur s);
    Skieur update(Skieur s);
    List <Skieur> getAll();
    Skieur getById(long id);
    void remove(long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur aasignSkieurToAbonnement(Long numSkieur, Long numAbon) ;
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
