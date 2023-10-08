public class GasPoweredCar extends Car{


    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving a " + this.getClass().getSimpleName());
    }
}
