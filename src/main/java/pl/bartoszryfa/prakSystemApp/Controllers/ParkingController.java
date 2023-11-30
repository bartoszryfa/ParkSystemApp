package pl.bartoszryfa.prakSystemApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.bartoszryfa.prakSystemApp.Parking;
import pl.bartoszryfa.prakSystemApp.Repositories.DisplayUsersRepository;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    DisplayUsersRepository displayUsersRepository;
    @GetMapping("")
    public List<Parking> getAll() {
        return displayUsersRepository.getAll();
    }
    @GetMapping("/{id}")
    public Parking getById(@PathVariable("id") int id) {
        return displayUsersRepository.getById(id);
    }



    // obsługa wyjątków - RuntimeException
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleRuntimeException(RuntimeException e) {
        return "Wystąpił błąd: " + e.getMessage();
    }

}
