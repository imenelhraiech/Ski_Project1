package tn.esprit.asi.ski_project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="cours") /* optionnel */

@Getter @Setter
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numCours ;
    public int niveau ;

    @Enumerated(EnumType.STRING)
    public Support support ;
    @Enumerated(EnumType.STRING)
    public TypeCours typeCours ;
    public Float prix ;
    public int creneau ;
    @OneToMany (mappedBy = "cours")
    private List<Inscription> inscriptions ;
}
