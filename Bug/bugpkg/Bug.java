/*  Alice Lily
    Creates the Bug class - an interactive "bug" that can move along
    a wire to the left or the right (can be turned). Establishes all
    the appropriate methods that can affect the bug or be used to
    view its status.	*/
	
package bugpkg;

public class Bug {

    //Establish the bounds of the wire
    private final int MAX_LEFT = -50;
    private final int MAX_RIGHT = 50;

    //Variables for position and direction used within the class
    private int position;
    private int direction = 1;

    //Places the bug at a random point along the wire
    public Bug() {
        position = (int)Math.floor(Math.random() * (Math.abs(MAX_LEFT)+MAX_RIGHT)- 50);
    }

    //User can construct with an initial point on wire
    public Bug(int startpoint) {
	if (startpoint >= MAX_LEFT && startpoint <= MAX_RIGHT)
		position = startpoint;
	else {
		position = (int)Math.floor(Math.random() * (Math.abs(MAX_LEFT)+MAX_RIGHT)- 50);
		System.out.println("You have chosen a position outside of the wire. " 
				+ "A random position along the wire has been chosen. ");
	}
    }

    //Internal check for if bug has met the bounds
    private boolean canMove() {
        if (position == MAX_RIGHT && direction == 1)
            return false;
        else if (position == MAX_LEFT && direction == 0)
            return false;
        else
            return true;
    }

    //Return direction of the bug
    public String getDirection() {
        String direct;
        if (direction == 1)
            direct = "right";
        else
            direct = "left";
        return direct;
    }

    //Return position on wire
    public int getPosition() {
        return position;
    }

    //Allow user to change position if need be within the max range
    public void setPosition(int newPosition) {
        if (newPosition >= MAX_LEFT && newPosition <= MAX_RIGHT)
            position = newPosition;
    }

    //Move in current direction
    public void move() {
        if (canMove()) {
            if (direction == 1)
                position++;
            else
                position--;
        }
    }

    //Turn to other direction
    public void turn() {
        if (direction == 1)
            direction = 0;
        else
            direction = 1;
    }

    //Print position and direction to user
    public String toString() {
        if (getPosition() == MAX_LEFT || getPosition() == MAX_RIGHT) {
            String result = "The bug is at position " + position + " (MAX) facing " + getDirection() + " on the wire.";
            return result;
        } else {
            String result = "The bug is at position " + position + " facing " + getDirection() + " on the wire.";
            return result;
        }
    }
}
