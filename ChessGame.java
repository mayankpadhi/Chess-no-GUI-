/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package chessgame;

import java.util.Scanner;


public class ChessGame{
    public static void main(String[] args){
        
        Scanner yo= new Scanner(System.in);
        boolean chance= true;
        
        player hi= new player();
        player.initpos();                       //initilise the positions of the kings, queens,... of both the teams
        pieces p;
        
        while(player.bk1.killstat!= true && player.wk1.killstat!= true){
            
            //This will display the grid and will be updated after every move.
            System.out.println("\ta\t\tb\t\tc\t\td\t\te\t\tf\t\tg\t\th");
            for(int g= 7; g>=0 ; g--){
                System.out.print(g+1+"\t");
                for(int gg= 7; gg>=0; gg--){
                    p= brd.board[g][gg];
                    if(p instanceof pawn0)
                        System.out.print("WPw\t\t");
                    else if(p instanceof pawn1)
                        System.out.print("BPw\t\t");
                    else if(p instanceof rook){
                        if(p.col== true)
                            System.out.print("BRk\t\t");
                        else
                            System.out.print("WRk\t\t");
                    }
                    else if(p instanceof knight){
                        if(p.col== true)
                            System.out.print("BKt\t\t");
                        else
                            System.out.print("WKt\t\t");
                    }
                    else if(p instanceof bishop){
                        if(p.col== true)
                            System.out.print("BBp\t\t");
                        else
                            System.out.print("WBp\t\t");
                    }
                    else if(p instanceof king){
                        if(p.col== true)
                            System.out.print("BKg\t\t");
                        else
                            System.out.print("WKg\t\t");
                    }
                    else if(p instanceof queen){
                        if(p.col== true)
                            System.out.print("BQn\t\t");
                        else
                            System.out.print("Wqn\t\t");
                    }
                    else
                        System.out.print("null\t\t");
                }
                System.out.println();
            }
            //display grid end
            
            System.out.println("Enter The ("+ !chance +") Piece Value: ");
            String pie= yo.next();
            
            System.out.println("From Positions: ");
            int frmposx= yo.nextInt();
            int frmposy= yo.nextInt();
            
            System.out.println("To Positions: ");
            int toposx= yo.nextInt();
            int toposy= yo.nextInt();
            
            //Checking the check condition
            /*            if(hi.ccheck(frmposx, frmposy, toposx, toposy, chance)){
            if(chance== true)
            System.out.println("Check for black");
            else
            System.out.println("Check for white");
            }
            */
            if((frmposx>= 0 && frmposx< 8) && (frmposy>= 0 && frmposy< 8) && (toposx>= 0 && toposx< 8) && (toposy>= 0 && toposy< 8)){//for index out of bound exception
                if(chance== true){
                    if(!brd.board[frmposx][frmposy].moves(frmposx, frmposy, toposx, toposy, chance)){
                        System.out.println("Try Again");
                    }
                    
                    else
                        chance= false;
                }
                
                else if(chance== false){
                    if(!brd.board[frmposx][frmposy].moves(frmposx, frmposy, toposx, toposy, chance)){
                        System.out.println("Try Again");
                    }
                    
                    else
                        chance= true;
                }
            }
            
            else
                System.out.println("Try Again");
        }
    }
}