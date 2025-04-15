import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Teddy extends Actor
{
    private int moveCooldown = 0;
    //teddy can go up or down when pressing up or down arrows respectively
    // teddy can be at the top, middle or bottom
    public void act()
    {
        if (moveCooldown > 0) {
            moveCooldown--;
            return;
        }
        if(Greenfoot.isKeyDown("up") && !atTop()){
            setLocation(100,getY()-200);
            moveCooldown = 10;
        }
        if(Greenfoot.isKeyDown("down") && !atBottom()){
            setLocation(100,getY()+200);
            moveCooldown = 10;
        }
    }
    //returns if teddy is at top or bottom
    public boolean atTop(){
        if(getY() == 100){
            return true;
        }
        return false;
    }
    public boolean atBottom(){
        if(getY() == 500){
            return true;
        }
        return false;
    }
}
