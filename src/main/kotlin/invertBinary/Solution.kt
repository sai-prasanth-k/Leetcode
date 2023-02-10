package invertBinary

import symmetric.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        helper(root)
        return root
    }

    private fun helper(node: TreeNode?){
        if(node == null) return

        var tmp : javax.swing.tree.TreeNode? = node.left
        node.left = node.right
        node.right = tmp

        helper(node.right)
        helper(node.left)
    }
}