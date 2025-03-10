package sn.uasz.EnseignementsAPI.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Enseignement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private int type;

    @ManyToOne
    private EC ec;

    @OneToMany(mappedBy = "enseignement")
    private List<Choix> choixes;

    private String createby;
    private String createat;
}
