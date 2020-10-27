package com.SpringBoot2Course.card;

import com.SpringBoot2Course.car.Card;
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
