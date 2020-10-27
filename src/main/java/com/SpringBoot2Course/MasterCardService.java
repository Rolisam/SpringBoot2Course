package com.SpringBoot2Course;

import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card {

   public MasterCardService() {
   }

   public String getInfo(){
      return "MasterCardService";
   }
}
