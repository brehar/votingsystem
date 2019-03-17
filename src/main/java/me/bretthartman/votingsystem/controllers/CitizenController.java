package me.bretthartman.votingsystem.controllers;

import me.bretthartman.votingsystem.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CitizenController {
  private final CitizenRepository citizenRepository;

  public CitizenController(@Autowired CitizenRepository citizenRepository) {
    this.citizenRepository = citizenRepository;
  }
}
