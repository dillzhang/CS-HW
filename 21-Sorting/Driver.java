public class Driver {
    public static void main(String[] args){
	BaseChar alpha = new BaseChar("alpha");
	BaseChar charlie = new BaseChar("charlie");
	System.out.println(alpha + ".compareTo(" + charlie + ") == " + alpha.compareTo(charlie));
	
	Warrior beta = new Warrior("beta");
	Warrior delta = new Warrior("delta");
	System.out.println(beta + ".compareTo(" + delta + ") == " + beta.compareTo(delta));

	System.out.println(delta + ".compareTo(" + beta + ") == " + delta.compareTo(beta));
	System.out.println(beta + ".compareTo(" + alpha + ") == " + beta.compareTo(alpha));
    }
}