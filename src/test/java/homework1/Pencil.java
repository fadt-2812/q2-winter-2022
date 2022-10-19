package homework1;

public class Pencil {
    private String color;
    private double leadDiameter;
    private  char leadHardness;
    private  String brand;
    private boolean eraser;

    // ----------------------G/S----------------------------

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLeadDiameter() {
        return leadDiameter;
    }

    public void setLeadDiameter(double leadDiameter) {
        this.leadDiameter = leadDiameter;
    }

    public char getLeadHardness() {
        return leadHardness;
    }

    public void setLeadHardness(char leadHardness) {
        this.leadHardness = leadHardness;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isEraser() {
        return eraser;
    }

    public void setEraser(boolean eraser) {
        this.eraser = eraser;
    }
}
