// Binary Search in Sorted Array
public int binarySearch(int[] sources, int target) {
	if (sources == null || sources.length == 0) {
		return -1;
	}

	int start = 0, end = sources.length - 1;
	while (start + 1 < end) {
		int mid = start + (end - start) >> 1;

		if (sources[mid] < target) {
			start = mid;
		} else if (sources[mid] > target) {
			end = mid;
		} else {
			return mid;
		}
	}

	return -1;
}

// Saddleback Search in Sorted matrix
// (Strictly increase from left to right in each row, from up to down in each column)
// Return the number of integers, which equal to target
public int countSearch(int[][] matrix, int target) {
	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
		return 0;
	}

	int row = matrix.length, col = matrix[0].length;
	int j = bsearch(matrix[0], target);
	int i = 0, result = 0;

	while (i < row && j >= 0) {
		if (matrix[i][j] < target) {
			i++;
		} else if (matrix[i][j] > target) {
			j--;
		} else {
			i++;
			j--;
			result++:
		}
	}

	return result;
}

private int bsearch(int[] A, int target) {
	int start = 0, end = A.length - 1;

	while (start + 1 < end) {
		int mid = start + (end - start) >> 1;

		if (A[mid] < target) {
			start = mid;
		} else {
			end = mid;
		}
	}

	if (A[end] == target) {
		return end;
	}
	return start;
}