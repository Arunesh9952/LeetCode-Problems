class Solution {
    private boolean isZero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
      int a=n-1;
      int b=1;
      while(!isZero(a)||!isZero(b)){
        a--;
    b++;
      }
      return new int[]{a,b};
    }
    
}