package circle;

public class circle {
	//atributos
    private double radius; 
    private String color; 
    
    // Constructor por defecto
    public circle() {
        this.radius=1.0;
        this.color= "Red";
    }
    
    // Constructor con radio especificado
    public circle(double radius) {
        this.radius =radius;
        this.color ="Red";
    }
    
    // Constructor con radio y color especificados
    public circle(double radius, String color) {
        this.radius= radius;
        this.color =color;
    }
    
    // Getters and setters
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius=radius;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color= color;
    }
    
    // Métodos
    public double getArea() {
        return Math.PI * radius*radius;
    }
    
    public void printCircle() {
        System.out.println("Radius: " +radius);
        System.out.println("area: "+this.getArea()); 
        System.out.println("Colour: " + color);
    }
    
    @Override
    public String toString() {
        return "radius=" +radius + ", color= " + color;
    }
}

