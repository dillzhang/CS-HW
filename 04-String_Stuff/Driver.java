//04-String_Stuff

//Returns TRUE if the first three letters are *ix
//Else returns FALSE
public boolean mixStart(String str) {
    if (str.length() >= 3) 
	{return "ix".equals(str.substring(1,3));}
    else
	{return false;}
}

//Returns a given word between a given out
public String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2,4);
}

//Returns the first half of an even length string
public String firstHalf(String str) {
    return str.substring(0,str.length()/2);
}