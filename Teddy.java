import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Teddy extends Actor
{
    boolean atTop = true;
    //switches between top and bottom when clicked
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        if(atTop){
            setLocation(100,100);
        } else {
            setLocation(100,300);
        }
    }
}
