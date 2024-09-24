// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * The Snake is the main enimy in the game. Essentially what the pig must avoid. If he eliminates the pig, the Game Over Screen is shown.
 */
public class Snake extends Actor
{

    /**
     * This constructor allows the snake to use the method "randoDirection".
     */
    public Snake()
    {
        randomDirection();
    }

    /**
     * This method allows "moveAround", "eliminatePig", "randomDirection" and "move" to be called whenever tge "Act" or "Run" button is used in Greenfoot. This method also allows for when the "isGameLost" boolean is true, to run the method "transitionToGameOverWorld".
     */
    public void act()
    {
        moveAround();
        eliminatePig();
        randomDirection();
        move(1);
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * This method allows the snake to move in a random direction. As so the 
     */
    public void randomDirection()
    {
        if (Greenfoot.getRandomNumber(1) == 1) {
            int randomDirection = Greenfoot.getRandomNumber(360);
            turn(randomDirection);
        }
    }

    /**
     * This method allows for the Snake to move around the world, as well as allow him to rotate by 180* whenever he is near an edge, so he won't be stuck on walls and such.
     */
    public void moveAround()
    {
        move(4);
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * This method allows the snake to eliminate the pig. Once the snake intersects with the pig, the pig gets removed, and plays the "lose.wav" sound effect.
     */
    public void eliminatePig()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * In this method, the game is checking to see if there are any pig classes in the game. If the pig count is equal to zero, the game will consider isGameLost to be True.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method allows the game to transition to the Game Over World.
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
