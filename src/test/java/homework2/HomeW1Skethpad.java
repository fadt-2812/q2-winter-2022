package homework2;

import homework1.Sketchpad;
import org.junit.jupiter.api.Test;

public class HomeW1Skethpad {
    @Test
    public void workingWithSketchpad() {
        Sketchpad firstSketcpad = new Sketchpad();

        firstSketcpad.setNumberSheets(50);
        firstSketcpad.setLined(true);
        firstSketcpad.setPaperQuality("формата А5, качественная бумага.");

         System.out.print("Блокнот ");
         System.out.println(firstSketcpad.getPaperQuality());
         System.out.print("Количество листов -");
         System.out.println(firstSketcpad.getNumberSheets());
         System.out.print("Разлиновка - ");
         System.out.println(firstSketcpad.isLined());


    }
}
