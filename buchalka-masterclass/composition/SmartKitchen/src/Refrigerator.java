public class Refrigerator {
    private boolean hasWorkToDo = false;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public Refrigerator(){
        this(false);
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(this.hasWorkToDo){
            System.out.println("Ordering food...");
            this.hasWorkToDo = false;
        }
        else{
            System.out.println("Food has already been ordered...");
        }
    }
}
