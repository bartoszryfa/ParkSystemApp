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




}
//	@Bean
//	public CommandLineRunner demo(DatabaseAdderService databaseAdderService) {
//		return args -> {
//			// create and add user
//			ParkingEntity parkingEntityUser = new ParkingEntity();
//			parkingEntityUser.setId(4);
//			parkingEntityUser.setRegistration("W1 XXXXXX");
//			parkingEntityUser.setStartTime(1);
//
//			databaseAdderService.addPark(parkingEntityUser);
//		};
//
//	}

//	@Bean
//	public CommandLineRunner demo(DatabaseAdderService databaseAdderService) {
//		return args -> {
//			// create and add user
//			Parking parkingUser = new Parking();
//			parkingUser.setId(4);
//
//			databaseAdderService.addPark(parkingUser);
//		};
//
//	}

