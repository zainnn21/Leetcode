package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PalindromeTest {

    @Test
    void testPalindrome(){
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome("aaaaa"));
        Assertions.assertTrue(palindrome.isPalindrome("asa"));
        Assertions.assertTrue(palindrome.isPalindrome("abuba"));
        Assertions.assertTrue(palindrome.isPalindrome(""));

        Assertions.assertFalse(palindrome.isPalindrome("abc"));
        Assertions.assertFalse(palindrome.isPalindrome("uhua"));

    }

}