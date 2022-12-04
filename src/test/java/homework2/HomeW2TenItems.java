package homework2;

import homework1.*;
import org.junit.jupiter.api.Test;


public class HomeW2TenItems {
    @Test
    public void workingWithCalculator() {
        Calculator firstCalculator = new Calculator();

        firstCalculator.setColor("grey");
        firstCalculator.setNumberDigits(12);
        firstCalculator.setBrand("SHARP");

        System.out.println("                  КАЛЬКУЛЯТОР");
        System.out.println("Цвет:");
        System.out.println(firstCalculator.getColor());
        System.out.println("Digits:");
        System.out.println(firstCalculator.getNumberDigits());
        System.out.println("Brand:");
        System.out.println(firstCalculator.getBrand());
    }

    @Test
    public void workingWithCalendar() {
        Calendar firstCalendar = new Calendar();

        firstCalendar.setYear(2022);
        firstCalendar.setFormat('5');

        System.out.println("                   КАЛЕНДАРЬ");
        System.out.println("Happy newyear");
        System.out.println("Year:");
        System.out.println(firstCalendar.getYear());
        System.out.println("Format:");
        System.out.println(firstCalendar.getFormat());

    }

    @Test
    public void workWithCup() {
        Cup firstCup = new Cup();

        firstCup.setProductionMaterial("Фарфор");
        firstCup.setCapacity(200.00);

        System.out.println("                   КРУЖКА");
        System.out.println("Любимая кружка из:");
        System.out.println(firstCup.getProductionMaterial());
        System.out.println("Весом");
        System.out.print(firstCup.getCapacity());
        System.out.println(" Миллилитров.");
    }
    @Test
    public void workingWithLaptop() {
        Laptop firstLaptop = new Laptop();

        firstLaptop.setBrand("Dell");
        firstLaptop.setRam(8);

        System.out.println("                   КОМПЬЮТЕР");
        System.out.println("Производитель:");
        System.out.println(firstLaptop.getBrand());
        System.out.println("RAM:");
        System.out.print(firstLaptop.getRam());
        System.out.println(" GB");

    }
    @Test
    public void workingWithMonitor() {
        Monitor firstMonitor = new Monitor();

        firstMonitor.setFabric("Dell");
        firstMonitor.setDiagonal(19);

        System.out.println("                   МОНИТОР");
        System.out.print("Монитор ");
        System.out.println(firstMonitor.getFabric());
        System.out.print("Диагональ экрана: ");
        System.out.print(firstMonitor.getDiagonal());
        System.out.println(" дюймов");

    }
    @Test
    public void workingWithPencil() {
        Pencil firstPensil = new Pencil();

        firstPensil.setColor("зелёный");
        firstPensil.setLeadDiameter(0.5);

        System.out.println("                   КАРАНДАШ");
        System.out.print("Цвет карандаша - ");
        System.out.println(firstPensil.getColor());
        System.out.print("Диаметр грифеля - ");
        System.out.print(firstPensil.getLeadDiameter());
        System.out.println(" mm");
    }
    @Test
    public void workingWithPrinter() {
        Printer firstPrinter = new Printer();

        firstPrinter.setBrand("Hewlett Packard,");
        firstPrinter.setPrintingColor(" цветной,");
        firstPrinter.setCartridgeType(" струйный.");
        firstPrinter.setCartridgeResource(330);

        System.out.println("                   ПРИНТЕР");
        System.out.print("Принтер фирмы ");
        System.out.print(firstPrinter.getBrand());
        System.out.print(firstPrinter.getPrintingColor());
        System.out.println(firstPrinter.getCartridgeType());
        System.out.print("Ресурс использования картриджа - ");
        System.out.print(firstPrinter.getCartridgeResource());
        System.out.println(" листов.");


    }
    @Test
    public void workingWithSketchpad() {
        Sketchpad firstSketcpad = new Sketchpad();

        firstSketcpad.setNumberSheets(50);
        firstSketcpad.setLined(true);
        firstSketcpad.setPaperQuality("формата А5, качественная бумага.");

        System.out.println("                   БЛОКНОТ");
        System.out.print("Блокнот ");
        System.out.println(firstSketcpad.getPaperQuality());
        System.out.print("Количество листов -");
        System.out.println(firstSketcpad.getNumberSheets());
        System.out.print("Разлиновка - ");
        System.out.println(firstSketcpad.isLined());


    }
    @Test
    public void workingWithTableLamp() {
        TableLamp firstTableLamp = new TableLamp();

        firstTableLamp.setColor("серого");
        firstTableLamp.setLampPower(60);

        System.out.println("                   НАСТОЛЬНАЯ ЛАМПА");
        System.out.print("Моя настольная лампа ");
        System.out.print(firstTableLamp.getColor());
        System.out.println(" цвета.");
        System.out.print("Мощность лампочки ");
        System.out.print(firstTableLamp.getLampPower());
        System.out.println(" W.");

    }
    @Test
    public void workingWithChair() {
        Chair firstChair = new Chair();

        firstChair.setLegsChair(45);
        firstChair.setBackChair(false);

        System.out.println("                   СТУЛ");
        System.out.println("Высота стула:");
        System.out.println(firstChair.getLegsChair());
        System.out.println("Спинка:");
        System.out.println(firstChair.isBackChair());

    }

}




