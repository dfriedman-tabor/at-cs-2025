package maze2;
import java.awt.Color;

public abstract class Bot {
	
	private MazeRunner maze;
	public Color color;
	
	public Bot(MazeRunner mr, Color c) {
		maze = mr;
		color = c;
	}
	
	// attempts to move the Bot forward one space in the direction it is facing. 
	// returns whether this move was successful
	public boolean moveForward() {
		return maze.move(this);
	}
	
	// turns left by 90 degrees. This is always successful. 
	public void turnLeft() {
		maze.turnLeft(this);
	}
	
	// this is called each round. In it, you should call either turnLeft or moveForward.
	// you may only use one move/turn per round (you cannot turn left and move forward in one round)
	public abstract void move();
}
