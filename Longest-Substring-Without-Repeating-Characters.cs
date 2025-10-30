public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int left=0;
        int right=0;
        int max=0;
        HashSet<char> set=new HashSet<char>();

        while(right<s.Length){
            if(!set.Contains(s[right])){
                set.Add(s[right]);
                max=Math.Max(max,set.Count);
                right++;
            }
            else{
                 set.Remove(s[left]);
                 left++;
            }
        }
        return max;
    }
}