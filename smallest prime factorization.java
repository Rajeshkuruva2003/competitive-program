import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        int n = sc.nextInt(); 
       for (int i = 0; i < n; i++) {
            ls.add(sc.nextInt());
        }

        int limit = 100001;
        int[] spf = new int[limit];
        for(int i=1;i<limit;i++){
            spf[i]=i;
        }
        for(int i=2;i*i<limit;i++){
            if(spf[i]==i){
                for(int j=i*i;j<limit;j+=i){
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }
            }
        }
         for (int num: ls){
            System.out.print("Prime factors of " + num + ": ");

            while(num!=1){
                System.out.println(spf[num]+" ");
                num=num/spf[num];
            }
            System.out.println();
        }
    }
}