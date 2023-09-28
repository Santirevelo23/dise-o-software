package Personalinformation;
//herencia
class address extends name {
	
	//atributos
    private String street;
    private String city;
    private String province;
    private int postalCode;
    //constructor
    public address(String firstName, String lastName, String secondLastName, String street, String city, String province, int postalCode) {
        //llama al constructor principal
    	super(firstName, lastName, secondLastName);
        this.street=street;
        this.city=city;
        this.province= province;
        this.postalCode=postalCode;
    }
//get y set
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street= street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province =province;
    }
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode=postalCode;
    }
    
    @Override
    public void display() {
        super.display(); 
        System.out.println("street="+street);
        System.out.println("city= " + city);
        System.out.println("Province="+ province);
        System.out.println("postal Code= " +postalCode);
    }
}
