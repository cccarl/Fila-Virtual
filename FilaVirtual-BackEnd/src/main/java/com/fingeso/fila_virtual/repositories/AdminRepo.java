package com.fingeso.fila_virtual.repositories;

import com.fingeso.fila_virtual.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository <Admin, String> {

}
