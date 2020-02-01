// Preorder + Inorder
public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
        return null;
    } else if (preorder.length != inorder.length) {
        return null;
    }
        
    return helper(preorder, inorder, 0, inorder.length - 1, 0);
}
    
private TreeNode helper(int[] preorder, int[] inorder, int start, int end, int pIndex) {
    if (start > end) {
        return null;
    } else if (pIndex >= preorder.length) {
        return null;
    }
        
    TreeNode root = new TreeNode(preorder[pIndex]);
    int index = -1;
        
    for (int i = start; i <= end; i++) {
        if (inorder[i] == preorder[pIndex]) {
            index = i;
            break;
        }
    }
    root.left = helper(preorder, inorder, start, index - 1, pIndex + 1);
    root.right = helper(preorder, inorder, index + 1, end, pIndex + index - start + 1);
        
    return root;
}

// Postorder + Inorder
public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) {
        return null;
    } else if (inorder.length != postorder.length) {
        return null;
    }
        
    return helper(inorder, postorder, 0, postorder.length - 1, postorder.length - 1);
}
    
private TreeNode helper(int[] inorder, int[] postorder, int start, int end, int pIndex) {
    if (start > end) {
        return null;
    } else if (pIndex < 0) {
        return null;
    }
        
    TreeNode root = new TreeNode(postorder[pIndex]);
    int index = -1;
        
    for (int i = start; i <= end; i++) {
        if (inorder[i] == root.val) {
            index = i;
            break;
        }
    }
    root.left = helper(inorder, postorder, start, index - 1, pIndex - end + index - 1);
    root.right = helper(inorder, postorder, index + 1, end, pIndex - 1);
        
    return root;
}