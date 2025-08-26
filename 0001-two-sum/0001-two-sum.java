class Solution {
    public int[] twoSum(int[] nums, int target) {
        // List<Integer> ans=new ArrayList<>();
        // Map<Integer,Integer> map=new HashMap<>();
        //  for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];

            
        //     if (map.containsKey(complement)) {
        //         return new int[]{map.get(complement), i};
        //     }

           
        //     map.put(nums[i], i);
        // }

        
        // return new int[]{-1, -1};
        for (int i = 1; i < nums.length; i ++) {
            for (int j = i; j < nums.length; j ++) {
                int total = nums[j] + nums[j - i];
                if(target == total){
                    return new int[]{j - i , j};
                }
            }
        }
        return new int[]{};
    }
}