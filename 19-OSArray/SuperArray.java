public class SuperArray {
    
    protected String[] data;
    protected int last;
    protected int chunk;

    public SuperArray() {
        // set up the initial instance variables
	data = new String[1];
	last = 0;
	chunk = 100;
	//Sarray(1,[0]);
    }

    public String toString() {
	String buffer = "";
	for(int i = 0; i < last; i++){
	    buffer += data[i] + ", ";
	}
	return buffer;
    }
    
    protected void grow() {
	String[] buffer = new String[data.length+chunk];
	for (int counter = 0; counter < data.length; counter++) {
	    buffer[counter] = data[counter];
	}
	data = buffer;
    }
    
    public boolean add(String i){
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
    
    
    public void add(int index, String i){
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
    
    public String get(int index) {
        // returns the item at location index of the lsit
	if (index < last && index >= 0) {
	    return data[index];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public String set(int index, String i){
        // sets the item at location index to value i
        // returns the old value.
	if (index < last && index >= 0) {
	    String buffer = data[index];
	    data[index] = i;
	    return buffer;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public String remove(int index){
        // removes the item at index i
        // returns the old value
	if (index < last && index >= 0){
	    String buffer = data[index];
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
}