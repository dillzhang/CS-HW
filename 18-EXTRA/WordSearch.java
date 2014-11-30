import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class WordSearch {
    
    //===========================================================================================================================================================================
    
    //INSTANCE VARIABLES
    Random rand;
    
    private char[][] board;
    private String key;
    private ArrayList<String> listofwords;
    
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
		s += board[i][j] + " ";
	    }
	    s += "\n\n";
	}
	return s;
    }
    
    //===========================================================================================================================================================================

    //METHODS
    
    public boolean addWordTester(String w, int row, int col, int d){
	int r = row;
	int c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    if (r>=0 && r<board.length && c>=0 && c<board[0].length)
		if (board[r][c] == w.charAt(i) || board[r][c] =='.') {
		    r += directions[d][0];
		    c += directions[d][1];
		} else {
		    return false;
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
	
	while (failures < 8000) {
	    int tryRow = rand.nextInt(board.length);
	    int tryCol = rand.nextInt(board[0].length);
	    int tryDir = rand.nextInt(8);

	    if (addWordTester(w,tryRow,tryCol,tryDir)) {
		addWordHelper(w,tryRow,tryCol,tryDir);
		break;
	    }
	}
	
	return failures < 1000;
    }

    public void addWords(ArrayList<String> wordList){
	for (int i = 0; i<wordList.size(); i++){
	    if(! addWord(wordList.get(i))){
		wordList.remove(i);
		i--;
	    }
	}
	listofwords =  wordList;
    }
		
    public void makeKey(){
	key = "";
	for(int i=0;i<board.length;i++) {
	    for (int j = 0; j< board[i].length; j++) {
		key += board[i][j];
	    }
	    key += "\n";
	}
    }
	
    public void fillBoard(){
	for(int i=0;i<board.length;i++){
	    for(int j = 0; j<board[i].length; j++) {
		if (board[i][j] == '.') {
		    board[i][j] = "aaaaaaaaaaaaaaaabbbbbcccccccddddddddeeeeeeeeeeeeeeeeeeeeeeeeffffgggggghhhhhhiiiiiiiiiiiiijjkkllllllllmmmmmmnnnnnnnnnnnnnnooooooooooooooooppppqqrrrrrrrrrrrrrrssssssssssstttttttttttttttuuuuuuuuvvvwwwwxxyyyyzz".charAt(rand.nextInt(200));
		}
	    }
	}
    }
    
    //===========================================================================================================================================================================

    //MAIN METHOD
    public static void main(String[] args) {

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	ArrayList<String> words = new ArrayList<String>();
	
	boolean readfile = false;
	Scanner sc = null;
	
	try {
	    sc = new Scanner(new File("Dict.txt"));
	    readfile = true;
	}catch (Exception e) {
	    System.out.println("File not found");
	    readfile = false;
	}
	
	//System.out.println("1");

	while (sc.hasNext() && words.size() < 20) {
	    if (rand.nextInt(1000) < 1){
		words.add(sc.nextLine());
	    } else {
		sc.nextLine();
	    }
	}
	
	//System.out.println("2");
	
	WordSearch w = new WordSearch();
	w.addWords(words);
	w.makeKey();
	w.fillBoard();
	System.out.println();
	
	int i = 0;
	while (i < 1000) {
	    //System.out.println(w.key);
	    
	    System.out.println(w);
	    System.out.println(w.listofwords);
	    
	    System.out.print("Enter Column: ");
	    int colguess = scan.nextInt();
	    System.out.print("Enter Row: ");
	    int rowguess = scan.nextInt();
	    System.out.print("Enter Direction: ");
	    int dirguess = scan.nextInt();
	    System.out.print("Enter Word: ");
	    String wordguess = scan.next();
	    scan.nextLine();

	    //System.out.println (colguess + " " + rowguess + " " + dirguess + " " + wordguess);

	    if (w.addWordTester(wordguess, rowguess, colguess, dirguess)) {
		System.out.println("You found a word");
		for (int alpha = 0; alpha < wordguess.length(); alpha++) {
		    w.board[rowguess + alpha * w.directions[dirguess][0]][colguess + alpha * w.directions[dirguess][1]] = Character.toUpperCase( w.board[rowguess + alpha * w.directions[dirguess][0]][colguess + alpha * w.directions[dirguess][1]]);
		    for (int beta = 0; beta < w.listofwords.size(); beta++) {
			if (w.listofwords.get(beta).equals(wordguess)){
			    w.listofwords.remove(beta);
			}
		    }
		}
	    } else {
		System.out.println("Not a word");
	    }
	    
	    System.out.print("End(Y/N): ");
	    String cont = scan.nextLine();

	    if (cont.equals("Y")) {
		System.out.println("ANSWER KEY");
		System.out.println(w.key);
		break;
	    }
	}
    }
}