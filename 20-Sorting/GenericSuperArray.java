import java.util.Arrays;

public class GenericSuperArray<Type extends Object & Comparable> {
    
    // INSTANCE VARIABLES =======================================================================================================================================================
    
    protected Type[] data;
    protected int last;
    protected int chunk;

    // CONSTRUCTORS =============================================================================================================================================================

    public GenericSuperArray() {
        // set up the initial instance variables
	data = (Type[])(new Object[10]);
	last = 0;
	chunk = 100;
    }

    // TOSTRING =================================================================================================================================================================

    public String toString() {
	String buffer = "";
	for(int i = 0; i < last; i++){
	    buffer += data[i] + ", ";
	}
	return buffer;
    }
    
    // METHODS ==================================================================================================================================================================

    protected void grow() {
	Type[] buffer = (Type[])(new Object[data.length+chunk]);
	for (int counter = 0; counter < data.length; counter++) {
	    buffer[counter] = data[counter];
	}
	data = buffer;
    }
    
    public boolean add(Type i){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (last < data.length) {
	    data[last] = i;
	    last += 1;
	} else {
	    grow();
	    add(i);
	}
	
	return true;
    }
    
    public void add(int index, Type i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
	if (last < data.length) {
	    for(int counter = last; counter > index; counter--) {
		data[counter] = data[counter-1];
	    }
	    data[index] = i;
	    last += 1;
	} else {
	    grow();
	    add(index, i);
	}
    }

    
    public int size() {
        // returns the number of items in the list (not the array size)
	return last;
    }
    
    public Type get(int index) {
        // returns the item at location index of the lsit
	if (index < last && index >= 0) {
	    return data[index];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Type set(int index, Type i){
        // sets the item at location index to value i
        // returns the old value.
	if (index < last && index >= 0) {
	    Type buffer = data[index];
	    data[index] = i;
	    return buffer;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Type remove(int index){
        // removes the item at index i
        // returns the old value
	if (index < last && index >= 0){
	    Type buffer = data[index];
	    last -= 1;
	    for(int counter = index; counter < data.length; counter ++) {
		if (counter < last) {
		    data[counter] = data[counter + 1];
		} else {
		    data[counter] = null;
		}
	    }
	    return buffer;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }
    
    // HOMEWORK 20 ISORT() ======================================================================================================================================================

    public void isort() {
	//Insertion Sort - Splits into sorted and unsorted part of the array
	//Moves one element at a time from the unsorted to the sorted array and places it in the proper spot
	//O(n) = n^2

	Type buffer;
	for (int i = 1; i < last; i++) {
	    buffer = data[i];
	    for (int j = i; 0 <= j; j--){
		if (j == 0 || data[j-1].compareTo(buffer) < 0) {
		    data[j] = buffer;
		    break;
		} else {
		    data[j] = data[j-1];
		}
	    }
	}
    }
    
    // MERGE SORT ===============================================================================================================================================================
    
    public Type[] msorting(Type[] arrayer) {
	//Splits the array, sorts the split arrays, merges the sorted array
	//O(n) = n * log(n)

        // base case: list only has 1 element
        if (arrayer.length == 1)
            return arrayer;

        // otherwise, split in half
        Type[] leftArray = splitArray(arrayer, false);
        Type[] rightArray = splitArray(arrayer, true);

        // recursively sort the left half and right half
        leftArray = msorting(leftArray);
        rightArray = msorting(rightArray);
	
        // merge the two sorted halves and return the result
        return merge(leftArray, rightArray);
    }

    public Type[] splitArray(Type[] alpha, boolean rightside){
	//Splits the arrays into the top half or bottom of the given array

	//System.out.println("SPLIT INPUT: " + Arrays.toString(alpha));

	int start, end;
	if (rightside) {
	    start = alpha.length/2;
	    end = alpha.length;
	} else {
	    start = 0;
	    end = alpha.length/2;
	}
	
	Type[] returner = (Type[])(new Object[end - start]);
	
	for (int i = start; i < end; i++) {
	    returner[i-start] = alpha[i];
	}
	

	//System.out.println("SPLIT RETURN: " + Arrays.toString(returner));
	
	return returner;
    }

    public Type[] merge(Type[] a, Type[] b) {
	//Takes two order arrays and combines then comparing the first elements
	//Places the smaller element first and then moves onto the second element of that array and so on
	//Once one array is depleted, the rest of the other array is appended to the merged array

	int ac = 0, bc = 0;
	Type[] c = (Type[])(new Object[a.length + b.length]);

	//System.out.println("MERGE: " + Arrays.toString(a) + " " + Arrays.toString(b));

	for(int i = 0; i < c.length; i++) {
	    
	    if (a.length <= ac) {
		c[i] = b[bc];
		bc += 1;
	    } else if (b.length <= bc) {
		c[i] = a[ac];
		ac += 1;
	    } else if (a[ac].compareTo(b[bc]) < 0) {
		c[i] = a[ac];
		ac += 1;
	    } else {
		c[i] = b[bc];
		bc += 1;
	    }

	}

	//System.out.println("MERGE RETURN: " + Arrays.toString(c));

	return c;
    }
	     
    public void msort() {
	//Creates an array with no null elements to be merge sorted
	//Takes merge sorted array and replicates it on original Superarray
	Type[] buffer = (Type[])(new Object[last]);
	
	for(int i = 0; i < last; i++) {
	    buffer[i] = data[i];
	}
	
	buffer = msorting(buffer);
	
	for(int i = 0; i < last; i++) {
	    data[i] = buffer[i];
	}
    }

    // MAIN METHOD ==============================================================================================================================================================

    public static void main(String[] args) {
	GenericSuperArray<String> alpha = new GenericSuperArray<String>();
	if (args.length > 0) {
	    for (int i=0; i<args.length; i++) {
		alpha.add(args[i]);
		//System.out.println(args[i]);
	    }
	} else {
	    alpha.add("b");
	    alpha.add("h");
	    alpha.add("c");
	    alpha.add("a");
	    alpha.add("z");
	}
	
	System.out.println(alpha);
	alpha.isort();
	//alpha.msort();
	System.out.println(alpha);
    }

}