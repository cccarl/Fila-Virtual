package com.fingeso.fila_virtual.services;


import com.fingeso.fila_virtual.models.Queue;
import com.fingeso.fila_virtual.models.User;
import com.fingeso.fila_virtual.repositories.QueueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // requests can be done from every port with *
@RequestMapping(value = "/queue") // queue queries URL

public class QueueService {
    @Autowired
    private QueueRepo queueRepo;
    //retornar una fila por su id
    @RequestMapping(value = "/getQueue/{id}", method = RequestMethod.GET)
    @ResponseBody // this will make the controller respond with a JSON format
    public Queue getAll(String id) { return this.queueRepo.findQueueById(id);}

}
