import java.util.*;

public class ArrayLists {
    private ArrayList<Integer> intlist;
    private Random r;
    
    public ArrayLists() {
	r = new Random();
	intlist = new ArrayList<Integer>();

	for (int i = 0; i < 20; i++) {
	    intlist.add(r.nextInt(5));
	}
    }

    public String toString() {
	return "" + intlist;
    }

    public void removeDuplicates() {
	for (int j = 1; j < intlist.size(); j++) {
	    if (intlist.get(j) == intlist.get(j-1)) {
		intlist.remove(j);
	    }
	}
    }

}

