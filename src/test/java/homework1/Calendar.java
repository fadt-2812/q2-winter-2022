package homework1;

public class Calendar {
    private int year;
    private int months;
    private boolean isFlip;
    private char format;
    private boolean holidayMarks;

    // ----------------------G/S----------------------------

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public boolean isFlip() {
        return isFlip;
    }

    public void setFlip(boolean flip) {
        isFlip = flip;
    }

    public char getFormat() {
        return format;
    }

    public void setFormat(char format) {
        this.format = format;
    }

    public boolean isHolidayMarks() {
        return holidayMarks;
    }

    public void setHolidayMarks(boolean holidayMarks) {
        this.holidayMarks = holidayMarks;
    }
}
