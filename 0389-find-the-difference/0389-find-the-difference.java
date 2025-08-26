class Solution {
    public char findTheDifference(String s, String t) {
      int sumS=0;
      int sumT=0;
      for(char c:s.toCharArray()){
        sumS+=c;
      }
      for(char c1:t.toCharArray()){
        sumT+=c1;
      }
      return (char)Math.abs(sumS-sumT);
    }
}