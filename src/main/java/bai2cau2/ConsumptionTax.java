package bai2cau2;

class ConsumptionTax implements TaxStrategy {

    public double calculateTax(double price) {
        return price * 0.05;
    }

}
