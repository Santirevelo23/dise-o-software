package ejercicioPerson;

//herencia 
public class Student extends Person {
	//atributos
    private String program;
    private int year;
    private double fee;

    	//constructor
    public Student(String name, String address, String program, int year, double fee) {
       //llama al principal constructor con parametros incluidos
    	super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    //get and set
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program=program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee=fee;
    }
//metodos
    public void printStudent() {
        System.out.println("Program="+program);
        System.out.println("year= "+ year);
        System.out.println("Fee= "+fee);
    }

    @Override
    public String toString() {
        return "Student [Person[name= "+getName()+", address= "+getAddress()+ ", program="+program + ", year= " + year + ", fee= " + fee+"]";
    }
}

