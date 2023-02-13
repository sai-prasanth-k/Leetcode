package LargestSubstringPalindrome

class Solution {
    private var resultStart = 0
    private var resultEnd = 0
    fun longestPalindrome(s: String): String {
        var strLength = s.length
        if(strLength < 2) return s

        for(i in 0 until strLength){
            expand(s ,i, i)
            expand(s ,i, i+1)
        }
        return s.substring(resultStart, resultStart + resultEnd)
    }

    private fun expand(str : String, begin : Int, end : Int){
        while(begin >=0 && end <= str.length && str[begin] == str[end]){
            begin-1
            end+1
        }
        if(resultEnd < end - begin - 1){
            resultStart = begin + 1
            resultEnd = end - begin -1
        }
    }
}