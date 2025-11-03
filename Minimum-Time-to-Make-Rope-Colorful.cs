public class Solution {
    public int MinCost(string colors, int[] neededTime) {
        var c=0;
        for(var i=0;i<colors.Length-1;i++){
            if(colors[i]==colors[i+1]){
                var remfirst=neededTime[i];
                var remsecond=neededTime[i+1];

                if(remfirst<=remsecond){
                    c+=remfirst;
                    neededTime[i]=remsecond;
                }
                else{
                     c+=remsecond;
                    neededTime[i+1]=remfirst;
                }
            }
        }
        return c;
    }
}