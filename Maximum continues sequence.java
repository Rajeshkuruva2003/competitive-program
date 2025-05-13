import java.util.*;

class Main
{
	public static int findIndexofZero(int[] nums)
	{
		
		int max_c=0;
		int max_ind=-1;
		int cnt=0;
		int prev=-1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1){
				cnt++;
			}
			else{
				cnt=i-prev;
				prev=i;
			}
			if(cnt>max_c){
				max_c=cnt;
				max_ind=prev;
			}
		}
		return max_ind;
	}
	
	 public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int index = findIndexofZero(nums);
 
        if (index != -1) {
            System.out.print("Index to be replaced is " + index);
        }
        else {
            System.out.print("Invalid input");
        }
    }

}
