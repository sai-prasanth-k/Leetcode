package linkedList

class LinkedList<T> {

    private var head : Node<T>?=null
    private var tail : Node<T>?=null
    private var size : Int = 0

    fun isLinkedListEmpty(): Boolean{
        return size == 0
    }

    override fun toString(): String {
        return if (isLinkedListEmpty()){
            "Linked List is Empty"
        }else {
             head.toString()
        }
    }
}