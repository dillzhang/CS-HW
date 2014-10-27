import java.util.*;

public class ArrayStuff {
    int[] a;
    Random r;

    public ArrayStuff(int n) {
	r = new Random();
	a = new int[n];

	for(int i = 0; i<a.length; i++) {
	    a[i] = r.nextInt(76) + 75;
	}
    }

    public ArrayStuff() {
	this(100);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int find(int n) {
	for (int i = 0; i<a.length; i++) {
	    if (a[i] == n) {
		return i;
	    }
	}

	return -1;
    }

    public int maxVal() {
	int maxer = a[0];

	for (int i = 0; i < a.length; i++) {
	    if (a[i] > maxer) {
		maxer = a[i];
	    }
	}

	return maxer;
    }

    public int length() {
	return a.length;
    }

}
