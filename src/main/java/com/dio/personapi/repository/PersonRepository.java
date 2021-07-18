package com.dio.personapi.repository;

import com.dio.personapi.model.Person;
import com.dio.personapi.service.PersonService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}