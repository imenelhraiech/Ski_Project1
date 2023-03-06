package tn.esprit.asi.ski_project.services;

import tn.esprit.asi.ski_project.entities.Inscription;
import tn.esprit.asi.ski_project.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    void add (Moniteur m);
    Moniteur update(Moniteur m);
    List<Moniteur> getAll();
    Moniteur getById(long id);
    void remove(long id);
}
