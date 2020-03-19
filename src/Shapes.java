public class Shapes {

    private Turtle bob;
    private final String DEFAULT_BG_CLR = "lightblue";
    private final String DEFAULT_PEN_CLR = "teal";
    private final int DEFAULT_WIDTH = 10;
    private final int STAR_ANGLE = 144;
    private final int TRIANGLE_ANGLE = 120;
    private final int SQUARE_ANGLE = 90;
    private final int START_DISTANCE = 100;
    private final int DEFAULT_SPEED = 500;
    private int distance;

    /**
     * constructor for the object
     */
    public Shapes()
    {
        bob = new Turtle();

        this.setBgColor(DEFAULT_BG_CLR);
        this.setPenWidth(DEFAULT_WIDTH);
        this.setPenColor(DEFAULT_PEN_CLR);
        this.setSpeed(DEFAULT_SPEED);
        this.setDistance(START_DISTANCE);
    }

    /**
     * this function draws a star with the turtle
     */
    public void drawStar()
    {
        this.cls();

        for(int i=0;i<5;i++)
        {
            bob.forward(this.distance);
            bob.right(STAR_ANGLE);
        }
    }

    /**
     * this function draws a circle
     */
    public void drawTriangle()
    {
        this.cls();

        for (int i = 0 ; i < 3; i++)
        {
            this.bob.forward(this.distance);
            this.bob.left(TRIANGLE_ANGLE);
        }
    }

    /**
     * this function draws a square
     */
    public void drawSquare()
    {
        this.cls();

        for (int i = 0 ; i < 4; i++)
        {
            this.bob.forward(this.distance);
            this.bob.left(SQUARE_ANGLE);
        }
    }

    /**
     * this function clears the screen
     */
    private void cls()
    {
        bob.clear();
    }

    /**
     * closes the turtle game
     */
    public void end()
    {
        Turtle.exit();
    }

    /**
     * sets the distance
     * @param distance the distance we wnat the turtle to move
     */
    public void setDistance(int distance) {

        if(distance > 0 && distance < 1000)
        {
            this.distance = distance;
        }
    }

    /**
     * sets the bg color
     * @param color the color we want to change
     */
    public void setBgColor(String color) {

        if(Turtle.containsColor(color))
        {
            Turtle.bgcolor(color);
        }
    }

    /**
     * sets the pen color
     * @param color the color we want to change
     */
    public void setPenColor(String color) {

        if(Turtle.containsColor(color))
        {
            bob.penColor(color);
        }
    }

    /**
     * sets the pen width color
     * @param width the width of the pen
     */
    public void setPenWidth(int width) {

        if(width > 0 && width < 500)
        {
            bob.width(width);
        }
    }

    /**
     * sets the bg color
     * @param speed the color we want to change
     */
    public void setSpeed(int speed) {

        if(speed> 0 && speed < 1000)
        {
            bob.speed(speed);
        }
    }
}
