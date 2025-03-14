package sn.uasz.EnseignementsAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UE {
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

    @OneToMany(mappedBy = "ue")
    private List<EC> ecs;

    @ManyToOne(fetch = FetchType.LAZY)
    private Maquette maquette;


    private String createby;
    private String createat;
}
