package com.SpringBoot2Course.Card;

import com.SpringBoot2Course.Car.Card;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class VisaCardService implements Card {

   public VisaCardService() {
   }

   @Override
   public String getInfo() {
      return "VisaCardService";
   }
}
