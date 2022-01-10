package demo.tpp.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.tpp.springboot.app.models.Profile;
import demo.tpp.springboot.app.services.TropiPayService;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin
class ProfileController {

  @Autowired
  private TropiPayService srvTPP;

  @GetMapping("")
  Profile all() {
    return this.srvTPP.getProfile();
  }
}