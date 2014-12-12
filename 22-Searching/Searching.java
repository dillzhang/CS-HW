import java.util.*;

public class Searching {
    private Comparable[] a;
    private int last = 0;
    private Random rand = new Random();
    
    public Searching(int i){
	a = new Comparable[i];
    }

    public Searching(){
	this(10);
    }
    
    public String toString() {
	return Arrays.toString(a);
    }
    
    public void additem(Comparable item) {
	if (last < a.length) {
	    a[last] = item;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }
    
    public void randFill() {
	for (int i = 0; i < a.length; i++) {
	    a[i] = rand.nextInt(100);
	}
	last = a.length;
    }

    public void sorter() {
	Arrays.sort(a);
	}

    
    public Comparable isearch(Comparable item) {
        for(int counter = 0; counter<a.length; counter++) {
            if (a[counter].equals(item)) {
                return a[counter];
            }
        }
        return null;
    }

    public Comparable bsearch(Comparable item) {
        int start = 0, stop = a.length - 1;

        while (start < stop) {

	    int middle = (start + stop) / 2;
 
            if (a[middle].equals(item)){
                return a[middle];
            } else if (a[middle].compareTo(item) < 0) {
                start = middle + 1;
            } else {
                stop = middle -1;
            }
	    
        }
        return null;
    }

    public Comparable rbsearch(Comparable item) {
	return a[rbsearch(item, 0, a.length-1)];
    }

    public Comparable rbsearch(Comparable item, int start, int stop) {
	int middle = (start + stop) / 2;
	if (stop <= start) {
	    return null;
	}else if (a[middle].equals(item)) {
	    return middle;
	} else if (a[middle].compareTo(item) < 0) {
	    return rbsearch(item, middle + 1, stop);
	} else {
	    return rbsearch(item, start, middle -1);
	}
    }

    public static void main(String[] args) {
	Random rand = new Random();
	Searching searcher = new Searching(100);
	int alpha = rand.nextInt(10);
	
	System.out.println(alpha);
       
	searcher.randFill();

	System.out.println(searcher);

	System.out.println(searcher.isearch(alpha));

	searcher.sorter();
	System.out.println(searcher);
	System.out.println(searcher.bsearch(alpha));
	System.out.println(searcher.rbsearch(alpha));
    }
    
}
