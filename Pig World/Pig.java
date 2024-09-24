// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * The pig class is used as the main character for the game.
 */
public class Pig extends Actor
{

    /**
     * This method allows "moveAndTurn" and "eat" to be called whenever tge "Act" or "Run" button is used in Greenfoot. This method also allows for the game to play the "win.wav" sound effect, and then use method "transitionToGameWonWorld".
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            Greenfoot.playSound("win.wav");
            transitionToGameWonWorld();
        }
    }

    /**
     * This method allows the pig to move around with the use of the arrow keys.
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(4);
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(4);
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(4);
            turn(-3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(4);
            turn(3);
        }
    }

    /**
     * This method allows the pig to eat the burgers. Once a burger is touched, it gets removed, and the "eating.wav" sound effect in the "sounds" folder gets played.
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * In this method, the game is checking to see if there are any burger classes in the game. If the burger count is equal to zero, the game will consider isGameWon to be True.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method allows the game to transition to the Game Won World.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
