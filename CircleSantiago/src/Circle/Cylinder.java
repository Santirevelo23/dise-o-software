package Circle;

//herencia
class Cylinder extends Circle {
	//atributos
    double height;

    //constructor de cilindro
    
    public Cylinder(double radius, double height) {
    	
    	//llama al costructor de la clase circulo
        super(radius);
        this.height = height;
    }
    
    //metodo
    public double calculateVolume() {
        return calculateArea() * height;
    }
}
