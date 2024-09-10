package com.hm.HospitalReport;

import org.neo4j.driver.Config;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;



@Node("Person")
public class Persons {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;
    public Persons(){
    }

    @Relationship(type = "report",direction = OUTGOING)
    private Set<Report> reportSet=new HashSet<>();

    public Persons(String name, String surname, Report report) {
        this.name = name;
        this.surname = surname;
        this.reportSet = new HashSet<>();
        this.reportSet.add(report);
    }

    public Set<Report> getReportSet() {
        return reportSet;
    }
    public Report getrep(){
        Set<Report> tempReport=this.getReportSet();

        for (Report temp:tempReport) {
            return temp;
        }

        return null;
    }

    public void setReportSet(Set<Report> reportSet) {
        this.reportSet = reportSet;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
