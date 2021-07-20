package com.dio.personapi.dto.mapper;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.model.Person;
import com.dio.personapi.service.PersonService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
