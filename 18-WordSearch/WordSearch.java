public class WordSearch {
    
    //===========================================================================================================================================================================
    
    //INSTANCE VARIABLES
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
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    //===========================================================================================================================================================================

    //METHODS
    
    //addWord( desired word, starting row, starting column, desired directon ) 
    //--> Direction calculations are stored in the private array direction
    //--> --> 0 - Right Horizontal, each one after is a 45 degree counterclockwise, till 7 - Right Downward
    //first runs through to check if the word can be legally added to the selected location at the selected orientation
    //second run through to place the word in the desired location after scouting of location reveals no problem
    //if error presents itself, code terminates and prints "Word does not fit location"
    public void addWord(String w, int row, int col, int d){
	String tester = w;
	int r = row;
	int c = col;
	for (int i = 0; i<w.length(); i++) {
	    if (r>=0 && r<board[0].length && c>=0 && c<board.length && (board[r][c] == tester.charAt(i) || board[r][c] =='.')) {
		r += directions[d][0];
		c += directions[d][1];
	    } else {
		System.out.println("Word does not fit location");
		System.exit(0);
	    }
	}
	
	r = row;
	c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    board[r][c] = w.charAt(i);
	    r += directions[d][0];
	    c += directions[d][1];
	}
    }

    //===========================================================================================================================================================================

    //MAIN METHOD
	public static void main(String[] args) {
	    WordSearch w = new WordSearch();
	    System.out.println(w);
	    w.addWord("hello",3,15,0); // should work
	    System.out.println(w);
	    //w.addWord("look",3,14,0); // test illegal overlap
	    //w.addWord("look",3,18,0); // test legal overlap
	    //w.addWord("look",-3,20,0); // test illegal row
	    //w.addWord("look",3,55,0); // test illegal col
	    w.addWord("look",3,18,2); //test vertical placement
	    System.out.println(w);
    }
}
