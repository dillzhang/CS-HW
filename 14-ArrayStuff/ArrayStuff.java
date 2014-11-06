import java.util.*;

public class ArrayStuff {
    int[] a;
    Random r = new Random();

    public ArrayStuff(int n) {
	a = new int[n];

	for(int i = 0; i<a.length; i++) {
	    a[i] = r.nextInt(76) + 75;
	}
    }

    public ArrayStuff() {
	this(100);
    }

    public ArrayStuff(int size, int min, int max) {
	a = new int[size];
	
	for(int i = 0; i<a.length; i++) {
	    a[i] = r.nextInt(max - min) + min;
	}

	System.out.println(Arrays.toString(a));
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

    public int freq(int i) {
	int counter = 0;
	int desiredval = a[i];

	for(int z = 0; z < a.length; z++) {
	    if (a[z] == desiredval) {
		counter += 1;
	    }
	}

	return counter;
    }

    public int length() {
	return a.length;
    }
    
    public int mode(){
        int most = a[0];
        int count = freq(0);
        for (int alpha = 1; alpha<a.length; alpha++) {
            if (freq(a[alpha]) > count) {
                most = a[alpha];
                count = freq(alpha);
            }
        }
        return most;
    }

    public int fastMode(){
	int[] buckets = new int[maxVal()+1];
	for (int i = 0; i<a.length; i++) {
	    buckets[a[i]] += 1;
	}

	int moder = 0;
	for (int x = 1; x<a.length; x++) {
	    if (a[x] > a[moder]) {
		moder = x;
	    }
	}
	return moder;
    }

}
