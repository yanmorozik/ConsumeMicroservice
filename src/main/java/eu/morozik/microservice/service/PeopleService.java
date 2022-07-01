package eu.morozik.microservice.service;

import eu.morozik.microservice.dto.PeopleDto;

public interface PeopleService {

    PeopleDto getPeople(String name);
}
