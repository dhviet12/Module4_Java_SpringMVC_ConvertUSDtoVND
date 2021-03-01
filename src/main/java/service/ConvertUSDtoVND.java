package service;

public class ConvertUSDtoVND {
    private double rate = 22500;

    public ConvertUSDtoVND() {
    }

    public double convert(double amount) {
        return rate * amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
