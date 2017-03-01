import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    private GreenfootImage Alien1 = new GreenfootImage("Alien1.png");
    private GreenfootImage Alien2 = new GreenfootImage("Alien2.png");
    private GreenfootImage Alien3 = new GreenfootImage("Alien3.png");
    private GreenfootImage Alien4 = new GreenfootImage("Alien4.png");
    private GreenfootImage Alien5 = new GreenfootImage("Alien5.png");
    private GreenfootImage Alien6 = new GreenfootImage("Alien6.png");
    private GreenfootImage Alien7 = new GreenfootImage("Alien7.png");
    private GreenfootImage Alien8 = new GreenfootImage("Alien8.png");
    private GreenfootImage Alien1f = new GreenfootImage("Alienf1.png");
    private GreenfootImage Alien2f = new GreenfootImage("Alienf2.png");
    private GreenfootImage Alien3f = new GreenfootImage("Alienf3.png");
    private GreenfootImage Alien4f = new GreenfootImage("Alienf4.png");
    private GreenfootImage Alien5f = new GreenfootImage("Alienf5.png");
    private GreenfootImage Alien6f = new GreenfootImage("Alienf6.png");
    private GreenfootImage Alien7f = new GreenfootImage("Alienf7.png");
    private GreenfootImage Alien8f = new GreenfootImage("Alienf8.png");
    private int frame = 0;
    
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        boundaries();
        rotation();
        animate();
    }
    private boolean isFacing;
    private int rotation = 0;
    public void rotation()
    {
        if (rotation == 1)
        {
            isFacing = true;
            
        }
        if (rotation == 2)
        {
            isFacing = false;
        }
    }
    
    public void move()
    {
        
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation((getX()), (getY()-3) );
            frame++;
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation((getX()-3), (getY()) );
            
            rotation = 2;
            frame++;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation((getX()), (getY()+3) );
            frame++;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation((getX()+3), (getY()) );
            rotation = 1;
            frame++;
        }
    }
    public void boundaries()
    {
        if (getY() < 235)
        {
            setLocation( getX() , 235);
        }
    }
    public void animate()
    {
        
        if (frame == 4 && isFacing == true)
        {
            setImage(Alien2);
        }
        if (frame == 8 && isFacing == true)
        {
            setImage(Alien3);
        }
        if (frame == 12 && isFacing == true)
        {
            setImage(Alien4);
        }
        if (frame == 16 && isFacing == true)
        {
            setImage(Alien5);
        }
        if (frame == 20 && isFacing == true)
        {
            setImage(Alien6);
        }
        if (frame == 24 && isFacing == true)
        {
            setImage(Alien7);
        }
        if (frame == 28 && isFacing == true)
        {
            setImage(Alien8);
        }
        if (frame >= 32 && isFacing == true)
        {
            setImage(Alien1);
            frame = 0;
            return;
        }
        if (frame == 4 && isFacing == false)
        {
            setImage(Alien2f);
        }
        if (frame == 8 && isFacing == false)
        {
            setImage(Alien3f);
        }
        if (frame == 12 && isFacing == false)
        {
            setImage(Alien4f);
        }
        if (frame == 16 && isFacing == false)
        {
            setImage(Alien5f);
        }
        if (frame == 20 && isFacing == false)
        {
            setImage(Alien6f);
        }
        if (frame == 24 && isFacing == false)
        {
            setImage(Alien7f);
        }
        if (frame == 28 && isFacing == false)
        {
            setImage(Alien8f);
        }
        if (frame >= 32 && isFacing == false)
        {
            setImage(Alien1f);
            frame = 0;
            return;
        }
    }
    public void shoot()
    {
        
    }
}
