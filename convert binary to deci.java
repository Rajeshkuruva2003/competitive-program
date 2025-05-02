import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res=sc.nextLine();
        int len=res.length();
        int num=0;
        int p=1;
        for(int i=len-1;i>=0;i--){
            if(res.charAt(i)=='1'){
                num=num+p;
            }
            p*=2;
        }
        System.out.println(num);
    }
}
