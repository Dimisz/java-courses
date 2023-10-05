public class DishWasher extends KitchenAppliance{
    public DishWasher(){
        super();
    }

    public void doDishes(){
        if(getHasWorkToDo()){
            System.out.println("Doing dishes...");
            setHasWorkToDo(false);
        }
        else {
            System.out.println("No washing task scheduled");
        }
    }
}
