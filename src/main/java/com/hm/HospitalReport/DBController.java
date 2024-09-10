package com.hm.HospitalReport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class DBController {
    RepositoryPerson repositoryPerson;

    ReportRepository reportRepository;




    public DBController(RepositoryPerson repositoryPerson,ReportRepository reportRepository){
        this.reportRepository=reportRepository;
        this.repositoryPerson=repositoryPerson;
    }

    @PostMapping("/report/updateService")
    public String updateService(@ModelAttribute ("updatePerson") RelotionShip relotionShip){
        System.out.println("log*********"+relotionShip.getName()+relotionShip.getSurname()+
                relotionShip.getId()+relotionShip.getHastalikTuru());

        Persons persons=repositoryPerson.findById(relotionShip.getId()).orElse(null);
        persons.setName(relotionShip.getName());
        persons.setSurname(relotionShip.getSurname());
        Report report=reportRepository.findById2(relotionShip.getHastalikTuru());
        persons.getReportSet().clear();
        persons.getReportSet().add(report);
        repositoryPerson.save(persons);
        return "redirect:/main";

    }

    @PostMapping("/report/createService")
    public String createService(@ModelAttribute("RPerson") RelotionShip relotionShip){
        Persons persons=new Persons(relotionShip.getName(),relotionShip.getSurname(),
                reportRepository.findById2(relotionShip.getHastalikTuru()));

        repositoryPerson.save(persons);
        return "redirect:/main";

    }


}
