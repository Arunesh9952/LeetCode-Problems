public class Solution {
    public int[] GetSneakyNumbers(int[] nums) {
        
        Dictionary<int, int> freq = new Dictionary<int, int>();
        List<int> result = new List<int>();

        foreach (int num in nums) {
            if (freq.ContainsKey(num)) {
                freq[num]++;
            } else {
                freq[num] = 1;
            }
        }

        foreach (var pair in freq) {
            if (pair.Value > 1)
                result.Add(pair.Key);
        }

        return result.ToArray();
    }
}