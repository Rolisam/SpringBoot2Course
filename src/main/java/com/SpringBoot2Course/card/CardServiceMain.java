package com.SpringBoot2Course.card;

import com.SpringBoot2Course.car.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardServiceMain {

   private Card card;

   @Autowired
   public CardServiceMain(@Qualifier("masterCardService") Card card) {
      this.card = card;
      String info = card.getInfo();
      System.out.println(info);
   }


}
