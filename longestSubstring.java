class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=s.length();
        int max;
        if(l!=0) max=1;
        else return 0;
        int len=0;
        int strStart=0;
        for(int i=1;i<l;i++){
            len=1;
            for(int j=strStart;j<i;j++){
                
                if(s.charAt(i)==s.charAt(j)){
                    strStart=j+1;
                    if(i-j>max) max=i-j;
                    break;
                }
                else {len++;
                if(len>max) max=len;}
            }
        }
        return max;
    }
}
