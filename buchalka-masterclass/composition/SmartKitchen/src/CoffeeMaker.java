public class CoffeeMaker {
    private boolean hasWorkToDo = false;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public CoffeeMaker(){
        this(false);
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(this.hasWorkToDo){
            System.out.println("Brewing coffee...");
            this.hasWorkToDo = false;
        }
        else{
            System.out.println("Here's the coffee...");
        }
    }
}
