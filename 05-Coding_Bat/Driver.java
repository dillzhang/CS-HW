public class Driver {
    public static void main(String[] args){
	//New StringStuff Variable
	StringStuff s = new StringStuff();
	
	//Tests nonStart()
	System.out.println("Testing nonStart()");
	System.out.println("nonStart('Hello','World') == " + s.nonStart("Hello","World"));
	System.out.println("nonStart('Bye','World') == " + s.nonStart("Bye","World"));
	System.out.println("nonStart('testing','123') == " + s.nonStart("testing","123"));
	System.out.println();

	//Tests makeABBA()
	System.out.println("Testing makeABBA()");
	System.out.println("makeABBA('A','B') == " + s.makeABBA("A","B"));
	System.out.println("makeABBA('Hi','Bye') == " + s.makeABBA("Hi","Bye"));
	System.out.println("makeABBA('Alpha','Beta') == " + s.makeABBA("Alpha","Beta"));
	System.out.println();

	//Tests diff21()
	System.out.println("Testing diff21()");
	System.out.println("diff21(17) == " + s.diff21(17));
	System.out.println("diff21(21) == " + s.diff21(21));
	System.out.println("diff21(42) == " + s.diff21(42));
	System.out.println();
    }
}
