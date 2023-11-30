package pl.bartoszryfa.prakSystemApp.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.bartoszryfa.prakSystemApp.Parking;

import java.util.List;

@Repository
public class DisplayUsersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Parking> getAll() {
        List<Parking> displayAll = jdbcTemplate.query("SELECT id, rejestrationNumber, time FROM parking",
                BeanPropertyRowMapper.newInstance(Parking.class));
        return displayAll;
    }


    public Parking getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id, rejestrationNumber, time FROM parking WHERE " + "id=?",
                BeanPropertyRowMapper.newInstance(Parking.class), id);
    }
}
