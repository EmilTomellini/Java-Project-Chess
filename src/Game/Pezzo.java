/**
 * 
 */
package Game;


/**
 * @author Emil Tomellini Matteo Brentegani
 *
 */
public abstract class Pezzo {

	private int x;
	private int y;
	private Color colore;
	
	public Pezzo(int x, int y, Color c) {
		this.x=x;
		this.y=y;
		colore=c;
	}
	
}
