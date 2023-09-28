package ejercicioPerson;

public class Main {
    public static void main(String[] args) {
    	//instanncia de estudiante
        Student student = new Student("santiago", "panamericana", "Software Engineering", 2023, 345644);
        //mostrar
        System.out.println("Student");
        student.printPerson();
        student.printStudent();
        System.out.println(" ");
//instancia de staff
        Staff stafff = new Staff("sebastian", "bolivar", "cooperativa", 789875);
//mostrar
        System.out.println("Staff");
        stafff.printPerson();
        stafff.printStaff();
    }
}
