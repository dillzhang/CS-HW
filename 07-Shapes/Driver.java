
public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	
	//Prints out Box Functions
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));

	//Prints out tr11(h) Functions
	System.out.println(s.tri1(4));
	System.out.println(s.tri1(6));
	System.out.println(s.tri1(1));

	//Prints out tri2(h) Functions
	System.out.println(s.tri2(4));
	System.out.println(s.tri2(6));
	System.out.println(s.tri2(1));
    
	//Prints out tri3(h) Functions
	System.out.println(s.tri3(4));
	System.out.println(s.tri3(6));
	System.out.println(s.tri3(1));

	//Prints out diamond(h) Functions
	System.out.println(s.diamond(4));
	System.out.println(s.diamond(11));
	System.out.println(s.diamond(1));

	//Prints out tri4(h) Functions
	System.out.println(s.tri4(4));
	System.out.println(s.tri4(6));
	System.out.println(s.tri4(1));
    }
}
