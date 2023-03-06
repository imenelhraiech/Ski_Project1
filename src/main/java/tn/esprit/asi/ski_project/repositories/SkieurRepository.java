package tn.esprit.asi.ski_project.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski_project.entities.Skieur;
import tn.esprit.asi.ski_project.entities.TypeAbonnement;
import tn.esprit.asi.ski_project.entities.TypeCours;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur,Long> {

    //apres appel dans le service
    // methode de qword pour le get

    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours) ;
}
