import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class WordSearch {
    
    //===========================================================================================================================================================================
    
    //INSTANCE VARIABLES
    Random rand;
    
    private char[][] board;

    private int[][] directions = { //Used in word placement direction
	{0,1},   // 0 Horizontal Right
	{1,1},   // 1 Up Right
	{1,0},   // 2 Vertical Up
	{1,-1},  // 3 Up Left
	{0,-1},  // 4 Horizontal Left
	{-1,-1}, // 5 Down Left
	{-1,0},  // 6 Vertical Down
	{-1,1}   // 7 Down Right
    };
    
    //===========================================================================================================================================================================


    //CONSTRUCTORS
    public WordSearch(int r, int c){
	rand = new Random();
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    
    public WordSearch() {
	this(20,40);
    }
    
    //===========================================================================================================================================================================

    //TOSTRING
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j] + " ";
	    }
	    s = s + "\n\n";
	}
	return s;
    }
    
    //===========================================================================================================================================================================

    //METHODS
    
    public boolean addWordTester(String w, int row, int col, int d){
	int r = row;
	int c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    if (r>=0 && r<board[0].length && c>=0 && c<board.length && (board[r][c] == w.charAt(i) || board[r][c] =='.')) {
		r += directions[d][0];
		c += directions[d][1];
	    } else {
		return false;
	    }
	}
	
	return true;
    }

    public void addWordHelper(String w, int row, int col, int d){
	int r = row;
	int c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    board[r][c] = w.charAt(i);
	    r += directions[d][0];
	    c += directions[d][1];
	}
    }

    public boolean addWord(String w){
	int failures = 0;
	
	while (failures < /*board.length*board[0].length*/ 8000) {
	    int tryRow = rand.nextInt(board.length - 2 * w.length()) + w.length();
	    int tryCol = rand.nextInt(board[0].length - 2 * w.length()) + w.length();
	    int tryDir = rand.nextInt(8);

	    if (addWordTester(w,tryRow,tryCol,tryDir)) {
		addWordHelper(w,tryRow,tryCol,tryDir);
		break;
	    }
	}
	
	return failures < 1000;
    }

    public ArrayList<String> addWords(ArrayList<String> wordList){
	for (int i = 0; i<wordList.size(); i++){
	    if(! addWord(wordList.get(i))){
		wordList.remove(i);
		i--;
	    }
	}
	return wordList;
    }
		
	
    public void fillBoard(){
	for(int i=0;i<board.length;i++){
	    for(int j = 0; j<board[i].length; j++) {
		if (board[i][j] == '.') {
		    board[i][j] = "abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt(26));
		}
	    }
	}
    }
    
    //===========================================================================================================================================================================

    //MAIN METHOD
    public static void main(String[] args) {
	ArrayList<String> words = new ArrayList<String>();
	
	boolean readfile = false;
	Scanner sc = null;

	if (args.length > 0) {
	    try {
		sc =new Scanner(new File(args[0]));
		readfile = true;
	    }catch (Exception e) {
		System.out.println("File not found");
		readfile = false;
	    }
	}
	if (readfile) {
	    
	    while (sc.hasNext()) {
		words.add(sc.nextLine());

	    }
	} else {
	    words.add("alpha");
	    words.add("bravo");
	    words.add("charlie");
	    words.add("delta");
	    words.add("echo");
	    words.add("foxtrot");
	    words.add("golf");
	    words.add("hotel");
	    words.add("india");
	    words.add("juliet");
	    words.add("kilo");
	    words.add("lima");
	    words.add("mike");
	}
	
	//System.out.println(words);
	
	WordSearch w = new WordSearch();
	System.out.println();

	/*
	System.out.println(w);
	
	w.addWord("hello"); // should work
	System.out.println(w);

	
	//w.addWord("look",3,14,0); // test illegal overlap
	//w.addWord("look",3,18,0); // test legal overlap
	//w.addWord("look",-3,20,0); // test illegal row
	//w.addWord("look",3,55,0); // test illegal col
	
	w.addWord("look"); //test vertical placement
	w.addWord("alphabet");//testing vertical placement
	System.out.println(w);
	*/
	System.out.println("Word Bank");
	System.out.println(w.addWords(words));
	System.out.println();

	//System.out.println(w);

	w.fillBoard();
	System.out.println(w);
    }
}
