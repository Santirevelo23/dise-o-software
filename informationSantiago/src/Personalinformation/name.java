package Personalinformation;
//clase principal
public class name {
	//atributos
    private String name;
    private String lastName;
    private String secondLastName;
    
    //constructor
    public name(String name, String lastName, String secondLastName) {
        this.name=name;
        this.lastName=lastName;
        this.setSecondLastName(secondLastName);
    }
    //getters and setters
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName=secondLastName;
    }
    
    
    public void display() {
        System.out.println(name +" ,"+ lastName + " ," + secondLastName);
    }
}

