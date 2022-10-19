package homework1;

public class Cup {
    private String productionMaterial;
    private double capacity;
    private boolean cupHandle;
    private boolean picture;
    private double weight;

    // ----------------------G/S----------------------------

    public String getProductionMaterial() {
        return productionMaterial;
    }

    public void setProductionMaterial(String productionMaterial) {
        this.productionMaterial = productionMaterial;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isCupHandle() {
        return cupHandle;
    }

    public void setCupHandle(boolean cupHandle) {
        this.cupHandle = cupHandle;
    }

    public boolean isPicture() {
        return picture;
    }

    public void setPicture(boolean picture) {
        this.picture = picture;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
