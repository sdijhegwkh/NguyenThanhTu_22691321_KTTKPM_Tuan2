package bai2cau2;

class LuxuryTax implements TaxStrategy {

    public double calculateTax(double price) {
        return price * 0.2;
    }

}
