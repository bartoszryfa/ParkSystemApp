package pl.bartoszryfa.prakSystemApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.bartoszryfa.prakSystemApp.database.DatabaseAdderService;
import pl.bartoszryfa.prakSystemApp.database.DatabaseRecordDeleterService;
import pl.bartoszryfa.prakSystemApp.database.DatabaseRecordUpdater;

@SpringBootApplication
public class PrakSystemAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrakSystemAppApplication.class, args);
	}

//hibernate add to DB
	@Bean
	public CommandLineRunner demo(DatabaseAdderService databaseAdderService) {
		return args -> {
			// create and add user
			ParkingEntity parkingEntityUser = new ParkingEntity();
			parkingEntityUser.setId(5);
			parkingEntityUser.setRegistration("WB GWAG63");
			parkingEntityUser.setStartTime(2);

			ParkingEntity parkingEntityUser1 = new ParkingEntity();
			parkingEntityUser1.setId(6);
			parkingEntityUser1.setRegistration("DJ 71000");
			parkingEntityUser1.setStartTime(2);

			databaseAdderService.addPark(parkingEntityUser);
			databaseAdderService.addPark(parkingEntityUser1);
		};

	}
}


//	@Bean
//	public CommandLineRunner demo(DatabaseAdderService databaseAdderService) {
//		return args -> {
//			// create and add user
//			Parking parkingUser = new Parking();
//			parkingUser.setId(5);
//
//
//			databaseAdderService.addPark(parkingUser);
//		};
//
//	}

