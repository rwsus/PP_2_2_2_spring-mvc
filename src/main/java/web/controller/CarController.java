package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceImpl;

@Controller
public class CarController {
    private ServiceImpl serviceImpl;

    @Autowired
    public CarController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    @GetMapping(value = "/cars")
    public String showCars(
            ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("listOfCars", serviceImpl.numberOfCars(count));
        return "cars";
    }
}
