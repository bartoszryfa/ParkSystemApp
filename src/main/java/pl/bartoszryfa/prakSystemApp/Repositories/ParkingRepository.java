package pl.bartoszryfa.prakSystemApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bartoszryfa.prakSystemApp.ParkingEntity;

public interface ParkingRepository extends JpaRepository<ParkingEntity, Long> {
}
