package com.fingeso.fila_virtual.services;

import com.fingeso.fila_virtual.models.Local;
import com.fingeso.fila_virtual.repositories.LocalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@CrossOrigin(origins = "*") //agregar servidor más adelante
@RequestMapping(value = "/local")

public class LocalService{

    @Autowired
    private LocalRepo localRepo;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    @ResponseBody
    public List<Local> getAll(){
        System.out.println("holaaa");
        return this.localRepo.findAll();
    }
/*
    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Local getById(@PathVariable(value = "id") String id){
        System.out.println(id);
        return this.localRepo.findLocalById(id);
    }
*/

}