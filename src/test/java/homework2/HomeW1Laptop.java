package homework2;

import homework1.Laptop;
import org.junit.jupiter.api.Test;

public class HomeW1Laptop {
@Test
    public  void workingWithLaptop() {
        Laptop firstLaptop = new Laptop();

        firstLaptop.setBrand("Dell");
        firstLaptop.setRam(8);

        System.out.println("Производитель:");
        System.out.println(firstLaptop.getBrand());
        System.out.println("RAM:");
        System.out.print(firstLaptop.getRam());
        System.out.println(" GB");

    }
}
