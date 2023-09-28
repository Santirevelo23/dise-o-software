package editoriallibros;
//clase principal
class editorial {
	//atributos
    private String title;
    private float price;
    
    //constructor
    public editorial(String title, float price) {
        this.title=title;
        this.price=price;
    }
//get y set
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    
    public void display() {
        System.out.println("title= " + title);
        System.out.println("Price= " + price);
    }
}

