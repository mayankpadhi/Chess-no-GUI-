/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

public abstract class pieces{

	public boolean col, killstat;
	public abstract boolean moves(int frmposx, int frmposy, int toposx, int toposy, boolean color);
        public abstract boolean chkmoves(int frmposx, int frmposy, int toposx, int toposy, boolean color);

}
