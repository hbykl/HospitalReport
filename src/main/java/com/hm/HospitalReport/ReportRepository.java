package com.hm.HospitalReport;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface ReportRepository extends Neo4jRepository<Report,Long> {

    @Query("MATCH (r:Report) WHERE r.hastalikTuru=$hastalik RETURN r")
    Report findById2(@Param("hastalik") String hastalik);


}
