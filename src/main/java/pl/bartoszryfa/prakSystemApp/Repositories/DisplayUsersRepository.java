package pl.bartoszryfa.prakSystemApp.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.bartoszryfa.prakSystemApp.ParkingEntity;

import java.util.List;

@Repository
public class DisplayUsersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ParkingEntity> getAll() {
        List<ParkingEntity> displayAll = jdbcTemplate.query("SELECT id, registration, time FROM parking",
                BeanPropertyRowMapper.newInstance(ParkingEntity.class));
        return displayAll;
    }


    public ParkingEntity getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id, registration, time FROM parking WHERE " + "id=?",
                BeanPropertyRowMapper.newInstance(ParkingEntity.class), id);
    }
}
