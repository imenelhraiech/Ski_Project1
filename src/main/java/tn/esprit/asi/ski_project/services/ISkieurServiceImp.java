package tn.esprit.asi.ski_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.asi.ski_project.entities.Abonnement;
import tn.esprit.asi.ski_project.entities.Piste;
import tn.esprit.asi.ski_project.entities.Skieur;
import tn.esprit.asi.ski_project.entities.TypeAbonnement;
import tn.esprit.asi.ski_project.repositories.AbonnementRepository;
import tn.esprit.asi.ski_project.repositories.PisteRepository;
import tn.esprit.asi.ski_project.repositories.SkieurRepository;

import java.util.ArrayList;
import java.util.List;

//service pour instancier une instance de cette classe
@Service
public class ISkieurServiceImp implements ISkieurService{

    //autowired pour injection de dépendances
    @Autowired
    //instance de l interface repository
    private SkieurRepository skieurRepository;
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public void add(Skieur s) {
        //traitement avant save
        skieurRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s)   ;
    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur getById(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) { skieurRepository.deleteById(id);

    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new RuntimeException("Skieur not found"));

        Piste piste = pisteRepository.findById(numPiste)
                .orElseThrow(() -> new RuntimeException("Piste not found"));

        skieur.getPistes().add(piste);

        return skieurRepository.save(skieur);
    }

    public Skieur aasignSkieurToAbonnement(Long numSkieur, Long numAbon) {

        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null) ;
        //asset = if condition
        Assert.notNull(skieur,"not found");

        Abonnement abonnement = abonnementRepository.findById (numAbon).orElse(null);
        Assert.notNull(abonnement,"abonnement not found");
        skieur.setAbonnement(abonnement);
        return skieurRepository.save(skieur);
    }
/*
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
        List<Skieur> list = new ArrayList<>();
        //for dans la liste skieur s
        for(Skieur s:getAll()){
            if (s.getAbonnement().getTypeAbon()==typeAbonnement){
                list.add(s);
            }
        }
        return list ;
    }
 */
    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        //appel pour la fonction dans le repo
        return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);
    }

}
