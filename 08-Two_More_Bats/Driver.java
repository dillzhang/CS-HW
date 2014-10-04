public class Driver {
    public static void main(String[] args) {
	
	//Intializes a new class variable
	Bats b = new Bats();
	
	//Test for stringSplosion
	System.out.println("stringSplosion('code')");
	System.out.println(b.stringSplosion("code"));
	System.out.println("stringSplosion('abcd')");
	System.out.println(b.stringSplosion("abcd"));
	System.out.println("stringSplosion('testing123')");
	System.out.println(b.stringSplosion("testing123"));
	System.out.println("stringSplosion('xyz')");
	System.out.println(b.stringSplosion("xyz"));
        
	//Test for stringX
	System.out.println("stringx('texting')");
	System.out.println(b.stringX("texting"));
	System.out.println("stringx('xhellox')");
	System.out.println(b.stringX("xhellox"));
	System.out.println("stringx('xxhelloxworldxx')");
	System.out.println(b.stringX("xxhelloxworldxx"));
	System.out.println("stringx('abcxyz')");
	System.out.println(b.stringX("abcxyz"));
    
    }
}