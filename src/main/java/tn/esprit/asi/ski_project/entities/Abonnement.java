package tn.esprit.asi.ski_project.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity /*obligatoire*/
@Table(name ="abonnements") /* optionnel */
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Abonnement {

    @Id /*obligatoire*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon ;
    private LocalDate dateDebut ;
    private LocalDate dateFin ;
    private Float prixAbon ;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon ;

}
