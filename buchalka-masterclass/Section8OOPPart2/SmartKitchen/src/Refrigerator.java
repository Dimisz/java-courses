public class Refrigerator extends KitchenAppliance{

    public Refrigerator(){
        super();
    }

    public void pourMilk(){
        if(getHasWorkToDo()){
            System.out.println("Pouring milk...");
            setHasWorkToDo(false);
        }
        else {
            System.out.println("No tasks...");
        }
    }
}
