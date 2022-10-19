package homework2;

import homework1.Pencil;
import org.junit.jupiter.api.Test;

public class HomeW1Pencil {
   @Test
    public void workingWithPencil() {
        Pencil firstPensil = new Pencil();

        firstPensil.setColor("зелёный");
        firstPensil.setLeadDiameter(0.5);

        System.out.print("Цвет карандаша - ");
        System.out.println(firstPensil.getColor());
        System.out.print("Диаметр грифеля - ");
        System.out.print(firstPensil.getLeadDiameter());
        System.out.println(" mm");
    }
}
