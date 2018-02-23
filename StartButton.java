import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Startbutton is the constructor for objects of type StartButton
     * 
     * @param There are no paramaters
     * @return an object of type startButton
     * 
     */
    public StartButton()
    {
        GreenfootImage buttonImage = new GreenfootImage( 90, 90 );
        
        buttonImage.setColor( Color.BLACK );
        buttonImage.fillOval( 0, 0, 90, 90 );
        
        buttonImage.setColor( Color.ORANGE );
        buttonImage.fillOval( 3, 3, 84, 84 );
        
        buttonImage.drawImage( new GreenfootImage( "START", 30, Color.BLACK, new Color( 0, 0, 0, 0) ), 6, buttonImage.getHeight() /3);
        
        setImage(buttonImage);
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.setWorld( new PlayerWorld() );
        }
    }    
}
