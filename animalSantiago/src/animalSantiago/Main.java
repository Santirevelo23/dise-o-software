package animalSantiago;

public class Main {
    public static void main(String[] args) {
    	//nueva instancia de animal
        animal Animal = new animal("dog");
        //nueva instancia de mammal
        mammal Mammal = new mammal("cat");
        //nueva instancia de cat
        cat gato = new cat("Meow");
        //nueva instancia de dog
        dog perro = new dog("Wooff");

        System.out.println(Animal);
        System.out.println(Mammal);
        System.out.println(perro);
        System.out.println(gato);
    }
}
