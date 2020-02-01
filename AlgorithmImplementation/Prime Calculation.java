// Euler
public List<Integer> prime(int n) {
    boolean[] notPrime = new boolean[n + 1];
    List<Integer> results = new ArrayList<Integer>();

    for (int i = 2; i <= n; i++) {
        if (!notPrime[i]) {
            results.add(i);
        }
        for (int j : results) {
            if (i * j > n) {
                break;
            }
            notPrime[i * j] = true;
            if (i % j == 0) {
                break;
            }
        }
    }

    return results;
}

// Eratosthenes
public List<Integer> prime(int n) {
    boolean[] notPrime = new boolean[n + 1];
    List<Integer> results = new ArrayList<Integer>();

    for (int i = 2; i <= n; i++) {
        if (!notPrime[i]) {
            results.add(i);
        }
        for (int j = i; i * j <= n; j++) {
            notPrime[i * j] = true;
        }
    }

    return results;
}