/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

public class king extends pieces{
	
	king(boolean colu){
		killstat= false;
		this.col= colu;
	}
	
        //method to check the validity of the given co-ordinates.
        public boolean chkmoves(int frmposx, int frmposy, int toposx, int toposy, boolean color){

		if(toposx== frmposx+1 && toposy == frmposy+1){

                        //if piece of the same team
			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

                        //if the net space is empty
			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx && toposy == frmposy+1){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy+1){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy-1){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx && toposy == frmposy-1){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx+1 && toposy == frmposy-1){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		if(toposx== frmposx+1 && toposy == frmposy){

			if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else if(brd.board[toposx][toposy]== null){
				return true;
			}

			else{
				return true;
			}
		}

		else
			return false;
            
        }
        
	public boolean moves(int frmposx, int frmposy, int toposx, int toposy, boolean color){

		if(toposx== frmposx+1 && toposy == frmposy+1){

                    //if the next position is empty
			if(brd.board[toposx][toposy]== null){
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];     //moved the object
				brd.board[frmposx][frmposy]= null;
				return true;
			}

                        //if next postion has piece of same color
                        else if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

                        //if next position has piece of other color
			else{
				brd.board[toposx][toposy].killstat= true;       //killed the prev object
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx && toposy == frmposy+1){

			if(brd.board[toposx][toposy]== null){
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];
				brd.board[frmposx][frmposy]= null;
				return true;
			}

                        else if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];        // move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy+1){

                    if(brd.board[toposx][toposy]== null){
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
				brd.board[frmposx][frmposy]= null;
				return true;
			}

                    else if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy){

                    if(brd.board[toposx][toposy]== null){
                    	brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                        brd.board[frmposx][frmposy]= null;
			return true;
                    }

                    else if(color== brd.board[toposx][toposy].col){
			System.out.println("Not Possible");
			return false;
                    }

                    else{
				//prev object kill
                        brd.board[toposx][toposy].killstat= true;
                        brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                        brd.board[frmposx][frmposy]= null;
			return true;
			}
		}

		if(toposx== frmposx-1 && toposy == frmposy-1){

			if(brd.board[toposx][toposy]== null){
                            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                            brd.board[frmposx][frmposy]= null;
                            return true;
			}

                        else if(color== brd.board[toposx][toposy].col){
                            System.out.println("Not Possible");
                            return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx && toposy == frmposy-1){

			if(brd.board[toposx][toposy]== null){
                            brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
                            brd.board[frmposx][frmposy]= null;
                            return true;
			}

                        else if(color== brd.board[toposx][toposy].col){
                            System.out.println("Not Possible");
                            return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx+1 && toposy == frmposy-1){

			if(brd.board[toposx][toposy]== null){
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
				brd.board[frmposx][frmposy]= null;
				return true;
			}

                        else if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		if(toposx== frmposx+1 && toposy == frmposy){

                        if(brd.board[toposx][toposy]== null){
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];		// move the object that is not present.
				brd.board[frmposx][frmposy]= null;
				return true;
			}
                    
                        else if(color== brd.board[toposx][toposy].col){
				System.out.println("Not Possible");
				return false;
			}

			else{
				//prev object kill
                                brd.board[toposx][toposy].killstat= true;
				brd.board[toposx][toposy]= brd.board[frmposx][frmposy];// move the object that is not present.
                                brd.board[frmposx][frmposy]= null;
				return true;
			}
		}

		else
			System.out.println("Invalid Move");
			return false;
	}
		
}