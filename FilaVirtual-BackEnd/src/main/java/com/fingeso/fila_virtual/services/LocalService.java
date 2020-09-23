package com.fingeso.fila_virtual.services;

import com.fingeso.fila_virtual.models.User;
import com.fingeso.fila_virtual.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;




@restController
@CrossOrigin(origins = "*") //agregar servidor más adelante
@RequestMapping(value = "/local")

public class LocalService{

    @autowired
    @RequestMapping(value = '/getall', method = RequestMetod.GET)
    @ResponseBody
    public List<Local> getAll(){
        System.out.println("holaaa");
        return this.LocalRepo.findAll();
    }

    @requestMapping(value = '/getbyid/{id}', method = RequestMethod.GET)
    @ResponseBody
    public Local getById(@PathVarable(value = "id") String id){
        System.out.println(id);
        return this.localRepo.findLocalById(id);
    }


}