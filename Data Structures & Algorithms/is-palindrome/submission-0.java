class Solution {
    public boolean isPalindrome(String s) {
        int end=s.length()-1;
       for(int i=0; i<s.length()/2;i=i){
        if(!Character.isLetterOrDigit(s.charAt(i))){
            i++;
            continue;
            
        }
        if(!Character.isLetterOrDigit(s.charAt(end))){
            end--;
            continue;
        }
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(end))){
            return false;
        }
        i++;
        end--;
       }
       return true;
    }
}
