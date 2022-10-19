package homework1;

public class Printer {
    private String brand;
    private String cartridgeType;
    private String printingColor;
    private int cartridgeResource;
    private char paperFormat;

    // ----------------------G/S----------------------------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCartridgeType() {
        return cartridgeType;
    }

    public void setCartridgeType(String cartridgeType) {
        this.cartridgeType = cartridgeType;
    }

    public String getPrintingColor() {
        return printingColor;
    }

    public void setPrintingColor(String printingColor) {
        this.printingColor = printingColor;
    }

    public int getCartridgeResource() {
        return cartridgeResource;
    }

    public void setCartridgeResource(int cartridgeResource) {
        this.cartridgeResource = cartridgeResource;
    }

    public char getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(char paperFormat) {
        this.paperFormat = paperFormat;
    }
}
