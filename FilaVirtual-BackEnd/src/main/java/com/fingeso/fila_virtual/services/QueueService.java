package com.fingeso.fila_virtual.services;


import com.fingeso.fila_virtual.models.Queue;
import com.fingeso.fila_virtual.models.User;
import com.fingeso.fila_virtual.repositories.QueueRepo;
import com.fingeso.fila_virtual.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
            Queue queue = this.queueRepo.findQueueByPrimary("1");
            ArrayList<User> aux = queue.getUserList();
            aux.add(nuevo);
            queue.setUserList(aux);
            this.queueRepo.save(queue);
            return queue;
        }
        catch (Exception e ){
            return null;
        }
    }
    @RequestMapping(value = "/removeUserInQueue", method = RequestMethod.GET)
    @ResponseBody
    public Queue removeUserInQueue(){
        try{
            List<User> users = this.userRepo.findAll(); //se obtiene todos los usuarios
            User antiguo = users.get(0);
            Queue queue = this.queueRepo.findQueueByPrimary("1");
            ArrayList<User> aux = queue.getUserList();
            aux.remove(antiguo);
            queue.setUserList(aux);
            return queue;
        }
        catch (Exception e ){
            return null;
        }
    }
}
