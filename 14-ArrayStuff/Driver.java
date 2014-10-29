public class Driver {
    public static void main(String[] args) {

	ArrayStuff as100 = new ArrayStuff();
	System.out.println("The length of as100 is " + as100.length());
	System.out.println("as100 is " + as100);
	System.out.println("find(100) is " + as100.find(100));
	System.out.println("maxVal() is " + as100.maxVal());
	System.out.println("freq(1) is " + as100.freq(1));

	ArrayStuff as20 = new ArrayStuff(20);
	System.out.println("The length of as20 is " + as20.length());
	System.out.println("as20 is " + as20);
	System.out.println("find(100) is " + as20.find(100));
	System.out.println("maxVal() is " + as20.maxVal());
	System.out.println("freq(1) is " + as20.freq(1));
    }
}
