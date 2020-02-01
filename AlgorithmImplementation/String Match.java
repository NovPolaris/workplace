// KMP
public int KMP(String source, String target) {
    if (source == null || target == null) {
        return -1;
    } else if (target.length() == 0) {
        return 0;
    } else if (source.length() == 0) {
        return -1;
    } else if (source.length() < target.length()) {
        return -1;
    }
        
    int[] next = buildNext(target);
    int i = 0, j = 0;
        
    while (i < source.length() && j < target.length()) {
        if (j < 0 || source.charAt(i) == target.charAt(j)) {
            i++;
            j++;
        } else {
            j = next[j];
        }
    }
        
    return j == target.length() ? i - j : -1;
}

private int[] buildNext(String target) {
    int[] next = new int[target.length()];
    int i = 0, j = -1;
    next[0] = -1;
        
    while (i < target.length() - 1) {
        if (j < 0 || target.charAt(i) == target.charAt(j)) {
            i++;
            j++;
            next[i] = (target.charAt(i) != target.charAt(j) ? j : next[j]);
        } else {
            j = next[j];
        }
    }    
    
    return next;
}

// BM
public int BoyerMoore(String source, String target) {
    if (source == null || target == null) {
        return -1;
    } else if (target.length() == 0) {
        return 0;
    } else if (source.length() == 0) {
        return -1;
    } else if (source.length() < target.length()) {
        return -1;
    }

    int[] bc = buildBC(target);
    int[] gs = buildGS(target);
    int i = 0;

    while (source.length() >= i + target.length()) {
        int j = target.length() - 1;
        while (j >= 0 && source.charAt(i + j) == target.charAt(j)) {
            j--;
        }
        if (j < 0) {
            return i;
        } else {
            i += Math.max(gs[j], j - bc[source.charAt(i + j)]);
        }
    }

    return -1;
}

private int[] buildBC(String target) {
    int[] bc = new int[256];
    Arrays.fill(bc, -1);

    for (int i = 0; i < target.length(); i++) {
        bc[(int)target.charAt(i)] = i;
    }

    return bc;
}

private int[] buildGS(String target) {
    int[] gs = new int[target.length()];
    int[] ss = buildSS(target);
    int len = target.length();
    Arrays.fill(gs, len);

    for (int i = 0, j = len - 1; j >= 0; j--) {
        if (j + 1 == ss[j]) {
            while (i < len - j - 1) {
                gs[i++] = len - j - 1;
            }
        }
    }

    for (int i = 0; i < len - 1; i++) {
        gs[len - ss[i] - 1] = len - i - 1;
    }

    return gs;
}

private int[] buildSS(String target) {
    int[] ss = new int[target.length()];
    int len = target.length();
    ss[ss.length - 1] = len;

    for (int left = len - 1, right = len - 1, i = left - 1; i >= 0; i--) {
        if ((left < i) && (ss[len - right + i - 1] <= i - left)) {
            ss[i] = ss[len - right + i - 1];
        } else {
            right = i;
            left = Math.min(left, right);
            while ((left >= 0) && (target.charAt(left) == target.charAt(len - right + left - 1))) {
                left--;
            }
            ss[i] = right - left;
        }
    }

    return ss;
}

// Karp-Robin
public int KarpRobin(String source, String target) {
    if (source == null || target == null) {
        return -1;
    } else if (target.length() == 0) {
        return 0;
    } else if (source.length() == 0) {
        return -1;
    } else if (source.length() < target.length()) {
        return -1;
    }
        
    int power = 1;
    int hashcodeTarget = 0;
    int mod = Integer.MAX_VALUE / 33;
    for (int i = 0; i < m; i++) {
        power = (power * 33) % mod;
        hashcodeTarget = (hashcodeTarget * 33 + target.charAt(i)) % mod;
    }
        
    int hashcodeSource = 0;
    for (int i = 0; i < n; i++) {
        hashcodeSource = (hashcodeSource * 33 + source.charAt(i)) % mod;
        if (i < m - 1) {
            continue;
        } else {
            hashcodeSource -= (source.charAt(i - m) * power) % mod;
            if(hashcodeSource < 0) {
                hashcodeSource += mod;
            }
        }
        if (hashcodeSource == hashcodeTarget) {
            if (source.substring(i - m + 1, i + 1).equals(target)) {
                return i - m + 1;
            }
        }
    }

    return -1;
}
// Sunday
public int Sunday(String source, String target) {
    if (source == null || target == null) {
        return -1;
    } else if (target.length() == 0) {
        return 0;
    } else if (source.length() == 0) {
        return -1;
    } else if (source.length() < target.length()) {
        return -1;
    }

    
}