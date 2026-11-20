class Solution {
    String reverses(String s) {
        StringBuilder res= new StringBuilder();
        int i=0,j=s.length()-1;
        while(i < s.length() && j>=0){
            if(s.charAt(i) == ' '){
                res.append(s.charAt(i));
            }
            else{
                while(s.charAt(j) == ' '){
                    j--;
                }
                res.append(s.charAt(j));
                j--;
            }
            i++;
        }
        
        return res.toString();
    }
}
