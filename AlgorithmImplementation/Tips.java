// 方向数组
int[] dx = {-1, 1, 0, 0};
int[] dy = {0, 0, -1, 1};

// 置乱算法
public void permute(int[] A) {
    Random r = new Random();
    for (int i = A.length; i > 0; i--) {
    	swap(A, i - 1, r.nextInt(i));
    }
}

private void swap(int[] A, int left, int right) {
    int temp = A[left];
    A[left] = A[right];
    A[right] = temp;
}

// 四平方和定理
public int numSquares(int n) {
    if (n <= 0) {
        return 0;
    }

    while (n % 4 == 0) {
    	n /= 4;
    }
    if (n % 8 == 7) {
    	return 4;
    }
    for (int i = 0; i * i <= n; i++) {
    	int j = Math.sqrt(n - i * i);
    	if (i * i + j * j == n) {
    		return (i == 0 || j == 0) ? 1 : 2;
    	}
    }

    return 3;
}

// 括号匹配
public boolean isValidParentheses(String s) {
	if (s == null || s.length() == 0) {
		return true;
	}

	Stack<Character> stack = new Stack<>();

	for (char c : s.toCharArray()) {
		if (c == '(' || c == '{' || c == '[') {
			stack.push(c);
		} else if (c == ')') {
			if (stack.empty() || stack.peek() != '(') {
				return false;
			}
			stack.pop();
		} else if (c == '}') {
			if (stack.empty() || stack.peek() != '{') {
				return false;
			}
			stack.pop();
		} else if (c == ']') {
			if (stack.empty() || stack.peek() != '[') {
				return false;
			}
			stack.pop();
		}
	}

	return stack.empty() ? true : false;
}

// dfs问题去重
用prev[]数组记录与当前元素相同的前一元素的位置，如果这一元素的位置处在startIndex和i之间则应跳过
因此，当所给数组为升序时，无需记录prev[]，只需确定前一元素是否没有取到