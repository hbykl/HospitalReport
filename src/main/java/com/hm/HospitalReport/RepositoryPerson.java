package com.hm.HospitalReport;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryPerson extends Neo4jRepository<Persons, Long> {



    /*@Query("CREATE (p:person {adi: $name, soyad: $surname}) RETURN p")
    Persons createPerson(@Param("name") String name, @Param("surname") String surname);*/



}
