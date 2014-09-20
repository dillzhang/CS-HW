public class Driver{
    public static void main(String[] args){
	//Initializing string with my name, Dillon Zhang, in all lowercase.
	String s="dillon zhang";
	
	//The first task simply involes using the string method .indexOf()
	//Which returns the index of the occurance of the parameter provided

	//Sets the value of "i" to the index of the space
	int i = s.indexOf(" ");
	//Print out the value of "i"
	System.out.println(i);
	
	//The next two tasks use the string method .substring()
	//Which returns the substring from the first index provided to one minus
	//the second index provided, inclusive

	//Sets the value of the string "first" to the string of the first name only
	//In this case, we want the begining of the string, 0 index, to the last
	//character of the first name, or the index before the space. Since the 
	//second index is excluded from the substring, we can simply put the index
	//of the space, which we have already found earlier.
	String first = s.substring(0,i);
	//Prints out the first name only
	System.out.println(first);

	//Sets the value of the string "last" to the string of the last name only
	//In this case, we want all of the last name. So since the first index
	//provided is included, we want to start with the one after the space
	//or simply, one more than the index of the space, which we have already
	//found earlier. Since the substring method defaults to the end of the
	//of the string, we only need to provide the parameter for the start.
	String last = s.substring(i+1);
	//Prints out the last name only
	System.out.println(last);
    }
}