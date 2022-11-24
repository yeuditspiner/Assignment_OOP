package pkg;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {
        //list of shapes:
        List<Shape> l = new ArrayList<>();
        l.add(new Circle());
        l.add(new Circle(6.5));
        l.add(new Circle("red", false, 3.3));
        l.add(new Rectangle());
        l.add(new Rectangle(2.2, 4.6));
        l.add(new Rectangle("yellow", false, 5.2, 3.1));
        l.forEach((shape -> System.out.println(shape +//executes the toString()
                " the area is: " + ((GeometricObject) shape).getArea() +//the shape's area
                " the perimeter is: " + ((GeometricObject) shape).getPerimeter() +//the shape's perimeter
                "\n" + "-------------")));
    }

}
