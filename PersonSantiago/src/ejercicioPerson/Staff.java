package ejercicioPerson;
//herencia
public class Staff extends Person {
//atributos
    private String school;
    private double pay;

    //constructor y llama al constructor principal con parametros
    public Staff(String name, String address, String school, double salary) {
        super(name,address);
        this.school=school;
        this.pay=salary;
    }
//get and set
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school=school;
    }

    public double getSalary() {
        return pay;
    }

    public void setSalary(double salary) {
        this.pay=salary;
    }
//metodos
    public void printStaff() {
        System.out.println("School= "+ school);
        System.out.println("Salary="+pay);
    }

    @Override
    public String toString() {
        return "Staff [name= "+getName()+", address="+getAddress() +",school= "+school + ", pay=" + pay;
    }
}
