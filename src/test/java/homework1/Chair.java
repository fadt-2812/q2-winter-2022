package homework1;

public class Chair {
    private double height;
    private int legsChair;
    private boolean backChair;
    private String productionMaterial;
    private double weight;

    // ----------------------G/S----------------------------

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLegsChair() {
        return legsChair;
    }

    public void setLegsChair(int legsChair) {
        this.legsChair = legsChair;
    }

    public boolean isBackChair() {
        return backChair;
    }

    public void setBackChair(boolean backChair) {
        this.backChair = backChair;
    }

    public String getProductionMaterial() {
        return productionMaterial;
    }

    public void setProductionMaterial(String productionMaterial) {
        this.productionMaterial = productionMaterial;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
