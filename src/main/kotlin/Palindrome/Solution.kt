package Palindrome

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x ==0) {
            return true
        };
        if(x<0 || x % 10 ==0){
            return false;
        }

        var reversed_num = 0
        while(x > reversed_num){
            var pop = x %10
            x =x/10

            reversed_num = (reversed_num * 10) + pop
        }

        if(x == reversed_num || x == reversed_num /10) return true
    }
}