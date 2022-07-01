package eu.morozik.microservice.service.Impl;

import eu.morozik.microservice.dto.PeopleDto;
import eu.morozik.microservice.service.PeopleService;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public PeopleDto getPeople(String name) {
        return PeopleDto.builder().age((int) (10 + Math.random() * 40)).name(name).build();
    }
}
