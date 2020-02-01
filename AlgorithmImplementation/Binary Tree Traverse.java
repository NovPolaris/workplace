// 层级遍历
public List<List<Integer>> levelOrder(TreeNode root) {
	List<List<Integer>> results = new ArrayList<>();
	if (root == null) {
		return results;
	}

	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	queue.offer(root);

	while (!queue.isEmpty()) {
		int size = queue.size();
		List<Integer> layer = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			TreeNode curt = queue.poll();
			layer.add(curt.val);
			if (curt.left != null) {
				queue.offer(curt.left);
			}
			if (curt.right != null) {
				queue.offer(curt.right);
			}
		}
		results.add(new ArrayList<Integer>(layer));
	}

	return results;
}

// 层级逆序遍历
public List<List<Integer>> levelOrderBottom(TreeNode root) {
	List<List<Integer>> results = new ArrayList<>();
	if (root == null) {
		return results;
	}

	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	Stack<List<Integer>> stack = new Stack<>();
	queue.offer(root);

	while (!queue.isEmtpy()) {
		int size = queue.size();
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			TreeNode curt = queue.poll();
			if (curt.left != null) {
				queue.offer(curt.left);
			}
			if (curt.right != null) {
				queue.offer(curt.right);
			}
		}
		stack.push(ans);
	}
	while (!stack.empty()) {
		List<Integer> curt = stack.pop();
		results.add(new ArrayList<Integer>(curt));
	}

	return results;
}

// Preorder traverse (前序遍历)
public List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<Integer>();
	if (root == null) {
		return result;
	}

	Stack<TreeNode> stack = new Stack<>();
	stack.push(root);

	while (!stack.empty()) {
	    TreeNode curt = stack.pop();
		result.add(curt.val);
		if (curt.right != null) {
			stack.push(curt.right);
		}
		if (curt.left != null) {
			stack.push(curt.left);
		}
	}

	return result;
}

// Morris preorder traverse
public List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<Integer>();
	if (root == null) {
		return result;
	}

	TreeNode curt = root;

	while (curt != null) {
		if (curt.left == null) {
			result.add(curt.val);
			curt = curt.right;
		} else {
			TreeNode temp = curt.left;
			while (temp.right != null && temp.right != curt) {
				temp = temp.right;
			}
			if (temp.right == null) {
				result.add(curt.val);
				temp.right = curt;
				curt = curt.left;
			} else {
				temp.right = null;
				curt = curt.right;
			}
		}
	}

	return result;
}

// Inorder traverse (中序遍历)
public List<Integer> inorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<Integer>();
	if (root == null) {
		return result;
	}

	Stack<TreeNode> stack = new Stack<>();
	TreeNode curt = root;

	while (curt != null || !stack.empty()) {
		while (curt != null) {
			stack.push(curt);
			curt = curt.left;
		}
		curt = stack.pop();
		result.add(curt.val);
		curt = curt.right;
	}

	return result;
}

// Morris inorder traverse
public List<Integer> inorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<Integer>();
	if (root == null) {
		return result;
	}

	TreeNode curt = root;

	while (curt != null) {
		if (curt.left == null) {
			result.add(curt.val);
			curt = curt.right;
		} else {
			TreeNode temp = curt.left;
			while (temp.right != null && temp.right != curt) {
				temp = temp.right;
			}
			if (temp.right == curt) {
				result.add(curt.val);
				temp.right = null;
				curt = curt.right;
			} else {
				temp.right = curt;
				curt = curt.left;
			}
		}
	}

	return result;
}

// Postorder traverse (后序遍历)
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> results = new ArrayList<Integer>();
	if (root == null) {
    	return results;
    }

    Stack<TreeNode> stack = new Stack<>();
    TreeNode prev = null;
    TreeNode curt = root;
    stack.push(root);
    while (!stack.empty()) {
    	curt = stack.peek();
    	if (prev == null || prev.left == curt || prev.right == curt) {
    		if (curt.left != null) {
    			stack.push(curt.left);
    		} else if (curt.right != null) {
    			stack.push(curt.right);
    		}
    	} else if (curt.left == prev) {
    		if (curt.right != null) {
    			stack.push(curt.right);
    		}
    	} else {
    		results.add(curt.val);
    		stack.pop();
    	}
    	prev = curt;
    }
    
    return results;
}

// Morris postorder traverse
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> results = new ArrayList<Integer>();
	if (root == null) {
    	return results;
    }

    TreeNode dummy = TreeNode(-1);
    TreeNode curt = dummy;
    dummy.left = root;

    while (curt != null) {
    	if (curt.left == null) {
    		curt = curt.right;
    	} else {
    		TreeNode temp = curt.left;
    		while (temp.right != null && temp.right != curt) {
    			temp = temp.right;
    		}
    		if (temp.right == null) {
    			temp.right = curt;
    			curt = curt.left;
    		} else {
    			helper(curt.left, temp, result);
    			temp.right = null;
    			curt = curt.right;
    		}
    	}
    }
    
    return results;
}

private void helper(TreeNode from, TreeNode to, List<Integer> result) {
	TreeNode temp = to;
	reverse(from, to);
	while (true) {
		result.add(temp.val);
		if (temp == from) {
			break;
		}
		temp = temp.right;
	}
	reverse(to, from);
}

private void reverse(TreeNode top, TreeNode down) {
	TreeNode x = top, y = top.right, z = null;
	while (x != down) {
		z = y.right;
		y.right = x;
		x = y;
		y = z;
	}
}