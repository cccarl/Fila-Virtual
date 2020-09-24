package com.fingeso.fila_virtual.repositories;

import com.fingeso.fila_virtual.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository <User, String> {

    User findUserByRut (String rut);
    User findUserByNames (String names);
    User findUserById (String Id);

}
