package Palindrome

class Solution {
    fun isPalindrome(x: Int): Boolean {
        var y = x
        if(y ==0) {
            return true
        };
        if(y<0 || y % 10 ==0){
            return false;
        }

        var reversed_num = 0
        while(y > reversed_num){
            var pop = x %10
            y =y/10

            reversed_num = (reversed_num * 10) + pop
        }

        if(x == reversed_num || x == reversed_num /10) return true
    }
}