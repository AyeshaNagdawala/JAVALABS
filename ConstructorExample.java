import java.util.*;

class Triangle {
    int side;

    public Triangle() // No Paramerter
    {
        side = 5;
    }

    public Triangle(int y) // Parameter yes
    {
        side = y;

    }
}

public class Main {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        System.out.println("Side is " + t1.side);
        Triangle t2 = new Triangle(69);
        System.out.println("Side is " + t2.side);
    }
}
