import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int count=1;
        for(int i=0;i<st.length();i++){
            if(i<st.length()-1 && st.charAt(i) == st.charAt(i=1)){
                count++;
            }
            else{
                System.out.print(st.charAt(i));
                if(count>1){
                    System.out.print(count);
                }
                count=1;
            }
        }
    }
}