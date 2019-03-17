package me.bretthartman.votingsystem.controllers;

import me.bretthartman.votingsystem.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CandidateController {
  private final CandidateRepository candidateRepository;

  public CandidateController(@Autowired CandidateRepository candidateRepository) {
    this.candidateRepository = candidateRepository;
  }
}
