package Circle;

class HollowCylinder extends Cylinder {
	//atributos
    private double innerRadius;

    //constructor cilindro hueco
    public HollowCylinder(double outerRadius, double innerRadius, double height) {
    	
    	//llama al constructor de la clase circulo
        super(outerRadius, height);
        this.innerRadius = innerRadius;
    }

    //metodo
    public double calculateHollowVolume() {
        double outerVolume = super.calculateVolume();
        double innerVolume = Math.PI * Math.pow(innerRadius, 2) * height;
        return outerVolume - innerVolume;
    }
}
