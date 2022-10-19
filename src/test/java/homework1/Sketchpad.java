package homework1;

public class Sketchpad {
    private char format;
    private boolean lined;
    private int numberSheets;
    private String bindingType;
    private String paperQuality;

    // ----------------------G/S----------------------------


    public boolean isLined() {
        return lined;
    }

    public void setLined(boolean lined) {
        this.lined = lined;
    }

    public int getNumberSheets() {
        return numberSheets;
    }

    public void setNumberSheets(int numberSheets) {
        this.numberSheets = numberSheets;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
