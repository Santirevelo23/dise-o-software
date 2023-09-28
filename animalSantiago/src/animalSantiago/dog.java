package animalSantiago;
//herencia
public class dog extends mammal {
	
	//constructor
    public dog(String name) {
    	//llama al constructor principal
        super(name);
    }

    @Override
    public String toString() {
        return "dog= "+super.toString();
    }
}

