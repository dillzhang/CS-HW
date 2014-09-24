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

	//Tests nearHundred()
	System.out.println("Testing nearHundred()");
	System.out.println("neadHundred(90) == " + s.nearHundred(90));
      	System.out.println("neadHundred(110) == " + s.nearHundred(110));
	System.out.println("neadHundred(190) == " + s.nearHundred(190));
	System.out.println();

	//Tests mixStart()
	System.out.println("Testing mixStart()");
	System.out.println("mixStart('Hix') == " + s.mixStart("Hix"));
	System.out.println("mixStart('mit') == " + s.mixStart("mit"));
	System.out.println("mixStart('mixture') == " + s.mixStart("mixture"));
	System.out.println();

	//Tests teaParty()
	System.out.println("Testing teaParty()");
	System.out.println("teaParty(1,2) == " + s.teaParty(1,2));
	System.out.println("teaParty(5,6) == " + s.teaParty(5,6));
	System.out.println("teaParty(50,6) == " + s.teaParty(50,6));
	System.out.println();

	//Tests lastDigit()
	System.out.println("Testing lastDigit()");
	System.out.println("lastDigit(12,13,14) == " + s.lastDigit(12,13,14));
	System.out.println("lastDigit(12,22,32) == " + s.lastDigit(12,22,32));
	System.out.println("lastDigit(43,25,33) == " + s.lastDigit(43,25,33));
	System.out.println();
    }
}
