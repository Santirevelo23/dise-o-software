package Circle;

public class Main {
    public static void main(String[] args) {
    	//nueva instancia de circulo
        Circle circle = new Circle(0);
        
        //interactuar con el usuario
        circle.readRadius();
        
        //nueva instancia de cilindro
        Cylinder cylinder = new Cylinder(circle.radius, 5.0);
        //nueva instancia de cilindro hueco
        HollowCylinder hollowCylinder = new HollowCylinder(circle.radius, 2.0, 7.0);
        
        
        //mostrar en pantalla los resultados de las operaciones
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());
        System.out.println("Hollow cylinder volume: " + hollowCylinder.calculateHollowVolume());
        System.out.println("Cylinder volume: " + cylinder.calculateVolume());
        
    
    
    }
}