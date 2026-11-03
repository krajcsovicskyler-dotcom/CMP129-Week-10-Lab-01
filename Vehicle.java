public class Vehicle{
    private int year;
    private String model;
    private String make;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}