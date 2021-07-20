package com.dio.personapi.utils;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.model.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {
    private static final String FIRST_NAME = "Nathalia";
    private static final String LAST_NAME = "Santos";
    private static final String CPF_NUMBER = "393.011.628-65";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1992, 12, 20);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("20-12-1991")
                .phoneNumbers(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phoneNumbers(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
