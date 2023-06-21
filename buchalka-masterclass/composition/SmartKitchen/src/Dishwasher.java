public class Dishwasher {
    private boolean hasWorkToDo = false;

    public Dishwasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public Dishwasher(){
        this(false);
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(this.hasWorkToDo){
            System.out.println("Washing dishes...");
            this.hasWorkToDo = false;
        }
        else{
            System.out.println("The dishes has already been washed...");
        }
    }
}
