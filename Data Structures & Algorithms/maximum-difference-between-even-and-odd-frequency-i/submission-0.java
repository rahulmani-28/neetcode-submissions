class Solution {
    public int maxDifference(String s) {
        int[]count=new int[26];
        for (char c:s.toCharArray()){
            count[c-'a']++;
        }
        int odd=0,even=s.length();
        for(int c:count){
            if((c&1)==1){
                odd=Math.max(odd,c);
            }
            else if(c>0){
                even=Math.min(even,c);
            }
        }
        return odd-even;
    }
}