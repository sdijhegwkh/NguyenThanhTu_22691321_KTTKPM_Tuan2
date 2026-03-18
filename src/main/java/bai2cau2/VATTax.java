package bai2cau2;

class VATTax implements TaxStrategy {

    public double calculateTax(double price) {
        return price * 0.1;
    }

}
