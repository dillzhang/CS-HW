
public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	
	//Prints out Box Functions
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));

	//Prints out tr11(h) Functions
	System.out.println(s.tri1(4));
	System.out.println(s.tri1(6));

	//Prints out tri2(h) Functions
	System.out.println(s.tri2(4));
	System.out.println(s.tri2(6));
    }
}
