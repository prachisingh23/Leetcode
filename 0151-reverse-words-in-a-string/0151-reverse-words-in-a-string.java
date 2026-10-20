class Solution {
    public String reverseWords(String s) {
        String result = "";
        int end = s.length();
        for (int i = s.length()-1; i>=0; i--){
            char ch  = s.charAt(i);
            if (ch == ' '){
                if(i+1<end){
                    result = result +s.substring(i+1,end) + " ";
                }
                end = i;
            }
        }
        if (end > 0){
            result = result + s.substring(0,end);
        }
        return result.trim(); 
    }
}