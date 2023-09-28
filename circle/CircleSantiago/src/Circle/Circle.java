package Circle;
import java.util.Scanner;

//super clase o clase principal
class Circle {
	
	//atributos de circulo
    double radius;

    //Constructor
    
    public Circle(double radius) {
        this.radius = radius;
    }

    //metodos
    public void readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the circle's radius: ");
        this.radius = scanner.nextDouble();
    }

    
    
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}