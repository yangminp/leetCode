
//125ValidPalindrome 
//Given a string, determine if it is a palindrome, 
//considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

// Note:
// Have you consider that the string might be empty? This is a good question to ask during an interview.

// For the purpose of this problem, we define empty string as valid palindrome.

class Test{
    public boolean isPalindrome(String s) {
        // if s is empty
        if(s.isEmpty()==0 || s.trim().length() == 0) return true;
        //if s only has spaces

        //else
        String strings[] = s.split(", ");
        if(strings.length == 1){
            return false;
        }
        for(int i = 0; i< strings.length-1;i++){
            String s1[] = strings[i].split(" ");
            String s2[] = strings[i+1].split(" ");
            if(!s1[0].equalsIgnoreCase(s2[0])){
                return false;
            }
        }
         return true;
        
    }
}


public class Solution {
    //test
    public static void main(String[] args) {
        Test s = new Test();

        boolean f = s.isPalindrome("               ");
        boolean f2 = s.isPalindrome("");
        if(f2){
            System.out.println("22true");
        }
        if(f){
            System.out.println("11true");
        }
        
    }
}
