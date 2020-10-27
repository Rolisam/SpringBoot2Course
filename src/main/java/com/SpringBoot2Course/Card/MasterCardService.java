package com.SpringBoot2Course.Card;

import com.SpringBoot2Course.Car.Card;
import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card {

   public MasterCardService() {
   }

   public String getInfo(){
      return "MasterCardService";
   }
}
