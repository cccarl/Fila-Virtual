package com.fingeso.fila_virtual.services;

import com.fingeso.fila_virtual.models.Owner;
import com.fingeso.fila_virtual.repositories.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins = "*") // requests can be done from every port with *
@RequestMapping(value = "/owner") // owner queries URL
public class OwnerService {

    @Autowired // configuration to bring queries from UserRepo without some manual configurations
    private OwnerRepo ownerRepo;


    @RequestMapping(value = "/registerowner", method = RequestMethod.GET)
    public ModelAndView createOwner(@RequestParam(defaultValue = "defaultNames") String names
            , @RequestParam(defaultValue = "defaultSurnames") String surnames
            , @RequestParam(defaultValue = "11.111.111-1") String rut
            , @RequestParam(defaultValue = "example@ex.com") String email
            , @RequestParam(defaultValue = "safepass") String password
            , @RequestParam(defaultValue = "+56912345678") String phoneNum
            , @RequestParam(defaultValue = "user") String role) {

        ModelMap model = new ModelMap();
        Owner newOwner = new Owner(rut, names, surnames, email, password, phoneNum, role);

        model.addAttribute("names", newOwner.getNames());
        model.addAttribute("surnames", newOwner.getSurnames());
        model.addAttribute("rut", newOwner.getRut());
        model.addAttribute("email", newOwner.getEmail());
        model.addAttribute("password", newOwner.getPassword());
        model.addAttribute("phoneNum", newOwner.getPhoneNum());
        model.addAttribute("role", newOwner.getRole());

        try {
            this.ownerRepo.save(newOwner);
        } catch (Exception e) {
            System.out.println("ERROR: COULDN'T CREATE OWNER");
            return null;
        }

        return new ModelAndView("redirect:/admin/registeradmin", model);
    }
}

