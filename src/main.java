import java.util.Scanner;

public class main {

    private final static int BAD_CASE = -1;
    private final static int EXIT = 0;
    private final static int TRIANGLE = 1;
    private final static int SQUARE = 2;
    private final static int STAR = 3;
    private final static int GRAPHICS_MENU = 4;

    private static Shapes artist;

    /**
     * @param a commandline args
     */
    public static void main(String[] a)
    {

        // gets the choice from the user
        int menuChoice = menu();

        // creates instants a  Shapes object
        artist = new Shapes();

        //while the user has not chosen exit
        while (menuChoice != EXIT)
        {
            // acts based upon the user choice
            switch (menuChoice)
            {
                case TRIANGLE:
                    artist.drawTriangle();
                    break;
                case SQUARE:
                    artist.drawSquare();
                    break;
                case STAR:
                    artist.drawStar();
                    break;
                case GRAPHICS_MENU:
                    GraphicsMenu();
                    break;
                default:
                    System.out.println("You have not picked a valid option");
            }

            menuChoice = menu();
        }

        // closes the turtle game
        artist.end();
    }

    /***
     * runs the menu to keep drawing
     * @return the shape we want to draw
     */
    private static int menu()
    {

        Scanner scan = new Scanner(System.in);

        // prints out the menu to the user and gets there choice
        System.out.println("Please enter what you would like to draw? ");
        System.out.println("for triangle enter Triangle ");
        System.out.println("for square enter Square ");
        System.out.println("for star enter Star ");
        System.out.println("for the Graphics menu enter Graphics");
        System.out.println("To Exit press Exit ");
        String answer = scan.nextLine();

        // returns a number based on the user choice
        switch (answer)
        {
            case "Exit":
                return EXIT;

            case "Triangle":
                return TRIANGLE;

            case "Square":
                return SQUARE;
            case "Star":
                return STAR;
            case "Graphics":
                return GRAPHICS_MENU;
            default:
                return BAD_CASE;
        }
    }

    private static void GraphicsMenu()
    {
        String color;
        int number;

        Scanner scan = new Scanner(System.in);

        // prints out the menu to the user and gets there choice
        System.out.println("Please enter what you would like to Change? ");
        System.out.println("for BackGround color enter 1 ");
        System.out.println("for Turtle color enter 2 ");
        System.out.println("for Turtle distance enter 3 ");
        System.out.println("for Turtle width enter 4 ");
        System.out.println("for Turtle speed enter 5 ");
        int answer = scan.nextInt();
        scan.nextLine();

        // returns a number based on the user choice
        switch (answer)
        {
            case 1:
                System.out.println("Enter a color for the BackGround");
                color = scan.nextLine();
                artist.setBgColor(color);
                break;
            case 2:
                System.out.println("Enter a color for the turtle to draw");
                color = scan.nextLine();
                artist.setPenColor(color);
                break;
            case 3:
                System.out.println("Enter the distance the turtle should go");
                number = scan.nextInt();
                artist.setDistance(number);
                break;
            case 4:
                System.out.println("Enter the width the turtle should be");
                number = scan.nextInt();
                artist.setPenWidth(number);
                break;
            case 5:
                System.out.println("Enter the width the speed turtle should go");
                number = scan.nextInt();
                artist.setSpeed(number);
             default:
                 System.out.println("No valid option was picked");
        }
    }
}
