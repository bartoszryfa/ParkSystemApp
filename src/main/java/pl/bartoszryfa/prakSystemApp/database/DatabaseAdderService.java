package pl.bartoszryfa.prakSystemApp.database;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.bartoszryfa.prakSystemApp.ParkingEntity;
import pl.bartoszryfa.prakSystemApp.Repositories.ParkingRepository;

@Service
@RequiredArgsConstructor
public class DatabaseAdderService {

    private final ParkingRepository parkingRepository;

    public void addPark(ParkingEntity parkingEntity) {
        parkingRepository.save(parkingEntity);
    }
}
