package com.SpringBoot2Course.card;

import com.SpringBoot2Course.car.Card;
import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card {

   public MasterCardService() {
   }

   public String getInfo(){
      return "MasterCardService";
   }
}
