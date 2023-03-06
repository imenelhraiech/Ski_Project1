package tn.esprit.asi.ski_project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="pistes") /* optionnel */

@Getter
@Setter
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numPiste;
    private String nomPiste ;

    @Enumerated(EnumType.STRING)
    private Couleur couleur ;
    private int longeur ;
    private int pente ;
    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;


}
