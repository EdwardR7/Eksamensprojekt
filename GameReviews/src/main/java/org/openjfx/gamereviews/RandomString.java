package org.openjfx.gamereviews;

import java.io.IOException;

public class RandomString {
    
    static String ABC = "";
    static String abc = "";
    static String numbers = "";
    
    
    // function to generate a random string of length n
    static String getAlphaNumericString(double n, boolean ABC_, boolean abc_, boolean numbers_) {

        // Check current checkboxes
        if(ABC_){
            
            ABC = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        } else{
            ABC = "";
        }
         if(abc_){
            
            abc = "abcdefghijklmnopqrstuvxyz";
        } else{
            abc = "";
        }
         if(numbers_){
            
            numbers = "0123456789";
        } else{
            numbers = "";
        }
        
        // chose a Character random from this String
       try{
        String AlphaNumericString = ABC + numbers + abc;
        
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder((int) n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
      
        return sb.toString();
       }catch(Exception e){
           System.out.println(e);
           return "No characters to create data from.";
       }
    }

}
