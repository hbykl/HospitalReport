package com.hm.HospitalReport;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Report")
public class Report {

    @Id
    @GeneratedValue
    private Long id;

    private String hastalikTuru;

    public Long getId() {
        return id;
    }

    public String getHastalikTuru() {
        return hastalikTuru;
    }

    public void setHastalikTuru(String hastalikTuru) {
        this.hastalikTuru = hastalikTuru;
    }
}
