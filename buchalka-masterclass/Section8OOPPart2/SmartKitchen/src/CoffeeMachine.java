public class CoffeeMachine extends KitchenAppliance{
    public CoffeeMachine(){
        super();
    }

    public void brewCoffee(){
        if(getHasWorkToDo()){
            System.out.println("Brewing coffee...");
            setHasWorkToDo(false);
        }
        else{
            System.out.println("Sorry, no brewing task scheduled");
        }
    }
}
