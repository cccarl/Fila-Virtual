package com.fingeso.fila_virtual.services;


import com.fingeso.fila_virtual.models.Queue;
import com.fingeso.fila_virtual.models.User;
import com.fingeso.fila_virtual.repositories.QueueRepo;
import com.fingeso.fila_virtual.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ExecutableRemoveOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.MongoOperations;


import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // requests can be done from every port with *
@RequestMapping(value = "/queue") // queue queries URL

public class QueueService {
    @Autowired
    private QueueRepo queueRepo;
    @Autowired
    private UserRepo userRepo;
    //retornar una fila por su id
    @RequestMapping(value = "/getQueue/{primary}",method = RequestMethod.GET)
    @ResponseBody // this will make the controller respond with a JSON format
    public Queue getQueue(@PathVariable(value="primary")  String primary) { return this.queueRepo.findQueueByPrimary(primary);}

    // version chanta
    @RequestMapping(value = "/createQueue", method = RequestMethod.GET)
    public void createQueue(
            @RequestParam(defaultValue = "1") String primary
            , @RequestParam(defaultValue = "true") String enabled
            , @RequestParam(defaultValue = "5") String estimatedTime
    ){



        Queue newQueue = new Queue(primary,enabled,estimatedTime);
        try{
            this.queueRepo.save(newQueue);
        }
        catch (Exception e){
            System.out.println("ERROR: COULDN'T CREATE USER");
        }



    }

    @RequestMapping(value = "/registerUserInQueue", method = RequestMethod.GET)
    @ResponseBody
    public Queue registerUserInQueue(){
        try{
            List<User> users = this.userRepo.findAll(); //se obtiene todos los usuarios
            User nuevo = users.get(users.size()-1);
            Queue queue = new Queue("1", "true", "5");
            ArrayList<User> aux = new ArrayList<>();
            // a queue is attempted to be searched, if it fails, it's created
            try{
                aux = this.queueRepo.findQueueByPrimary("1").getUserList();
            }
            catch (Exception e ){
                this.queueRepo.save(new Queue("1", "true", "5"));
                System.out.println("ERROR IN: this.queueRepo.findQueueByPrimary(\"1\")");
            }

            aux.add(nuevo);
            queue.setUserList(aux);
            this.queueRepo.deleteByPrimary("1");
            this.queueRepo.save(queue);
            return queue;
        }
        catch (Exception e ){
            return new Queue("1", "error", "error");
        }
    }
    @RequestMapping(value = "/removeUserInQueue", method = RequestMethod.GET)
    @ResponseBody
    public Queue removeUserInQueue(){
        try{
            Queue newQueue = new Queue("1", "true", "5");
            try {
                newQueue = this.queueRepo.findQueueByPrimary("1");
            }
            catch (Exception e){
                this.queueRepo.save(new Queue("1", "true", "5"));
                newQueue = this.queueRepo.findQueueByPrimary("1");
            }

            ArrayList<User> newUserList = newQueue.getUserList();
            newUserList.remove(0);
            newQueue.setUserList(newUserList);
            Queue newBetterQueue = new Queue("1", "true", "5");
            newBetterQueue.setUserList(newUserList);
            this.queueRepo.deleteByPrimary("1");
            this.queueRepo.save(newBetterQueue);
            return newQueue;
        }
        catch (Exception e ){
            return null;
        }
    }
}