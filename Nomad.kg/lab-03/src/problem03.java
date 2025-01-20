import processing.core.PApplet;

public class Problem03 extends PApplet {
    private float x;
    private float y;
    private float speedX;
    private float speedY;
    private int rad;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        x = width / 2f;
        y = height / 2f;

        speedX = 3f;
        speedY = 3f;

        rad = 100;
    }

    @Override
    public void draw() {
        background(0, 0, 0);
        fill(255);
        circle(x, y, rad);
        x += speedX;
        y += speedY;

        if (x >= width-rad/2f){
            speedX *= -1;
        }

        if (y >= height-rad/2f){
            speedY *= -1;
        }

        if (x <= rad/2f){
            speedX *= -1;
        }

        if (y <= rad/2f){
            speedY *= -1;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}