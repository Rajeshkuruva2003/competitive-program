// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isValidPassword(s)){
            System.out.println(s + "is a valid password");
        }
        else{
            System.out.println(s + "is an invalid password");
        }
    }
    public static boolean isValidPassword(String s){
        if(s.length()<8 || s.length()>50){
            return false;
        }
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else{
                hasSpecial=true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    } 
}