package pl.bartoszryfa.prakSystemApp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="parking")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParkingEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //, nullable = false, columnDefinition = "BIGINT default 0")
    private long id;
    @Column(name="registration")
    private String registration;
    @Column(name="time")
    private int startTime;
}







