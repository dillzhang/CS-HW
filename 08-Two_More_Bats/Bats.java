public class Bats {
    //stringSplosion(str) 3 minutes
    public String stringSplosion(String str) {
	String returner = ""; //Initiates a return string
        
	//For loop that moves from 1 to the length of the string
	//Appends a string of that length from the begining of the string
	for(int a=1;a<=str.length();a++) {
	    returner += str.substring(0,a);
	}

	return returner; //Returns a return string
    }

    //stringX(str) 4 minutes
    public String stringX(String str) {
	//If the string is shorter than or equal to 2, return the string
	if (str.length()<=2) {
	    return str;
	} else {
	    String returner = "" + str.charAt(0); //Intiates a return string with the first character of the string
	    
	    //For loop that analyzes the second to the second to last character of the string
	    //If that character is not an 'x', we append that to the return string
	    for(int a=1; a<str.length()-1; a++) {
		if (str.charAt(a) != 'x') {
		    returner += str.charAt(a);
		}
	    }

	    return returner + str.charAt(str.length()-1); //Returns the return string with the last character of the string
	}
    }
}