import java.io.*;
import java.util.*;

class Sorts {
    long compare;
    int[] data;
    int[] copy;
    Random r;

    public Sorts(int n){
	compare = 0;
	r = new Random();
	data = new int[n];
	copy = new int[n];
	fill();
	
    }
    
    public Sorts() {
	this(20);
    }
    
    public void fill(){
	for (int i = 0; i < data.length; i++) {
	    //data[i]=r.nextInt(100);
	    data[i] = data.length-i;
	}
    }
    
    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }

    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }
    
    
    public void isort() {
	int i,j;
	compare = 0;
	for (i = 1; i < data.length; i++) {
	    compare += 1;
	    int tmp=data[i];
	    for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
		compare += 2;
		data[j+1]=data[j];
	    }
	    data[j+1]=tmp;
	}
	System.out.println("" + compare);
    }
    
    
    public void ssort() {
	int i,j;
	int mi;
	compare = 0;

	for ( i = 0; i < data.length-1; i++) {
	    compare += 1;
	    mi = i;
	    for (j=i+1;j<data.length;j++) {
		compare += 2;
		if (data[j]<data[mi]){
		    mi=j;
		}
	    }
	    int tmp=data[mi];
	    data[mi]=data[i];
	    data[i]=tmp;
	}
	System.out.println("" + compare);
    }
    
    public void builtin() {
	Arrays.sort(data);
    }
    
    public String toString() {
	return Arrays.toString(data);
    }
    
    public static void main(String[] args) {
	long starter;
	Sorts s = new Sorts(Integer.parseInt(args[0]));
	s.backup();

	//System.out.println(s);
	
	starter = System.nanoTime();
	s.builtin();
	System.out.println("builtin time (Nanoseconds): " + (System.nanoTime() - starter));

	s.restore();
	starter = System.nanoTime();
	s.isort();
	System.out.println("isort time (Nanoseconds): " + (System.nanoTime() - starter));

	s.restore();
	starter = System.nanoTime();
	s.ssort();
	System.out.println("ssort time (Nanoseconds): " + (System.nanoTime() - starter));
	
    }
}
