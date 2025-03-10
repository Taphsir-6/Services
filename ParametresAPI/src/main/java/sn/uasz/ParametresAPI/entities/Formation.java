package sn.uasz.ParametresAPI.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Formation {
    @Id
    private Long id;
    private String libelle;
    @ManyToOne
    @JoinColumn(name = "ufr_id")
    private UFR ufr;
    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    @OneToMany
    private List<Classe> classes;

    private String createby;
    private String createat;

}
