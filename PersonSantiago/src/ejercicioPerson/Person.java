package ejercicioPerson;

//clase principal
public class Person {
	//atributos
    private String name;
    private String address;

    	//constructor super
    public Person(String name, String address) {
        this.name=name;
        this.address=address;
    }

    	//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    //metodos
    public void printPerson() {
        System.out.println("Name="+name);
        System.out.println("Address= "+address);
    }

    @Override
    public String toString() {
        return "Person [name= "+name+", address= "+address+"]";
    }
}

