package com.mundisoft.gameobjects;

public class ScrollHandler {

    // ScrollHandler will create all five objects that we need.
    private Line line1, line2, line3, line4;
    public static final int SCROLL_SPEED = -59; 
    public static final int LINE_GAP = 34;

    // Constructor receives a float that tells us where we need to create our
    // Grass and Line objects.
    public ScrollHandler(float yPos) {
    	line1 = new Line(0,200, 34, 70, SCROLL_SPEED);
    }

    public void update(float delta) {
    	line1.update(delta);
    }

    // The getters for our instance variables

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Line getLine3() {
        return line3;
    }

    public Line getLine4() {
        return line4;
    }
    
}