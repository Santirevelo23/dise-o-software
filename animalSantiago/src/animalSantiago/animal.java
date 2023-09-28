package animalSantiago;
//clase principal
public class animal {
    private String name;
//constructor principal
    public animal(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "animal= name=" +name;
    }
}
