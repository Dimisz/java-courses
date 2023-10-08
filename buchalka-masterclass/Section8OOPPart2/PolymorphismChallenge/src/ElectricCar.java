public class ElectricCar extends Car{
    public ElectricCar(String description){
        super(description);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving a " + this.getClass().getSimpleName());
    }
}
