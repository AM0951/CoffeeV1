/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Legatodie_2
 */
package com.example.model;

import java.util.*;

public class CoffeeExpert {
   public List getTypes(String type) {

     List types = new ArrayList();

       switch (type) {
           case "milky":
               types.add("latte");
               types.add("cappuccino");
               break;
           case "froffy":
               types.add("latte");
               types.add("cappuccino");
               types.add("frappuccino");
               break;
           case "icey":
               types.add("frappuccino");
               break;
           case "strong":
               types.add("espresso");
               types.add("double espresso");
               break;
           default:
               types.add("Vending Machine");
               break;
       }
     return(types);
   }
}
