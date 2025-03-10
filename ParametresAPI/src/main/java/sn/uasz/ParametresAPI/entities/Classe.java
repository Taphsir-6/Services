package sn.uasz.ParametresAPI.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Classe {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @ManyToOne
    private Niveau niveau;
    private String nbreEtudiant;
    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;
    @ManyToOne
    private Cycle cycle;
    @ManyToOne
    private Salle salle;

    private String semestre;

}
