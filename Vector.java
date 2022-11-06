import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector(20);
        v2.add(100);
        v2.add(100);
        v2.add(100);
        Vector v3 = new Vector(30, 10);
        Vector v4 = new Vector(v2);
        System.out.println("Vector v1 of capacity " + v1.capacity());
        System.out.println("Vector v2 of capacity " + v2.capacity());
        System.out.println("Vector v3 of capacity " + v3.capacity());
        System.out.println("Vector v4 of capacity " + v4.capacity());

        Vector v = new Vector();
        v.add("Java");
        v.add("is");
        v.add("Fun");
        System.out.println("The vector is " + v);

        Vector v_new = new Vector(5);
        v_new.add(0, 1);
        v_new.add(1, "Java");
        v_new.add(2, "is");
        v_new.add(3, "Fun");
        v_new.add(4, "!!!");

        System.out.println("The vector is " + v_new);
        // v_new.remove(1);
        System.out.println("The new vector is " + v_new);
        // v_new.remove("!!!");
        System.out.println("The new vector is " + v_new);
        System.out.println("The vector size is " + v_new.size());
        System.out.println("The vector capacity is " + v_new.capacity());
        v_new.add(5, "abcd");
        System.out.println("The vector capacity is " + v_new.capacity());
        v_new.remove("abcd");
        v_new.remove("!!!");
        System.out.println("The vector size is " + v_new.size());
        System.out.println("The vector capacity is " + v_new.capacity());
        v_new.trimToSize();
        System.out.println("The vector size is " + v_new.size());
        System.out.println("The vector capacity is " + v_new.capacity());

    }
}
