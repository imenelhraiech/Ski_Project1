package tn.esprit.asi.ski_project.services;

import tn.esprit.asi.ski_project.entities.Cours;
import tn.esprit.asi.ski_project.entities.Skieur;

import java.util.List;

public interface ICoursService {

    void add (Cours c);
    Cours update(Cours c);
    List<Cours> getAll();
    Cours getById(long id);
    void remove(long id);
}
