import java.util.*;

public class ArrayListsBeta {
    private ArrayList<Integer> intlist;
    private int[] intArray;

    private Random r;

    public ArrayListsBeta() {
	r = new Random();
	intlist = new ArrayList<Integer>();
	intArray = new int[20]; 

	for (int i = 0; i < 20; i++) {
	    intlist.add(i);
	    intArray[i] = i;
	}
    }

    public String toString() {
	return "Array List: " + intlist + "\n" + "Array: " + Arrays.toString(intArray);
    }

    public void randify() {
	for (int j = intlist.size()-1; j > 0; j--) {
	    int buffer = intlist.get(j);
	    int randLocation = r.nextInt(j);
	    intlist.set(j,intlist.get(randLocation));
	    intlist.set(randLocation, buffer);	    
	}
    }
    
    public void arrayRand() {
	for (int k = intArray.length - 1; k > 0; k--) {
	    int buffer = intArray[k];
	    int randLocation = r.nextInt(k);
	    intArray[k] = intArray[randLocation];
	    intArray[randLocation] = buffer;
	}
    }

}
