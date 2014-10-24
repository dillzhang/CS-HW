public class Arrayer {
    public int[] frontPiece(int[] nums) {
	if (nums.length <= 2) {
	    return nums;
	} else {
	    int[] returner = new int[2];
	    returner[0] = nums[0];
	    returner[1] = nums[1];
	    return returner;
	}   
    }
 
    public int sum13(int[] nums) {
	int summation = 0;
	for (int i=0; i<nums.length; i++) {
	    if (nums[i] == 13) {
		i += 1;
	    } else {
		summation += nums[i];
	    }
	}
	return summation;
    }
    
}