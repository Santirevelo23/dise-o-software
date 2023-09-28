package circle;

public class Main {
    public static void main(String[] args) {
        circle myCircle = new circle();
        System.out.println("circle");
        myCircle.printCircle();

        cylindre myCylinder = new cylindre(2.3, 2.1, "Red");
        System.out.println("cylindre ");

        System.out.println("Radius= " + myCylinder.getRadius());
        System.out.println("color= " + myCylinder.getColor());
        myCylinder.printCylinder();
        System.out.println("volume= " + myCylinder.getVolume()); 
    }
}
