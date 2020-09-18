package com.fingeso.fila_virtual.services;

import com.fingeso.fila_virtual.models.User;
import com.fingeso.fila_virtual.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // requests can be done from every port with *
@RequestMapping(value = "/user") // user queries URL
public class UserService {

    @Autowired // configuration to bring queries from UserRepo without some manual configurations
    private UserRepo userRepo;

    // basically CRUD to connect the web browser with the DB, this is a GET
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    @ResponseBody // this will make the controller respond with a JSON format
    public List<User> getAll() {
        return this.userRepo.findAll();
    }

    @RequestMapping(value = "/getbyname/{names}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByName(@PathVariable(value = "names") String names) {
        return this.userRepo.findUserByNames(names);
    }
}

