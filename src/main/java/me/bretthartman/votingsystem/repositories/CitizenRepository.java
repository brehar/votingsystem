package me.bretthartman.votingsystem.repositories;

import me.bretthartman.votingsystem.entities.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {}
