package eu.morozik.microservice.controller;

import eu.morozik.microservice.dto.PeopleDto;
import eu.morozik.microservice.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/myapp")
public class CountryController {

    private final PeopleService peopleService;

    @GetMapping("/simpleresponse")
    public String response() {
        return "Hello from microservice";
    }

    @GetMapping("/responsedto")
    public PeopleDto responseDto(@RequestParam String name){
        return peopleService.getPeople(name);
    }
}
