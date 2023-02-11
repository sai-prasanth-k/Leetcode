package mergeTwoBinaryTree

import symmetric.TreeNode

class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if(root1 == null && root2 == null) return null
        if(root1 == null) return root2
        if(root2 == null) return root1


        var result : TreeNode? = TreeNode(root1.`val` + root2.`val`)
        result?.left = mergeTrees(root1.left, root2.left)
        result?.right = mergeTrees(root1.right, root2.right)
        return result

    }
}