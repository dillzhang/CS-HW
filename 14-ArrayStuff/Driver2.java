public class Driver2 {
    public static void main(String[] args) {
	ArrayStuff Alpha;

	if (args.length >= 3) {
	    Alpha = new ArrayStuff(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	} else {
	    Alpha = new ArrayStuff();
	}

	System.out.println(Alpha.fastMode());
    }
}
