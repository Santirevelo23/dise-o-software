package animalSantiago;
//herencia
public class mammal extends animal {

	//constructor
    public mammal(String name) {
    	//llama al constructor principal
        super(name);
    }
    @Override
    public String toString() {
        return "mammal =animal=Name=  "+super.toString();
    }
}
