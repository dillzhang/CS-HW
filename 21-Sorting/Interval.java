import java.io.*;
import java.util.*;

public class Interval {
    
    //Instance Variables
    
    private int low, high;
    private Random rand = new Random();
    
    //Constructors

    private void setup(int l, int h) {
	low = l;
	high = h;
    }

    public Interval() {
	int h = rand.nextInt(100) + 1;
	int l = rand.nextInt(h);
	setup(l,h);
    }

    public Interval(int l, int h) {
	setup(l,h);
    }

    //toString()

    public String toString() {
	return "[" + low + "," + high + "]";
    }

    //Setters and Getters
    
    public int getLow() {
	return low;
    }

    public int getHigh() {
	return high;
    }

    //Methods

    public int compareTo(Interval other){
	if (low-other.getLow() == 0) {
	    return high - other.getHigh();
	} else {
	    return low - other.getLow();
	}
    }

    //Main

    public static void main(String[] args) {
	Interval alpha = new Interval(1,6),
	    bravo = new Interval(1,6),
	    charlie = new Interval(1,7), 
	    delta = new Interval(1,5),
	    echo = new Interval(2,6),
	    foxtrot = new Interval(0,6);

	Interval[] intervals = {alpha, bravo, charlie, delta, echo, foxtrot};
	
	for(int i = 1; i < intervals.length; i++) {
	    System.out.println(alpha + ".compareTo(" + intervals[i] + ") = " + alpha.compareTo(intervals[i]));
	}
    }
}
