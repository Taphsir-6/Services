package sn.uasz.EnseignementsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.uasz.EnseignementsAPI.entities.Enseignement;

@RepositoryRestResource
public interface EnseignementRepository extends JpaRepository<Enseignement, Long> {
    Page<Enseignement> findByCodeContains(String code, Pageable pageable);
}
