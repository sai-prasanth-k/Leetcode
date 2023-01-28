package AddTwoNumbers

class Solution {
    fun addTwoNumbers(l1: ListNode?,l2: ListNode?): ListNode? {
        val result = ListNode(-1)
        var current = result

        var list1 = l1
        var list2 = l2
        var carry = 0

        while (list1 != null || list2 != null){
            val first = if (list1 != null ) `val` else 0
            val second = if (list2 != null ) `val` else 0
            val sum = first + second + carry
            carry = sum /10
            current.next = ListNode(sum % 10)
        }
        if (carry > 0 ) current.next = ListNode(carry)
        return current.next
    }
}