package org.example;

public class Palindrome {

    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            int iAkhir = s.length() -i -1;

            if (s.charAt(i) != s.charAt(iAkhir)){
                return false;
            }
        }
        return true;
    }
}
