package editoriallibros;
//herencia
class libro extends editorial {
	//atributos
    private int pages;
    private int publicYear;

    //contructor
    public libro(String title, float price, int pages, int publicYear) {
       //llama al contructor principal
        super(title, price);
        this.pages = pages;
        this.publicYear = publicYear;
    }
//getters y setters
    public int getpages() {
        return pages;
    }

    public void setpages(int pages) {
        this.pages = pages;
    }
    public int getpublicYear() {
        return publicYear;
    }
    public void setpublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("pages= "+pages);
        System.out.println("Publication=" +publicYear);
    }
}
