package pl.bartoszryfa.prakSystemApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.bartoszryfa.prakSystemApp.ParkingEntity;
import pl.bartoszryfa.prakSystemApp.Repositories.DisplayUsersRepository;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    DisplayUsersRepository displayUsersRepository;

    @GetMapping("")
    public ResponseEntity<List<ParkingEntity>> getAll() {
      List<ParkingEntity> parkingEntityList = displayUsersRepository.getAll();

      return ResponseEntity.ok(parkingEntityList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ParkingEntity> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(displayUsersRepository.getById(id));
    }




    // catching RuntimeException
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleRuntimeException(RuntimeException e) {
        return "Wystąpił błąd: " + e.getMessage();
    }

}
