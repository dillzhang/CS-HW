public class WordSearch {
    private char[][] board;
    private int[][] directions = {
	{0,1},   //Horizontal Right
	{0,-1},  //Horizontal Left
	{1,0},   //Vertical Up
	{-1,0},  //Vertical Down
	{1,1},   //Up Right
	{1,-1},  //Up Left
	{-1,-1}, //Down Left
	{-1,1}   //Down Right
    };
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    
    public WordSearch() {
	this(30,30);
    }
    
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
    
    public void addWord(String w, int row, int col, int d){
	String tester = w;
	r = row;
	c = col;
	for (int i = 0; i<w.length() && r>=0 && r<board[0].length && c>=0 && c<board.length; i++) {
	    if (board[r][c] == tester.charAt(i) || board[r][c] =='.') {
		
	    r += directions[d][0];
	    c += directions[d][1];
	}
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
            /*
	      w.addWordH("hello",3,15); // should work
	      w.addWordH("look",3,14); // test illegal overlap
	      //w.addWordH("look",3,18); // test legal overlap
	      //w.addWordH("look",-3,20); // test illegal row
	      //w.addWordH("look",3,55); // test illegal col
	      // etc
	      */
	System.out.println(w);
    }
}
