package Personalinformation;

public class Main {
    public static void main(String[] args) {
    	//nueva instancia de direccion con sus parametros especificos
        address address = new address("david", "Obando", "revelo", "pandiaco", "pasto", "nariño", 12345);
//mostrar en pantalla
        System.out.println("Personal Information=");
        address.display();
    }
}
