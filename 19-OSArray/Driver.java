public class Driver {
    public static void main(String[] args) {
	OSArray alpha = new OSArray();
	System.out.println(alpha);
	
	alpha.add("alpha");
	System.out.println(alpha);

	alpha.add("bravo");
	System.out.println(alpha);

	alpha.add("charlie");
	alpha.add("echo");
	System.out.println(alpha);
	
	alpha.add("delta");
	System.out.println(alpha);

	System.out.println("Element 2 is " +alpha.get(2));

	System.out.println("Setting Element 2 to foxtrot");
	alpha.set(2,"foxtrot");
	System.out.println(alpha);
    }
}