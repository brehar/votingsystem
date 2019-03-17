package me.bretthartman.votingsystem.repositories;

import me.bretthartman.votingsystem.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {}
