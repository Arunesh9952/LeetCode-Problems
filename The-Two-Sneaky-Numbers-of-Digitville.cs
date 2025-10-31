public class Solution {
    public int[] GetSneakyNumbers(int[] nums) {
        HashSet<int> seen=new HashSet<int>();
        List<int> res=new List<int>();
        foreach(var num in nums){
            if(seen.Contains(num)){
                res.Add(num);
            }
            else{
               seen.Add(num);
            }
        }
        return res.ToArray();
    }
}