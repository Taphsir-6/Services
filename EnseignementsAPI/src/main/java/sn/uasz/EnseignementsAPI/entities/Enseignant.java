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
public class Enseignant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String matricule;
    private String grade;

    @OneToMany(mappedBy = "enseignant")
    private List<Choix> choixes;
    private String createby;
    private String createat;

    public Enseignant(int i, String mohamed, String ciss, String mail, String number, String n214, String professeur, Object o, Object o1) {
    }
}
