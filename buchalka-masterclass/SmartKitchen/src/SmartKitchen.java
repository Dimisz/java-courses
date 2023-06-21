public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Dishwasher dishwasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.dishwasher = new Dishwasher();
        this.iceBox = new Refrigerator();
    }

    public void addWater(){
        System.out.println("Adding water");
    }

    public void pourMilk(){
        System.out.println("Pouring milk...");
    }

    public void loadDishwasher(){
        System.out.println("Loading dishwasher...");
    }

    public void setKitchenState(boolean coffeMakerHasWork, boolean fridgeHasWork, boolean dishwasherHasWork){
        brewMaster.setHasWorkToDo(coffeMakerHasWork);
        dishwasher.setHasWorkToDo(fridgeHasWork);
        iceBox.setHasWorkToDo(dishwasherHasWork);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishwasher.doDishes();
        iceBox.orderFood();
    }
}
