package lesson4.Stock;

public class Stock {

    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;

    }

    public void updatePrice(double currentValue){
        this.currentValue = currentValue;
        if (currentValue > max) {
            this.max = currentValue;
        } else if (currentValue < min) {
            this.min = currentValue;
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public String toString() {
        return "Company: " + company + "\n"
                + "Current Value: " + currentValue + "\n"
                + "Max Value: " + max + "\n"
                + "Min Value: " + min + "\n";
    }
}
