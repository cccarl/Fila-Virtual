package com.fingeso.fila_virtual.repositories;

import com.fingeso.fila_virtual.models.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OwnerRepo extends MongoRepository <Owner, String> {

}
