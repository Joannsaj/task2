import java.math.BigDecimal;

public class TaxCalc {
    public static void main(String[] args) {
        double productCost = 9.99;
        double VAT= 0.23*productCost;
        double grossCost = (9.99 + VAT);

        BigDecimal newProductCost = new BigDecimal(productCost);
        BigDecimal newGrossCost = new BigDecimal(grossCost);
        BigDecimal noOfProducts = new BigDecimal(10000);

        //cost of the 10000 sold pcs with net product cost
        BigDecimal totalProductsCost = newProductCost.multiply(noOfProducts);
        System.out.println("The total price of the the 10,000pcs sold at net price " + productCost + " is " + totalProductsCost);

        //cost of the 10000 sold pcs with gross product cost
        BigDecimal totalGrossCost = newGrossCost.multiply(noOfProducts);
        System.out.println("The total price of the the 10,000pcs sold at gross price " + grossCost + " is " + totalGrossCost);

        //In summary goods sold at net price are cheaper than goods sold at gross price

    }
}
