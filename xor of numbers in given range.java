import java.util.*;
class Main{
    public static int rangeF(int n){
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        else{
            return n;
        }
    }
    public static int rangF(int l,int r){
        return rangeF(l-1)^rangeF(r);
        
    }
    public static void main(String[] args){
        int n=3;
        int l=1;
        int r=3;
        int ans=rangF(l,r);
    System.out.println(ans);    
    }
}