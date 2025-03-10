package sn.uasz.EnseignementsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import sn.uasz.EnseignementsAPI.entities.Choix;

@Repository
public interface ChoixRepository extends JpaRepository<Choix, Integer> {
}
