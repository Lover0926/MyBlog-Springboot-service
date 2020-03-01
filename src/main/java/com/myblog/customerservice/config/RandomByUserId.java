package com.myblog.customerservice.config;

import java.util.Random;

public class RandomByUserId {
   public  Integer randomByUserId(){
       int radomInt = new Random().nextInt(999999999);
       return radomInt;
   }
}
