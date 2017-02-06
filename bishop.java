/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package chessgame;

public class bishop extends pieces{
    
    bishop(boolean colu){
        killstat= false;
        this.col= colu;
    }
    
    public boolean chkmoves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
        int i= frmposx;
        int j= frmposy;
        int flag= 0;
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
//				System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
//                                System.out.println("Not Possible");
                    flag= 0;
                    return false;
                }
                
                else{//prev object kill
                    return true;
                }
            }
            i--;
            j++;
        }
        
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
//				System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
//                                System.out.println("Not Possible");
                    flag= 0;
                    return false;
                }
                
                else{//prev object kill
                    return true;
                }
            }
            i++;
            j++;
        }
        
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
//				System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
//                                System.out.println("Not Possible");
                    flag= 0;
                    return false;
                }
                
                else{//prev object kill
                    return true;
                }
            }
            i++;
            j--;
        }
        
        while(i!= 0 || j!= 0){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
//				System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
//                                System.out.println("Not Possible");
                    flag= 0;
                    return false;
                }
                
                else{//prev object kill
                    return true;
                }
            }
            i--;
            j--;
        }
        
        return false ;
    }
    
    public boolean moves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
        int i= frmposx;
        int j= frmposy;
        int flag= 0;
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
                System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                brd.board[frmposx][frmposy]= null;
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
                    System.out.println("Not Possible");
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
            i--;
            j++;
        }
        
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
                System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                brd.board[frmposx][frmposy]= null;
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
                    System.out.println("Not Possible");
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
            i++;
            j++;
        }
        
        while(i!= 8 || j!= 8){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
                System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                brd.board[frmposx][frmposy]= null;
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
                    System.out.println("Not Possible");
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
            i++;
            j--;
        }
        
        while(i!= 0 || j!= 0){
            if(brd.board[i][j]!= null && i<toposx && j< toposy){
                System.out.println("Not Possible");
                flag= 0;
                return false;
            }
            else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[i][j]){
                brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                brd.board[frmposx][frmposy]= null;
                return true;
            }
            else if(brd.board[toposx][toposy]== brd.board[i][j]){
                if(brd.board[toposx][toposy].col== color){
                    System.out.println("Not Possible");
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
            i--;
            j--;
        }
        
        return false ;
    }
}
