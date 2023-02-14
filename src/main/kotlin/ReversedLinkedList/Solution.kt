package ReversedLinkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var output : ListNode? = null;
        var heaad = head

        while(heaad != null){
            var tmp = heaad.next
            heaad.next = output
            output = heaad
            heaad = tmp
        }

        return output

    }
}