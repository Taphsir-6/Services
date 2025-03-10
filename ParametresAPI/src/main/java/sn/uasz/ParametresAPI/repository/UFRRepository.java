package sn.uasz.ParametresAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.uasz.ParametresAPI.entities.UFR;

@RepositoryRestResource
public interface UFRRepository extends JpaRepository<UFR, Long> {
}
