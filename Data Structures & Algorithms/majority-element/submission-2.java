class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_count=0;
        int majority_ele=0;
        for(int num : nums)
        {
         
            map.put(num,map.getOrDefault(num,0)+1);
        
        
        
          if(map.get(num)>max_count){
          majority_ele=num;
          max_count=map.get(num);
          }
        }
        return majority_ele;
    }
}