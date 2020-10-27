package com.SpringBoot2Course;

import org.springframework.context.annotation.Primary;
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
