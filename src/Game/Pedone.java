/**
 * 
 */
package Game;

/**
 * @author Emil Tomellini Matteo Brentegani
 *
 */
public class Pedone extends Pezzo {

	private boolean firstMove;
	
	/**
	 * @param x
	 * @param y
	 */
	
	public Pedone(int x, int y, Color c) {
		super(x, y, c);
		firstMove=true;
	}

}
