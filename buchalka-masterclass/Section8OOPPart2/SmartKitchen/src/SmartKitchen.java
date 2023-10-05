public class SmartKitchen {
    private CoffeeMachine brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMachine();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void setKitchenState(boolean hasRefrigeratorTask, boolean hasBrewingTask, boolean hasWashingTask){
        brewMaster.setHasWorkToDo(hasBrewingTask);
        dishWasher.setHasWorkToDo(hasWashingTask);
        iceBox.setHasWorkToDo(hasRefrigeratorTask);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.pourMilk();
    }
}
