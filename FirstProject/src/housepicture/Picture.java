package housepicture;

/**
 * House Picture Lab for 2.5
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */


public class Picture
{
    private Square wall;
    private Square window;
    // created 2 Square variables
    private Square window2;
    private Square door;
    private Triangle roof;
    private Circle sun;
    // created variable person with type Person
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        // Initialized window2 + door + person
        window2 = new Square();
        door = new Square();
        roof = new Triangle();
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        // new Picture object created
        Picture p = new Picture();
        // ran both draw + sunset so that canvas showed
        p.draw();
        p.sunset();
    }
    //////////////////////////////////////////////////////////////////////////////

    // called previously created sunset function when drawing image
    public void sunset()
    {
        for(int i = 0; i < 140; i++)
        {
            sun.slowMoveDiagonallyUpLeft(1);
        }
        for(int i = 0; i < 140; i++)
        {
            sun.slowMoveDiagonallyDownLeft(1);
        }
    }
    /////////////////////////////////////////////////////////////////////////////

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();

            window.changeColor("black");
            window.moveHorizontal(-130);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();

           // window2 + door attributes altered for different colors and positions

            window2.changeColor("black");
            window2.moveHorizontal(-70);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();

            door.changeColor("blue");
            door.moveHorizontal(-100);
            door.moveVertical(100);
            door.changeSize(40);
            door.makeVisible();

            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();

            // person attributes changed to match sample image

            person.changeColor("magenta");
            person.moveHorizontal(-190);
            person.moveVertical(30);
            person.changeSize(90,30);
            person.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {

        // added custom colors if drawn on b/w display (for window2, door, person instances)
        wall.changeColor("black");
        window.changeColor("white");
        window2.changeColor("white");
        door.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        // set default colors if using color display (for window2. door, person instances)
        wall.changeColor("red");
        window.changeColor("black");
        window2.changeColor("black");
        door.changeColor("blue");
        roof.changeColor("green");
        sun.changeColor("yellow");
        person.changeColor("yellow");

    }
}