package symmetric

import javax.swing.tree.TreeNode

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
    var ti = symmetric.TreeNode(5)
    var v = ti.`val`
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null ) return true
        return helper(root.left,root.right)
    }

    fun helper(left:TreeNode? , right: TreeNode?): Boolean{

        if(left == null && right == null) return true
        if(left == null || right == null || left.`val` != right.`val`) return false
        return helper(left.left, right.right) && helper(left.right , right.left)
    }
}