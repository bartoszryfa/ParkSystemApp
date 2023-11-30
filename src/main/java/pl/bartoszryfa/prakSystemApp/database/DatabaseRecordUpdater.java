package pl.bartoszryfa.prakSystemApp.database;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.bartoszryfa.prakSystemApp.ParkingEntity;
import pl.bartoszryfa.prakSystemApp.Repositories.ParkingRepository;

@Service
@RequiredArgsConstructor
public class DatabaseRecordUpdater {
    private final ParkingRepository parkingRepository;

    public void update(ParkingEntity updatedParkingEntity) {
        if(parkingRepository.existsById(updatedParkingEntity.getId())) {
            parkingRepository.save(updatedParkingEntity);
        } else {
            throw new IllegalArgumentException("Parking o podanym ID nie istnieje");
        }

    }

}
