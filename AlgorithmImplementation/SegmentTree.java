class SegmentTree {
	class SegmentTreeNode {
		int start, end, max;
		SegmentTreeNode left, right;

		public SegmentTreeNode(int start, int end, int max) {
			this.start = start;
			this.end = end;
			this.max = max;
			left = right = null;
		}
	}

	private SegmentTreeNode root;

	public SegmentTree(int[] A) {
		root = build(A, 0, A.length - 1);
	}

	public SegmentTreeNode build(int[] A, int start, int end) {
		if (start == end) {
			return new SegmentTreeNode(start, end, A[start]);
		}

		int mid = start + (end - start) / 2;

		SegmentTreeNode node = new SegmentTreeNode(start, end, -1);
		node.left = build(A, start, mid);
		node.right = build(A, mid + 1, end);
		node.max = Math.max(node.left.max, node.right.max);

		return node;
	}

	public void modify(Segment node, int index, int value) {
		if (index < node.start || index > node.end) {
			return;
		}
		if (node.start == index && node.end == index) {
			node.max = value;
			return;
		}

		modify(node.left, index, value);
		modify(node.right, index, value);

		node.max = Math.max(node.left.max, node.right.max);
	}

	public int query(Segment node, int start, int end) {
		if (node.start <= start && node.end >= end) {
			return node.max;
		}

		if (end < node.start || node.end < start || start > end) {
			return Integer.MIN_VALUE;
		}

		return Math.max(query(node.left, start, end), query(node.right, start, end));
	}
}