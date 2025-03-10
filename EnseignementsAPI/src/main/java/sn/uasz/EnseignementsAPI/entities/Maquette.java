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
public class Maquette {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String libelle;
    private String classe;
    private String semestre;
    private int creditUe;
    private int creditEc;
    private int coefUe;
    private int coefEc;
    private int nbreHeureEnseignement;
    private int nbreHeureTpe;
    private int VHT;
    @OneToMany(mappedBy = "maquette")
    private List<UE> ues;

    private String createby;
    private String createat;

}
