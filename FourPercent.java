public class FourPercent implements SalesTaxBehavior{
    public double compute(double value) {
        return value * 0.045;
    }
}