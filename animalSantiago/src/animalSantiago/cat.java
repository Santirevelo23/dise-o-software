package animalSantiago;
//herencia
public class cat extends mammal {
	//constructor
    public cat(String name) {
    	//llama al constructor principal
        super(name);
    }

    @Override
    public String toString() {
        return "cat= "+super.toString();
    }
}


