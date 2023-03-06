package tn.esprit.asi.ski_project.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentParser;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="skieurs") /* optionnel */

@Getter
@Setter
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numSkieur ;

    private String nomS ;
    private String prenomS ;
    private LocalDate dateNaissance ;
    private String ville ;


    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
    @OneToOne
    private Abonnement abonnement ;
    @ManyToMany
    private List<Piste> pistes ;
}
