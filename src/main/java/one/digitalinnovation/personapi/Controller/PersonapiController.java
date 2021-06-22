package one.digitalinnovation.personapi.Controller;

import one.digitalinnovation.personapi.DTO.Response.MessageResponseDTO;
import one.digitalinnovation.personapi.Repository.PersonRepository;
import one.digitalinnovation.personapi.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import one.digitalinnovation.personapi.DTO.Request.PersonDTO;

import one.digitalinnovation.personapi.Exception.PersonNotFoundException;
import one.digitalinnovation.personapi.Service.PersonService;

import javax.validation.Valid;
import java.util.List;

//import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonapiController {

    private PersonRepository personRepository;

    @Autowired
    public PersonapiController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder().message("Pessoa criada  corretamente com ID:"+savedPerson.getId()).build();
    }

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }



}




