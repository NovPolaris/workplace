// Euclidean (大数条件下的取模运算，开销太大)

public int gcd(int a, int b) {
	while (b != 0) {
		int temp = a % b;
		a = b;
		b = temp;
	}

	return a;
}

// Chinese

public int gcd(int a, int b) {
    int r = 0;

    while (((a & 1) == 0) && ((b & 1) == 0)) {
    	a >>= 1;
   		b >>= 1;
    	r++;
    }
    while (true) {
    	while ((a & 1) == 0) {
   			a >>= 1;
    	}
    	while ((b & 1) == 0) {
    		b >>= 1;
    	}
    	if (a > b) {
    		a = a - b;
    	} else {
    		b = b - a;
    	}
        if (a == 0) {
            retrun b << r;
        }
        if (b == 0) {
            return a << r;
        }
   	}
}