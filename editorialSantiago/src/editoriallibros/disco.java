package editoriallibros;

//herencia
class disco extends editorial {
    private float duration;
    
    //constructor
    public disco(String title, float price, float duration) {
        //llama al contructor principal
        super(title, price);
        this.duration=duration;
    }
    //get y set
    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration=duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("duration (minutes)= "+ duration);
    }
}

