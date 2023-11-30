package pl.bartoszryfa.prakSystemApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {
    private int id;
    private String registrationNumber;
    private LocalDateTime startTime;
}







