import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Banana extends Actor{
    //always moving to left
    //if touching teddy, add skull to show game over
    public void act()
    {
        move(-15);
        if(getX()  <= 0){
            resetBanana();
        }
        if(isTouching(Teddy.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 300);
            getWorld().removeObject(this);
        } 
    }
    //reset banana to right of screen, randomize if at bottom, middle, or top
    public void resetBanana(){
        int num = Greenfoot.getRandomNumber(3);
        if(num == 0){
            setLocation(600, 100);
        } else if(num == 1){
            setLocation(600, 300);
        } else {
            setLocation(600, 500);
        }
    }
}
