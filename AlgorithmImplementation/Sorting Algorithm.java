private void swap(int[] A, int left, int right) {
	int temp = A[left];
	A[left] = A[right];
	A[right] = temp;
}

// selectionSort
public void selectionSort(int[] A) {
    if (A == null || A.length <= 1) {
        return;
    }
    
    for (int i = A.length - 1; i >= 0; i--) {
        int max = Integer.MIN_VALUE;
        int index = -1;

    	for (int j = 0; j <= i; j++) {
        	if (max < A[j]) {
				max = A[j];
				index = j;
			}
		}
		swap(A, i, index);
	}
}

// bubbleSort
public void bubbleSort(int[] A) {
    if (A == null || A.length <= 1) {
        return;
    }

    boolean isSorted = false;
    int n = A.length;
    while (!isSorted) {
        isSorted = true;
        for (int i = 1; i < n; i++) {
            if (A[i - 1] > A[i]) {
                isSorted = false;
                swap(A, i - 1, i);
            }
        }
        n--;
    }
}

// insertionSort
public void insertionSort(int[] A) {
    if (A == null || A.length <= 1) {
        return;
    }

    for (int i = 1; i < A.length; i++) {
    	for (int j = i; j > 0 && A[j] < A[j - 1]; j--) {
    		swap(A, j - 1, j);
    	}
    }
}

// mergeSort
public void mergeSort(int[] A) {
    if (A == null || A.length <= 1) {
       	return;
    }
        
    int[] temp = new int[A.length];
    mergeSort(A, temp, 0, A.length - 1);
}
    
private void helper(int[] A, int[] temp, int start, int end) {
    if (start >= end) {
        return;
    }
        
    int mid = start + ((end - start) >> 1);
    int i = start, j = mid + 1, num = start;
        
    helper(A, temp, start, mid);
    helper(A, temp, mid + 1, end);
        
    while (i <= mid && j <= end) {
        if (A[i] <= A[j]) {
            temp[num++] = A[i++];
        } else {
            temp[num++] = A[j++];
        }
    }
        
    while (i <= mid) {
        temp[num++] = A[i++];
    }
    while (j <= end) {
        temp[num++] = A[j++];
    }
    for (int k = start; k <= end; k++) {
        A[k] = temp[k];
    }
}

// quickSort
public void quickSort(int[] A) {
    if (A == null || A.length <= 1) {
        return;
    }

    helper(A, 0, A.length - 1);
}

private void helper(int[] A, int start, int end) {
    if (start >= end) {
        return;
    }

    int pivot = A[start + ((end - start) >> 1)];
    int left = start, right = end;

    while (left <= right) {
        while (left <= right && A[left] < pivot) {
            left++;
        }
        while (left <= right && A[right] > pivot) {
            right--;
        }
        if (left <= right) {
            swap(A, left, right);
            left++;
            right--;
        }
    }

    helper(A, start, right);
    helper(A, left, end);
}

// heapSort
public void heapSort(int[] A) {
    if (A == null || A.length <= 1) {
        return;
    }

    for (int i = A.length / 2 - 1; i >= 0; i--) {
        heapify(A, i, A.length);
    }
    for (int i = A.length - 1; i > 0; i--) {
        swap(A, 0, i);
        heapify(A, 0, i);
    }
}

private void heapify(int[] A, int index, int len) {
    int temp = A[index];

    for (int i = 2 * index + 1; i < len; i = i * 2 + 1) {
        if (i + 1 < len && A[i] < A[i + 1]) {
            i++;
        }
        if (A[i] > temp) {
            A[index] = A[i];
            index = i;
        } else {
            break;
        }
    }
    A[index] = temp;
}

// mergeSort (LinkedList)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public ListNode mergeSort(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int n = 0;

    while (head != null) {
        head = head.next;
        n++;
    }
    for (int step = 1; step < n; step <<= 1) {
        ListNode prev = dummy;
        ListNode curt = dummy.next;

        while (curt != null) {
            ListNode left = curt;
            ListNode right = split(left, step);

            curt = split(right, step);
            prev = merge(left, right, prev);
        } 
    }
    
    return dummy.next;
}
    
private ListNode split(ListNode head, int step) {
    if (head == null) {
        return null;
    }
        
    for (int i = 1; head.next != null && i < step; i++) {
        head = head.next;
    }
        
    ListNode right = head.next;
    head.next = null;

    return right;
}
    
private ListNode merge(ListNode left, ListNode right, ListNode prev) {
    ListNode curt = prev;

    while (left != null && right != null) {
        if (left.val < right.val) {
            curt.next = left;
            left = left.next;
        } else {
            curt.next = right;
            right = right.next;
        }
        curt = curt.next;
    }
        
    if (left != null) {
        curt.next = left;
    } else if (right != null) {
        curt.next = right;
    }
    while (curt.next != null) {
        curt = curt.next;
    }

    return curt;
}