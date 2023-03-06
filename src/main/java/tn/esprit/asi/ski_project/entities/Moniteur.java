package tn.esprit.asi.ski_project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="moniteurs") /* optionnel */

@Getter
@Setter
public class Moniteur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur ;
private String nomM;
private String PrenimM ;
private LocalDate dateRecru ;

@OneToMany
    private List<Cours> cours ;

}
