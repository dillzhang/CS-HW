//Coding Bat Assignment 2014-09-23
public class StringStuff {

//Nonstart
public String nonStart(String a, String b) {
    return a.substring(1)+b.substring(1);
}

//makeABBA
public String makeABBA(String a, String b) {
    return a+b+b+a;
}

//diff21
public int diff21(int n) {
    if (n>21) 
	{return 2*n-42;}
    else
	{return 21-n;}
}

}