import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt(); 
        int k = scanner.nextInt();
        int[][] a = new int[n][n];
      

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<=n-k;i++){
            for(int j=0;j<=n-k;j++){
                for(int p=0;p<k;p++){
                    for(int q=0;q<k;q++){
                        System.out.print(a[i + p][j + q] + " ");
                    }
                    System.out.println();
                }
                System.out.println();  
            }
        }

        //scanner.close();
    }
}