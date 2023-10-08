public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    protected void startEngine(){
        System.out.println("\nStarting car engine...");
    }

    protected void runEngine(){
        System.out.println("Running engine...");
    }

    public void drive(){
        startEngine();
        runEngine();
    }
}
