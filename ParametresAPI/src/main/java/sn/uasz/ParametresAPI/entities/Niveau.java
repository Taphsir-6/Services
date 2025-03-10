package sn.uasz.ParametresAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Niveau {
    @Id
    private Long id;

}
