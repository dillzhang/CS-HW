public class OSArray extends SuperArray{

    public OSArray() {
	super();
    }

    public String toString(){
	String buffer = "";
	for (int i = 0; i < last; i++) {
	    buffer += data[i]+ ", ";
	}
	return buffer;
    }

    public boolean add(String str){
	int i = 0;
	while(i < last) {
	    if(str.compareTo(data[i]) <= 0){
		super.add(i, str);
		break;
	    }
	    i++;
	}
	
	if (i == last) {
	    super.add(str);
	}
	return true;
    }
    
    public void add(int index, String i) {
	this.add(i);
    }

    public String set(int index, String i) {
	if (index < last && index >= 0) {
	    String buffer = data[index];
	    remove(index);
	    add(i);
	    return buffer;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

}