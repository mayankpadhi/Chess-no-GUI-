/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

public class pawn1 extends pieces{

        int flag= 0;
	pawn1(boolean colu){
		killstat= false;
		this.col= colu;
	}
	
        public boolean chkmoves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
            
            if(brd.board[frmposx-1][frmposy]!= null){
		flag= 0;
                return false;
            }

            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx-1][frmposy]){
		return true;
            }

            else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 1]|| brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 1]){
                if(brd.board[toposx][toposy].col== color){
                    flag= 0;
                    return false;
                }
                            
                else{//prev object kill
                    return true;
                }
            }
            return false;
        }
        
	public boolean moves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
            if(brd.board[frmposx-1][frmposy]!= null){
		System.out.println("Not Possibleoy");
		flag= 0;
                return false;
            }

            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx-1][frmposy]){
		brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
		brd.board[frmposx][frmposy]= null;
                return true;
            }

            else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 1]|| brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 1]){
                if(brd.board[toposx][toposy].col== color){
                    System.out.println("Not Possiblehi");
                    flag= 0;
                    return false;
                }
                            
                else{//prev object kill
                    brd.board[toposx][toposy].killstat= true;
                    brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                    brd.board[frmposx][frmposy]= null;
                    return true;
                }
            }
            return false;
        }
}
