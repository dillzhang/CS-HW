
public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	
	//Prints out Box Functions
	System.out.println("box(r,c) Test");
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));

	//Prints out tr11(h) Functions
	System.out.println("tri1(h) Test");
	System.out.println(s.tri1(4));
	System.out.println(s.tri1(6));
	System.out.println(s.tri1(1));

	//Prints out tri2(h) Functions
	System.out.println("tri2(h) Test");
	System.out.println(s.tri2(4));
	System.out.println(s.tri2(6));
	System.out.println(s.tri2(1));
    
	//Prints out tri3(h) Functions
	System.out.println("tri3(h) Test");
	System.out.println(s.tri3(4));
	System.out.println(s.tri3(6));
	System.out.println(s.tri3(1));

	//Prints out diamond(h) Functions
	System.out.println("diamond(h) Test");
	System.out.println(s.diamond(4));
	System.out.println(s.diamond(11));
	System.out.println(s.diamond(1));

	//Prints out tri4(h) Functions
	System.out.println("tri4(h) Test");
	System.out.println(s.tri4(4));
	System.out.println(s.tri4(6));
	System.out.println(s.tri4(1));
        
    //Prints out frame(r,c) Functions
        System.out.println("frame(r,c) Test");
        System.out.println("frame(0,0)");
        System.out.println(s.frame(0,0));
        System.out.println("frame(1,0)");
        System.out.println(s.frame(1,0));
        System.out.println("frame(0,1)");
        System.out.println(s.frame(0,1));
        System.out.println("frame(1,1)");
        System.out.println(s.frame(1,1));
        System.out.println("frame(1,2)");
        System.out.println(s.frame(1,2));
        System.out.println("frame(2,1)");
        System.out.println(s.frame(2,1));
        System.out.println("frame(2,2)");
        System.out.println(s.frame(2,2));
        System.out.println("frame(4,5)");
        System.out.println(s.frame(4,5));
        System.out.println("frame(5,4)");
        System.out.println(s.frame(5,4));
    }
}
