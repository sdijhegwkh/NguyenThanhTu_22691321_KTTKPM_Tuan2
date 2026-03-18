package bai2cau2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(new VATTax());
        System.out.println(p1.calculateTotal(100));
        Product p2 = new Product(new LuxuryTax());
        System.out.println(p2.calculateTotal(100));
    }
}
