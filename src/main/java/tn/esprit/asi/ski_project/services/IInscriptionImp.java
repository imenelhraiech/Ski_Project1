package tn.esprit.asi.ski_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_project.entities.Abonnement;
import tn.esprit.asi.ski_project.entities.Inscription;
import tn.esprit.asi.ski_project.repositories.InscriptionRepository;

import java.util.List;

@Service
public class IInscriptionImp implements IInscriptionService{
    @Autowired
    private InscriptionRepository inscriptionRepository ;
    @Override
    public void add(Inscription i) {
       inscriptionRepository.save(i) ;
    }
    @Override
    public Inscription update(Inscription i) {
        return inscriptionRepository.save(i) ;
    }
    @Override
    public List<Inscription> getAll() {
        return( List<Inscription> ) inscriptionRepository.findAll() ;
    }

    @Override
    public Inscription getById(long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) { inscriptionRepository.deleteById(id);

    }
}
