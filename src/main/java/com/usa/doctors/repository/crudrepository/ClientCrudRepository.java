package com.usa.doctors.repository.crudrepository;

import com.usa.doctors.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <Client, Integer> {
}
