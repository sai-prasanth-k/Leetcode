package longestSubstringWithoutRepeatingCharacter

import java.util.*
import kotlin.math.max

class SetApproach {
    fun longestSubstringWithoutRepeating (s : String) : Int {
        var maxLength = 0
        val queue = LinkedList<Char>()

        for (i in s.indices){
            if(queue.isNotEmpty()) {
                when {
                    queue.first == s[i] -> queue.poll()
                    queue.last == s[i] -> queue.clear()
                    queue.contains(s[i]) -> {
                        while (queue.isNotEmpty()){
                            if(queue.poll() == s[i]) break
                        }
                    }
                }
            }
            maxLength = max(maxLength , queue.size+1)
            queue.offer(s[i])
        }
        return maxLength
    }
}
