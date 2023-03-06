package tn.esprit.asi.ski_project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity

@Table(name ="inscriptions") /* optionnel */
@Getter
@Setter
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long numInscription ;
    public int numSemaine ;
    @ManyToOne
    private Skieur skieur ;
    @ManyToOne
    private Cours cours ;

}
