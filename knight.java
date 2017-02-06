/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package chessgame;

public class knight extends pieces{
    
    knight(boolean colu){
        killstat= false;
        this.col= colu;
    }
    
    public boolean chkmoves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
        int flag;
        if(brd.board[frmposx- 1][frmposy+ 2]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 2]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 2]){
            return true;
        }
        
        
        if(brd.board[frmposx+ 1][frmposy+ 2]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy+ 2]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy+ 2]){
            return true;
        }
        
        
        if(brd.board[frmposx+ 2][frmposy+ 1]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy+ 1]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy+ 1]){
            return true;
        }
        
        if(brd.board[frmposx+ 2][frmposy- 1]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy- 1]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy- 1]){
            return true;
        }
        
        if(brd.board[frmposx+ 1][frmposy- 2]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy- 2]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy- 2]){
            return true;
        }
        
        if(brd.board[frmposx- 1][frmposy- 2]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 2]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 2]){
            return true;
        }
        
        if(brd.board[frmposx- 2][frmposy- 1]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy- 1]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy- 1]){
            return true;
        }
        
        if(brd.board[frmposx- 2][frmposy+ 1]!= null && color== brd.board[toposx][toposy].col){
//			System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy+ 1]){
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy+ 1]){
            return true;
        }
        return false;
    }
    
    public boolean moves(int frmposx, int frmposy, int toposx, int toposy, boolean color){
        
        int flag;
        if(brd.board[frmposx- 1][frmposy+ 2]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 2]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy+ 2]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        
        if(brd.board[frmposx+ 1][frmposy+ 2]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy+ 2]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy+ 2]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        
        if(brd.board[frmposx+ 2][frmposy+ 1]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy+ 1]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy+ 1]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        if(brd.board[frmposx+ 2][frmposy- 1]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy- 1]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 2][frmposy- 1]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        if(brd.board[frmposx+ 1][frmposy- 2]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy- 2]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx+ 1][frmposy- 2]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        if(brd.board[frmposx- 1][frmposy- 2]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 2]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 1][frmposy- 2]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        if(brd.board[frmposx- 2][frmposy- 1]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy- 1]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy- 1]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        
        if(brd.board[frmposx- 2][frmposy+ 1]!= null && color== brd.board[toposx][toposy].col){
            System.out.println("Not Possible");
            flag= 0;
            return false;
        }
        else if(brd.board[toposx][toposy]== null && brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy+ 1]){
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        else if(brd.board[toposx][toposy]== brd.board[frmposx- 2][frmposy+ 1]){
            //prev object kill
            brd.board[toposx][toposy].killstat= true;
            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
            brd.board[frmposx][frmposy]= null;
            return true;
        }
        return false;
    }
}
