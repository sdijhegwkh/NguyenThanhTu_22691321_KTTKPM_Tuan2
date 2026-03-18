package bai2cau3;

class Discount extends PaymentDecorator {

    public Discount(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {
        amount = payment.pay(amount);
        amount -= 10;
        System.out.println("Áp dụng mã giảm giá: -10");
        return amount;
    }

}
