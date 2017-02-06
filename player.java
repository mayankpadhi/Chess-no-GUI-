/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

public class player{
//	void initl(){
                //made objects of pieces
                //white 
		public static king wk1= new king(false);
		public static queen wq1= new queen(false);
		public static pawn0 wp1= new pawn0(false);
		public static pawn0 wp2= new pawn0(false);
		public static pawn0 wp3= new pawn0(false);
		public static pawn0 wp4= new pawn0(false);
		public static pawn0 wp5= new pawn0(false);
		public static pawn0 wp6= new pawn0(false);
		public static pawn0 wp7= new pawn0(false);
		public static pawn0 wp8= new pawn0(false);
		public static rook wr1= new rook(false);
		public static rook wr2= new rook(false);
		public static knight wn1= new knight(false);
		public static knight wn2= new knight(false);
		public static bishop wb1= new bishop(false);
		public static bishop wb2= new bishop(false);

                //black
		public static king bk1= new king(true);
		public static queen bq1= new queen(true);
		public static pawn1 bp1= new pawn1(true);
		public static pawn1 bp2= new pawn1(true);
		public static pawn1 bp3= new pawn1(true);
		public static pawn1 bp4= new pawn1(true);
		public static pawn1 bp5= new pawn1(true);
		public static pawn1 bp6= new pawn1(true);
		public static pawn1 bp7= new pawn1(true);
		public static pawn1 bp8= new pawn1(true);
		public static rook br1= new rook(true);
		public static rook br2= new rook(true);
		public static knight bn1= new knight(true);
		public static knight bn2= new knight(true);
		public static bishop bb1= new bishop(true);
		public static bishop bb2= new bishop(true);
	
//	}

        public static void initpos(){
/*
                        brd.board[3][0]= wk1;
                        brd.board[4][0]= wq1;
                        brd.board[0][0]= wr1;
                        brd.board[7][0]= wr2;
                        brd.board[1][0]= wn1;
                        brd.board[6][0]= wn2;
                        brd.board[2][0]= wb1;
                        brd.board[5][0]= wb2;
                        brd.board[0][1]= wp1;
                        brd.board[1][1]= wp2;
                        brd.board[2][1]= wp3;
                        brd.board[3][1]= wp4;
                        brd.board[4][1]= wp5;
                        brd.board[5][1]= wp6;
                        brd.board[6][1]= wp7;
                        brd.board[7][1]= wp8;

       			brd.board[4][7]= bk1;
                        brd.board[3][7]= bq1;
                        brd.board[0][7]= br1;
                        brd.board[7][7]= br2;
                        brd.board[1][7]= bn1;
                        brd.board[6][7]= bn2;
                        brd.board[2][7]= bb1;
                        brd.board[5][7]= bb2;
                        brd.board[0][6]= bp1;
                        brd.board[1][6]= bp2;
                        brd.board[2][6]= bp3;
                        brd.board[3][6]= bp4;
                        brd.board[4][6]= bp5;
                        brd.board[5][6]= bp6;
                        brd.board[6][6]= bp7;
                        brd.board[7][6]= bp8;
*/           //initialized positions
			brd.board[0][3]= wk1;
                        brd.board[0][4]= wq1;
                        brd.board[0][0]= wr1;
                        brd.board[0][7]= wr2;
                        brd.board[0][1]= wn1;
                        brd.board[0][6]= wn2;
                        brd.board[0][2]= wb1;
                        brd.board[0][5]= wb2;
                        brd.board[1][0]= wp1;
                        brd.board[1][1]= wp2;
                        brd.board[1][2]= wp3;
                        brd.board[1][3]= wp4;
                        brd.board[1][4]= wp5;
                        brd.board[1][5]= wp6;
                        brd.board[1][6]= wp7;
                        brd.board[1][7]= wp8;

       			brd.board[7][4]= bk1;
                        brd.board[7][3]= bq1;
                        brd.board[7][0]= br1;
                        brd.board[7][7]= br2;
                        brd.board[7][1]= bn1;
                        brd.board[7][6]= bn2;
                        brd.board[7][2]= bb1;
                        brd.board[7][5]= bb2;
                        brd.board[6][0]= bp1;
                        brd.board[6][1]= bp2;
                        brd.board[6][2]= bp3;
                        brd.board[6][3]= bp4;
                        brd.board[6][4]= bp5;
                        brd.board[6][5]= bp6;
                        brd.board[6][6]= bp7;
                        brd.board[6][7]= bp8;
        }
        
	public boolean ccheck(int frmposx, int frmposy, int toposx, int toposy, boolean col){
		if(col == false){
			if(bq1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp3.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp4.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp5.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp6.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp7.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bp8.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(br1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(br2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bn1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bn2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bb1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(bb2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
		}

		else{
			if(wq1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp3.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp4.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp5.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp6.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp7.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wp8.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wr1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wr2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wn1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wn2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wb1.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
			else if(wb2.chkmoves(frmposx, frmposy, toposx, toposy, col)== true)
				return true;
		}

                return false;
	}
}