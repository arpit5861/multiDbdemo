package com.demo.database.sqlserver.repository;

import com.demo.database.sqlserver.domain.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
    

}