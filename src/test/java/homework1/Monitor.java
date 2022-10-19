package homework1;

public class Monitor {
    //------------------ atributes------------

    private char model;
    private String fabric;
    private int diagonal;
    private Double height;
    private Double lenght;

    // ----------------------G/S----------------------------


    public char getModel() {
        return model;
    }

    public void setModel(char model) {
        this.model = model;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }
}
