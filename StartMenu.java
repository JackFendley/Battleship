import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Jack Fendley
 * Course: CS30S
 * Teacher: Mr. Hardizzle
 * Lab #1, Program #0
 * Date Last Modified: February 22nd, 2018
 */
public class StartMenu extends World
{
    private GreenfootImage startBackground = new GreenfootImage( "Battleship.jpg" );
    /**
     * StartMenu is the constructor for objects of type StartMenu
     * 
     * @param There are no parameters
     * @return An object of type StartMenu
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        
        startBackground.scale( getWidth(), getHeight() );
        
        setBackground( startBackground );
        
        addObject( new StartButton(), getWidth()/2, getHeight() - 100 );
    }
}
