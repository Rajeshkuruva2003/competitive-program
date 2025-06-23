import java.util.*;
/*class Main{
    public static void recur(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("raj");
        recur(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recur(1,n);
    }
}*/
/*class Main{
    
    public static void recur(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        recur(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recur(1,n);
    }
}*/
/*class Main{
    
    public static void recur(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        recur(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recur(n,n);
    }
}*/
/*class Main{
    
    public static void recur(int i,int n){
        if(i<1){
            return;
        }
        recur(i-1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recur(n,n);
    }
}*/
/*class Main{
    
    public static void recur(int i,int n){
        if(i>n){
            return;
        }
        recur(i+1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recur(1,n);
    }
}*/
class Main{
    
    public static void recur(int i, int n, int[] arr) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        recur(i + 1, n, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        recur(0, n, arr);

        System.out.println(Arrays.toString(arr));
    }
}


