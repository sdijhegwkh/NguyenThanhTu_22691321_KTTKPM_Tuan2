package bai2cau2;

class Product {

    private TaxStrategy taxStrategy;

    public Product(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTotal(double price) {
        return price + taxStrategy.calculateTax(price);
    }

}
