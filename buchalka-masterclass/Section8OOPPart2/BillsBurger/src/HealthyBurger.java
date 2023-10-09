public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String additionName, double additionPrice){
        healthyExtra1Name = additionName;
        healthyExtra1Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public void addHealthyAddition2(String additionName, double additionPrice){
        healthyExtra2Name = additionName;
        healthyExtra2Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
