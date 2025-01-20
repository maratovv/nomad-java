import processing.core.PApplet;

public class Lab3 extends PApplet {

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(0, 0, 0);
        line(0, height/2f, width, height/2f);
        line(width/2f, 0, width/2f, height);
        stroke(0, 80, 0);
        strokeWeight(50);
    }



    public static void main(String[] args) {
        PApplet.main("Lab3");
    }
}