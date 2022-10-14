package com.usa.doctors.repository.crudrepository;

import com.usa.doctors.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
