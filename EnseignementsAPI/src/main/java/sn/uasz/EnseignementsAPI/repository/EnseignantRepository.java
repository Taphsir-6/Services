package sn.uasz.EnseignementsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.uasz.EnseignementsAPI.entities.Enseignant;

@RepositoryRestResource
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
}
