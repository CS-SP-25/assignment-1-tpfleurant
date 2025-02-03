public class State {
    // declarations
    private String name;
    private SalesTaxBehavior behavior;

    // methods
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBehavior(SalesTaxBehavior behavior) {
        this.behavior = behavior;
    }
    public void showTax(double value) {
        double tax = behavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f", value, name, tax);
    }
}