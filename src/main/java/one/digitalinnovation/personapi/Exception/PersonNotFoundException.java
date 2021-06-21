package one.digitalinnovation.personapi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Throwable {
    public PersonNotFoundException(Long id) {
        super((String.format("Person with ID %%s not found!%d", id)));
    }
}
