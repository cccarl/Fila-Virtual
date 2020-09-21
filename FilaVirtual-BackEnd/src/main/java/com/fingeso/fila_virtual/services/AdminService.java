package com.fingeso.fila_virtual.services;

import com.fingeso.fila_virtual.models.Admin;
import com.fingeso.fila_virtual.repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins = "*") // requests can be done from every port with *
@RequestMapping(value = "/admin") // owner queries URL
public class AdminService {

    @Autowired // configuration to bring queries from UserRepo without some manual configurations
    private AdminRepo adminRepo;

    @RequestMapping(value = "/registeradmin", method = RequestMethod.GET)
    public ModelAndView createOwner(@RequestParam(defaultValue = "defaultNames") String names
            , @RequestParam(defaultValue = "defaultSurnames") String surnames
            , @RequestParam(defaultValue = "11.111.111-1") String rut
            , @RequestParam(defaultValue = "example@ex.com") String email
            , @RequestParam(defaultValue = "safepass") String password
            , @RequestParam(defaultValue = "+56912345678") String phoneNum
            , @RequestParam(defaultValue = "user") String role) {

        ModelMap model = new ModelMap();

        Admin newAdmin = new Admin(rut, names, surnames, email, password, phoneNum, role);
        try {
            this.adminRepo.save(newAdmin);
        } catch (Exception e) {
            System.out.println("ERROR: COULDN'T CREATE ADMIN");
            return null;
        }

        return new ModelAndView("redirect:/user/getall", model);
    }

}
