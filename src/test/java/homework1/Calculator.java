package homework1;

public class Calculator {
    private String color;
    private char size;
    private String displayType;
    private int numberDigits;
    private String brand;
// ----------------------G/S----------------------------

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public int getNumberDigits() {
        return numberDigits;
    }

    public void setNumberDigits(int numberDigits) {
        this.numberDigits = numberDigits;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
