
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

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //tri1 Function (2 Minutes to Type, 3 more to comment and format)
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

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //tri2 Function (2 minutes to type and 3 more to comment and format)
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

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //tri3 Function (2 minutes to type and 3 more to comment and format)
    public String tri3(int h) {
	String returner = ""; //Intializes a return variable as a string

	//For loop to go through each row of triangle
	//hc denotes the row number but also used for the number of stars
	//hc is incremented by 1, until it equals the height of the desired triangle
	for(int hc = 1; hc <= h; hc++) {
	    
	    int rc = 0; //Initializes a counter for the indices of our spaces and stars
	    String stars = ""; //Initializes a string to store our stars for this layer
	    
	    //While loop that adds the spaces to our return string, Adds the difference of the total height and the row number
	    while(rc < h - hc) {
		returner += " "; //Adding the spaces to the return string
		rc += 1; //Increments our counter
	    }
	    
	    //While loop that adds stars to our string that stores them. Adds enough stars so stars from the left to the middle column of stars, not including the middle
	    while (rc < h - 1) {
		stars += "*"; //Adding the stars onto the storing string
		rc += 1; //Incrementing our counter
	    }
	    
	    //Adds our strings onto our return string
	    //First the stars stored in our string, a single star, then the same stored string again, and the break. Remember the preceeding spaces have already been added.
	    //This construct puts the stars on the left hand side of the middle column, the middle column, and then the right hand side
	    returner += stars + "*" + stars + "\n";
	}
	
	return returner; //Returns the return string that was constructed
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //diamond Function (3 minutes to type and 3 more to comment and format)
    public String diamond(int h) {
	
	int top = h - h/2; //Splits height into a top and bottom
	int bottom = h/2; //Top is rounded up if needed and bottom is rounded down

	String returner = tri3(top); //Initializes a return string preset with the top of our diamond using the tri3(h) with the top value
	
	//Using a for loop to construct the bottom of our pyramid
    //hc denotes not only the height but also the number of stars required
    //hc starts at the height given and increments downward to get the reverse pyramid
	for (int hc = bottom; hc >= 1; hc--) {
	    
        int rc = 0; //Initializes our counter for the stars and spaces
	    String stars = ""; //Initializes a string to store stars, similar to the method used in tri3(h)
	    
        //While loop to add the spaces, adds the diffence of the row and the height of the bottom half) number of spaces
	    while (rc < bottom - hc) {
		returner += " "; //Adding the spaces
		rc += 1; //Incrementing the counter
	    }
	    
        //While loop to add the stars before the middle column into our store string
	    while (rc < bottom - 1) {
		stars += "*"; //Adds the stars to the string
		rc += 1; //Increments the counter
	    }
	
        //If the number is even, bottom and top pyramids bases have to align, but if the height is odd, the bottom base is smaller than the top base
        //Therefore, we have to shift the whole bottom base over 1, basically adding a space to each line
	    if (top != bottom) {
		returner += " "; //Adding said space to the line if the height inputed was odd
	    }

	    returner += stars + "*" + stars + "\n"; //Adds the stars before the middle column, a star for the middle column, the stars for the right hand side, and the line break
	}

	return returner; //Returns the return string that was constructed
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //tri4 Function (2 minutes to type and 3 more minutes to comment and format)
    public String tri4(int h) {
	
	String returner = ""; //Initiates a variable to store our return string
	
    //For loop to increment through the rows of the triangle
    //hc is used to denote the height but also the number of stars for the row
    //hc is incremented downwards and starts at the max height of the triangle
	for(int hc=h; hc > 0; hc--) {
	    
	    int rc = 0; //Initiates a counters to places stars and spaces

        //While loop to places spaces before the line of stars
	    while (rc<h-hc){
		returner += " "; //Adds the difference between the max height and the row number (number of stars) number of spaces
		rc += 1; //Increments the counter
	    }
	    
        //While loop to add on the remaining stars to the spaces in the row
	    while (rc < h){
		returner += "*"; //Adding the stars on
		rc += 1; //Incrementing a counter
	    }
	    
	    returner += "\n"; //Adding the line break to move onto the next line
	}
	
	return returner; //Returns the return string that was constructed
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
	   