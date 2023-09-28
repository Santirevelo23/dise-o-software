package editoriallibros;

public class Main {
    public static void main(String[] args) {
        libro book = new libro("rayuela=", 500000, 750, 1963);
        
        disco disc = new disco("disc", 98673 , 546);
        
        System.out.println("book=");
        book.display();
        
        System.out.println("disc=");
        disc.display();
    }
}

