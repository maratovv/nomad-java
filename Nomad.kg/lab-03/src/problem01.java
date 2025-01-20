import processing.core.PApplet;

public class Problem01 extends PApplet {

    private float starterX;
    private float starterY;
    private float rectWidth;
    private float rectHeight;


    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        textSize(45.0f);
        starterX = width/3f;
        starterY = height/6f;

        rectHeight = starterY;
        rectWidth = starterX;
    }

    @Override
    public void draw() {
        background(0);
        fill(0, 0, 255);
        rect(starterX, starterY, rectWidth, rectHeight);
        fill(255);
        text("Python Programming Language", starterX+22.5f, starterY+100);

        if (mouseX >= starterX && mouseX <= starterX + rectWidth &&
                mouseY >= starterY && mouseY <= starterY + rectHeight) {
            fill(255, 255, 0);
            text("Year: 1991, PYPL Index: 1", 730, height - 100);
            fill(83, 15, 5);
            text("Python Programming Language", starterX+22.5f, starterY+100);
        }



        fill(0, 0, 255);
        rect(starterX, starterY+181, rectWidth, rectHeight);
        fill(255);
        text("Java Programming Language", starterX+45, starterY+280);

        if (mouseX >= starterX && mouseX <= starterX + rectWidth &&
                mouseY >= starterY+181 && mouseY <= starterY+181 + rectHeight) {
            fill(255, 255, 0);
            text("Year: 1995, PYPL Index: 2", 730, height - 100);
            fill(83, 15, 5);
            text("Java Programming Language", starterX+45, starterY+280);
        }



        fill(0, 0, 255);
        rect(starterX, starterY+362, rectWidth, rectHeight);
        fill(255);
        text("PHP Programming Language", starterX+50, starterY+460);

        if (mouseX >= starterX && mouseX <= starterX + rectWidth &&
                mouseY >= starterY+362 && mouseY <= starterY+362 + rectHeight) {
            fill(255, 255, 0);
            text("Year: 1995, PYPL Index: 7", 730, height - 100);
            fill(83, 15, 5);
            text("PHP Programming Language", starterX+50, starterY+460);
        }



        fill(0, 0, 255);
        rect(starterX, starterY+543, rectWidth, rectHeight);
        fill(255);
        text("Rust Programming Language", starterX+50, starterY+640);

        if (mouseX >= starterX && mouseX <= starterX + rectWidth &&
                mouseY >= starterY+543 && mouseY <= starterY+543 + rectHeight) {
            fill(255, 255, 0);
            text("Year: 2006, PYPL Index: 9", 730, height - 100);fill(255);
            fill(83, 15, 5);
            text("Rust Programming Language", starterX+50, starterY+640);
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}