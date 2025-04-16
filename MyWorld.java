import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        //create a new world with 600x400 cells with a cell size of 1x1 pixels
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        Apple apple = new Apple();
        addObject(apple, 100, 300);
    }
}
