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
    int n1 = (int) (Math.random() * 60) + 1;
    int n2 = (int) (Math.random() * 60) + 1;
    int n3 = (int) (Math.random() * 60) + 1;
    int n4 = (int) (Math.random() * 60) + 1;
    int n5 = (int) (Math.random() * 60) + 1;
    int n6 = (int) (Math.random() * 60) + 1;

    model.addAttribute("a", n1);
    model.addAttribute("b", n2);
    model.addAttribute("c", n3);
    model.addAttribute("d", n4);
    model.addAttribute("e", n5);
    model.addAttribute("f", n6);

    return "aposta";
  }

}
