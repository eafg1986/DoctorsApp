package com.usa.doctors.repository.crudrepository;

import com.usa.doctors.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
