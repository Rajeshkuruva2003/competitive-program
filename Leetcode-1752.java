class Solution {
    public boolean check(int[] nums) {
     ArrayList<Integer> list = new ArrayList<>();
     ArrayList<Integer> list1=new ArrayList<>();
     for(int val:nums){
        list.add(val);
        list1.add(val);
     }

     Collections.sort(list1);
        for(int j=0;j<nums.length;j++){
            list.add(nums[j]);
            list.remove(0);
            if(list.equals(list1)){
                return true;
            }
        }
      return false;
}
}