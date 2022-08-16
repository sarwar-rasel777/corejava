package programs.basic_01;

public class CircleAreaAndPerimeter {
    private static double radius = 7.5;

    public static void main(String[] args) {
        System.out.println("The area of a circle is (pi*r^2):"+(Math.PI*radius*radius));
        System.out.println("The perimeter of a circle is (2*pi*r):"+(2*Math.PI*radius));
    }
}
