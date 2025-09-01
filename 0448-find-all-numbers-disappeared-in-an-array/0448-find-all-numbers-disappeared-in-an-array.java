class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!ans.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}