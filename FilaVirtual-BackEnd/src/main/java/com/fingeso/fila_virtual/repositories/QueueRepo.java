package com.fingeso.fila_virtual.repositories;

import com.fingeso.fila_virtual.models.Queue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueueRepo extends MongoRepository<Queue, String> {
    Queue findQueueByPrimary(String primary);
    void deleteByPrimary(String primary);
}