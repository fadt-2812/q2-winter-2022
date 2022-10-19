package homework2;

import homework1.Printer;
import org.junit.jupiter.api.Test;

public class HomeW1Printer {
    @Test
    public void workingWithPrinter() {
        Printer firstPrinter = new Printer();

        firstPrinter.setBrand("Hewlett Packard,");
        firstPrinter.setPrintingColor(" цветной,");
        firstPrinter.setCartridgeType(" струйный.");
        firstPrinter.setCartridgeResource(330);

        System.out.print("Принтер фирмы ");
        System.out.print(firstPrinter.getBrand());
        System.out.print(firstPrinter.getPrintingColor());
        System.out.println(firstPrinter.getCartridgeType());
        System.out.print("Ресурс использования картриджа - ");
        System.out.print(firstPrinter.getCartridgeResource());
        System.out.println(" листов.");


    }
}
