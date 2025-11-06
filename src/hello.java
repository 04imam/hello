import java.math.BigDecimal;
import java.math.RoundingMode;

public class hello {
    public static void main(String[] args) {
        System.out.println("hello vitula");

//      task 5
//      {

        double netDouble = 9.99;
        double VatRate = 0.23;
        double grossDouble = netDouble * (1 + VatRate);
        double totalGrossDouble = grossDouble * 10000;
        double totalNetFromGrossDouble = totalGrossDouble / (1 + VatRate);

        System.out.println("Using double");
        System.out.println("Net price: " + netDouble);
        System.out.println("Gross price: " + grossDouble);
        System.out.println("Total gross (10,000 pcs): " + totalGrossDouble);
        System.out.println("Total net from gross: " + totalNetFromGrossDouble);
        System.out.println();


        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");
        BigDecimal grossBD = netBD.multiply(BigDecimal.ONE.add(vatRateBD));
        BigDecimal totalGrossBD = grossBD.multiply(new BigDecimal("10000"));
        BigDecimal totalNetFromGrossBD = totalGrossBD.divide(BigDecimal.ONE.add(vatRateBD), 2, RoundingMode.HALF_UP);

        System.out.println("Using BigDecimal");
        System.out.println("Net price: " + netBD);
        System.out.println("Gross price: " + grossBD);
        System.out.println("Total gross (10,000 pcs): " + totalGrossBD);
        System.out.println("Total net from gross: " + totalNetFromGrossBD);
    }


}

