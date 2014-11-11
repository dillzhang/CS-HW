import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Sarray alpha = new Sarray();
	
	for (int counter = 0; counter < 10; counter++) {
	    alpha.add(counter);
	}
	System.out.println("Adding completed");
	System.out.println("Sarray: " + Arrays.toString(alpha.data));
	System.out.println("Last: " + alpha.last);
	
	System.out.println();
	alpha.add(2,11);
	System.out.println("Index Adding completed");
	System.out.println("Sarray: " + Arrays.toString(alpha.data));
	System.out.println("Last: " + alpha.last);
	
	System.out.println();
	System.out.println(Arrays.toString(alpha.data));
	System.out.println("Size: " + alpha.size());
	System.out.println("alpha[4]: " + alpha.get(4));

	System.out.println();
	System.out.println("Setting index 7 to 100: " + alpha.set(7,100));
	System.out.println("After Setting: " + Arrays.toString(alpha.data));
	
	System.out.println();
	System.out.println("Removing index 4: " + alpha.remove(4));
	System.out.println("After Removal: " + Arrays.toString(alpha.data));

	System.out.println("Error Testing");
	try {
	    System.out.println(alpha.get(100));
	} catch (IndexOutOfBoundsException e) {
	    System.out.println("Failed: " + e);
	}

    }
}