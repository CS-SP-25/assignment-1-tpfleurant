import java.util.Scanner;
public class SalesTaxCalculator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String state = scanner.next();
      double value = scanner.nextDouble();
      if (state.equals("Alaska")) {
          Alaska alsk = new Alaska();
          alsk.showTax(value);
      }
      else if (state.equals("Indiana")) {
          Indiana ind = new Indiana();
          ind.showTax(value);
      }
      else if (state.equals("Hawaii")) {
          Hawaii ind = new Hawaii();
          ind.showTax(value);
      }
    }
}
