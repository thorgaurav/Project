/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gaurav
 */
class FeildValidation {

    int age;
    boolean validateAge(String text) {
        try{
            age = Integer.parseInt(text);
        }
        catch(Exception e){
            return false;
        }
        if(age <= 0 || age >= 103){
            return false;
        }
        return true;
    }

    boolean validatePassword(String text) {
    
        if(text.length() < 6 || text.length() > 20){
            return false;
        }
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(!matcher.matches()){
            return false;
        }
        
        return true;    
    }

    boolean validateUserName(String text) {
        
        String regex = "^[a-zA-Z0-9](_(?!(\\.|_))|\\.(?!(_|\\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(!matcher.matches()){
            return false;
        }
        return true;
    }
    
}
