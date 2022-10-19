package homework2;

import homework1.TableLamp;
import org.junit.jupiter.api.Test;

public class HomeW1TableLamp {
    @Test
    public void workingWithTableLamp() {
        TableLamp firstTableLamp = new TableLamp();

        firstTableLamp.setColor("серого");
        firstTableLamp.setLampPower(60);

        System.out.print("Моя настольная лампа ");
        System.out.print(firstTableLamp.getColor());
        System.out.println(" цвета.");
        System.out.print("Мощность лампочки ");
        System.out.print(firstTableLamp.getLampPower());
        System.out.println(" W.");

    }
}
