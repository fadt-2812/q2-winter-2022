package homework2;

import homework1.Chair;
import org.junit.jupiter.api.Test;

public class NomeW1Chair {
    @Test
    public void workingWithChair() {
        Chair firstChair = new Chair();

        firstChair.setLegsChair(45);
        firstChair.setBackChair(false);

        System.out.println("Высота стула:");
        System.out.println(firstChair.getLegsChair());
        System.out.println("Спинка:");
        System.out.println(firstChair.isBackChair());

    }
}
