/*
 * 中缀表达式转换成前缀表达式 (Polish Notation)
 * 1. 初始化两个栈:运算符栈s1，储存中间结果的栈s2
 * 2. 从右至左扫描中缀表达式
 * 3. 遇到操作数时，将其压入s2
 * 4. 遇到运算符时，比较其与s1栈顶运算符的优先级
 *    1. 如果s1为空，或栈顶运算符为右括号“)”，则直接将此运算符入栈
 *	  2. 否则，若优先级比栈顶运算符的较高或相等，也将运算符压入s1
 *	  3. 否则，将s1栈顶的运算符弹出并压入到s2中，再次转到(4-1)与s1中新的栈顶运算符相比较
 * 5. 遇到括号时
 *	  1. 如果是右括号“)”，则直接压入s1
 *    2. 如果是左括号“(”，则依次弹出S1栈顶的运算符，并压入S2，直到遇到右括号为止，此时将这一对括号丢弃
 * 6. 重复步骤2至5，直到表达式的最左边
 * 7. 将s1中剩余的运算符依次弹出并压入s2
 * 8. 依次弹出s2中的元素并输出，结果即为中缀表达式对应的前缀表达式
 */
public List<String> convertToPN(String[] expression) {
	List<String> results = new ArrayList<String>();
	if (expression == null || expression.length == 0) {
		return results;
	}

	Stack<String> stack1 = new Stack<>();
	Stack<String> stack2 = new Stack<>();

	for (int i = expression.length - 1; i >= 0; i--) {
		String s = expression[i];
		if (s.equals(")") || s.equals("*") || s.equals("/")) {
			stack1.push(s);
		} else if (s.equals("+") || s.equals("-")) {
			if (stack1.empty()) {
				stack1.push(s);
			} else {
				while (!stack1.empty() && (stack1.peek().equals("*") || stack1.peek().equals("/"))) {
					stack2.push(stack1.pop());
				}
				stack1.push(s);
			}
		} else if (s.equals("(")) {
			while (!stack1.peek().equals(")")) {
				stack2.push(stack1.pop());
			}
			stack1.pop();
		} else {
			stack2.push(s);
		}
	}

	while (!stack1.empty()) {
		stack2.push(stack1.pop());
	}
	while (!stack2.empty()) {
		results.add(stack2.pop());
	}

	return results;
}

/*
 * 1. 初始化两个栈：运算符栈s1和储存中间结果的栈s2
 * 2. 从左至右扫描中缀表达式
 * 3. 遇到操作数时，将其压s2
 * 4. 遇到运算符时，比较其与s1栈顶运算符的优先级
 *    1.如果s1为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈
 *    2. 否则，若优先级比栈顶运算符的高，也将运算符压入s1（注意转换为前缀表达式时是优先级较高或相同，而这里则不包括相同的情况）
 *    3. 否则，将s1栈顶的运算符弹出并压入到s2中，再次转到(4-1)与s1中新的栈顶运算符相比较
 * 5. 遇到括号时
 *    1. 如果是左括号“(”，则直接压入s1
 *    2. 如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃
 * 6. 重复步骤2至5，直到表达式的最右边
 * 7. 将s1中剩余的运算符依次弹出并压入s2
 * 8. 依次弹出s2中的元素并输出，结果的逆序即为中缀表达式对应的后缀表达式（转换为前缀表达式时不用逆序）
 */
public List<String> convertToRPN(String[] expression) {
    List<String> results = new ArrayList<String>();
	if (expression == null || expression.length == 0) {
		return results;
	}

	Stack<String> stack1 = new Stack<>();
	Stack<String> stack2 = new Stack<>();

	for (String s : expression) {
		if (s.equals("(")) {
			stack1.push(s);
		} else if (s.equals("*") || s.equals("/")) {
			while (!stack1.empty() && (stack1.peek().equals("*") || stack1.peek().equals("/"))) {
				stack2.push(stack1.pop());
			}
			stack1.push(s);
		} else if (s.equals("+") || s.equals("-")) {
			while (!stack1.empty() && !stack1.peek().equals("(")) {
				stack2.push(stack1.pop());
			}
			stack1.push(s);
		} else if (s.equals(")")) {
			while (!stack1.empty() && !stack1.peek.equals("(")) {
				stack2.push(stack1.pop());
			}
			stack1.pop();
		} else {
			stack2.push(s);
		}
	}
	while (!stack1.empty()) {
		stack2.push(stack1.pop());
	}
	while (!stack2.empty()) {
		results.add(stack2.pop());
	}
	Collections.reverse(results);

	return results;
}

// Evaluate Reverse Polish Notation
public int evalRPN(String[] tokens) {
    if (tokens == null || tokens.length == 0) {
    	return 0;
    }

    Stack<String> stack = new Stack<>();

    for (String s : tokens) {
    	if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
    		int b = Integer.parseInt(stack.pop());
    		int a = Integer.parseInt(stack.pop());
    		String temp = calculate(a, b, s);
    		stack.push(temp); 
    	} else {
    		stack.push(s);
    	}
    }

    return Integer.parseInt(stack.pop());
}

private String calculate(int a, int b, String s) {
	if (s.equals("+")) {
		return Integer.toString(a + b);
	}
	if (s.equals("-")) {
		return Integer.toString(a - b);
	}
	if (s.equals("*")) {
		return Integer.toString(a * b);
	}
	return Integer.toString(a / b);
}