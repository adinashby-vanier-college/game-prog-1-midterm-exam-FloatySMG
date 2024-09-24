// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 73, 55);
        Burger burger2 =  new  Burger();
        addObject(burger2, 166, 68);
        Burger burger3 =  new  Burger();
        addObject(burger3, 116, 149);
        Pig pig =  new  Pig();
        addObject(pig, 179, 229);
        Burger burger4 =  new  Burger();
        addObject(burger4, 57, 305);
        Burger burger5 =  new  Burger();
        addObject(burger5, 135, 355);
        Burger burger6 =  new  Burger();
        addObject(burger6, 429, 300);
        Burger burger7 =  new  Burger();
        addObject(burger7, 536, 253);
        Burger burger8 =  new  Burger();
        addObject(burger8, 438, 102);
        Burger burger9 =  new  Burger();
        addObject(burger9, 487, 42);
        Snake snake =  new  Snake();
        addObject(snake, 531, 349);
    }
}
