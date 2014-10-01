public class Codes {
    //Fronttimes (2 Minutes)
    public String frontTimes(String str, int n) {
	String returner = "";
	int a = 0;
	if (str.length() <= 3) {
	    while (a<n) {
		returner += str;
		a += 1;
	    }
	} else {
	    while (a<n) {
		returner += str.substring(0,3);
		a += 1;
	    }
	}
	return returner;
    }

    //StringBits (2 Minutes)
    public String stringBits(String str) {
	String returner = "";
	int a = 0;
	while (a < str.length()) {
	    returner += str.charAt(a);
	    a+=2;
	}
	return returner;
    }

    //stringYak (4 Minutes)
    public String stringYak(String str) {
	String returner = "";
	int a = 0;
	while (a < str.length()) {
	    if (a + 2 < str.length() && str.charAt(a) == 'y' && str.charAt(a+2) == 'k') {
		a += 3;
	    } else {
		returner += str.charAt(a);
		a += 1;
	    }
	}
	return returner; 
    }

    //stringMatch (2 Minutes)
    public int stringMatch(String a, String b) {
	int c = Math.min(a.length(),b.length());
	int counter = 0;
	while (c>1) {
	    if (a.substring(0,2).equals(b.substring(0,2))) {
		counter += 1;
	    }
	    c -= 1;
	    a = a.substring(1);
	    b = b.substring(1);
	}
	return counter;
    }
}