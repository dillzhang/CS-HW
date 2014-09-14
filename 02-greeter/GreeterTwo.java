import java.util.*;

//New Interactive Version of Greeter
//Replaces "Hello World" with "Hello <input>"
//Also testing Git on Home Machine

public class GreeterTwo 
{
    public static final void main(String[] args)
    {
	//Askes for a name
	System.out.println("What is your name: "); 
	
	//Creates a way to find the name
	Scanner scan = new Scanner(System.in); 
	
	//Stores the name in a string
	String name = scan.next(); 
	
	//Prints Hello <Name>!
	System.out.println("Hello, " + name + "!"); 
    }
}