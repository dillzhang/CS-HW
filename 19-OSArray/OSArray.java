import java.util.*;
import java.io.*;

public class OSArray<Type extends Object & Comparable> extends GenericSuperArray<Type>{

    public OSArray() {
	super();
    }

    public boolean add(Type val){
	int i = 0;
	while(i < last) {
	    if(data[i].compareTo(val) > 0){
		super.add(i, val);
		break;
	    }
	    i++;
	}
	
	if (i == last) {
	    super.add(val);
	}
	return true;
    }
    
    public void add(int index, Type i) {
	this.add(i);
    }

    public Type set(int index, Type i) {
	if (index < last && index >= 0) {
	    Type buffer = data[index];
	    remove(index);
	    add(i);
	    return buffer;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

}