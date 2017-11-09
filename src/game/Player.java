package game;
/**
 * @author NoahAwad
 *
 */
public class Player extends Character {
	int score = 0;
	int health = 10;
	int food = 0;
	
	//JUNIT
	/**
	 * Creates an instance of a player, with attributes xloc,yloc, and lane
	 */
	public Player() {
		xloc = Main.frameWidth - 650;
		yloc = 2 * (Main.frameHeight / 5);
		lane = 3;
	}
	//JUNIT
	/**
	 * Getter for player health, returns an int
	 */
	public int getHealth() {
		return health;
	}
	//JUNIT
	/**
	 * Increments the number of food that this object has "eaten"
	 */
	public void eatFood() {
		this.food++;
	}
	//JUNIT
	/**
	 * checks to see if there is a lane above the player. if there is, moves them up into that lane/increments lane, and updates yloc
	 * returns void
	 */
	public void jumpUp() {
		if (lane < 5) {
			lane++;
			yloc = Main.frameHeight - (lane * (Main.frameHeight / 5));
		}
	}
	//JUNIT
	/**
	 * checks to see if there is a lane under the player. if there is, moves them down into that lane/decrements lane, and updates yloc
	 * returns void
	 */
	public void jumpDown() {
		if (lane > 1) {
			lane--;
			yloc = Main.frameHeight - (lane * (Main.frameHeight / 5));
		}
	}
	//JUNIT
	
	/* (non-Javadoc)
	 * @see game.Character#getXloc()
	 */
	public int getXloc() {
		return xloc;
	}
	//JUNIT
	/**
	 * returns the current player objects score
	 */
	public int getScore() {
		return this.score;
	}
	
	// JUNIT
	/**
	 * @param int i is the score you want to set for the current player
	 */
	public void setScore(int i) {
		this.score = i;
	}
	// JUNIT
	/**
	 * @param changes current player objects score by the given value input
	 */
	public void changeScore(int value) {
		score += value;
	}
	// JUNIT
	/**
	 * @param Decrements health. dmg is the amount you decrement the current player objects health by
	 */
	public void takeDamage(int dmg) {
		health +=  dmg;
	}
	//JUNIT
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//return "This player has lane:" + this.lane + " Their score is:" + this.score;
		return "This player is in lane " + this.lane + ", their score is " + this.score + ", and they have " + this.health + " hit points.";
	}
}
