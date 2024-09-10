package com.hm.HospitalReport;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    RepositoryPerson repositoryPerson;

    ReportRepository reportRepository;
    public Controller(RepositoryPerson repositoryPerson,ReportRepository reportRepository){
        this.reportRepository=reportRepository;
        this.repositoryPerson=repositoryPerson;
    }
    @GetMapping("/report/view/{id}")
    public String reportView(@PathVariable Long id, Model model) {
        model.addAttribute("report", repositoryPerson.findById(id).orElse(null));
        return "report.html";
    }

    @GetMapping("/main")
    public String listele(Model model){
        List<Persons> persons=repositoryPerson.findAll();
        model.addAttribute("person",persons);
        return "main.html";
    }

    @GetMapping("/report/delete/{id}")
    public String sil(@PathVariable Long id){
        repositoryPerson.deleteById(id);
        return "redirect:/main";
    }

    @GetMapping("/report/create")
    public String create(Model model){
        model.addAttribute("RPerson",new RelotionShip());
        return "create.html";
    }

    @GetMapping("/report/update/{id}")
    public String update(@PathVariable Long id,Model model){
        Persons persons=repositoryPerson.findById(id).orElse(null);
        RelotionShip relotionShip=new RelotionShip();
        relotionShip.setId(persons.getId());
        relotionShip.setName(persons.getName());
        relotionShip.setSurname(persons.getSurname());
        relotionShip.setHastalikTuru(persons.getrep().getHastalikTuru());

        model.addAttribute("updatePerson",relotionShip);
        return "update.html";

    }

}
