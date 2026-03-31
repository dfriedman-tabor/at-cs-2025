package decisionMaking;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeFiller {
	
	class State {
		
		char[][] board;
		boolean turn;		// true = x   false = o
		
		
		// creates a new state with a (partially) filled in board
		public State(char[][] board, boolean turn) {
			this.board = board; this.turn = turn;
		}
		
		// creates a state with a fresh board
		public State(boolean turn) {
			this.turn = turn;
			this.board = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		}
		
		
		// displays the board
		public String toString() {
			String output = "\n\n"+board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n";
			output += "---------\n";
			output += board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n";
			output += "---------\n";
			output += board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n";
			return output;
		}
		
		// generates all possible moves from this state
		public ArrayList<Integer> possMoves() {
			ArrayList<Integer> next = new ArrayList<Integer>();
			
			for (int i = 0; i < 9; i++) 
				if (board[i/3][i%3] == ' ') 
					next.add(i);

			return next;
		}
		
		
		// generates a DEEP copy of the current state
		public State copy() {
			// fill this in
		}	
		
		
		// determines if the game is won
		public boolean win() {
			char other = turn ? 'o' : 'x';
			for (int i = 0; i < board.length; i++) {
				boolean win = true;
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j] != other) {
						win = false;
						break;
					}
				}
				if (win) return true;
			}
			for (int i = 0; i < board.length; i++) {
				boolean win = true;
				for (int j = 0; j < board[i].length; j++) {
					if (board[j][i] != other) {
						win = false;
						break;
					}
				}
				if (win) return true;
			}
			boolean win = true;
			for (int i = 0; i < board.length; i++) {
				if (board[i][i] != other) {
					win = false;
					break;
				}
			}
			if (win) return true;
			
			win = true;
			for (int i = 0; i < board.length; i++) {
				if (board[i][2-i] != other) {
					win = false;
					break;
				}
			}
			if (win) return true;
			
			return false;
		}
		
		// determines if the game is tied
		public boolean stalemate() {
			for (int i = 0; i < 3; i++) 
				for (int j = 0; j < 3; j++) 
					if (board[i][j] == ' ') return false;
			return true;
		}
		
		// takes an integer 0-8 and updates the board at that location with 
		// an x/o depending on current turn
		public State performMove(int move) {
			if(board[move/3][move%3] != ' ') {
				System.out.println("Already taken");
				return null;
			}
			State copy = this.copy();
			copy.board[move/3][move%3] = turn ? 'x':'o';
			copy.turn = !turn;
			return copy;
		}
	}
	
	// chooses a move at depth level 1+
	public int chooseMove(State s, boolean currTurn) {
		
		// fill this in
	}
	
	
	// chooses a move at depth level 0
	public int chooseMove(State curr) {
		
		// fill this in
	}
	
	
	// runs the game
	public TicTacToeFiller() {
		
		Scanner input = new Scanner(System.in);
		
		State currState = new State(true);
		
		System.out.println(currState);
		
		while (!currState.win() && ! currState.stalemate()) {
			System.out.println((currState.turn ? 'x':'o') + "'s turn!\nChoose a square: ");
			int move = input.nextInt();
			
			State humanMove = currState.performMove(move);
			if (humanMove == null) {
				continue;
			}
			
			currState = humanMove;
			
			
			System.out.println(currState);
			
			currState = currState.performMove(chooseMove(currState));
			
			System.out.println(currState);
		}
		if (currState.win()) {
			System.out.println((currState.turn ? 'o':'x') + " wins!" );
		}
		else {
			System.out.println("Stalemate :/");
		}
		input.close();
	}
	

	public static void main(String[] args) {
		new TicTacToeFiller();
	}

}
