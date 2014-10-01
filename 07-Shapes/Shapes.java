
public class Shapes {
    
    //Box Function
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    //tri1 Function
    public String tri1(int h) {
	String returner = ""; //Intializes a return variable as a string
	
	int hc = 1; //Intializes a counter for row height (Starts at 1 so it can be used as a star counter as well)
	
	//While loop to create each row (Starts from the top and slowly works down)
	while (hc <= h) { 
	    int rc = 0; //Initialzes a counter for the number of stars for specified row (Going to be compared to row number)
	    
	    //While loop to place the number of stars in each row
	    while (rc < hc) {
		returner += "*"; //Adds a star (Repeatedly through the loop)
		rc += 1; //Incraments the counter
	    }

	    returner += "\n"; //Adds a break to start the next row (Repeatly through the larger loop)
	    hc += 1; //Incraments the counter
	}
	return returner; //Returns the return string that was constructed
    }



    //tri2 Function
    public String tri2(int h) {
	String returner = ""; //Intializes a return variable as a string
	
	int hc = 1; //Intializes a counter for row height (Starts at 1 so it can be used as a star counter as  well)
	
	//While loop to create each row (Starts from the top and slowly works down)
	while (hc <= h) {
	    int rc = 0; //Initializes a  counter for number of spaces and then stars for specified row (Going to be compared to row number)
	    
	    //While loop to place spaces in front of the stars (Places the difference between the number row number and the total height = Number of spots without stars)
	    while (rc < h - hc) {
		returner += " "; //Adds a space (Repeatedly through the loop)
		rc += 1; //Incraments the counter
	    }

	    //While loop to place stars after the spaces (Places from the spot left by spaces to the toal height = The slots empty after the spaces)
	    while (rc < h) {
		returner += "*"; //Adds a star (Repeatly through the loop)
		rc += 1; //Incrameents the counter
	    }

	    returner += "\n"; //Adds a break to start the next row (Repeatly through the larger loop)
	    hc += 1; //Increments the couner
	}

	return returner; //Returns the return string that was constructed
    }
}
