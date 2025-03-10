package sn.uasz.ParametresAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.uasz.ParametresAPI.entities.Cycle;

@RepositoryRestResource
public interface CycleRepository extends JpaRepository<Cycle, Long> {
}
