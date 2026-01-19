import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String parts[]=str.split(" ");
        String sub=parts[0];
        String main=parts[1];
        int i=0,j=0;
        while(i<sub.length() && j<main.length()){
            if(sub.charAt(i) == main.charAt(j)){
               
                j++;
            }
            i++;
        }
        if(j==sub.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}