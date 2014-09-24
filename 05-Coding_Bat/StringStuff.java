//Coding Bat Assignment 2014-09-23
public class StringStuff {

//Nonstart
/*Working Version*/
public String nonStart(String a, String b) {
    return a.substring(1)+b.substring(1);
}

//makeABBA
/*Working Version*/
public String makeABBA(String a, String b) {
    return a+b+b+a;
}

//diff21
/*Working Version*/
public int diff21(int n) {
    if (n>21) 
	{return 2*n-42;}
    else
	{return 21-n;}
}

//nearHundred
/*Working Version*/
public boolean nearHundred(int n) {
    return Math.abs(100-n) <= 10 | Math.abs(200-n) <= 10;
}

//mixstart
/*Working Version*/
public boolean mixStart(String str) {
    if (str.length() >= 3) 
        {return "ix".equals(str.substring(1,3));}
    else
        {return false;}
}

//teaparty
/*Working Version*/
public int teaParty(int tea, int candy) {
    if (tea >= 5 && candy >= 5)
        if (tea/candy >= 2 || candy/tea>=2)
	    {return 2;}
        else
	    {return 1;}
    else
        {return 0;}
}


//lastDigit
/*Working Version*/
public boolean lastDigit(int a, int b, int c) {
    return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
}

}