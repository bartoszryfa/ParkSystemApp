package pl.bartoszryfa.prakSystemApp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name="parking")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="registrationNumber")
    private String registrationNumber;
    @Column(name="time")
    private LocalDateTime startTime;
}







