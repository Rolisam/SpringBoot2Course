package com.SpringBoot2Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

   private CarService carService;

   @Autowired
   public CarController(CarService carService) {
      this.carService = carService;
   }

   @GetMapping
   public List<Car> get() {
      System.out.println("Wpadam2");
      return carService.showCar();
   }

}
