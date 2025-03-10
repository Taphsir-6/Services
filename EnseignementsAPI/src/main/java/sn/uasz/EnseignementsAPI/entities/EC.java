package sn.uasz.EnseignementsAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private int credits;
    private int coef;
    private int cm;
    private int td;
    private int tp;
    private int tpe;
    private String semestre;
    @ManyToOne(fetch = FetchType.LAZY)
    private UE ue;
    @OneToMany(mappedBy = "ec")
    private List<Enseignement> enseignements;

    private String createby;
    private String createat;
}
