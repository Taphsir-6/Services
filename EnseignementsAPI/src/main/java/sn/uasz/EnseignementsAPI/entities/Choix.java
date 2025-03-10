package sn.uasz.EnseignementsAPI.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Choix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Enseignant enseignant;

    @ManyToOne(fetch = FetchType.LAZY)
    private Enseignement enseignement;

    private String dateModification;

    private boolean validation;
    private String createby;
    private String createat;
}
