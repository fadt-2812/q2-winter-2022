package homework2;

import homework1.Cup;
import org.junit.jupiter.api.Test;

public class HomeW1Cup {
    @Test
    public void workWithCup() {
        Cup firstCup = new Cup();

        firstCup.setProductionMaterial("Фарфор");
        firstCup.setCapacity(200.00);

        System.out.println("Любимая кружка из:");
        System.out.println(firstCup.getProductionMaterial());
        System.out.println("Весом");
        System.out.print(firstCup.getCapacity());
        System.out.println(" Миллилитров.");
    }
}
