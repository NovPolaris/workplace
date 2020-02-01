@Override
public int hashCode() {
	return x * 101 + y;
}

@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof Pair)) {
		return false;
	}
	Pair another = (Pair)obj;
	return this.x == another.x && this.y == another.y;
}