package com.professorangoti.aula05092025;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

  @GetMapping("/alo")
  public String mandeUmAlo() {
    System.out.println("Mandei um alô");
    return "alo";
  }

  @GetMapping("/megasena")
  public String GeraAposta(Model model) {
    int[] numeros = new int[6];
    for (int i = 0; i < 6; i++) {
      numeros[i] = (int) (Math.random() * 60) + 1;
    }

    model.addAttribute("lista", numeros);

    return "aposta";
  }

}
