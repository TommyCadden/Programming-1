import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("radius: " + circle.getRadius() + " color: "+ circle.getColor());
    }
}
