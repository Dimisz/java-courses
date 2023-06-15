public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return 2023 - Integer.parseInt(birthDate);
    }

    public double collectPay(){
        System.out.println(this.name + " collecting his pay...");
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Terminating work on " + this.endDate);
    }

    @Override
    public String toString(){
        return "Worker[name='" + this.name +
                "', birthDate='" + this.birthDate +
                "', endDate='" + this.endDate + "']";
    }
}
