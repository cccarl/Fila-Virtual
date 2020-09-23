package com.fingeso.fila_virtual.repositories;

import com.fingeso.fila_virtual.models.Local;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalRepo extends MongoRepository<Local, String> {
    Local findLocalByID(String id);
    List<Local> findByType(int type);


}
