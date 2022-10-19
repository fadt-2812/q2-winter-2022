package homework2;

import homework1.Calculator;
import org.junit.jupiter.api.Test;

public class HomeW1Calculator {
 @Test
    public void workingWithCalculator() {
        Calculator firstCalculator = new Calculator();

        firstCalculator.setColor("grey");
        firstCalculator.setNumberDigits(12);
        firstCalculator.setBrand("SHARP");

        System.out.println("Цвет:");
        System.out.println(firstCalculator.getColor());
        System.out.println("Digits:");
        System.out.println(firstCalculator.getNumberDigits());
        System.out.println("Brand:");
        System.out.println(firstCalculator.getBrand());
    }
}





