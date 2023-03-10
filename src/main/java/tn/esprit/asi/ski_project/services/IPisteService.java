package tn.esprit.asi.ski_project.services;


import tn.esprit.asi.ski_project.entities.Piste;

import java.util.List;

public interface IPisteService {
    void add (Piste p);
    Piste update(Piste p);
    List<Piste> getAll();
    Piste getById(long id);
    void remove(long id);
}
