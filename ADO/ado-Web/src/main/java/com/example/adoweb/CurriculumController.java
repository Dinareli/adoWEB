package com.example.adoweb;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.Professions;
import com.example.dto.courses;

@Controller
public class CurriculumController {
  @GetMapping
  String getCurriculum(Model model) {

    courses c1 = new courses();
    courses c2 = new courses("Tecnólogo em Análise e Desenvolvimento de Sistemas", "SENAC", 2024);
    Professions p1 = new Professions("Jovem Aprendiz", "Dock", "03/2022 - 07/2023");
    Professions p2 = new Professions("Estágiária", "CERC", "04/2023 - Atual");
    model.addAttribute("name", "Natalia Dinareli de Lima");
    model.addAttribute("birthDate", "7 de Dezembro de 2001");
    model.addAttribute("email", "dinareli.lima@gmail.com");
    model.addAttribute("courses", Arrays.asList(c1, c2));
    model.addAttribute("professions", Arrays.asList(p1, p2));
    model.addAttribute("tools", Arrays.asList("HTML & CSS", "JavaScript", "TypeScript", "Git", "Angular", "ReactJs"));
    model.addAttribute("languages", Arrays.asList("Inglês - Básico"));

    return "curriculum";
  }
}
