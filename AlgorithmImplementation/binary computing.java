// 统计整数二进制数中1的个数
public int countOnes(int n) {
	int ones = 0;
	
	while (0 < n) {
		ones++;
		n &= n - 1; // 清除最右边的1
	}

	return ones;
}

// pow(2, n)  --> O(logn) = O(r) (r是n的二进制位数，且假定n > 1)
public long power2(int n) {
	if (0 == n) {
		return 1L;
	}
	return (n & 1) ? sqr(power2(n >> 1)) << 1 : sqr(power2(n >> 1));
}

private long sqr(long a) {
	return a * a;
}

// 求模运算 (当且仅当a为2的n次方)
n % a = n & (a - 1);

// bitmap
class BitMap {
	private byte[] bits;
	private int size, count = -1;

	public BitMap(int n) {
		size = n;
		bits = new byte[(size >> 3) + 1];
	}

	public void set(int bit) {
		bits[bit >> 3] |= 1 << (bit & 7);
		count = -1;
	}

	public void clear(int bit) {
		bits[bit >> 3] &= ~(1 << (bit & 7));
		count = -1;
	}

	public boolean get(int bit) {
		return (bits[bit >> 3] & (1 << (bit & 7))) != 0;
	}

	public int count() {
		int c = 0;
		if (count = -1) {
			for (int i = 0; i < size; i++) {
				while (bits[i] != 0) {
					bits[i] &= bits[i] - 1;
					c++;
				}
			}
			count = c;
		}

		return count;
	}
}

// 加法运算
public int getSum(int a, int b) {
    while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    
    return a;
}