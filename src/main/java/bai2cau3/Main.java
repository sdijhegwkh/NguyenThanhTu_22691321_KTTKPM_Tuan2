package bai2cau3;

public class Main {

    public static void main(String[] args) {

        Payment payment = new CreditCardPayment();

        payment = new ProcessingFee(payment);
        payment = new Discount(payment);

        double total = payment.pay(100);

        System.out.println("Tổng tiền: " + total);

    }

}
