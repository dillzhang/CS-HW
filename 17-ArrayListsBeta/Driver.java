public class Driver {
    public static void main(String[] args) {
	ArrayListsBeta alpha = new ArrayListsBeta();
	System.out.println("Before:\n" + alpha);

	alpha.randify();
	alpha.arrayRand();

	System.out.println();
	System.out.println("After:\n"  + alpha);
    }
}
