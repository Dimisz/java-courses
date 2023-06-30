public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;

    public Pet(String name, double health, int painLevel){
        this.name = name;
        if(health > 1.0){
            this.health = 1.0;
        }
        else if(health < 0.0){
            this.health = 0.0;
        }
        else{
            this.health = health;
        }

        if(painLevel > 10){
            this.painLevel = 10;
        }
        else if(painLevel < 1){
            this.painLevel = 1;
        }
        else{
            this.painLevel = painLevel;
        }
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public abstract int treat();

    public void speak(){
        String res = "Hello! My name is " + this.name;
        if(painLevel > 5){
            res = res.toUpperCase();
        }
        System.out.println(res);
    }

    public boolean equals(Object o){
        if(o instanceof Pet){
            Pet pet = (Pet) o;
            return this.name.equals(pet.getName());
        }
        return false;
    }

    protected void heal(){
        this.health = 1.0;
        this.painLevel = 1;
    }
}
