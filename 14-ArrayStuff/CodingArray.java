import java.util.*;

public class CodingArray {
    
    public int sum67(int[] nums) {
	boolean notbetween = true;
	int summer = 0;
  
	for(int i = 0; i<nums.length; i++) {
	    if (nums[i] == 6) {
		notbetween = false;
	    }
	    if (notbetween) {
		summer += nums[i];
	    }
	    if (nums[i] == 7) {
		notbetween = true;
	    }
	}
  
	return summer;
    }
    
    public boolean more14(int[] nums) {
	int four = 0;
	int one = 0;
	
	for(int a = 0; a<nums.length; a++) {
	    if (nums[a] == 1) {
		one += 1;
	    }
	    if (nums[a] == 4) {
		four += 1;
	    }
	}
	
	return (one > four);
    }

    public int[] tenRun(int[] nums) {
	boolean running = false;
	int runner = 0;
	int[] numer = new int[nums.length];
  
	for (int i = 0; i<nums.length; i++) {
	    if ( (nums[i] % 10) == 0) {
		running = true;
		runner = nums[i];
	    } 
    
	    if (running) {
		numer[i] = runner;
	    } else {
		numer[i] = nums[i];
	    }

	}
  
	return numer; 
    }

    public boolean tripleUp(int[] nums) {
	int upper = 0;
	int beginner = 0;
  
	for (int a = 0; a < nums.length; a++) {
	    if (upper >= 3) {
		break;
	    } else if  (nums[a] == (beginner + upper)) {
		upper += 1;
	    } else {
		beginner = nums[a];
		upper = 1;
	    }
	}
  
	return (upper >= 3);
    }

    public boolean canBalance(int[] nums) {
	int[] sums = new int[nums.length];
	int summer = 0;
  
	for (int a = 0; a < nums.length; a++) {
	    summer += nums[a];
	    sums[a] = summer;
	}
  
	for (int b = 0; b < sums.length; b++) {
	    if ((2 * sums[b]) == summer) {
		return true;
	    }
	}
  
	return false;
    }

    public int[] seriesUp(int n) {
	int[] series = new int[ (n * (n + 1)) / 2];
  
	for (int alpha = 1; alpha <= n; alpha++) {
	    for (int beta = 1; beta <= alpha; beta++) {
		series[ ((alpha - 1) * (alpha)) / 2 + beta - 1 ] = beta;
	    }
	}
  
	return series;
    }

    public int maxMirror(int[] nums) {
	int[] rev = new int[nums.length];
	int current = 0;
	int maxer = 0;
  
	for(int i = 0; i<nums.length; i++) {
	    rev[i] = nums[nums.length - (i + 1)];
	}
  
	for(int a = 0; a<nums.length; a++) {
	    for(int b = 0; (a+current)<nums.length && b<rev.length; b++) {
		if(nums[a+current] == rev[b]) {
		    current += 1;
		} else if (current > maxer) {
		    maxer = current;
		    current = 0;
		} else {
		    current = 0;
		}
	    }
    
	    if (current > maxer) {
		maxer = current;
	    }
	}
  
	return maxer;    
    }

}
