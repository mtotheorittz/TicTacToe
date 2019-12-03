public class TicTacToe {
	
	
	private int ROWS = 3;
	private int COLS = 3;
	public Player[][] board;

	public enum Player {
		Unknown, X, O,  
}
	public TicTacToe() {
		winner=null;
		board = new Player[3][3];
		initialiazeBoard();
		getCurrentPlayer(currentPlayer, currentPlayer);
        
	}
	

	private Player currentPlayer;
	private Player winner;
	
	public void initialiazeBoard() {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]=null;
			}
		}
	}
	
	public void play(int row, int col) {
		if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == null) {
                    board[row][col] = currentPlayer;
                    
                }
            }
        }

        
    }
	
	
	
	
	public boolean isBoardEmpty() {
		 boolean isEmpty = true;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == null) {
	                    isEmpty = true;
	                }
	            }
	        }

	        return isEmpty;
	}
	
	public boolean isGameWon() {
		
//		  for (int i = 0; i < 3; i++) {
//	            if (isGameWon(board[i][0], board[i][1], board[i][2]) == true) {
//	                return true;
//	            }
//	        }
//	        return false;
		for (int i = 0; i < 3; i++) {
            if (isGameWon(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
		
        return false;
        
        for (int i = 0; i < 3; i++) {
            if (board[0][i] && board[1][i] && board[2][i]) == true) {
                return true;
            }
        }
        return false;
        
        (board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true)
    }
	    
	

	
	
	

	
	public boolean isDraw() {
		if(isGameWon()==true) {
			return false;
	}
		return false;
	}
	public boolean isGameOver() {
		if(isDraw()||isGameWon()==true) {
			return true;
	}
		return false;
	}
	
	public Player getCurrentPlayer(Player X, Player O) {
		currentPlayer=X;
		
		
	        if (currentPlayer == X) {
	            return O;
	        }
	        else {
	            return X;
	        }
			
	    }
	
	public Player getWinner() {
		return winner;}
}


